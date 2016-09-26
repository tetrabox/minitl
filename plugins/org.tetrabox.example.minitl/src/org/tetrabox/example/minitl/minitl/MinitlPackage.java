/**
 */
package org.tetrabox.example.minitl.minitl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.tetrabox.example.minitl.minitl.MinitlFactory
 * @model kind="package"
 * @generated
 */
public interface MinitlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "minitl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://minitl/minitl/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.tetrabox.example.minitl.model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinitlPackage eINSTANCE = org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.NamedElementImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.TransformationImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Input Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__INPUT_METAMODEL = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__RULES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__OUTPUT_METAMODEL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__INPUT_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Model</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__OUTPUT_MODEL = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__INPUT_MODEL_URI = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Output File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__OUTPUT_FILE_PATH = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.RuleImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Object Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__OBJECT_TEMPLATES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TRANSFORMATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.BindingImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 2;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Object Template</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__OBJECT_TEMPLATE = 2;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.ValueImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 3;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.BinaryExpressionImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__EXPRESSIONS = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.FieldAccessValueImpl <em>Field Access Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.FieldAccessValueImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getFieldAccessValue()
	 * @generated
	 */
	int FIELD_ACCESS_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_VALUE__OBJECT = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_VALUE__FEATURE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Field Access Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_ACCESS_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.ObjectTemplateImpl <em>Object Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.ObjectTemplateImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getObjectTemplate()
	 * @generated
	 */
	int OBJECT_TEMPLATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE__BINDINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE__RULE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE__CURRENT_OBJECT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Object Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.StringValueImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.ObjectTemplateValueImpl <em>Object Template Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.ObjectTemplateValueImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getObjectTemplateValue()
	 * @generated
	 */
	int OBJECT_TEMPLATE_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Objecttemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_VALUE__OBJECTTEMPLATE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Object Template Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TEMPLATE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.impl.MetamodelImpl <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.impl.MetamodelImpl
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 10;

	/**
	 * The feature id for the '<em><b>Packages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__PACKAGES = 0;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.tetrabox.example.minitl.minitl.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.tetrabox.example.minitl.minitl.Operator
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 11;

	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 12;

	/**
	 * The meta object id for the '<em>EObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EObject
	 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getEObject()
	 * @generated
	 */
	int EOBJECT = 13;


	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.example.minitl.minitl.Transformation#getInputMetamodel <em>Input Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Metamodel</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Transformation#getInputMetamodel()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_InputMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.minitl.minitl.Transformation#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Transformation#getRules()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_Rules();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.example.minitl.minitl.Transformation#getOutputMetamodel <em>Output Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Metamodel</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Transformation#getOutputMetamodel()
	 * @see #getTransformation()
	 * @generated
	 */
	EReference getTransformation_OutputMetamodel();

	/**
	 * Returns the meta object for the attribute list '{@link org.tetrabox.example.minitl.minitl.Transformation#getInputModel <em>Input Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Input Model</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Transformation#getInputModel()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_InputModel();

	/**
	 * Returns the meta object for the attribute list '{@link org.tetrabox.example.minitl.minitl.Transformation#getOutputModel <em>Output Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Output Model</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Transformation#getOutputModel()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_OutputModel();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.minitl.Transformation#getInputModelURI <em>Input Model URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Model URI</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Transformation#getInputModelURI()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_InputModelURI();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.minitl.Transformation#getOutputFilePath <em>Output File Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output File Path</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Transformation#getOutputFilePath()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_OutputFilePath();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.minitl.minitl.Rule#getObjectTemplates <em>Object Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object Templates</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Rule#getObjectTemplates()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ObjectTemplates();

	/**
	 * Returns the meta object for the container reference '{@link org.tetrabox.example.minitl.minitl.Rule#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transformation</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Rule#getTransformation()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Transformation();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.minitl.minitl.Binding#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Binding#getFeature()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.example.minitl.minitl.Binding#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Binding#getValue()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Value();

	/**
	 * Returns the meta object for the container reference '{@link org.tetrabox.example.minitl.minitl.Binding#getObjectTemplate <em>Object Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Object Template</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Binding#getObjectTemplate()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_ObjectTemplate();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see org.tetrabox.example.minitl.minitl.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.minitl.minitl.BinaryExpression#getExpressions <em>Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expressions</em>'.
	 * @see org.tetrabox.example.minitl.minitl.BinaryExpression#getExpressions()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Expressions();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.minitl.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see org.tetrabox.example.minitl.minitl.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.FieldAccessValue <em>Field Access Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Access Value</em>'.
	 * @see org.tetrabox.example.minitl.minitl.FieldAccessValue
	 * @generated
	 */
	EClass getFieldAccessValue();

	/**
	 * Returns the meta object for the containment reference '{@link org.tetrabox.example.minitl.minitl.FieldAccessValue#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.tetrabox.example.minitl.minitl.FieldAccessValue#getObject()
	 * @see #getFieldAccessValue()
	 * @generated
	 */
	EReference getFieldAccessValue_Object();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.minitl.minitl.FieldAccessValue#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.tetrabox.example.minitl.minitl.FieldAccessValue#getFeature()
	 * @see #getFieldAccessValue()
	 * @generated
	 */
	EReference getFieldAccessValue_Feature();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.ObjectTemplate <em>Object Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Template</em>'.
	 * @see org.tetrabox.example.minitl.minitl.ObjectTemplate
	 * @generated
	 */
	EClass getObjectTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.tetrabox.example.minitl.minitl.ObjectTemplate#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bindings</em>'.
	 * @see org.tetrabox.example.minitl.minitl.ObjectTemplate#getBindings()
	 * @see #getObjectTemplate()
	 * @generated
	 */
	EReference getObjectTemplate_Bindings();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.minitl.minitl.ObjectTemplate#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.tetrabox.example.minitl.minitl.ObjectTemplate#getType()
	 * @see #getObjectTemplate()
	 * @generated
	 */
	EReference getObjectTemplate_Type();

	/**
	 * Returns the meta object for the container reference '{@link org.tetrabox.example.minitl.minitl.ObjectTemplate#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Rule</em>'.
	 * @see org.tetrabox.example.minitl.minitl.ObjectTemplate#getRule()
	 * @see #getObjectTemplate()
	 * @generated
	 */
	EReference getObjectTemplate_Rule();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.minitl.ObjectTemplate#getCurrentObject <em>Current Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Object</em>'.
	 * @see org.tetrabox.example.minitl.minitl.ObjectTemplate#getCurrentObject()
	 * @see #getObjectTemplate()
	 * @generated
	 */
	EAttribute getObjectTemplate_CurrentObject();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see org.tetrabox.example.minitl.minitl.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.minitl.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.tetrabox.example.minitl.minitl.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see org.tetrabox.example.minitl.minitl.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.minitl.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.tetrabox.example.minitl.minitl.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.ObjectTemplateValue <em>Object Template Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Template Value</em>'.
	 * @see org.tetrabox.example.minitl.minitl.ObjectTemplateValue
	 * @generated
	 */
	EClass getObjectTemplateValue();

	/**
	 * Returns the meta object for the reference '{@link org.tetrabox.example.minitl.minitl.ObjectTemplateValue#getObjecttemplate <em>Objecttemplate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Objecttemplate</em>'.
	 * @see org.tetrabox.example.minitl.minitl.ObjectTemplateValue#getObjecttemplate()
	 * @see #getObjectTemplateValue()
	 * @generated
	 */
	EReference getObjectTemplateValue_Objecttemplate();

	/**
	 * Returns the meta object for class '{@link org.tetrabox.example.minitl.minitl.Metamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Metamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the reference list '{@link org.tetrabox.example.minitl.minitl.Metamodel#getPackages <em>Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Packages</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Metamodel#getPackages()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Packages();

	/**
	 * Returns the meta object for enum '{@link org.tetrabox.example.minitl.minitl.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see org.tetrabox.example.minitl.minitl.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EObject <em>EObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EObject</em>'.
	 * @see org.eclipse.emf.ecore.EObject
	 * @model instanceClass="org.eclipse.emf.ecore.EObject"
	 * @generated
	 */
	EDataType getEObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MinitlFactory getMinitlFactory();

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
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.TransformationImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Input Metamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__INPUT_METAMODEL = eINSTANCE.getTransformation_InputMetamodel();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__RULES = eINSTANCE.getTransformation_Rules();

		/**
		 * The meta object literal for the '<em><b>Output Metamodel</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORMATION__OUTPUT_METAMODEL = eINSTANCE.getTransformation_OutputMetamodel();

		/**
		 * The meta object literal for the '<em><b>Input Model</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__INPUT_MODEL = eINSTANCE.getTransformation_InputModel();

		/**
		 * The meta object literal for the '<em><b>Output Model</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__OUTPUT_MODEL = eINSTANCE.getTransformation_OutputModel();

		/**
		 * The meta object literal for the '<em><b>Input Model URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__INPUT_MODEL_URI = eINSTANCE.getTransformation_InputModelURI();

		/**
		 * The meta object literal for the '<em><b>Output File Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__OUTPUT_FILE_PATH = eINSTANCE.getTransformation_OutputFilePath();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.RuleImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Object Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__OBJECT_TEMPLATES = eINSTANCE.getRule_ObjectTemplates();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TRANSFORMATION = eINSTANCE.getRule_Transformation();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.BindingImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__FEATURE = eINSTANCE.getBinding_Feature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__VALUE = eINSTANCE.getBinding_Value();

		/**
		 * The meta object literal for the '<em><b>Object Template</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__OBJECT_TEMPLATE = eINSTANCE.getBinding_ObjectTemplate();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.ValueImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.BinaryExpressionImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__EXPRESSIONS = eINSTANCE.getBinaryExpression_Expressions();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.FieldAccessValueImpl <em>Field Access Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.FieldAccessValueImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getFieldAccessValue()
		 * @generated
		 */
		EClass FIELD_ACCESS_VALUE = eINSTANCE.getFieldAccessValue();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ACCESS_VALUE__OBJECT = eINSTANCE.getFieldAccessValue_Object();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_ACCESS_VALUE__FEATURE = eINSTANCE.getFieldAccessValue_Feature();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.ObjectTemplateImpl <em>Object Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.ObjectTemplateImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getObjectTemplate()
		 * @generated
		 */
		EClass OBJECT_TEMPLATE = eINSTANCE.getObjectTemplate();

		/**
		 * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TEMPLATE__BINDINGS = eINSTANCE.getObjectTemplate_Bindings();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TEMPLATE__TYPE = eINSTANCE.getObjectTemplate_Type();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TEMPLATE__RULE = eINSTANCE.getObjectTemplate_Rule();

		/**
		 * The meta object literal for the '<em><b>Current Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TEMPLATE__CURRENT_OBJECT = eINSTANCE.getObjectTemplate_CurrentObject();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.NamedElementImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.StringValueImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.ObjectTemplateValueImpl <em>Object Template Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.ObjectTemplateValueImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getObjectTemplateValue()
		 * @generated
		 */
		EClass OBJECT_TEMPLATE_VALUE = eINSTANCE.getObjectTemplateValue();

		/**
		 * The meta object literal for the '<em><b>Objecttemplate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TEMPLATE_VALUE__OBJECTTEMPLATE = eINSTANCE.getObjectTemplateValue_Objecttemplate();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.impl.MetamodelImpl <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.impl.MetamodelImpl
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Packages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__PACKAGES = eINSTANCE.getMetamodel_Packages();

		/**
		 * The meta object literal for the '{@link org.tetrabox.example.minitl.minitl.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.tetrabox.example.minitl.minitl.Operator
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em>EObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EObject
		 * @see org.tetrabox.example.minitl.minitl.impl.MinitlPackageImpl#getEObject()
		 * @generated
		 */
		EDataType EOBJECT = eINSTANCE.getEObject();

	}

} //MinitlPackage
