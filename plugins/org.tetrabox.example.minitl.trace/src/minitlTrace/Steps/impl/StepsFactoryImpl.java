/**
 */
package minitlTrace.Steps.impl;

import minitlTrace.Steps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsFactoryImpl extends EFactoryImpl implements StepsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StepsFactory init() {
		try {
			StepsFactory theStepsFactory = (StepsFactory)EPackage.Registry.INSTANCE.getEFactory(StepsPackage.eNS_URI);
			if (theStepsFactory != null) {
				return theStepsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StepsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StepsPackage.MINITL_BINDING_ASSIGN: return createMinitl_Binding_Assign();
			case StepsPackage.MINITL_BINDING_CHECK: return createMinitl_Binding_Check();
			case StepsPackage.MINITL_OBJECT_TEMPLATE_CONSTRUCT: return createMinitl_ObjectTemplate_Construct();
			case StepsPackage.MINITL_OBJECT_TEMPLATE_CONSTRUCT_IMPLICIT_STEP: return createMinitl_ObjectTemplate_Construct_ImplicitStep();
			case StepsPackage.MINITL_OBJECT_TEMPLATE_MATCH: return createMinitl_ObjectTemplate_Match();
			case StepsPackage.MINITL_OBJECT_TEMPLATE_MATCH_IMPLICIT_STEP: return createMinitl_ObjectTemplate_Match_ImplicitStep();
			case StepsPackage.MINITL_RULE_APPLY: return createMinitl_Rule_Apply();
			case StepsPackage.MINITL_RULE_APPLY_IMPLICIT_STEP: return createMinitl_Rule_Apply_ImplicitStep();
			case StepsPackage.MINITL_TRANSFORMATION_EXECUTE: return createMinitl_Transformation_Execute();
			case StepsPackage.MINITL_TRANSFORMATION_EXECUTE_IMPLICIT_STEP: return createMinitl_Transformation_Execute_ImplicitStep();
			case StepsPackage.MINITL_TRANSFORMATION_INITIALIZE: return createMinitl_Transformation_Initialize();
			case StepsPackage.ROOT_IMPLICIT_STEP: return createRootImplicitStep();
			case StepsPackage.SPECIFIC_ROOT_STEP: return createSpecificRootStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_Binding_Assign createMinitl_Binding_Assign() {
		Minitl_Binding_AssignImpl minitl_Binding_Assign = new Minitl_Binding_AssignImpl();
		return minitl_Binding_Assign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_Binding_Check createMinitl_Binding_Check() {
		Minitl_Binding_CheckImpl minitl_Binding_Check = new Minitl_Binding_CheckImpl();
		return minitl_Binding_Check;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_ObjectTemplate_Construct createMinitl_ObjectTemplate_Construct() {
		Minitl_ObjectTemplate_ConstructImpl minitl_ObjectTemplate_Construct = new Minitl_ObjectTemplate_ConstructImpl();
		return minitl_ObjectTemplate_Construct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_ObjectTemplate_Construct_ImplicitStep createMinitl_ObjectTemplate_Construct_ImplicitStep() {
		Minitl_ObjectTemplate_Construct_ImplicitStepImpl minitl_ObjectTemplate_Construct_ImplicitStep = new Minitl_ObjectTemplate_Construct_ImplicitStepImpl();
		return minitl_ObjectTemplate_Construct_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_ObjectTemplate_Match createMinitl_ObjectTemplate_Match() {
		Minitl_ObjectTemplate_MatchImpl minitl_ObjectTemplate_Match = new Minitl_ObjectTemplate_MatchImpl();
		return minitl_ObjectTemplate_Match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_ObjectTemplate_Match_ImplicitStep createMinitl_ObjectTemplate_Match_ImplicitStep() {
		Minitl_ObjectTemplate_Match_ImplicitStepImpl minitl_ObjectTemplate_Match_ImplicitStep = new Minitl_ObjectTemplate_Match_ImplicitStepImpl();
		return minitl_ObjectTemplate_Match_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_Rule_Apply createMinitl_Rule_Apply() {
		Minitl_Rule_ApplyImpl minitl_Rule_Apply = new Minitl_Rule_ApplyImpl();
		return minitl_Rule_Apply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_Rule_Apply_ImplicitStep createMinitl_Rule_Apply_ImplicitStep() {
		Minitl_Rule_Apply_ImplicitStepImpl minitl_Rule_Apply_ImplicitStep = new Minitl_Rule_Apply_ImplicitStepImpl();
		return minitl_Rule_Apply_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_Transformation_Execute createMinitl_Transformation_Execute() {
		Minitl_Transformation_ExecuteImpl minitl_Transformation_Execute = new Minitl_Transformation_ExecuteImpl();
		return minitl_Transformation_Execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_Transformation_Execute_ImplicitStep createMinitl_Transformation_Execute_ImplicitStep() {
		Minitl_Transformation_Execute_ImplicitStepImpl minitl_Transformation_Execute_ImplicitStep = new Minitl_Transformation_Execute_ImplicitStepImpl();
		return minitl_Transformation_Execute_ImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minitl_Transformation_Initialize createMinitl_Transformation_Initialize() {
		Minitl_Transformation_InitializeImpl minitl_Transformation_Initialize = new Minitl_Transformation_InitializeImpl();
		return minitl_Transformation_Initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootImplicitStep createRootImplicitStep() {
		RootImplicitStepImpl rootImplicitStep = new RootImplicitStepImpl();
		return rootImplicitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificRootStep createSpecificRootStep() {
		SpecificRootStepImpl specificRootStep = new SpecificRootStepImpl();
		return specificRootStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsPackage getStepsPackage() {
		return (StepsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StepsPackage getPackage() {
		return StepsPackage.eINSTANCE;
	}

} //StepsFactoryImpl
