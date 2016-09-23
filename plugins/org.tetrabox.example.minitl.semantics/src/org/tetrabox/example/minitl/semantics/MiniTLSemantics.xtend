package org.tetrabox.example.minitl.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.util.HashSet
import java.util.Set
import minitl.BinaryExpression
import minitl.Binding
import minitl.FieldAccessValue
import minitl.ObjectTemplate
import minitl.Rule
import minitl.StringValue
import minitl.Transformation
import minitl.Value
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.util.EcoreUtil

import static extension org.tetrabox.example.minitl.semantics.ObjectTemplateAspect.*
import static extension org.tetrabox.example.minitl.semantics.RuleAspect.*
import static extension org.tetrabox.example.minitl.semantics.BindingAspect.*
import static extension org.tetrabox.example.minitl.semantics.ValueAspect.*
import static extension org.tetrabox.example.minitl.semantics.TransformationAspect.*
import org.eclipse.emf.ecore.EClass
import minitl.ObjectTemplateValue
import org.eclipse.emf.ecore.resource.Resource
import java.io.File
import java.util.List

@Aspect(className=Transformation)
class TransformationAspect {

	public val Set<EObject> inputModel = new HashSet;
	public val Set<EObject> outputModel = new HashSet;
	public String inputModelURI
	public String outputFilePath

	@InitializeModel
	public def void initialize(List<String> args) {
		_self.inputModelURI = args.get(0)
		_self.outputFilePath = args.get(1)
		val rs = _self.eResource.resourceSet
		val inputModelResource = rs.getResource(URI.createURI(_self.inputModelURI), true)
		
		// If an input metamodel was specified, we check conformity of the input model
		if (_self.inputMetamodel != null) {
			val allInputMetamodelClasses = _self.inputMetamodel.packages.map[p|p.eAllContents.filter(EClass).toSet].
				flatten.toSet
			_self.inputModel.addAll(inputModelResource.allContents.toSet)
			for (o : _self.inputModel) {
				if (!allInputMetamodelClasses.contains(o.eClass)) {
					throw new RuntimeException(
						"The input model does not conform to the input metamodel: type " + o.eClass + " of object " +
							o + " is unknown"
					)
				}
			}
		}
	}

	@Main
	@Step
	public def void execute() {

		// Applying all the rules of the transformation
		for (Rule r : _self.rules) {
			r.apply()
		}

		// Saving output model
		if (_self.outputFilePath != null && _self.outputFilePath != "") {
			val rs = _self.eResource.resourceSet
			val File outputFile = new File(_self.outputFilePath)
			if (outputFile.exists)
				outputFile.delete
			outputFile.parentFile.mkdirs
			val URI outputModelURI = URI.createFileURI(outputFile.absolutePath)
			val Resource inputModelResource = rs.createResource(outputModelURI)
			inputModelResource.contents.addAll(_self.outputModel)
			inputModelResource.save(null)
		}
	}
}

@Aspect(className=Rule)
class RuleAspect {

	@Step
	/**
	 * Applies the rule to each possible match in the input model.
	 */
	public def void apply() {
		val inputObjectTemplate = _self.objectTemplates.get(0)
		val outputObjectTemplate = _self.objectTemplates.get(1)

		for (o : _self.transformation.inputModel) {
			inputObjectTemplate.match(o)
			if (inputObjectTemplate.currentObject != null) {
				outputObjectTemplate.construct
				_self.transformation.outputModel.add(outputObjectTemplate.currentObject)
			}

			// Here we reset the context
			inputObjectTemplate.reset
			outputObjectTemplate.reset
		}

	}

}

@Aspect(className=ObjectTemplate)
class ObjectTemplateAspect {

	public var EObject currentObject

	public def void reset() {
		_self.currentObject = null
	}

	public def void match(EObject o) {
		if (o.eClass.classifierID == _self.type.classifierID) {
			if (_self.bindings.forall[b|b.check(o)]) {
				_self.currentObject = o
			}
		} else {
			_self.currentObject = null
		}
	}

	@Step
	public def void construct() {
		_self.currentObject = EcoreUtil.create(_self.type)
		for (b : _self.bindings) {
			b.assign()
		}
	}
}

@Aspect(className=Binding)
class BindingAspect {

	public def boolean check(EObject o) {
		val Object existingValue = o.eGet(_self.feature)
		val Object patternValue = _self.value.evaluate
		return existingValue == patternValue
	}

	@Step
	public def void assign() {
		val Object value = _self.value.evaluate()
		_self.objectTemplate.currentObject.eSet(_self.feature, value)
	}
}

@Aspect(className=Value)
abstract class ValueAspect {

	@Step
	abstract def Object evaluate();
}

@Aspect(className=BinaryExpression)
class BinaryExpressionAspect extends ValueAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		val Value left = _self.expressions.get(0)
		val Value right = _self.expressions.get(1)
		val Object leftComputedValue = left.evaluate
		val Object rightComputedValue = right.evaluate

		switch (_self.operator) {
			case ADD: {
				// Case at least one string
				if (leftComputedValue instanceof String || rightComputedValue instanceof String) {
					return leftComputedValue.toString + rightComputedValue.toString
				}

				// Case two integers
				if (leftComputedValue instanceof Integer && rightComputedValue instanceof Integer) {
					return new Integer((leftComputedValue as Integer) + (rightComputedValue as Integer))
				}

				throw new RuntimeException("Incompatible types for addition operator.")

			}
			case SUB: {
				// Case two integers
				if (leftComputedValue instanceof Integer && rightComputedValue instanceof Integer) {
					return new Integer((leftComputedValue as Integer) - (rightComputedValue as Integer))
				}

				throw new RuntimeException("Incompatible types for addition operator.")
			}
			default:
				throw new RuntimeException("Not a valid operator.")
		}
	}
}

@Aspect(className=FieldAccessValue)
class FieldAccessValueAspect extends ValueAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		return (_self.object.evaluate as EObject).eGet(_self.feature)
	}
}

@Aspect(className=StringValue)
class StringValueAspect extends ValueAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		return _self.value
	}
}

@Aspect(className=ObjectTemplateValue)
class ObjectTemplateValueAspect extends ValueAspect {
	@OverrideAspectMethod
	def Object evaluate() {
		return _self.objecttemplate.currentObject
	}
}
