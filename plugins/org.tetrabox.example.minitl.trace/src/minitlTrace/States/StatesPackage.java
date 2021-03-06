/**
 */
package minitlTrace.States;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
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
	 * The meta object id for the '{@link minitlTrace.States.impl.SpecificDimensionImpl <em>Specific Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.SpecificDimensionImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificDimension()
	 * @generated
	 */
	int SPECIFIC_DIMENSION = 3;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DIMENSION__VALUES = TracePackage.DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Specific Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_DIMENSION_FEATURE_COUNT = TracePackage.DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.ObjectTemplate_currentObject_DimensionImpl <em>Object Template current Object Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.ObjectTemplate_currentObject_DimensionImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getObjectTemplate_currentObject_Dimension()
	 * @generated
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Object Template current Object Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.SpecificValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificValue()
	 * @generated
	 */
	int SPECIFIC_VALUE = 7;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_VALUE__STATES = TracePackage.VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_VALUE_FEATURE_COUNT = TracePackage.VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.SpecificAttributeValue
	 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
	 * @generated
	 */
	int SPECIFIC_ATTRIBUTE_VALUE = 2;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_VALUE__STATES = SPECIFIC_VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Attribute Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT = SPECIFIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl <em>Object Template current Object Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getObjectTemplate_currentObject_Value()
	 * @generated
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Current Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Template current Object Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.SpecificReferenceValue
	 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificReferenceValue()
	 * @generated
	 */
	int SPECIFIC_REFERENCE_VALUE = 4;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_REFERENCE_VALUE__STATES = SPECIFIC_VALUE__STATES;

	/**
	 * The number of structural features of the '<em>Specific Reference Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_REFERENCE_VALUE_FEATURE_COUNT = SPECIFIC_VALUE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.SpecificStateImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificState()
	 * @generated
	 */
	int SPECIFIC_STATE = 5;

	/**
	 * The feature id for the '<em><b>Started Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__STARTED_STEPS = TracePackage.STATE__STARTED_STEPS;

	/**
	 * The feature id for the '<em><b>Ended Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__ENDED_STEPS = TracePackage.STATE__ENDED_STEPS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE__VALUES = TracePackage.STATE__VALUES;

	/**
	 * The number of structural features of the '<em>Specific State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STATE_FEATURE_COUNT = TracePackage.STATE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.SpecificTracedObjectImpl <em>Specific Traced Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.SpecificTracedObjectImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificTracedObject()
	 * @generated
	 */
	int SPECIFIC_TRACED_OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Dimensions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACED_OBJECT__DIMENSIONS = TracePackage.TRACED_OBJECT__DIMENSIONS;

	/**
	 * The number of structural features of the '<em>Specific Traced Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACED_OBJECT_FEATURE_COUNT = TracePackage.TRACED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_inputModelURI_DimensionImpl <em>Transformation input Model URI Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_inputModelURI_DimensionImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_inputModelURI_Dimension()
	 * @generated
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_DIMENSION = 8;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Transformation input Model URI Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl <em>Transformation input Model URI Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_inputModelURI_Value()
	 * @generated
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE = 9;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Input Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation input Model URI Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_URI_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_inputModel_DimensionImpl <em>Transformation input Model Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_inputModel_DimensionImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_inputModel_Dimension()
	 * @generated
	 */
	int TRANSFORMATION_INPUT_MODEL_DIMENSION = 10;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Transformation input Model Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_inputModel_ValueImpl <em>Transformation input Model Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_inputModel_ValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_inputModel_Value()
	 * @generated
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE = 11;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Input Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE__INPUT_MODEL = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation input Model Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_INPUT_MODEL_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_outputFilePath_DimensionImpl <em>Transformation output File Path Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_outputFilePath_DimensionImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_outputFilePath_Dimension()
	 * @generated
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION = 12;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Transformation output File Path Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_outputFilePath_ValueImpl <em>Transformation output File Path Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_outputFilePath_ValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_outputFilePath_Value()
	 * @generated
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE = 13;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Output File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__OUTPUT_FILE_PATH = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation output File Path Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_FILE_PATH_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_outputModel_DimensionImpl <em>Transformation output Model Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_outputModel_DimensionImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_outputModel_Dimension()
	 * @generated
	 */
	int TRANSFORMATION_OUTPUT_MODEL_DIMENSION = 14;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_DIMENSION__VALUES = SPECIFIC_DIMENSION__VALUES;

	/**
	 * The number of structural features of the '<em>Transformation output Model Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_DIMENSION_FEATURE_COUNT = SPECIFIC_DIMENSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.impl.Transformation_outputModel_ValueImpl <em>Transformation output Model Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.impl.Transformation_outputModel_ValueImpl
	 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_outputModel_Value()
	 * @generated
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE = 15;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES = SPECIFIC_ATTRIBUTE_VALUE__STATES;

	/**
	 * The feature id for the '<em><b>Output Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transformation output Model Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OUTPUT_MODEL_VALUE_FEATURE_COUNT = SPECIFIC_ATTRIBUTE_VALUE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link minitlTrace.States.ObjectTemplate_currentObject_Dimension <em>Object Template current Object Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Template current Object Dimension</em>'.
	 * @see minitlTrace.States.ObjectTemplate_currentObject_Dimension
	 * @generated
	 */
	EClass getObjectTemplate_currentObject_Dimension();

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
	 * Returns the meta object for class '{@link minitlTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Attribute Value</em>'.
	 * @see minitlTrace.States.SpecificAttributeValue
	 * @generated
	 */
	EClass getSpecificAttributeValue();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.SpecificDimension <em>Specific Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Dimension</em>'.
	 * @see minitlTrace.States.SpecificDimension
	 * @generated
	 */
	EClass getSpecificDimension();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Reference Value</em>'.
	 * @see minitlTrace.States.SpecificReferenceValue
	 * @generated
	 */
	EClass getSpecificReferenceValue();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.SpecificState <em>Specific State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific State</em>'.
	 * @see minitlTrace.States.SpecificState
	 * @generated
	 */
	EClass getSpecificState();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.SpecificTracedObject <em>Specific Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Traced Object</em>'.
	 * @see minitlTrace.States.SpecificTracedObject
	 * @generated
	 */
	EClass getSpecificTracedObject();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.SpecificValue <em>Specific Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Value</em>'.
	 * @see minitlTrace.States.SpecificValue
	 * @generated
	 */
	EClass getSpecificValue();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.Transformation_inputModelURI_Dimension <em>Transformation input Model URI Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation input Model URI Dimension</em>'.
	 * @see minitlTrace.States.Transformation_inputModelURI_Dimension
	 * @generated
	 */
	EClass getTransformation_inputModelURI_Dimension();

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
	 * Returns the meta object for class '{@link minitlTrace.States.Transformation_inputModel_Dimension <em>Transformation input Model Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation input Model Dimension</em>'.
	 * @see minitlTrace.States.Transformation_inputModel_Dimension
	 * @generated
	 */
	EClass getTransformation_inputModel_Dimension();

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
	 * Returns the meta object for class '{@link minitlTrace.States.Transformation_outputFilePath_Dimension <em>Transformation output File Path Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation output File Path Dimension</em>'.
	 * @see minitlTrace.States.Transformation_outputFilePath_Dimension
	 * @generated
	 */
	EClass getTransformation_outputFilePath_Dimension();

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
	 * Returns the meta object for class '{@link minitlTrace.States.Transformation_outputModel_Dimension <em>Transformation output Model Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation output Model Dimension</em>'.
	 * @see minitlTrace.States.Transformation_outputModel_Dimension
	 * @generated
	 */
	EClass getTransformation_outputModel_Dimension();

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
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.ObjectTemplate_currentObject_DimensionImpl <em>Object Template current Object Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.ObjectTemplate_currentObject_DimensionImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getObjectTemplate_currentObject_Dimension()
		 * @generated
		 */
		EClass OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION = eINSTANCE.getObjectTemplate_currentObject_Dimension();

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
		 * The meta object literal for the '{@link minitlTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.SpecificAttributeValue
		 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificAttributeValue()
		 * @generated
		 */
		EClass SPECIFIC_ATTRIBUTE_VALUE = eINSTANCE.getSpecificAttributeValue();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.SpecificDimensionImpl <em>Specific Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.SpecificDimensionImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificDimension()
		 * @generated
		 */
		EClass SPECIFIC_DIMENSION = eINSTANCE.getSpecificDimension();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.SpecificReferenceValue
		 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificReferenceValue()
		 * @generated
		 */
		EClass SPECIFIC_REFERENCE_VALUE = eINSTANCE.getSpecificReferenceValue();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.SpecificStateImpl <em>Specific State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.SpecificStateImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificState()
		 * @generated
		 */
		EClass SPECIFIC_STATE = eINSTANCE.getSpecificState();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.SpecificTracedObjectImpl <em>Specific Traced Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.SpecificTracedObjectImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificTracedObject()
		 * @generated
		 */
		EClass SPECIFIC_TRACED_OBJECT = eINSTANCE.getSpecificTracedObject();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.SpecificValueImpl <em>Specific Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.SpecificValueImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getSpecificValue()
		 * @generated
		 */
		EClass SPECIFIC_VALUE = eINSTANCE.getSpecificValue();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.impl.Transformation_inputModelURI_DimensionImpl <em>Transformation input Model URI Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.Transformation_inputModelURI_DimensionImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_inputModelURI_Dimension()
		 * @generated
		 */
		EClass TRANSFORMATION_INPUT_MODEL_URI_DIMENSION = eINSTANCE.getTransformation_inputModelURI_Dimension();

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
		 * The meta object literal for the '{@link minitlTrace.States.impl.Transformation_inputModel_DimensionImpl <em>Transformation input Model Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.Transformation_inputModel_DimensionImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_inputModel_Dimension()
		 * @generated
		 */
		EClass TRANSFORMATION_INPUT_MODEL_DIMENSION = eINSTANCE.getTransformation_inputModel_Dimension();

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
		 * The meta object literal for the '{@link minitlTrace.States.impl.Transformation_outputFilePath_DimensionImpl <em>Transformation output File Path Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.Transformation_outputFilePath_DimensionImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_outputFilePath_Dimension()
		 * @generated
		 */
		EClass TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION = eINSTANCE.getTransformation_outputFilePath_Dimension();

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
		 * The meta object literal for the '{@link minitlTrace.States.impl.Transformation_outputModel_DimensionImpl <em>Transformation output Model Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.impl.Transformation_outputModel_DimensionImpl
		 * @see minitlTrace.States.impl.StatesPackageImpl#getTransformation_outputModel_Dimension()
		 * @generated
		 */
		EClass TRANSFORMATION_OUTPUT_MODEL_DIMENSION = eINSTANCE.getTransformation_outputModel_Dimension();

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

	}

} //StatesPackage
