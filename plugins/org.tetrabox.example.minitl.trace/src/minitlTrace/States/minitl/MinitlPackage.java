/**
 */
package minitlTrace.States.minitl;

import org.eclipse.emf.ecore.EClass;
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
 * @see minitlTrace.States.minitl.MinitlFactory
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
	String eNS_URI = "minitlTrace_minitl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinitlPackage eINSTANCE = minitlTrace.States.minitl.impl.MinitlPackageImpl.init();

	/**
	 * The meta object id for the '{@link minitlTrace.States.minitl.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.minitl.impl.TracedNamedElementImpl
	 * @see minitlTrace.States.minitl.impl.MinitlPackageImpl#getTracedNamedElement()
	 * @generated
	 */
	int TRACED_NAMED_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Traced Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_NAMED_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link minitlTrace.States.minitl.impl.TracedObjectTemplateImpl <em>Traced Object Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.minitl.impl.TracedObjectTemplateImpl
	 * @see minitlTrace.States.minitl.impl.MinitlPackageImpl#getTracedObjectTemplate()
	 * @generated
	 */
	int TRACED_OBJECT_TEMPLATE = 1;

	/**
	 * The feature id for the '<em><b>Current Object Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_TEMPLATE__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Traced Object Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_OBJECT_TEMPLATE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link minitlTrace.States.minitl.impl.TracedRuleImpl <em>Traced Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.minitl.impl.TracedRuleImpl
	 * @see minitlTrace.States.minitl.impl.MinitlPackageImpl#getTracedRule()
	 * @generated
	 */
	int TRACED_RULE = 2;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Traced Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_RULE_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.States.minitl.impl.TracedTransformationImpl <em>Traced Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.States.minitl.impl.TracedTransformationImpl
	 * @see minitlTrace.States.minitl.impl.MinitlPackageImpl#getTracedTransformation()
	 * @generated
	 */
	int TRACED_TRANSFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Input Model Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSFORMATION__INPUT_MODEL_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Model URI Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSFORMATION__ORIGINAL_OBJECT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output File Path Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSFORMATION__OUTPUT_FILE_PATH_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Output Model Sequence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Traced Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACED_TRANSFORMATION_FEATURE_COUNT = TRACED_NAMED_ELEMENT_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link minitlTrace.States.minitl.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Named Element</em>'.
	 * @see minitlTrace.States.minitl.TracedNamedElement
	 * @generated
	 */
	EClass getTracedNamedElement();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.minitl.TracedObjectTemplate <em>Traced Object Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Object Template</em>'.
	 * @see minitlTrace.States.minitl.TracedObjectTemplate
	 * @generated
	 */
	EClass getTracedObjectTemplate();

	/**
	 * Returns the meta object for the containment reference list '{@link minitlTrace.States.minitl.TracedObjectTemplate#getCurrentObjectSequence <em>Current Object Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Current Object Sequence</em>'.
	 * @see minitlTrace.States.minitl.TracedObjectTemplate#getCurrentObjectSequence()
	 * @see #getTracedObjectTemplate()
	 * @generated
	 */
	EReference getTracedObjectTemplate_CurrentObjectSequence();

	/**
	 * Returns the meta object for the reference '{@link minitlTrace.States.minitl.TracedObjectTemplate#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see minitlTrace.States.minitl.TracedObjectTemplate#getOriginalObject()
	 * @see #getTracedObjectTemplate()
	 * @generated
	 */
	EReference getTracedObjectTemplate_OriginalObject();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.minitl.TracedRule <em>Traced Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Rule</em>'.
	 * @see minitlTrace.States.minitl.TracedRule
	 * @generated
	 */
	EClass getTracedRule();

	/**
	 * Returns the meta object for the reference '{@link minitlTrace.States.minitl.TracedRule#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see minitlTrace.States.minitl.TracedRule#getOriginalObject()
	 * @see #getTracedRule()
	 * @generated
	 */
	EReference getTracedRule_OriginalObject();

	/**
	 * Returns the meta object for class '{@link minitlTrace.States.minitl.TracedTransformation <em>Traced Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Traced Transformation</em>'.
	 * @see minitlTrace.States.minitl.TracedTransformation
	 * @generated
	 */
	EClass getTracedTransformation();

	/**
	 * Returns the meta object for the containment reference list '{@link minitlTrace.States.minitl.TracedTransformation#getInputModelSequence <em>Input Model Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Model Sequence</em>'.
	 * @see minitlTrace.States.minitl.TracedTransformation#getInputModelSequence()
	 * @see #getTracedTransformation()
	 * @generated
	 */
	EReference getTracedTransformation_InputModelSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link minitlTrace.States.minitl.TracedTransformation#getInputModelURISequence <em>Input Model URI Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Model URI Sequence</em>'.
	 * @see minitlTrace.States.minitl.TracedTransformation#getInputModelURISequence()
	 * @see #getTracedTransformation()
	 * @generated
	 */
	EReference getTracedTransformation_InputModelURISequence();

	/**
	 * Returns the meta object for the reference '{@link minitlTrace.States.minitl.TracedTransformation#getOriginalObject <em>Original Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Original Object</em>'.
	 * @see minitlTrace.States.minitl.TracedTransformation#getOriginalObject()
	 * @see #getTracedTransformation()
	 * @generated
	 */
	EReference getTracedTransformation_OriginalObject();

	/**
	 * Returns the meta object for the containment reference list '{@link minitlTrace.States.minitl.TracedTransformation#getOutputFilePathSequence <em>Output File Path Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output File Path Sequence</em>'.
	 * @see minitlTrace.States.minitl.TracedTransformation#getOutputFilePathSequence()
	 * @see #getTracedTransformation()
	 * @generated
	 */
	EReference getTracedTransformation_OutputFilePathSequence();

	/**
	 * Returns the meta object for the containment reference list '{@link minitlTrace.States.minitl.TracedTransformation#getOutputModelSequence <em>Output Model Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Model Sequence</em>'.
	 * @see minitlTrace.States.minitl.TracedTransformation#getOutputModelSequence()
	 * @see #getTracedTransformation()
	 * @generated
	 */
	EReference getTracedTransformation_OutputModelSequence();

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
		 * The meta object literal for the '{@link minitlTrace.States.minitl.impl.TracedNamedElementImpl <em>Traced Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.minitl.impl.TracedNamedElementImpl
		 * @see minitlTrace.States.minitl.impl.MinitlPackageImpl#getTracedNamedElement()
		 * @generated
		 */
		EClass TRACED_NAMED_ELEMENT = eINSTANCE.getTracedNamedElement();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.minitl.impl.TracedObjectTemplateImpl <em>Traced Object Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.minitl.impl.TracedObjectTemplateImpl
		 * @see minitlTrace.States.minitl.impl.MinitlPackageImpl#getTracedObjectTemplate()
		 * @generated
		 */
		EClass TRACED_OBJECT_TEMPLATE = eINSTANCE.getTracedObjectTemplate();

		/**
		 * The meta object literal for the '<em><b>Current Object Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE = eINSTANCE.getTracedObjectTemplate_CurrentObjectSequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_OBJECT_TEMPLATE__ORIGINAL_OBJECT = eINSTANCE.getTracedObjectTemplate_OriginalObject();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.minitl.impl.TracedRuleImpl <em>Traced Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.minitl.impl.TracedRuleImpl
		 * @see minitlTrace.States.minitl.impl.MinitlPackageImpl#getTracedRule()
		 * @generated
		 */
		EClass TRACED_RULE = eINSTANCE.getTracedRule();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_RULE__ORIGINAL_OBJECT = eINSTANCE.getTracedRule_OriginalObject();

		/**
		 * The meta object literal for the '{@link minitlTrace.States.minitl.impl.TracedTransformationImpl <em>Traced Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.States.minitl.impl.TracedTransformationImpl
		 * @see minitlTrace.States.minitl.impl.MinitlPackageImpl#getTracedTransformation()
		 * @generated
		 */
		EClass TRACED_TRANSFORMATION = eINSTANCE.getTracedTransformation();

		/**
		 * The meta object literal for the '<em><b>Input Model Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSFORMATION__INPUT_MODEL_SEQUENCE = eINSTANCE.getTracedTransformation_InputModelSequence();

		/**
		 * The meta object literal for the '<em><b>Input Model URI Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE = eINSTANCE.getTracedTransformation_InputModelURISequence();

		/**
		 * The meta object literal for the '<em><b>Original Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSFORMATION__ORIGINAL_OBJECT = eINSTANCE.getTracedTransformation_OriginalObject();

		/**
		 * The meta object literal for the '<em><b>Output File Path Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSFORMATION__OUTPUT_FILE_PATH_SEQUENCE = eINSTANCE.getTracedTransformation_OutputFilePathSequence();

		/**
		 * The meta object literal for the '<em><b>Output Model Sequence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE = eINSTANCE.getTracedTransformation_OutputModelSequence();

	}

} //MinitlPackage
