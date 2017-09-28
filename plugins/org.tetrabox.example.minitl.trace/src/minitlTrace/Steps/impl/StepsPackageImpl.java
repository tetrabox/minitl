/**
 */
package minitlTrace.Steps.impl;

import minitlTrace.MinitlTracePackage;

import minitlTrace.States.StatesPackage;

import minitlTrace.States.impl.StatesPackageImpl;

import minitlTrace.States.minitl.impl.MinitlPackageImpl;

import minitlTrace.Steps.Minitl_Binding_Assign;
import minitlTrace.Steps.Minitl_Binding_Check;
import minitlTrace.Steps.Minitl_ObjectTemplate_Construct;
import minitlTrace.Steps.Minitl_ObjectTemplate_Construct_AbstractSubStep;
import minitlTrace.Steps.Minitl_ObjectTemplate_Construct_ImplicitStep;
import minitlTrace.Steps.Minitl_ObjectTemplate_Match;
import minitlTrace.Steps.Minitl_ObjectTemplate_Match_AbstractSubStep;
import minitlTrace.Steps.Minitl_ObjectTemplate_Match_ImplicitStep;
import minitlTrace.Steps.Minitl_Rule_Apply;
import minitlTrace.Steps.Minitl_Rule_Apply_AbstractSubStep;
import minitlTrace.Steps.Minitl_Rule_Apply_ImplicitStep;
import minitlTrace.Steps.Minitl_Transformation_Execute;
import minitlTrace.Steps.Minitl_Transformation_Execute_AbstractSubStep;
import minitlTrace.Steps.Minitl_Transformation_Execute_ImplicitStep;
import minitlTrace.Steps.Minitl_Transformation_Initialize;
import minitlTrace.Steps.RootImplicitStep;
import minitlTrace.Steps.SpecificRootStep;
import minitlTrace.Steps.SpecificStep;
import minitlTrace.Steps.StepsFactory;
import minitlTrace.Steps.StepsPackage;

import minitlTrace.impl.MinitlTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import org.tetrabox.example.minitl.minitl.MinitlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StepsPackageImpl extends EPackageImpl implements StepsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_Binding_AssignEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_Binding_CheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_ObjectTemplate_ConstructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_ObjectTemplate_Construct_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_ObjectTemplate_Construct_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_ObjectTemplate_MatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_ObjectTemplate_Match_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_ObjectTemplate_Match_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_Rule_ApplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_Rule_Apply_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_Rule_Apply_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_Transformation_ExecuteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_Transformation_Execute_AbstractSubStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_Transformation_Execute_ImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minitl_Transformation_InitializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootImplicitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificRootStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStepEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see minitlTrace.Steps.StepsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StepsPackageImpl() {
		super(eNS_URI, StepsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StepsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StepsPackage init() {
		if (isInited) return (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Obtain or create and register package
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StepsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		MinitlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MinitlTracePackageImpl theMinitlTracePackage = (MinitlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MinitlTracePackage.eNS_URI) instanceof MinitlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MinitlTracePackage.eNS_URI) : MinitlTracePackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		MinitlPackageImpl theMinitlPackage_1 = (MinitlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(minitlTrace.States.minitl.MinitlPackage.eNS_URI) instanceof MinitlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(minitlTrace.States.minitl.MinitlPackage.eNS_URI) : minitlTrace.States.minitl.MinitlPackage.eINSTANCE);

		// Create package meta-data objects
		theStepsPackage.createPackageContents();
		theMinitlTracePackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theMinitlPackage_1.createPackageContents();

		// Initialize created meta-data
		theStepsPackage.initializePackageContents();
		theMinitlTracePackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theMinitlPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStepsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StepsPackage.eNS_URI, theStepsPackage);
		return theStepsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_Binding_Assign() {
		return minitl_Binding_AssignEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_Binding_Check() {
		return minitl_Binding_CheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_ObjectTemplate_Construct() {
		return minitl_ObjectTemplate_ConstructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_ObjectTemplate_Construct_AbstractSubStep() {
		return minitl_ObjectTemplate_Construct_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_ObjectTemplate_Construct_ImplicitStep() {
		return minitl_ObjectTemplate_Construct_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_ObjectTemplate_Match() {
		return minitl_ObjectTemplate_MatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_ObjectTemplate_Match_AbstractSubStep() {
		return minitl_ObjectTemplate_Match_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_ObjectTemplate_Match_ImplicitStep() {
		return minitl_ObjectTemplate_Match_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_Rule_Apply() {
		return minitl_Rule_ApplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_Rule_Apply_AbstractSubStep() {
		return minitl_Rule_Apply_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_Rule_Apply_ImplicitStep() {
		return minitl_Rule_Apply_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_Transformation_Execute() {
		return minitl_Transformation_ExecuteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_Transformation_Execute_AbstractSubStep() {
		return minitl_Transformation_Execute_AbstractSubStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_Transformation_Execute_ImplicitStep() {
		return minitl_Transformation_Execute_ImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinitl_Transformation_Initialize() {
		return minitl_Transformation_InitializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootImplicitStep() {
		return rootImplicitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificRootStep() {
		return specificRootStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificStep() {
		return specificStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsFactory getStepsFactory() {
		return (StepsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		minitl_Binding_AssignEClass = createEClass(MINITL_BINDING_ASSIGN);

		minitl_Binding_CheckEClass = createEClass(MINITL_BINDING_CHECK);

		minitl_ObjectTemplate_ConstructEClass = createEClass(MINITL_OBJECT_TEMPLATE_CONSTRUCT);

		minitl_ObjectTemplate_Construct_AbstractSubStepEClass = createEClass(MINITL_OBJECT_TEMPLATE_CONSTRUCT_ABSTRACT_SUB_STEP);

		minitl_ObjectTemplate_Construct_ImplicitStepEClass = createEClass(MINITL_OBJECT_TEMPLATE_CONSTRUCT_IMPLICIT_STEP);

		minitl_ObjectTemplate_MatchEClass = createEClass(MINITL_OBJECT_TEMPLATE_MATCH);

		minitl_ObjectTemplate_Match_AbstractSubStepEClass = createEClass(MINITL_OBJECT_TEMPLATE_MATCH_ABSTRACT_SUB_STEP);

		minitl_ObjectTemplate_Match_ImplicitStepEClass = createEClass(MINITL_OBJECT_TEMPLATE_MATCH_IMPLICIT_STEP);

		minitl_Rule_ApplyEClass = createEClass(MINITL_RULE_APPLY);

		minitl_Rule_Apply_AbstractSubStepEClass = createEClass(MINITL_RULE_APPLY_ABSTRACT_SUB_STEP);

		minitl_Rule_Apply_ImplicitStepEClass = createEClass(MINITL_RULE_APPLY_IMPLICIT_STEP);

		minitl_Transformation_ExecuteEClass = createEClass(MINITL_TRANSFORMATION_EXECUTE);

		minitl_Transformation_Execute_AbstractSubStepEClass = createEClass(MINITL_TRANSFORMATION_EXECUTE_ABSTRACT_SUB_STEP);

		minitl_Transformation_Execute_ImplicitStepEClass = createEClass(MINITL_TRANSFORMATION_EXECUTE_IMPLICIT_STEP);

		minitl_Transformation_InitializeEClass = createEClass(MINITL_TRANSFORMATION_INITIALIZE);

		rootImplicitStepEClass = createEClass(ROOT_IMPLICIT_STEP);

		specificRootStepEClass = createEClass(SPECIFIC_ROOT_STEP);

		specificStepEClass = createEClass(SPECIFIC_STEP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		MinitlPackage theMinitlPackage = (MinitlPackage)EPackage.Registry.INSTANCE.getEPackage(MinitlPackage.eNS_URI);
		minitlTrace.States.minitl.MinitlPackage theMinitlPackage_1 = (minitlTrace.States.minitl.MinitlPackage)EPackage.Registry.INSTANCE.getEPackage(minitlTrace.States.minitl.MinitlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(this.getMinitl_ObjectTemplate_Construct_AbstractSubStep());
		minitl_Binding_AssignEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		minitl_Binding_AssignEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		EGenericType g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_Binding_AssignEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		minitl_Binding_CheckEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_Binding_CheckEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMinitl_ObjectTemplate_Match_AbstractSubStep());
		minitl_Binding_CheckEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMinitl_Rule_Apply_AbstractSubStep());
		minitl_ObjectTemplate_ConstructEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		minitl_ObjectTemplate_ConstructEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getMinitl_ObjectTemplate_Construct_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_ObjectTemplate_ConstructEClass.getEGenericSuperTypes().add(g1);
		minitl_ObjectTemplate_Construct_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		g1 = createEGenericType(this.getMinitl_ObjectTemplate_Construct_AbstractSubStep());
		minitl_ObjectTemplate_Construct_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_ObjectTemplate_Construct_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMinitl_Rule_Apply_AbstractSubStep());
		minitl_ObjectTemplate_MatchEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		minitl_ObjectTemplate_MatchEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getMinitl_ObjectTemplate_Match_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_ObjectTemplate_MatchEClass.getEGenericSuperTypes().add(g1);
		minitl_ObjectTemplate_Match_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		g1 = createEGenericType(this.getMinitl_ObjectTemplate_Match_AbstractSubStep());
		minitl_ObjectTemplate_Match_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_ObjectTemplate_Match_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getMinitl_Transformation_Execute_AbstractSubStep());
		minitl_Rule_ApplyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		minitl_Rule_ApplyEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getMinitl_Rule_Apply_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_Rule_ApplyEClass.getEGenericSuperTypes().add(g1);
		minitl_Rule_Apply_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		g1 = createEGenericType(this.getMinitl_Rule_Apply_AbstractSubStep());
		minitl_Rule_Apply_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_Rule_Apply_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		minitl_Transformation_ExecuteEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getMinitl_Transformation_Execute_AbstractSubStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_Transformation_ExecuteEClass.getEGenericSuperTypes().add(g1);
		minitl_Transformation_Execute_AbstractSubStepEClass.getESuperTypes().add(this.getSpecificStep());
		g1 = createEGenericType(this.getMinitl_Transformation_Execute_AbstractSubStep());
		minitl_Transformation_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_Transformation_Execute_ImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		minitl_Transformation_InitializeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		minitl_Transformation_InitializeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSmallStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		rootImplicitStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getSequentialStep());
		g2 = createEGenericType(this.getSpecificStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificRootStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificStep());
		specificRootStepEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getStep());
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificStepEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(minitl_Binding_AssignEClass, Minitl_Binding_Assign.class, "Minitl_Binding_Assign", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(minitl_Binding_AssignEClass, theMinitlPackage.getBinding(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(minitl_Binding_CheckEClass, Minitl_Binding_Check.class, "Minitl_Binding_Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(minitl_Binding_CheckEClass, theMinitlPackage.getBinding(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(minitl_ObjectTemplate_ConstructEClass, Minitl_ObjectTemplate_Construct.class, "Minitl_ObjectTemplate_Construct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(minitl_ObjectTemplate_ConstructEClass, theMinitlPackage_1.getTracedObjectTemplate(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(minitl_ObjectTemplate_Construct_AbstractSubStepEClass, Minitl_ObjectTemplate_Construct_AbstractSubStep.class, "Minitl_ObjectTemplate_Construct_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minitl_ObjectTemplate_Construct_ImplicitStepEClass, Minitl_ObjectTemplate_Construct_ImplicitStep.class, "Minitl_ObjectTemplate_Construct_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minitl_ObjectTemplate_MatchEClass, Minitl_ObjectTemplate_Match.class, "Minitl_ObjectTemplate_Match", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(minitl_ObjectTemplate_MatchEClass, theMinitlPackage_1.getTracedObjectTemplate(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(minitl_ObjectTemplate_Match_AbstractSubStepEClass, Minitl_ObjectTemplate_Match_AbstractSubStep.class, "Minitl_ObjectTemplate_Match_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minitl_ObjectTemplate_Match_ImplicitStepEClass, Minitl_ObjectTemplate_Match_ImplicitStep.class, "Minitl_ObjectTemplate_Match_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minitl_Rule_ApplyEClass, Minitl_Rule_Apply.class, "Minitl_Rule_Apply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(minitl_Rule_ApplyEClass, theMinitlPackage_1.getTracedRule(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(minitl_Rule_Apply_AbstractSubStepEClass, Minitl_Rule_Apply_AbstractSubStep.class, "Minitl_Rule_Apply_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minitl_Rule_Apply_ImplicitStepEClass, Minitl_Rule_Apply_ImplicitStep.class, "Minitl_Rule_Apply_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minitl_Transformation_ExecuteEClass, Minitl_Transformation_Execute.class, "Minitl_Transformation_Execute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(minitl_Transformation_ExecuteEClass, theMinitlPackage_1.getTracedTransformation(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(minitl_Transformation_Execute_AbstractSubStepEClass, Minitl_Transformation_Execute_AbstractSubStep.class, "Minitl_Transformation_Execute_AbstractSubStep", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minitl_Transformation_Execute_ImplicitStepEClass, Minitl_Transformation_Execute_ImplicitStep.class, "Minitl_Transformation_Execute_ImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minitl_Transformation_InitializeEClass, Minitl_Transformation_Initialize.class, "Minitl_Transformation_Initialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(minitl_Transformation_InitializeEClass, theMinitlPackage_1.getTracedTransformation(), "getCaller", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(rootImplicitStepEClass, RootImplicitStep.class, "RootImplicitStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificRootStepEClass, SpecificRootStep.class, "SpecificRootStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStepEClass, SpecificStep.class, "SpecificStep", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //StepsPackageImpl
