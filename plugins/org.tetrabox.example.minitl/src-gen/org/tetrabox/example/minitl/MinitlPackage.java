/**
 * generated by Xtext 2.27.0
 */
package org.tetrabox.example.minitl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.tetrabox.example.minitl.MinitlFactory
 * @model kind="package"
 * @generated
 */
public interface MinitlPackage extends EPackage
{
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
  String eNS_URI = "http://org.tetrabox.example.minitl/minitl/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "minitl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MinitlPackage eINSTANCE = org.tetrabox.example.minitl.impl.MinitlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.tetrabox.example.minitl.impl.TransformationImpl <em>Transformation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.impl.TransformationImpl
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getTransformation()
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
  int TRANSFORMATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Input Metamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__INPUT_METAMODEL = 1;

  /**
   * The feature id for the '<em><b>Output Metamodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__OUTPUT_METAMODEL = 2;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION__RULES = 3;

  /**
   * The number of structural features of the '<em>Transformation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSFORMATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.tetrabox.example.minitl.impl.MetamodelImpl <em>Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.impl.MetamodelImpl
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getMetamodel()
   * @generated
   */
  int METAMODEL = 1;

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
   * The meta object id for the '{@link org.tetrabox.example.minitl.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.impl.RuleImpl
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getRule()
   * @generated
   */
  int RULE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Object Templates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__OBJECT_TEMPLATES = 1;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.tetrabox.example.minitl.impl.ObjectTemplateImpl <em>Object Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.impl.ObjectTemplateImpl
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getObjectTemplate()
   * @generated
   */
  int OBJECT_TEMPLATE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPLATE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPLATE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Bindings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPLATE__BINDINGS = 2;

  /**
   * The number of structural features of the '<em>Object Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TEMPLATE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.tetrabox.example.minitl.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.impl.BindingImpl
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 4;

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
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.tetrabox.example.minitl.impl.ValueImpl <em>Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.impl.ValueImpl
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getValue()
   * @generated
   */
  int VALUE = 5;

  /**
   * The number of structural features of the '<em>Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.tetrabox.example.minitl.impl.StringValueImpl <em>String Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.impl.StringValueImpl
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getStringValue()
   * @generated
   */
  int STRING_VALUE = 6;

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
   * The meta object id for the '{@link org.tetrabox.example.minitl.impl.ObjectTemplateValueImpl <em>Object Template Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.impl.ObjectTemplateValueImpl
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getObjectTemplateValue()
   * @generated
   */
  int OBJECT_TEMPLATE_VALUE = 7;

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
   * The meta object id for the '{@link org.tetrabox.example.minitl.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.impl.BinaryExpressionImpl
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getBinaryExpression()
   * @generated
   */
  int BINARY_EXPRESSION = 8;

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
   * The meta object id for the '{@link org.tetrabox.example.minitl.impl.FieldAccessValueImpl <em>Field Access Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.impl.FieldAccessValueImpl
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getFieldAccessValue()
   * @generated
   */
  int FIELD_ACCESS_VALUE = 9;

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
   * The meta object id for the '{@link org.tetrabox.example.minitl.Operator <em>Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.tetrabox.example.minitl.Operator
   * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getOperator()
   * @generated
   */
  int OPERATOR = 10;


  /**
   * Returns the meta object for class '{@link org.tetrabox.example.minitl.Transformation <em>Transformation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transformation</em>'.
   * @see org.tetrabox.example.minitl.Transformation
   * @generated
   */
  EClass getTransformation();

  /**
   * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.Transformation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.tetrabox.example.minitl.Transformation#getName()
   * @see #getTransformation()
   * @generated
   */
  EAttribute getTransformation_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.tetrabox.example.minitl.Transformation#getInputMetamodel <em>Input Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input Metamodel</em>'.
   * @see org.tetrabox.example.minitl.Transformation#getInputMetamodel()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_InputMetamodel();

  /**
   * Returns the meta object for the containment reference '{@link org.tetrabox.example.minitl.Transformation#getOutputMetamodel <em>Output Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output Metamodel</em>'.
   * @see org.tetrabox.example.minitl.Transformation#getOutputMetamodel()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_OutputMetamodel();

  /**
   * Returns the meta object for the containment reference list '{@link org.tetrabox.example.minitl.Transformation#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.tetrabox.example.minitl.Transformation#getRules()
   * @see #getTransformation()
   * @generated
   */
  EReference getTransformation_Rules();

  /**
   * Returns the meta object for class '{@link org.tetrabox.example.minitl.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel</em>'.
   * @see org.tetrabox.example.minitl.Metamodel
   * @generated
   */
  EClass getMetamodel();

  /**
   * Returns the meta object for the reference list '{@link org.tetrabox.example.minitl.Metamodel#getPackages <em>Packages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Packages</em>'.
   * @see org.tetrabox.example.minitl.Metamodel#getPackages()
   * @see #getMetamodel()
   * @generated
   */
  EReference getMetamodel_Packages();

  /**
   * Returns the meta object for class '{@link org.tetrabox.example.minitl.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.tetrabox.example.minitl.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.tetrabox.example.minitl.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.tetrabox.example.minitl.Rule#getObjectTemplates <em>Object Templates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Object Templates</em>'.
   * @see org.tetrabox.example.minitl.Rule#getObjectTemplates()
   * @see #getRule()
   * @generated
   */
  EReference getRule_ObjectTemplates();

  /**
   * Returns the meta object for class '{@link org.tetrabox.example.minitl.ObjectTemplate <em>Object Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Template</em>'.
   * @see org.tetrabox.example.minitl.ObjectTemplate
   * @generated
   */
  EClass getObjectTemplate();

  /**
   * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.ObjectTemplate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.tetrabox.example.minitl.ObjectTemplate#getName()
   * @see #getObjectTemplate()
   * @generated
   */
  EAttribute getObjectTemplate_Name();

  /**
   * Returns the meta object for the reference '{@link org.tetrabox.example.minitl.ObjectTemplate#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.tetrabox.example.minitl.ObjectTemplate#getType()
   * @see #getObjectTemplate()
   * @generated
   */
  EReference getObjectTemplate_Type();

  /**
   * Returns the meta object for the containment reference list '{@link org.tetrabox.example.minitl.ObjectTemplate#getBindings <em>Bindings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Bindings</em>'.
   * @see org.tetrabox.example.minitl.ObjectTemplate#getBindings()
   * @see #getObjectTemplate()
   * @generated
   */
  EReference getObjectTemplate_Bindings();

  /**
   * Returns the meta object for class '{@link org.tetrabox.example.minitl.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.tetrabox.example.minitl.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the reference '{@link org.tetrabox.example.minitl.Binding#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.tetrabox.example.minitl.Binding#getFeature()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Feature();

  /**
   * Returns the meta object for the containment reference '{@link org.tetrabox.example.minitl.Binding#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.tetrabox.example.minitl.Binding#getValue()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Value();

  /**
   * Returns the meta object for class '{@link org.tetrabox.example.minitl.Value <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value</em>'.
   * @see org.tetrabox.example.minitl.Value
   * @generated
   */
  EClass getValue();

  /**
   * Returns the meta object for class '{@link org.tetrabox.example.minitl.StringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value</em>'.
   * @see org.tetrabox.example.minitl.StringValue
   * @generated
   */
  EClass getStringValue();

  /**
   * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.StringValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.tetrabox.example.minitl.StringValue#getValue()
   * @see #getStringValue()
   * @generated
   */
  EAttribute getStringValue_Value();

  /**
   * Returns the meta object for class '{@link org.tetrabox.example.minitl.ObjectTemplateValue <em>Object Template Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Template Value</em>'.
   * @see org.tetrabox.example.minitl.ObjectTemplateValue
   * @generated
   */
  EClass getObjectTemplateValue();

  /**
   * Returns the meta object for the reference '{@link org.tetrabox.example.minitl.ObjectTemplateValue#getObjecttemplate <em>Objecttemplate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Objecttemplate</em>'.
   * @see org.tetrabox.example.minitl.ObjectTemplateValue#getObjecttemplate()
   * @see #getObjectTemplateValue()
   * @generated
   */
  EReference getObjectTemplateValue_Objecttemplate();

  /**
   * Returns the meta object for class '{@link org.tetrabox.example.minitl.BinaryExpression <em>Binary Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expression</em>'.
   * @see org.tetrabox.example.minitl.BinaryExpression
   * @generated
   */
  EClass getBinaryExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.tetrabox.example.minitl.BinaryExpression#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.tetrabox.example.minitl.BinaryExpression#getExpressions()
   * @see #getBinaryExpression()
   * @generated
   */
  EReference getBinaryExpression_Expressions();

  /**
   * Returns the meta object for the attribute '{@link org.tetrabox.example.minitl.BinaryExpression#getOperator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operator</em>'.
   * @see org.tetrabox.example.minitl.BinaryExpression#getOperator()
   * @see #getBinaryExpression()
   * @generated
   */
  EAttribute getBinaryExpression_Operator();

  /**
   * Returns the meta object for class '{@link org.tetrabox.example.minitl.FieldAccessValue <em>Field Access Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Access Value</em>'.
   * @see org.tetrabox.example.minitl.FieldAccessValue
   * @generated
   */
  EClass getFieldAccessValue();

  /**
   * Returns the meta object for the containment reference '{@link org.tetrabox.example.minitl.FieldAccessValue#getObject <em>Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Object</em>'.
   * @see org.tetrabox.example.minitl.FieldAccessValue#getObject()
   * @see #getFieldAccessValue()
   * @generated
   */
  EReference getFieldAccessValue_Object();

  /**
   * Returns the meta object for the reference '{@link org.tetrabox.example.minitl.FieldAccessValue#getFeature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Feature</em>'.
   * @see org.tetrabox.example.minitl.FieldAccessValue#getFeature()
   * @see #getFieldAccessValue()
   * @generated
   */
  EReference getFieldAccessValue_Feature();

  /**
   * Returns the meta object for enum '{@link org.tetrabox.example.minitl.Operator <em>Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Operator</em>'.
   * @see org.tetrabox.example.minitl.Operator
   * @generated
   */
  EEnum getOperator();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.tetrabox.example.minitl.impl.TransformationImpl <em>Transformation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.impl.TransformationImpl
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getTransformation()
     * @generated
     */
    EClass TRANSFORMATION = eINSTANCE.getTransformation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSFORMATION__NAME = eINSTANCE.getTransformation_Name();

    /**
     * The meta object literal for the '<em><b>Input Metamodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__INPUT_METAMODEL = eINSTANCE.getTransformation_InputMetamodel();

    /**
     * The meta object literal for the '<em><b>Output Metamodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__OUTPUT_METAMODEL = eINSTANCE.getTransformation_OutputMetamodel();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSFORMATION__RULES = eINSTANCE.getTransformation_Rules();

    /**
     * The meta object literal for the '{@link org.tetrabox.example.minitl.impl.MetamodelImpl <em>Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.impl.MetamodelImpl
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getMetamodel()
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
     * The meta object literal for the '{@link org.tetrabox.example.minitl.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.impl.RuleImpl
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Object Templates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__OBJECT_TEMPLATES = eINSTANCE.getRule_ObjectTemplates();

    /**
     * The meta object literal for the '{@link org.tetrabox.example.minitl.impl.ObjectTemplateImpl <em>Object Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.impl.ObjectTemplateImpl
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getObjectTemplate()
     * @generated
     */
    EClass OBJECT_TEMPLATE = eINSTANCE.getObjectTemplate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OBJECT_TEMPLATE__NAME = eINSTANCE.getObjectTemplate_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_TEMPLATE__TYPE = eINSTANCE.getObjectTemplate_Type();

    /**
     * The meta object literal for the '<em><b>Bindings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OBJECT_TEMPLATE__BINDINGS = eINSTANCE.getObjectTemplate_Bindings();

    /**
     * The meta object literal for the '{@link org.tetrabox.example.minitl.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.impl.BindingImpl
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getBinding()
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
     * The meta object literal for the '{@link org.tetrabox.example.minitl.impl.ValueImpl <em>Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.impl.ValueImpl
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getValue()
     * @generated
     */
    EClass VALUE = eINSTANCE.getValue();

    /**
     * The meta object literal for the '{@link org.tetrabox.example.minitl.impl.StringValueImpl <em>String Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.impl.StringValueImpl
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getStringValue()
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
     * The meta object literal for the '{@link org.tetrabox.example.minitl.impl.ObjectTemplateValueImpl <em>Object Template Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.impl.ObjectTemplateValueImpl
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getObjectTemplateValue()
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
     * The meta object literal for the '{@link org.tetrabox.example.minitl.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.impl.BinaryExpressionImpl
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getBinaryExpression()
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
     * The meta object literal for the '{@link org.tetrabox.example.minitl.impl.FieldAccessValueImpl <em>Field Access Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.impl.FieldAccessValueImpl
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getFieldAccessValue()
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
     * The meta object literal for the '{@link org.tetrabox.example.minitl.Operator <em>Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.tetrabox.example.minitl.Operator
     * @see org.tetrabox.example.minitl.impl.MinitlPackageImpl#getOperator()
     * @generated
     */
    EEnum OPERATOR = eINSTANCE.getOperator();

  }

} //MinitlPackage
