/**
 */
package minitlTrace;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

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
 * @see minitlTrace.MinitlTraceFactory
 * @model kind="package"
 * @generated
 */
public interface MinitlTracePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "minitlTrace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "minitlTrace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "minitlTrace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinitlTracePackage eINSTANCE = minitlTrace.impl.MinitlTracePackageImpl.init();

	/**
	 * The meta object id for the '{@link minitlTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.impl.SpecificTraceImpl
	 * @see minitlTrace.impl.MinitlTracePackageImpl#getSpecificTrace()
	 * @generated
	 */
	int SPECIFIC_TRACE = 0;

	/**
	 * The feature id for the '<em><b>Root Step</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__ROOT_STEP = TracePackage.TRACE__ROOT_STEP;

	/**
	 * The feature id for the '<em><b>Launchconfiguration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__LAUNCHCONFIGURATION = TracePackage.TRACE__LAUNCHCONFIGURATION;

	/**
	 * The feature id for the '<em><b>Minitl Binding Assign Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__MINITL_BINDING_ASSIGN_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Minitl Binding Check Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__MINITL_BINDING_CHECK_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Minitl Object Template Construct Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_CONSTRUCT_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minitl Object Template Match Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_MATCH_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Minitl Rule Apply Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__MINITL_RULE_APPLY_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Minitl Transformation Execute Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__MINITL_TRANSFORMATION_EXECUTE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Minitl Transformation Initialize Sequence</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__MINITL_TRANSFORMATION_INITIALIZE_SEQUENCE = TracePackage.TRACE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Minitl traced Object Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__MINITL_TRACED_OBJECT_TEMPLATES = TracePackage.TRACE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Minitl traced Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__MINITL_TRACED_RULES = TracePackage.TRACE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Minitl traced Transformations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__MINITL_TRACED_TRANSFORMATIONS = TracePackage.TRACE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>States Trace</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE__STATES_TRACE = TracePackage.TRACE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Specific Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_TRACE_FEATURE_COUNT = TracePackage.TRACE_FEATURE_COUNT + 11;


	/**
	 * Returns the meta object for class '{@link minitlTrace.SpecificTrace <em>Specific Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Trace</em>'.
	 * @see minitlTrace.SpecificTrace
	 * @generated
	 */
	EClass getSpecificTrace();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.SpecificTrace#getMinitl_Binding_Assign_Sequence <em>Minitl Binding Assign Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Minitl Binding Assign Sequence</em>'.
	 * @see minitlTrace.SpecificTrace#getMinitl_Binding_Assign_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Minitl_Binding_Assign_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.SpecificTrace#getMinitl_Binding_Check_Sequence <em>Minitl Binding Check Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Minitl Binding Check Sequence</em>'.
	 * @see minitlTrace.SpecificTrace#getMinitl_Binding_Check_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Minitl_Binding_Check_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.SpecificTrace#getMinitl_ObjectTemplate_Construct_Sequence <em>Minitl Object Template Construct Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Minitl Object Template Construct Sequence</em>'.
	 * @see minitlTrace.SpecificTrace#getMinitl_ObjectTemplate_Construct_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Minitl_ObjectTemplate_Construct_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.SpecificTrace#getMinitl_ObjectTemplate_Match_Sequence <em>Minitl Object Template Match Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Minitl Object Template Match Sequence</em>'.
	 * @see minitlTrace.SpecificTrace#getMinitl_ObjectTemplate_Match_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Minitl_ObjectTemplate_Match_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.SpecificTrace#getMinitl_Rule_Apply_Sequence <em>Minitl Rule Apply Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Minitl Rule Apply Sequence</em>'.
	 * @see minitlTrace.SpecificTrace#getMinitl_Rule_Apply_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Minitl_Rule_Apply_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.SpecificTrace#getMinitl_Transformation_Execute_Sequence <em>Minitl Transformation Execute Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Minitl Transformation Execute Sequence</em>'.
	 * @see minitlTrace.SpecificTrace#getMinitl_Transformation_Execute_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Minitl_Transformation_Execute_Sequence();

	/**
	 * Returns the meta object for the reference list '{@link minitlTrace.SpecificTrace#getMinitl_Transformation_Initialize_Sequence <em>Minitl Transformation Initialize Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Minitl Transformation Initialize Sequence</em>'.
	 * @see minitlTrace.SpecificTrace#getMinitl_Transformation_Initialize_Sequence()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Minitl_Transformation_Initialize_Sequence();

	/**
	 * Returns the meta object for the containment reference list '{@link minitlTrace.SpecificTrace#getMinitl_tracedObjectTemplates <em>Minitl traced Object Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minitl traced Object Templates</em>'.
	 * @see minitlTrace.SpecificTrace#getMinitl_tracedObjectTemplates()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Minitl_tracedObjectTemplates();

	/**
	 * Returns the meta object for the containment reference list '{@link minitlTrace.SpecificTrace#getMinitl_tracedRules <em>Minitl traced Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minitl traced Rules</em>'.
	 * @see minitlTrace.SpecificTrace#getMinitl_tracedRules()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Minitl_tracedRules();

	/**
	 * Returns the meta object for the containment reference list '{@link minitlTrace.SpecificTrace#getMinitl_tracedTransformations <em>Minitl traced Transformations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Minitl traced Transformations</em>'.
	 * @see minitlTrace.SpecificTrace#getMinitl_tracedTransformations()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_Minitl_tracedTransformations();

	/**
	 * Returns the meta object for the containment reference list '{@link minitlTrace.SpecificTrace#getStatesTrace <em>States Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States Trace</em>'.
	 * @see minitlTrace.SpecificTrace#getStatesTrace()
	 * @see #getSpecificTrace()
	 * @generated
	 */
	EReference getSpecificTrace_StatesTrace();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MinitlTraceFactory getMinitlTraceFactory();

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
		 * The meta object literal for the '{@link minitlTrace.impl.SpecificTraceImpl <em>Specific Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.impl.SpecificTraceImpl
		 * @see minitlTrace.impl.MinitlTracePackageImpl#getSpecificTrace()
		 * @generated
		 */
		EClass SPECIFIC_TRACE = eINSTANCE.getSpecificTrace();

		/**
		 * The meta object literal for the '<em><b>Minitl Binding Assign Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__MINITL_BINDING_ASSIGN_SEQUENCE = eINSTANCE.getSpecificTrace_Minitl_Binding_Assign_Sequence();

		/**
		 * The meta object literal for the '<em><b>Minitl Binding Check Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__MINITL_BINDING_CHECK_SEQUENCE = eINSTANCE.getSpecificTrace_Minitl_Binding_Check_Sequence();

		/**
		 * The meta object literal for the '<em><b>Minitl Object Template Construct Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_CONSTRUCT_SEQUENCE = eINSTANCE.getSpecificTrace_Minitl_ObjectTemplate_Construct_Sequence();

		/**
		 * The meta object literal for the '<em><b>Minitl Object Template Match Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_MATCH_SEQUENCE = eINSTANCE.getSpecificTrace_Minitl_ObjectTemplate_Match_Sequence();

		/**
		 * The meta object literal for the '<em><b>Minitl Rule Apply Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__MINITL_RULE_APPLY_SEQUENCE = eINSTANCE.getSpecificTrace_Minitl_Rule_Apply_Sequence();

		/**
		 * The meta object literal for the '<em><b>Minitl Transformation Execute Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__MINITL_TRANSFORMATION_EXECUTE_SEQUENCE = eINSTANCE.getSpecificTrace_Minitl_Transformation_Execute_Sequence();

		/**
		 * The meta object literal for the '<em><b>Minitl Transformation Initialize Sequence</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__MINITL_TRANSFORMATION_INITIALIZE_SEQUENCE = eINSTANCE.getSpecificTrace_Minitl_Transformation_Initialize_Sequence();

		/**
		 * The meta object literal for the '<em><b>Minitl traced Object Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__MINITL_TRACED_OBJECT_TEMPLATES = eINSTANCE.getSpecificTrace_Minitl_tracedObjectTemplates();

		/**
		 * The meta object literal for the '<em><b>Minitl traced Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__MINITL_TRACED_RULES = eINSTANCE.getSpecificTrace_Minitl_tracedRules();

		/**
		 * The meta object literal for the '<em><b>Minitl traced Transformations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__MINITL_TRACED_TRANSFORMATIONS = eINSTANCE.getSpecificTrace_Minitl_tracedTransformations();

		/**
		 * The meta object literal for the '<em><b>States Trace</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_TRACE__STATES_TRACE = eINSTANCE.getSpecificTrace_StatesTrace();

	}

} //MinitlTracePackage
