/**
 */
package minitlTrace.Steps;

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
 * @see minitlTrace.Steps.StepsFactory
 * @model kind="package"
 * @generated
 */
public interface StepsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Steps";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "minitlTrace_Steps";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "events";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsPackage eINSTANCE = minitlTrace.Steps.impl.StepsPackageImpl.init();

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.SpecificStep
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
	 * @generated
	 */
	int SPECIFIC_STEP = 16;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__MSEOCCURRENCE = TracePackage.STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__ENDING_STATE = TracePackage.STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP__STARTING_STATE = TracePackage.STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Specific Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFIC_STEP_FEATURE_COUNT = TracePackage.STEP_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Construct_AbstractSubStep <em>Minitl Object Template Construct Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Construct_AbstractSubStep
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Construct_AbstractSubStep()
	 * @generated
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP = 3;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Object Template Construct Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_Binding_AssignImpl <em>Minitl Binding Assign</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_Binding_AssignImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Binding_Assign()
	 * @generated
	 */
	int MINITL_BINDING_ASSIGN = 0;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_BINDING_ASSIGN__MSEOCCURRENCE = MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_BINDING_ASSIGN__ENDING_STATE = MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_BINDING_ASSIGN__STARTING_STATE = MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Binding Assign</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_BINDING_ASSIGN_FEATURE_COUNT = MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_Binding_CheckImpl <em>Minitl Binding Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_Binding_CheckImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Binding_Check()
	 * @generated
	 */
	int MINITL_BINDING_CHECK = 1;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_BINDING_CHECK__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_BINDING_CHECK__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_BINDING_CHECK__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Binding Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_BINDING_CHECK_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.Minitl_Rule_Apply_AbstractSubStep <em>Minitl Rule Apply Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.Minitl_Rule_Apply_AbstractSubStep
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Rule_Apply_AbstractSubStep()
	 * @generated
	 */
	int MINITL_RULE_APPLY_ABSTRACT_SUB_STEP = 9;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Rule Apply Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_ObjectTemplate_ConstructImpl <em>Minitl Object Template Construct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_ObjectTemplate_ConstructImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Construct()
	 * @generated
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT = 2;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT__MSEOCCURRENCE = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT__ENDING_STATE = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT__STARTING_STATE = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT__SUB_STEPS = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minitl Object Template Construct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_FEATURE_COUNT = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_ObjectTemplate_Construct_ImplicitStepImpl <em>Minitl Object Template Construct Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_ObjectTemplate_Construct_ImplicitStepImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Construct_ImplicitStep()
	 * @generated
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_IMPLICIT_STEP = 4;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_IMPLICIT_STEP__MSEOCCURRENCE = MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_IMPLICIT_STEP__ENDING_STATE = MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_IMPLICIT_STEP__STARTING_STATE = MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Object Template Construct Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_CONSTRUCT_IMPLICIT_STEP_FEATURE_COUNT = MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_ObjectTemplate_MatchImpl <em>Minitl Object Template Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_ObjectTemplate_MatchImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Match()
	 * @generated
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH = 5;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH__MSEOCCURRENCE = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH__ENDING_STATE = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH__STARTING_STATE = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH__SUB_STEPS = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minitl Object Template Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_FEATURE_COUNT = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Match_AbstractSubStep <em>Minitl Object Template Match Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Match_AbstractSubStep
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Match_AbstractSubStep()
	 * @generated
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP = 6;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Object Template Match Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_ObjectTemplate_Match_ImplicitStepImpl <em>Minitl Object Template Match Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_ObjectTemplate_Match_ImplicitStepImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Match_ImplicitStep()
	 * @generated
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_IMPLICIT_STEP = 7;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_IMPLICIT_STEP__MSEOCCURRENCE = MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_IMPLICIT_STEP__ENDING_STATE = MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_IMPLICIT_STEP__STARTING_STATE = MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Object Template Match Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_OBJECT_TEMPLATE_MATCH_IMPLICIT_STEP_FEATURE_COUNT = MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.Minitl_Transformation_Execute_AbstractSubStep <em>Minitl Transformation Execute Abstract Sub Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.Minitl_Transformation_Execute_AbstractSubStep
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Transformation_Execute_AbstractSubStep()
	 * @generated
	 */
	int MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP = 12;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Transformation Execute Abstract Sub Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_Rule_ApplyImpl <em>Minitl Rule Apply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_Rule_ApplyImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Rule_Apply()
	 * @generated
	 */
	int MINITL_RULE_APPLY = 8;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY__MSEOCCURRENCE = MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY__ENDING_STATE = MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY__STARTING_STATE = MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY__SUB_STEPS = MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minitl Rule Apply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY_FEATURE_COUNT = MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_Rule_Apply_ImplicitStepImpl <em>Minitl Rule Apply Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_Rule_Apply_ImplicitStepImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Rule_Apply_ImplicitStep()
	 * @generated
	 */
	int MINITL_RULE_APPLY_IMPLICIT_STEP = 10;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY_IMPLICIT_STEP__MSEOCCURRENCE = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY_IMPLICIT_STEP__ENDING_STATE = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY_IMPLICIT_STEP__STARTING_STATE = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Rule Apply Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_RULE_APPLY_IMPLICIT_STEP_FEATURE_COUNT = MINITL_RULE_APPLY_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_Transformation_ExecuteImpl <em>Minitl Transformation Execute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_Transformation_ExecuteImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Transformation_Execute()
	 * @generated
	 */
	int MINITL_TRANSFORMATION_EXECUTE = 11;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The feature id for the '<em><b>Sub Steps</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE__SUB_STEPS = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Minitl Transformation Execute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_Transformation_Execute_ImplicitStepImpl <em>Minitl Transformation Execute Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_Transformation_Execute_ImplicitStepImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Transformation_Execute_ImplicitStep()
	 * @generated
	 */
	int MINITL_TRANSFORMATION_EXECUTE_IMPLICIT_STEP = 13;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE_IMPLICIT_STEP__MSEOCCURRENCE = MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE_IMPLICIT_STEP__ENDING_STATE = MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE_IMPLICIT_STEP__STARTING_STATE = MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Transformation Execute Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_EXECUTE_IMPLICIT_STEP_FEATURE_COUNT = MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.Minitl_Transformation_InitializeImpl <em>Minitl Transformation Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.Minitl_Transformation_InitializeImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Transformation_Initialize()
	 * @generated
	 */
	int MINITL_TRANSFORMATION_INITIALIZE = 14;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_INITIALIZE__MSEOCCURRENCE = SPECIFIC_STEP__MSEOCCURRENCE;

	/**
	 * The feature id for the '<em><b>Ending State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_INITIALIZE__ENDING_STATE = SPECIFIC_STEP__ENDING_STATE;

	/**
	 * The feature id for the '<em><b>Starting State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_INITIALIZE__STARTING_STATE = SPECIFIC_STEP__STARTING_STATE;

	/**
	 * The number of structural features of the '<em>Minitl Transformation Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINITL_TRANSFORMATION_INITIALIZE_FEATURE_COUNT = SPECIFIC_STEP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link minitlTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see minitlTrace.Steps.impl.RootImplicitStepImpl
	 * @see minitlTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
	 * @generated
	 */
	int ROOT_IMPLICIT_STEP = 15;

	/**
	 * The feature id for the '<em><b>Mseoccurrence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP__MSEOCCURRENCE = TracePackage.SMALL_STEP__MSEOCCURRENCE;

	/**
	 * The number of structural features of the '<em>Root Implicit Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_IMPLICIT_STEP_FEATURE_COUNT = TracePackage.SMALL_STEP_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_Binding_Assign <em>Minitl Binding Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Binding Assign</em>'.
	 * @see minitlTrace.Steps.Minitl_Binding_Assign
	 * @generated
	 */
	EClass getMinitl_Binding_Assign();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_Binding_Check <em>Minitl Binding Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Binding Check</em>'.
	 * @see minitlTrace.Steps.Minitl_Binding_Check
	 * @generated
	 */
	EClass getMinitl_Binding_Check();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Construct <em>Minitl Object Template Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Object Template Construct</em>'.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Construct
	 * @generated
	 */
	EClass getMinitl_ObjectTemplate_Construct();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Construct_AbstractSubStep <em>Minitl Object Template Construct Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Object Template Construct Abstract Sub Step</em>'.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Construct_AbstractSubStep
	 * @generated
	 */
	EClass getMinitl_ObjectTemplate_Construct_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Construct_ImplicitStep <em>Minitl Object Template Construct Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Object Template Construct Implicit Step</em>'.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Construct_ImplicitStep
	 * @generated
	 */
	EClass getMinitl_ObjectTemplate_Construct_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Match <em>Minitl Object Template Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Object Template Match</em>'.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Match
	 * @generated
	 */
	EClass getMinitl_ObjectTemplate_Match();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Match_AbstractSubStep <em>Minitl Object Template Match Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Object Template Match Abstract Sub Step</em>'.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Match_AbstractSubStep
	 * @generated
	 */
	EClass getMinitl_ObjectTemplate_Match_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Match_ImplicitStep <em>Minitl Object Template Match Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Object Template Match Implicit Step</em>'.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Match_ImplicitStep
	 * @generated
	 */
	EClass getMinitl_ObjectTemplate_Match_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_Rule_Apply <em>Minitl Rule Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Rule Apply</em>'.
	 * @see minitlTrace.Steps.Minitl_Rule_Apply
	 * @generated
	 */
	EClass getMinitl_Rule_Apply();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_Rule_Apply_AbstractSubStep <em>Minitl Rule Apply Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Rule Apply Abstract Sub Step</em>'.
	 * @see minitlTrace.Steps.Minitl_Rule_Apply_AbstractSubStep
	 * @generated
	 */
	EClass getMinitl_Rule_Apply_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_Rule_Apply_ImplicitStep <em>Minitl Rule Apply Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Rule Apply Implicit Step</em>'.
	 * @see minitlTrace.Steps.Minitl_Rule_Apply_ImplicitStep
	 * @generated
	 */
	EClass getMinitl_Rule_Apply_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_Transformation_Execute <em>Minitl Transformation Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Transformation Execute</em>'.
	 * @see minitlTrace.Steps.Minitl_Transformation_Execute
	 * @generated
	 */
	EClass getMinitl_Transformation_Execute();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_Transformation_Execute_AbstractSubStep <em>Minitl Transformation Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Transformation Execute Abstract Sub Step</em>'.
	 * @see minitlTrace.Steps.Minitl_Transformation_Execute_AbstractSubStep
	 * @generated
	 */
	EClass getMinitl_Transformation_Execute_AbstractSubStep();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_Transformation_Execute_ImplicitStep <em>Minitl Transformation Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Transformation Execute Implicit Step</em>'.
	 * @see minitlTrace.Steps.Minitl_Transformation_Execute_ImplicitStep
	 * @generated
	 */
	EClass getMinitl_Transformation_Execute_ImplicitStep();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.Minitl_Transformation_Initialize <em>Minitl Transformation Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minitl Transformation Initialize</em>'.
	 * @see minitlTrace.Steps.Minitl_Transformation_Initialize
	 * @generated
	 */
	EClass getMinitl_Transformation_Initialize();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Implicit Step</em>'.
	 * @see minitlTrace.Steps.RootImplicitStep
	 * @generated
	 */
	EClass getRootImplicitStep();

	/**
	 * Returns the meta object for class '{@link minitlTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specific Step</em>'.
	 * @see minitlTrace.Steps.SpecificStep
	 * @generated
	 */
	EClass getSpecificStep();

	/**
	 * Returns the meta object for the reference '{@link minitlTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ending State</em>'.
	 * @see minitlTrace.Steps.SpecificStep#getEndingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_EndingState();

	/**
	 * Returns the meta object for the reference '{@link minitlTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Starting State</em>'.
	 * @see minitlTrace.Steps.SpecificStep#getStartingState()
	 * @see #getSpecificStep()
	 * @generated
	 */
	EReference getSpecificStep_StartingState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StepsFactory getStepsFactory();

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
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_Binding_AssignImpl <em>Minitl Binding Assign</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_Binding_AssignImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Binding_Assign()
		 * @generated
		 */
		EClass MINITL_BINDING_ASSIGN = eINSTANCE.getMinitl_Binding_Assign();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_Binding_CheckImpl <em>Minitl Binding Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_Binding_CheckImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Binding_Check()
		 * @generated
		 */
		EClass MINITL_BINDING_CHECK = eINSTANCE.getMinitl_Binding_Check();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_ObjectTemplate_ConstructImpl <em>Minitl Object Template Construct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_ObjectTemplate_ConstructImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Construct()
		 * @generated
		 */
		EClass MINITL_OBJECT_TEMPLATE_CONSTRUCT = eINSTANCE.getMinitl_ObjectTemplate_Construct();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Construct_AbstractSubStep <em>Minitl Object Template Construct Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Construct_AbstractSubStep
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Construct_AbstractSubStep()
		 * @generated
		 */
		EClass MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP = eINSTANCE.getMinitl_ObjectTemplate_Construct_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_ObjectTemplate_Construct_ImplicitStepImpl <em>Minitl Object Template Construct Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_ObjectTemplate_Construct_ImplicitStepImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Construct_ImplicitStep()
		 * @generated
		 */
		EClass MINITL_OBJECT_TEMPLATE_CONSTRUCT_IMPLICIT_STEP = eINSTANCE.getMinitl_ObjectTemplate_Construct_ImplicitStep();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_ObjectTemplate_MatchImpl <em>Minitl Object Template Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_ObjectTemplate_MatchImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Match()
		 * @generated
		 */
		EClass MINITL_OBJECT_TEMPLATE_MATCH = eINSTANCE.getMinitl_ObjectTemplate_Match();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Match_AbstractSubStep <em>Minitl Object Template Match Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Match_AbstractSubStep
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Match_AbstractSubStep()
		 * @generated
		 */
		EClass MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP = eINSTANCE.getMinitl_ObjectTemplate_Match_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_ObjectTemplate_Match_ImplicitStepImpl <em>Minitl Object Template Match Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_ObjectTemplate_Match_ImplicitStepImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_ObjectTemplate_Match_ImplicitStep()
		 * @generated
		 */
		EClass MINITL_OBJECT_TEMPLATE_MATCH_IMPLICIT_STEP = eINSTANCE.getMinitl_ObjectTemplate_Match_ImplicitStep();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_Rule_ApplyImpl <em>Minitl Rule Apply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_Rule_ApplyImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Rule_Apply()
		 * @generated
		 */
		EClass MINITL_RULE_APPLY = eINSTANCE.getMinitl_Rule_Apply();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.Minitl_Rule_Apply_AbstractSubStep <em>Minitl Rule Apply Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.Minitl_Rule_Apply_AbstractSubStep
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Rule_Apply_AbstractSubStep()
		 * @generated
		 */
		EClass MINITL_RULE_APPLY_ABSTRACT_SUB_STEP = eINSTANCE.getMinitl_Rule_Apply_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_Rule_Apply_ImplicitStepImpl <em>Minitl Rule Apply Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_Rule_Apply_ImplicitStepImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Rule_Apply_ImplicitStep()
		 * @generated
		 */
		EClass MINITL_RULE_APPLY_IMPLICIT_STEP = eINSTANCE.getMinitl_Rule_Apply_ImplicitStep();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_Transformation_ExecuteImpl <em>Minitl Transformation Execute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_Transformation_ExecuteImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Transformation_Execute()
		 * @generated
		 */
		EClass MINITL_TRANSFORMATION_EXECUTE = eINSTANCE.getMinitl_Transformation_Execute();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.Minitl_Transformation_Execute_AbstractSubStep <em>Minitl Transformation Execute Abstract Sub Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.Minitl_Transformation_Execute_AbstractSubStep
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Transformation_Execute_AbstractSubStep()
		 * @generated
		 */
		EClass MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP = eINSTANCE.getMinitl_Transformation_Execute_AbstractSubStep();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_Transformation_Execute_ImplicitStepImpl <em>Minitl Transformation Execute Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_Transformation_Execute_ImplicitStepImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Transformation_Execute_ImplicitStep()
		 * @generated
		 */
		EClass MINITL_TRANSFORMATION_EXECUTE_IMPLICIT_STEP = eINSTANCE.getMinitl_Transformation_Execute_ImplicitStep();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.Minitl_Transformation_InitializeImpl <em>Minitl Transformation Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.Minitl_Transformation_InitializeImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getMinitl_Transformation_Initialize()
		 * @generated
		 */
		EClass MINITL_TRANSFORMATION_INITIALIZE = eINSTANCE.getMinitl_Transformation_Initialize();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.impl.RootImplicitStepImpl <em>Root Implicit Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.impl.RootImplicitStepImpl
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getRootImplicitStep()
		 * @generated
		 */
		EClass ROOT_IMPLICIT_STEP = eINSTANCE.getRootImplicitStep();

		/**
		 * The meta object literal for the '{@link minitlTrace.Steps.SpecificStep <em>Specific Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see minitlTrace.Steps.SpecificStep
		 * @see minitlTrace.Steps.impl.StepsPackageImpl#getSpecificStep()
		 * @generated
		 */
		EClass SPECIFIC_STEP = eINSTANCE.getSpecificStep();

		/**
		 * The meta object literal for the '<em><b>Ending State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__ENDING_STATE = eINSTANCE.getSpecificStep_EndingState();

		/**
		 * The meta object literal for the '<em><b>Starting State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFIC_STEP__STARTING_STATE = eINSTANCE.getSpecificStep_StartingState();

	}

} //StepsPackage
