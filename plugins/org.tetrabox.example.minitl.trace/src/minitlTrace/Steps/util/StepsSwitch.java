/**
 */
package minitlTrace.Steps.util;

import fr.inria.diverse.trace.commons.model.trace.BigStep;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.SmallStep;
import fr.inria.diverse.trace.commons.model.trace.Step;

import minitlTrace.Steps.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see minitlTrace.Steps.StepsPackage
 * @generated
 */
public class StepsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsSwitch() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StepsPackage.MINITL_BINDING_ASSIGN: {
				Minitl_Binding_Assign minitl_Binding_Assign = (Minitl_Binding_Assign)theEObject;
				T result = caseMinitl_Binding_Assign(minitl_Binding_Assign);
				if (result == null) result = caseMinitl_ObjectTemplate_Construct_AbstractSubStep(minitl_Binding_Assign);
				if (result == null) result = caseSmallStep(minitl_Binding_Assign);
				if (result == null) result = caseSpecificStep(minitl_Binding_Assign);
				if (result == null) result = caseStep(minitl_Binding_Assign);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_BINDING_CHECK: {
				Minitl_Binding_Check minitl_Binding_Check = (Minitl_Binding_Check)theEObject;
				T result = caseMinitl_Binding_Check(minitl_Binding_Check);
				if (result == null) result = caseSmallStep(minitl_Binding_Check);
				if (result == null) result = caseMinitl_ObjectTemplate_Match_AbstractSubStep(minitl_Binding_Check);
				if (result == null) result = caseSpecificStep(minitl_Binding_Check);
				if (result == null) result = caseStep(minitl_Binding_Check);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_OBJECT_TEMPLATE_CONSTRUCT: {
				Minitl_ObjectTemplate_Construct minitl_ObjectTemplate_Construct = (Minitl_ObjectTemplate_Construct)theEObject;
				T result = caseMinitl_ObjectTemplate_Construct(minitl_ObjectTemplate_Construct);
				if (result == null) result = caseMinitl_Rule_Apply_AbstractSubStep(minitl_ObjectTemplate_Construct);
				if (result == null) result = caseSequentialStep(minitl_ObjectTemplate_Construct);
				if (result == null) result = caseSpecificStep(minitl_ObjectTemplate_Construct);
				if (result == null) result = caseBigStep(minitl_ObjectTemplate_Construct);
				if (result == null) result = caseStep(minitl_ObjectTemplate_Construct);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP: {
				Minitl_ObjectTemplate_Construct_AbstractSubStep minitl_ObjectTemplate_Construct_AbstractSubStep = (Minitl_ObjectTemplate_Construct_AbstractSubStep)theEObject;
				T result = caseMinitl_ObjectTemplate_Construct_AbstractSubStep(minitl_ObjectTemplate_Construct_AbstractSubStep);
				if (result == null) result = caseSpecificStep(minitl_ObjectTemplate_Construct_AbstractSubStep);
				if (result == null) result = caseStep(minitl_ObjectTemplate_Construct_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_OBJECT_TEMPLATE_CONSTRUCT_IMPLICIT_STEP: {
				Minitl_ObjectTemplate_Construct_ImplicitStep minitl_ObjectTemplate_Construct_ImplicitStep = (Minitl_ObjectTemplate_Construct_ImplicitStep)theEObject;
				T result = caseMinitl_ObjectTemplate_Construct_ImplicitStep(minitl_ObjectTemplate_Construct_ImplicitStep);
				if (result == null) result = caseMinitl_ObjectTemplate_Construct_AbstractSubStep(minitl_ObjectTemplate_Construct_ImplicitStep);
				if (result == null) result = caseSmallStep(minitl_ObjectTemplate_Construct_ImplicitStep);
				if (result == null) result = caseSpecificStep(minitl_ObjectTemplate_Construct_ImplicitStep);
				if (result == null) result = caseStep(minitl_ObjectTemplate_Construct_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_OBJECT_TEMPLATE_MATCH: {
				Minitl_ObjectTemplate_Match minitl_ObjectTemplate_Match = (Minitl_ObjectTemplate_Match)theEObject;
				T result = caseMinitl_ObjectTemplate_Match(minitl_ObjectTemplate_Match);
				if (result == null) result = caseMinitl_Rule_Apply_AbstractSubStep(minitl_ObjectTemplate_Match);
				if (result == null) result = caseSequentialStep(minitl_ObjectTemplate_Match);
				if (result == null) result = caseSpecificStep(minitl_ObjectTemplate_Match);
				if (result == null) result = caseBigStep(minitl_ObjectTemplate_Match);
				if (result == null) result = caseStep(minitl_ObjectTemplate_Match);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP: {
				Minitl_ObjectTemplate_Match_AbstractSubStep minitl_ObjectTemplate_Match_AbstractSubStep = (Minitl_ObjectTemplate_Match_AbstractSubStep)theEObject;
				T result = caseMinitl_ObjectTemplate_Match_AbstractSubStep(minitl_ObjectTemplate_Match_AbstractSubStep);
				if (result == null) result = caseSpecificStep(minitl_ObjectTemplate_Match_AbstractSubStep);
				if (result == null) result = caseStep(minitl_ObjectTemplate_Match_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_OBJECT_TEMPLATE_MATCH_IMPLICIT_STEP: {
				Minitl_ObjectTemplate_Match_ImplicitStep minitl_ObjectTemplate_Match_ImplicitStep = (Minitl_ObjectTemplate_Match_ImplicitStep)theEObject;
				T result = caseMinitl_ObjectTemplate_Match_ImplicitStep(minitl_ObjectTemplate_Match_ImplicitStep);
				if (result == null) result = caseMinitl_ObjectTemplate_Match_AbstractSubStep(minitl_ObjectTemplate_Match_ImplicitStep);
				if (result == null) result = caseSmallStep(minitl_ObjectTemplate_Match_ImplicitStep);
				if (result == null) result = caseSpecificStep(minitl_ObjectTemplate_Match_ImplicitStep);
				if (result == null) result = caseStep(minitl_ObjectTemplate_Match_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_RULE_APPLY: {
				Minitl_Rule_Apply minitl_Rule_Apply = (Minitl_Rule_Apply)theEObject;
				T result = caseMinitl_Rule_Apply(minitl_Rule_Apply);
				if (result == null) result = caseMinitl_Transformation_Execute_AbstractSubStep(minitl_Rule_Apply);
				if (result == null) result = caseSequentialStep(minitl_Rule_Apply);
				if (result == null) result = caseSpecificStep(minitl_Rule_Apply);
				if (result == null) result = caseBigStep(minitl_Rule_Apply);
				if (result == null) result = caseStep(minitl_Rule_Apply);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_RULE_APPLY_ABSTRACT_SUB_STEP: {
				Minitl_Rule_Apply_AbstractSubStep minitl_Rule_Apply_AbstractSubStep = (Minitl_Rule_Apply_AbstractSubStep)theEObject;
				T result = caseMinitl_Rule_Apply_AbstractSubStep(minitl_Rule_Apply_AbstractSubStep);
				if (result == null) result = caseSpecificStep(minitl_Rule_Apply_AbstractSubStep);
				if (result == null) result = caseStep(minitl_Rule_Apply_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_RULE_APPLY_IMPLICIT_STEP: {
				Minitl_Rule_Apply_ImplicitStep minitl_Rule_Apply_ImplicitStep = (Minitl_Rule_Apply_ImplicitStep)theEObject;
				T result = caseMinitl_Rule_Apply_ImplicitStep(minitl_Rule_Apply_ImplicitStep);
				if (result == null) result = caseMinitl_Rule_Apply_AbstractSubStep(minitl_Rule_Apply_ImplicitStep);
				if (result == null) result = caseSmallStep(minitl_Rule_Apply_ImplicitStep);
				if (result == null) result = caseSpecificStep(minitl_Rule_Apply_ImplicitStep);
				if (result == null) result = caseStep(minitl_Rule_Apply_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_TRANSFORMATION_EXECUTE: {
				Minitl_Transformation_Execute minitl_Transformation_Execute = (Minitl_Transformation_Execute)theEObject;
				T result = caseMinitl_Transformation_Execute(minitl_Transformation_Execute);
				if (result == null) result = caseSpecificStep(minitl_Transformation_Execute);
				if (result == null) result = caseSequentialStep(minitl_Transformation_Execute);
				if (result == null) result = caseBigStep(minitl_Transformation_Execute);
				if (result == null) result = caseStep(minitl_Transformation_Execute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP: {
				Minitl_Transformation_Execute_AbstractSubStep minitl_Transformation_Execute_AbstractSubStep = (Minitl_Transformation_Execute_AbstractSubStep)theEObject;
				T result = caseMinitl_Transformation_Execute_AbstractSubStep(minitl_Transformation_Execute_AbstractSubStep);
				if (result == null) result = caseSpecificStep(minitl_Transformation_Execute_AbstractSubStep);
				if (result == null) result = caseStep(minitl_Transformation_Execute_AbstractSubStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_TRANSFORMATION_EXECUTE_IMPLICIT_STEP: {
				Minitl_Transformation_Execute_ImplicitStep minitl_Transformation_Execute_ImplicitStep = (Minitl_Transformation_Execute_ImplicitStep)theEObject;
				T result = caseMinitl_Transformation_Execute_ImplicitStep(minitl_Transformation_Execute_ImplicitStep);
				if (result == null) result = caseMinitl_Transformation_Execute_AbstractSubStep(minitl_Transformation_Execute_ImplicitStep);
				if (result == null) result = caseSmallStep(minitl_Transformation_Execute_ImplicitStep);
				if (result == null) result = caseSpecificStep(minitl_Transformation_Execute_ImplicitStep);
				if (result == null) result = caseStep(minitl_Transformation_Execute_ImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.MINITL_TRANSFORMATION_INITIALIZE: {
				Minitl_Transformation_Initialize minitl_Transformation_Initialize = (Minitl_Transformation_Initialize)theEObject;
				T result = caseMinitl_Transformation_Initialize(minitl_Transformation_Initialize);
				if (result == null) result = caseSpecificStep(minitl_Transformation_Initialize);
				if (result == null) result = caseSmallStep(minitl_Transformation_Initialize);
				if (result == null) result = caseStep(minitl_Transformation_Initialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.ROOT_IMPLICIT_STEP: {
				RootImplicitStep rootImplicitStep = (RootImplicitStep)theEObject;
				T result = caseRootImplicitStep(rootImplicitStep);
				if (result == null) result = caseSmallStep(rootImplicitStep);
				if (result == null) result = caseStep(rootImplicitStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StepsPackage.SPECIFIC_STEP: {
				SpecificStep specificStep = (SpecificStep)theEObject;
				T result = caseSpecificStep(specificStep);
				if (result == null) result = caseStep(specificStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Binding Assign</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Binding Assign</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_Binding_Assign(Minitl_Binding_Assign object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Binding Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Binding Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_Binding_Check(Minitl_Binding_Check object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Object Template Construct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Object Template Construct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_ObjectTemplate_Construct(Minitl_ObjectTemplate_Construct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Object Template Construct Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Object Template Construct Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_ObjectTemplate_Construct_AbstractSubStep(Minitl_ObjectTemplate_Construct_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Object Template Construct Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Object Template Construct Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_ObjectTemplate_Construct_ImplicitStep(Minitl_ObjectTemplate_Construct_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Object Template Match</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Object Template Match</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_ObjectTemplate_Match(Minitl_ObjectTemplate_Match object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Object Template Match Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Object Template Match Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_ObjectTemplate_Match_AbstractSubStep(Minitl_ObjectTemplate_Match_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Object Template Match Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Object Template Match Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_ObjectTemplate_Match_ImplicitStep(Minitl_ObjectTemplate_Match_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Rule Apply</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Rule Apply</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_Rule_Apply(Minitl_Rule_Apply object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Rule Apply Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Rule Apply Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_Rule_Apply_AbstractSubStep(Minitl_Rule_Apply_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Rule Apply Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Rule Apply Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_Rule_Apply_ImplicitStep(Minitl_Rule_Apply_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Transformation Execute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Transformation Execute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_Transformation_Execute(Minitl_Transformation_Execute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Transformation Execute Abstract Sub Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Transformation Execute Abstract Sub Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_Transformation_Execute_AbstractSubStep(Minitl_Transformation_Execute_AbstractSubStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Transformation Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Transformation Execute Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_Transformation_Execute_ImplicitStep(Minitl_Transformation_Execute_ImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minitl Transformation Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minitl Transformation Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinitl_Transformation_Initialize(Minitl_Transformation_Initialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root Implicit Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootImplicitStep(RootImplicitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificStep(SpecificStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallStep(SmallStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step> T caseBigStep(BigStep<StepSubtype> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubtype extends Step> T caseSequentialStep(SequentialStep<StepSubtype> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StepsSwitch
