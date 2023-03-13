package org.tetrabox.example.minitl.semantics

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel
import fr.inria.diverse.k3.al.annotationprocessor.Main
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod
import fr.inria.diverse.k3.al.annotationprocessor.Step
import java.io.File
import java.util.List
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.common.util.UniqueEList
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.tetrabox.example.minitl.BinaryExpression
import org.tetrabox.example.minitl.Binding
import org.tetrabox.example.minitl.FieldAccessValue
import org.tetrabox.example.minitl.ObjectTemplate
import org.tetrabox.example.minitl.ObjectTemplateValue
import org.tetrabox.example.minitl.Rule
import org.tetrabox.example.minitl.StringValue
import org.tetrabox.example.minitl.Transformation
import org.tetrabox.example.minitl.Value

import static extension org.tetrabox.example.minitl.semantics.BindingAspect.*
import static extension org.tetrabox.example.minitl.semantics.ObjectTemplateAspect.*
import static extension org.tetrabox.example.minitl.semantics.RuleAspect.*
import static extension org.tetrabox.example.minitl.semantics.TransformationAspect.*
import static extension org.tetrabox.example.minitl.semantics.ValueAspect.*

@Aspect(className=Transformation)
class TransformationAspect {

	public List<EObject> inputModel = new UniqueEList;
	public List<EObject> outputModel = new UniqueEList;
	public String inputModelURI
	public String outputFilePath

	@InitializeModel
	@Step
	def void initialize(List<String> args) {

		// Read args
		_self.inputModelURI = args.get(0)
		_self.outputFilePath = args.get(1)

		// Finding same resourceset as the transformation
		val rs = _self.eResource.resourceSet

		// Adding input and output metamodels to rs registry (in case loading outside eclipse UI)
		val inputMetamodel = _self.inputMetamodel.packages.get(0)
		val outputMetamodel = _self.outputMetamodel.packages.get(0)
		rs.packageRegistry.put(inputMetamodel.nsURI, inputMetamodel)
		rs.packageRegistry.put(outputMetamodel.nsURI, outputMetamodel)

		// Loading input model
		val inputModelResource = rs.getResource(URI.createURI(_self.inputModelURI), true)

		// If an input metamodel was specified, we check conformity of the input model
		if (_self.inputMetamodel !== null) {
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
	def void execute() {

		// Applying all the rules of the transformation
		for (Rule r : _self.rules) {
			r.apply()
		}

		// Saving output model
		if (_self.outputFilePath !== null && _self.outputFilePath != "") {
			val rs = new ResourceSetImpl
			val File outputFile = new File(_self.outputFilePath)
			if (outputFile.exists)
				outputFile.delete
			outputFile.parentFile.mkdirs
			val URI outputModelURI = URI.createFileURI(outputFile.absolutePath)
			val Resource outputModelResource = rs.createResource(outputModelURI)
			outputModelResource.contents.addAll(_self.outputModel)
			outputModelResource.save(null)
		}
	}
}

@Aspect(className=Rule)
class RuleAspect {

	/**
	 * Applies the rule to each possible match in the input model.
	 */
	@Step
	def void apply() {
		val inputObjectTemplate = _self.objectTemplates.get(0)
		val outputObjectTemplate = _self.objectTemplates.get(1)

		for (o : (_self.eContainer as Transformation).inputModel) {
			inputObjectTemplate.match(o)
			if (inputObjectTemplate.currentObject != null) {
				outputObjectTemplate.construct;
				(_self.eContainer as Transformation).outputModel.add(outputObjectTemplate.currentObject)
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

	def void reset() {
		_self.currentObject = null
	}

	@Step
	def void match(EObject o) {
		if (o.eClass.classifierID == _self.type.classifierID) {
			if (_self.bindings.forall[b|b.check(o)]) {
				_self.currentObject = o
			}
		} else {
			_self.currentObject = null
		}
	}

	@Step
	def void construct() {
		_self.currentObject = EcoreUtil.create(_self.type)
		for (b : _self.bindings) {
			b.assign()
		}
	}
}

@Aspect(className=Binding)
class BindingAspect {

	@Step
	def boolean check(EObject o) {
		val Object existingValue = o.eGet(_self.feature)
		val Object patternValue = _self.value.evaluate
		return existingValue == patternValue
	}

	@Step
	def void assign() {
		val Object value = _self.value.evaluate()
		(_self.eContainer as ObjectTemplate).currentObject.eSet(_self.feature, value)
	}
}

@Aspect(className=Value)
abstract class ValueAspect {
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
					return ((leftComputedValue as Integer) + (rightComputedValue as Integer))
				}

				throw new RuntimeException("Incompatible types for addition operator.")

			}
			case SUB: {
				// Case two integers
				if (leftComputedValue instanceof Integer && rightComputedValue instanceof Integer) {
					return ((leftComputedValue as Integer) - (rightComputedValue as Integer))
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
