/**
 */
package minitlTrace.States.util;

import minitlTrace.States.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.gemoc.trace.commons.model.trace.Dimension;
import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;
import org.eclipse.gemoc.trace.commons.model.trace.Value;

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
 * @see minitlTrace.States.StatesPackage
 * @generated
 */
public class StatesSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesSwitch() {
		if (modelPackage == null) {
			modelPackage = StatesPackage.eINSTANCE;
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
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION: {
				ObjectTemplate_currentObject_Dimension objectTemplate_currentObject_Dimension = (ObjectTemplate_currentObject_Dimension)theEObject;
				T1 result = caseObjectTemplate_currentObject_Dimension(objectTemplate_currentObject_Dimension);
				if (result == null) result = caseSpecificDimension(objectTemplate_currentObject_Dimension);
				if (result == null) result = caseDimension(objectTemplate_currentObject_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE: {
				ObjectTemplate_currentObject_Value objectTemplate_currentObject_Value = (ObjectTemplate_currentObject_Value)theEObject;
				T1 result = caseObjectTemplate_currentObject_Value(objectTemplate_currentObject_Value);
				if (result == null) result = caseSpecificAttributeValue(objectTemplate_currentObject_Value);
				if (result == null) result = caseSpecificValue(objectTemplate_currentObject_Value);
				if (result == null) result = caseValue(objectTemplate_currentObject_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_ATTRIBUTE_VALUE: {
				SpecificAttributeValue specificAttributeValue = (SpecificAttributeValue)theEObject;
				T1 result = caseSpecificAttributeValue(specificAttributeValue);
				if (result == null) result = caseSpecificValue(specificAttributeValue);
				if (result == null) result = caseValue(specificAttributeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_DIMENSION: {
				SpecificDimension<?> specificDimension = (SpecificDimension<?>)theEObject;
				T1 result = caseSpecificDimension(specificDimension);
				if (result == null) result = caseDimension(specificDimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_REFERENCE_VALUE: {
				SpecificReferenceValue<?> specificReferenceValue = (SpecificReferenceValue<?>)theEObject;
				T1 result = caseSpecificReferenceValue(specificReferenceValue);
				if (result == null) result = caseSpecificValue(specificReferenceValue);
				if (result == null) result = caseValue(specificReferenceValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_STATE: {
				SpecificState specificState = (SpecificState)theEObject;
				T1 result = caseSpecificState(specificState);
				if (result == null) result = caseState(specificState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_TRACED_OBJECT: {
				SpecificTracedObject<?> specificTracedObject = (SpecificTracedObject<?>)theEObject;
				T1 result = caseSpecificTracedObject(specificTracedObject);
				if (result == null) result = caseTracedObject(specificTracedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.SPECIFIC_VALUE: {
				SpecificValue specificValue = (SpecificValue)theEObject;
				T1 result = caseSpecificValue(specificValue);
				if (result == null) result = caseValue(specificValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_DIMENSION: {
				Transformation_inputModelURI_Dimension transformation_inputModelURI_Dimension = (Transformation_inputModelURI_Dimension)theEObject;
				T1 result = caseTransformation_inputModelURI_Dimension(transformation_inputModelURI_Dimension);
				if (result == null) result = caseSpecificDimension(transformation_inputModelURI_Dimension);
				if (result == null) result = caseDimension(transformation_inputModelURI_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE: {
				Transformation_inputModelURI_Value transformation_inputModelURI_Value = (Transformation_inputModelURI_Value)theEObject;
				T1 result = caseTransformation_inputModelURI_Value(transformation_inputModelURI_Value);
				if (result == null) result = caseSpecificAttributeValue(transformation_inputModelURI_Value);
				if (result == null) result = caseSpecificValue(transformation_inputModelURI_Value);
				if (result == null) result = caseValue(transformation_inputModelURI_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_DIMENSION: {
				Transformation_inputModel_Dimension transformation_inputModel_Dimension = (Transformation_inputModel_Dimension)theEObject;
				T1 result = caseTransformation_inputModel_Dimension(transformation_inputModel_Dimension);
				if (result == null) result = caseSpecificDimension(transformation_inputModel_Dimension);
				if (result == null) result = caseDimension(transformation_inputModel_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_VALUE: {
				Transformation_inputModel_Value transformation_inputModel_Value = (Transformation_inputModel_Value)theEObject;
				T1 result = caseTransformation_inputModel_Value(transformation_inputModel_Value);
				if (result == null) result = caseSpecificAttributeValue(transformation_inputModel_Value);
				if (result == null) result = caseSpecificValue(transformation_inputModel_Value);
				if (result == null) result = caseValue(transformation_inputModel_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION: {
				Transformation_outputFilePath_Dimension transformation_outputFilePath_Dimension = (Transformation_outputFilePath_Dimension)theEObject;
				T1 result = caseTransformation_outputFilePath_Dimension(transformation_outputFilePath_Dimension);
				if (result == null) result = caseSpecificDimension(transformation_outputFilePath_Dimension);
				if (result == null) result = caseDimension(transformation_outputFilePath_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRANSFORMATION_OUTPUT_FILE_PATH_VALUE: {
				Transformation_outputFilePath_Value transformation_outputFilePath_Value = (Transformation_outputFilePath_Value)theEObject;
				T1 result = caseTransformation_outputFilePath_Value(transformation_outputFilePath_Value);
				if (result == null) result = caseSpecificAttributeValue(transformation_outputFilePath_Value);
				if (result == null) result = caseSpecificValue(transformation_outputFilePath_Value);
				if (result == null) result = caseValue(transformation_outputFilePath_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_DIMENSION: {
				Transformation_outputModel_Dimension transformation_outputModel_Dimension = (Transformation_outputModel_Dimension)theEObject;
				T1 result = caseTransformation_outputModel_Dimension(transformation_outputModel_Dimension);
				if (result == null) result = caseSpecificDimension(transformation_outputModel_Dimension);
				if (result == null) result = caseDimension(transformation_outputModel_Dimension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE: {
				Transformation_outputModel_Value transformation_outputModel_Value = (Transformation_outputModel_Value)theEObject;
				T1 result = caseTransformation_outputModel_Value(transformation_outputModel_Value);
				if (result == null) result = caseSpecificAttributeValue(transformation_outputModel_Value);
				if (result == null) result = caseSpecificValue(transformation_outputModel_Value);
				if (result == null) result = caseValue(transformation_outputModel_Value);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Template current Object Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Template current Object Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseObjectTemplate_currentObject_Dimension(ObjectTemplate_currentObject_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Template current Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Template current Object Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseObjectTemplate_currentObject_Value(ObjectTemplate_currentObject_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Attribute Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Attribute Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpecificAttributeValue(SpecificAttributeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ValueSubType extends SpecificValue> T1 caseSpecificDimension(SpecificDimension<ValueSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Reference Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Reference Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseSpecificReferenceValue(SpecificReferenceValue<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpecificState(SpecificState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Traced Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <DimensionSubType extends SpecificDimension<? extends SpecificValue>> T1 caseSpecificTracedObject(SpecificTracedObject<DimensionSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specific Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specific Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSpecificValue(SpecificValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation input Model URI Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation input Model URI Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformation_inputModelURI_Dimension(Transformation_inputModelURI_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation input Model URI Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation input Model URI Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformation_inputModelURI_Value(Transformation_inputModelURI_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation input Model Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation input Model Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformation_inputModel_Dimension(Transformation_inputModel_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation input Model Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation input Model Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformation_inputModel_Value(Transformation_inputModel_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation output File Path Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation output File Path Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformation_outputFilePath_Dimension(Transformation_outputFilePath_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation output File Path Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation output File Path Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformation_outputFilePath_Value(Transformation_outputFilePath_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation output Model Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation output Model Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformation_outputModel_Dimension(Transformation_outputModel_Dimension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformation output Model Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformation output Model Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransformation_outputModel_Value(Transformation_outputModel_Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dimension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <ValueSubType extends Value<?>> T1 caseDimension(Dimension<ValueSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StateSubType extends State<?, ?>> T1 caseValue(Value<StateSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <StepSubType extends Step<?>, ValueSubType extends Value<?>> T1 caseState(State<StepSubType, ValueSubType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Traced Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <DimensionSubType extends Dimension<?>> T1 caseTracedObject(TracedObject<DimensionSubType> object) {
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
	public T1 defaultCase(EObject object) {
		return null;
	}

} //StatesSwitch
