/**
 */
package minitlTrace.States;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see minitlTrace.States.StatesFactory
 * @model kind="package"
 * @generated
 */
public interface StatesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "States";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "minitlTrace_States";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tracedclasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesPackage eINSTANCE = minitlTrace.States.impl.StatesPackageImpl.init();

	/**
	 * The meta object id for the '{@link minitlTrace.States.Value <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.Value
	 * @see minitlTrace.States.impl.StatesPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 6;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE__STATES_NO_OPPOSITE = 0;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl <em>Object Template current Object Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getObjectTemplate_currentObject_Value()
	 * @generated
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Current Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Template current Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Template current Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.StateImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENDED_STEPS = 0;

	/**
	 * The feature id for the '<em><b>Object Template current Object Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES = 1;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__STARTED_STEPS = 2;

	/**
	 * The feature id for the '<em><b>Transformation input Model URI Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Transformation input Model Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSFORMATION_INPUT_MODEL_VALUES = 4;

	/**
	 * The feature id for the '<em><b>Transformation output File Path Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSFORMATION_OUTPUT_FILE_PATH_VALUES = 5;

	/**
	 * The feature id for the '<em><b>Transformation output Model Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES = 6;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl <em>Transformation input Model URI Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_inputModelURI_Value()
	 * @generated
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE = 2;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Input Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation input Model URI Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transformation input Model URI Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_inputModel_ValueImpl <em>Transformation input Model Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_inputModel_ValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_inputModel_Value()
	 * @generated
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE = 3;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Input Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE__INPUT_MODEL = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation input Model Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transformation input Model Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_outputFilePath_ValueImpl <em>Transformation output File Path Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_outputFilePath_ValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_outputFilePath_Value()
	 * @generated
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE = 4;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Output File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__OUTPUT_FILE_PATH = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation output File Path Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transformation output File Path Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_outputModel_ValueImpl <em>Transformation output Model Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_outputModel_ValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_outputModel_Value()
	 * @generated
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE = 5;

	/**
	 * The feature id for the '<em><b>States No Opposite</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES_NO_OPPOSITE = VALUE__STATES_NO_OPPOSITE;

	/**
	 * The feature id for the '<em><b>Output Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transformation output Model Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get States No Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE___GET_STATES_NO_OPPOSITE = VALUE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transformation output Model Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link minitlTrace.States.ObjectTemplate_currentObject_Value <em>Object Template current Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Template current Object Value</em>'.
	 * @see minitlTrace.States.ObjectTemplate_currentObject_Value
	 * @generated
	 */
	EClass getObjectTemplate_currentObject_Value();

	/**
	 * Returns the meta object for the attribute '{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getCurrentObject <em>Current Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Object</em>'.
	 * @see minitlTrace.States.ObjectTemplate_currentObject_Value#getCurrentObject()
	 * @see #getObjectTemplate_currentObject_Value()
	 * @generated
	 */
	EAttribute getObjectTemplate_currentObject_Value_CurrentObject();

	/**
	 * Returns the meta object for the container reference '{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see minitlTrace.States.ObjectTemplate_currentObject_Value#getParent()
	 * @see #getObjectTemplate_currentObject_Value()
	 * @generated
	 */
	EReference getObjectTemplate_currentObject_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see minitlTrace.States.ObjectTemplate_currentObject_Value#getStates()
	 * @see #getObjectTemplate_currentObject_Value()
	 * @generated
	 */
	EReference getObjectTemplate_currentObject_Value_States();

	/**
	 * Returns the meta object for the '{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see minitlTrace.States.ObjectTemplate_currentObject_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getObjectTemplate_currentObject_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see minitlTrace.States.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.State#getEndedSteps <em>Ended Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ended Steps</em>'.
	 * @see minitlTrace.States.State#getEndedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EndedSteps();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.State#getObjectTemplate_currentObject_Values <em>Object Template current Object Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Object Template current Object Values</em>'.
	 * @see minitlTrace.States.State#getObjectTemplate_currentObject_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ObjectTemplate_currentObject_Values();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.State#getStartedSteps <em>Started Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Started Steps</em>'.
	 * @see minitlTrace.States.State#getStartedSteps()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_StartedSteps();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.State#getTransformation_inputModelURI_Values <em>Transformation input Model URI Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformation input Model URI Values</em>'.
	 * @see minitlTrace.States.State#getTransformation_inputModelURI_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transformation_inputModelURI_Values();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.State#getTransformation_inputModel_Values <em>Transformation input Model Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformation input Model Values</em>'.
	 * @see minitlTrace.States.State#getTransformation_inputModel_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transformation_inputModel_Values();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.State#getTransformation_outputFilePath_Values <em>Transformation output File Path Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformation output File Path Values</em>'.
	 * @see minitlTrace.States.State#getTransformation_outputFilePath_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transformation_outputFilePath_Values();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.State#getTransformation_outputModel_Values <em>Transformation output Model Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transformation output Model Values</em>'.
	 * @see minitlTrace.States.State#getTransformation_outputModel_Values()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Transformation_outputModel_Values();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.Transformation_inputModelURI_Value <em>Transformation input Model URI Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation input Model URI Value</em>'.
	 * @see minitlTrace.States.Transformation_inputModelURI_Value
	 * @generated
	 */
	EClass getTransformation_inputModelURI_Value();

	/**
	 * Returns the meta object for the attribute '{@link minitlTrace.States.Transformation_inputModelURI_Value#getInputModelURI <em>Input Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Model URI</em>'.
	 * @see minitlTrace.States.Transformation_inputModelURI_Value#getInputModelURI()
	 * @see #getTransformation_inputModelURI_Value()
	 * @generated
	 */
	EAttribute getTransformation_inputModelURI_Value_InputModelURI();

	/**
	 * Returns the meta object for the container reference '{@link minitlTrace.States.Transformation_inputModelURI_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see minitlTrace.States.Transformation_inputModelURI_Value#getParent()
	 * @see #getTransformation_inputModelURI_Value()
	 * @generated
	 */
	EReference getTransformation_inputModelURI_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.Transformation_inputModelURI_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see minitlTrace.States.Transformation_inputModelURI_Value#getStates()
	 * @see #getTransformation_inputModelURI_Value()
	 * @generated
	 */
	EReference getTransformation_inputModelURI_Value_States();

	/**
	 * Returns the meta object for the '{@link minitlTrace.States.Transformation_inputModelURI_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see minitlTrace.States.Transformation_inputModelURI_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getTransformation_inputModelURI_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.Transformation_inputModel_Value <em>Transformation input Model Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation input Model Value</em>'.
	 * @see minitlTrace.States.Transformation_inputModel_Value
	 * @generated
	 */
	EClass getTransformation_inputModel_Value();

	/**
	 * Returns the meta object for the attribute list '{@link minitlTrace.States.Transformation_inputModel_Value#getInputModel <em>Input Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Input Model</em>'.
	 * @see minitlTrace.States.Transformation_inputModel_Value#getInputModel()
	 * @see #getTransformation_inputModel_Value()
	 * @generated
	 */
	EAttribute getTransformation_inputModel_Value_InputModel();

	/**
	 * Returns the meta object for the container reference '{@link minitlTrace.States.Transformation_inputModel_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see minitlTrace.States.Transformation_inputModel_Value#getParent()
	 * @see #getTransformation_inputModel_Value()
	 * @generated
	 */
	EReference getTransformation_inputModel_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.Transformation_inputModel_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see minitlTrace.States.Transformation_inputModel_Value#getStates()
	 * @see #getTransformation_inputModel_Value()
	 * @generated
	 */
	EReference getTransformation_inputModel_Value_States();

	/**
	 * Returns the meta object for the '{@link minitlTrace.States.Transformation_inputModel_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see minitlTrace.States.Transformation_inputModel_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getTransformation_inputModel_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.Transformation_outputFilePath_Value <em>Transformation output File Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation output File Path Value</em>'.
	 * @see minitlTrace.States.Transformation_outputFilePath_Value
	 * @generated
	 */
	EClass getTransformation_outputFilePath_Value();

	/**
	 * Returns the meta object for the attribute '{@link minitlTrace.States.Transformation_outputFilePath_Value#getOutputFilePath <em>Output File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output File Path</em>'.
	 * @see minitlTrace.States.Transformation_outputFilePath_Value#getOutputFilePath()
	 * @see #getTransformation_outputFilePath_Value()
	 * @generated
	 */
	EAttribute getTransformation_outputFilePath_Value_OutputFilePath();

	/**
	 * Returns the meta object for the container reference '{@link minitlTrace.States.Transformation_outputFilePath_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see minitlTrace.States.Transformation_outputFilePath_Value#getParent()
	 * @see #getTransformation_outputFilePath_Value()
	 * @generated
	 */
	EReference getTransformation_outputFilePath_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.Transformation_outputFilePath_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see minitlTrace.States.Transformation_outputFilePath_Value#getStates()
	 * @see #getTransformation_outputFilePath_Value()
	 * @generated
	 */
	EReference getTransformation_outputFilePath_Value_States();

	/**
	 * Returns the meta object for the '{@link minitlTrace.States.Transformation_outputFilePath_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see minitlTrace.States.Transformation_outputFilePath_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getTransformation_outputFilePath_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.Transformation_outputModel_Value <em>Transformation output Model Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation output Model Value</em>'.
	 * @see minitlTrace.States.Transformation_outputModel_Value
	 * @generated
	 */
	EClass getTransformation_outputModel_Value();

	/**
	 * Returns the meta object for the attribute list '{@link minitlTrace.States.Transformation_outputModel_Value#getOutputModel <em>Output Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Model</em>'.
	 * @see minitlTrace.States.Transformation_outputModel_Value#getOutputModel()
	 * @see #getTransformation_outputModel_Value()
	 * @generated
	 */
	EAttribute getTransformation_outputModel_Value_OutputModel();

	/**
	 * Returns the meta object for the container reference '{@link minitlTrace.States.Transformation_outputModel_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see minitlTrace.States.Transformation_outputModel_Value#getParent()
	 * @see #getTransformation_outputModel_Value()
	 * @generated
	 */
	EReference getTransformation_outputModel_Value_Parent();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.Transformation_outputModel_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see minitlTrace.States.Transformation_outputModel_Value#getStates()
	 * @see #getTransformation_outputModel_Value()
	 * @generated
	 */
	EReference getTransformation_outputModel_Value_States();

	/**
	 * Returns the meta object for the '{@link minitlTrace.States.Transformation_outputModel_Value#getStatesNoOpposite() <em>Get States No Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get States No Opposite</em>' operation.
	 * @see minitlTrace.States.Transformation_outputModel_Value#getStatesNoOpposite()
	 * @generated
	 */
	EOperation getTransformation_outputModel_Value__GetStatesNoOpposite();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see minitlTrace.States.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.States.Value#getStatesNoOpposite <em>States No Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States No Opposite</em>'.
	 * @see minitlTrace.States.Value#getStatesNoOpposite()
	 * @see #getValue()
	 * @generated
	 */
	EReference getValue_StatesNoOpposite();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StatesFactory getStatesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl <em>Object Template current Object Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getObjectTemplate_currentObject_Value()
		 * @generated
		 */
		EClass OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE = eINSTANCE.getObjectTemplate_currentObject_Value();

		/**
		 * The meta object literal for the '<em><b>Current Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT = eINSTANCE.getObjectTemplate_currentObject_Value_CurrentObject();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT = eINSTANCE.getObjectTemplate_currentObject_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES = eINSTANCE.getObjectTemplate_currentObject_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getObjectTemplate_currentObject_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.StateImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Ended Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENDED_STEPS = eINSTANCE.getState_EndedSteps();

		/**
		 * The meta object literal for the '<em><b>Object Template current Object Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES = eINSTANCE.getState_ObjectTemplate_currentObject_Values();

		/**
		 * The meta object literal for the '<em><b>Started Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__STARTED_STEPS = eINSTANCE.getState_StartedSteps();

		/**
		 * The meta object literal for the '<em><b>Transformation input Model URI Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES = eINSTANCE.getState_Transformation_inputModelURI_Values();

		/**
		 * The meta object literal for the '<em><b>Transformation input Model Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSFORMATION_INPUT_MODEL_VALUES = eINSTANCE.getState_Transformation_inputModel_Values();

		/**
		 * The meta object literal for the '<em><b>Transformation output File Path Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSFORMATION_OUTPUT_FILE_PATH_VALUES = eINSTANCE.getState_Transformation_outputFilePath_Values();

		/**
		 * The meta object literal for the '<em><b>Transformation output Model Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES = eINSTANCE.getState_Transformation_outputModel_Values();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl <em>Transformation input Model URI Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_inputModelURI_Value()
		 * @generated
		 */
		EClass TRANSFORMATION_INPUT_MODEL_URI_VALUE = eINSTANCE.getTransformation_inputModelURI_Value();

		/**
		 * The meta object literal for the '<em><b>Input Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI = eINSTANCE.getTransformation_inputModelURI_Value_InputModelURI();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT = eINSTANCE.getTransformation_inputModelURI_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES = eINSTANCE.getTransformation_inputModelURI_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION_INPUT_MODEL_URI_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getTransformation_inputModelURI_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.Transformation_inputModel_ValueImpl <em>Transformation input Model Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.Transformation_inputModel_ValueImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_inputModel_Value()
		 * @generated
		 */
		EClass TRANSFORMATION_INPUT_MODEL_VALUE = eINSTANCE.getTransformation_inputModel_Value();

		/**
		 * The meta object literal for the '<em><b>Input Model</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_INPUT_MODEL_VALUE__INPUT_MODEL = eINSTANCE.getTransformation_inputModel_Value_InputModel();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_INPUT_MODEL_VALUE__PARENT = eINSTANCE.getTransformation_inputModel_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_INPUT_MODEL_VALUE__STATES = eINSTANCE.getTransformation_inputModel_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION_INPUT_MODEL_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getTransformation_inputModel_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.Transformation_outputFilePath_ValueImpl <em>Transformation output File Path Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.Transformation_outputFilePath_ValueImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_outputFilePath_Value()
		 * @generated
		 */
		EClass TRANSFORMATION_OUTPUT_FILE_PATH_VALUE = eINSTANCE.getTransformation_outputFilePath_Value();

		/**
		 * The meta object literal for the '<em><b>Output File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__OUTPUT_FILE_PATH = eINSTANCE.getTransformation_outputFilePath_Value_OutputFilePath();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__PARENT = eINSTANCE.getTransformation_outputFilePath_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__STATES = eINSTANCE.getTransformation_outputFilePath_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION_OUTPUT_FILE_PATH_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getTransformation_outputFilePath_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.Transformation_outputModel_ValueImpl <em>Transformation output Model Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.Transformation_outputModel_ValueImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_outputModel_Value()
		 * @generated
		 */
		EClass TRANSFORMATION_OUTPUT_MODEL_VALUE = eINSTANCE.getTransformation_outputModel_Value();

		/**
		 * The meta object literal for the '<em><b>Output Model</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL = eINSTANCE.getTransformation_outputModel_Value_OutputModel();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT = eINSTANCE.getTransformation_outputModel_Value_Parent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES = eINSTANCE.getTransformation_outputModel_Value_States();

		/**
		 * The meta object literal for the '<em><b>Get States No Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION_OUTPUT_MODEL_VALUE___GET_STATES_NO_OPPOSITE = eINSTANCE.getTransformation_outputModel_Value__GetStatesNoOpposite();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.Value <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.Value
		 * @see minitlTrace.States.impl.StatesPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>States No Opposite</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE__STATES_NO_OPPOSITE = eINSTANCE.getValue_StatesNoOpposite();

	}

} //StatesPackage
