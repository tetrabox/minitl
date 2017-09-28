/**
 */
package minitlTrace.impl;

import minitlTrace.MinitlTraceFactory;
import minitlTrace.MinitlTracePackage;
import minitlTrace.SpecificTrace;

import minitlTrace.States.StatesPackage;

import minitlTrace.States.impl.StatesPackageImpl;

import minitlTrace.States.minitl.impl.MinitlPackageImpl;

import minitlTrace.Steps.StepsPackage;

import minitlTrace.Steps.impl.StepsPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

import org.tetrabox.example.minitl.minitl.MinitlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinitlTracePackageImpl extends EPackageImpl implements MinitlTracePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTraceEClass = null;

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
	 * @see minitlTrace.MinitlTracePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MinitlTracePackageImpl() {
		super(eNS_URI, MinitlTraceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MinitlTracePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MinitlTracePackage init() {
		if (isInited) return (MinitlTracePackage)EPackage.Registry.INSTANCE.getEPackage(MinitlTracePackage.eNS_URI);

		// Obtain or create and register package
		MinitlTracePackageImpl theMinitlTracePackage = (MinitlTracePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MinitlTracePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MinitlTracePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		MinitlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);
		MinitlPackageImpl theMinitlPackage_1 = (MinitlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(minitlTrace.States.minitl.MinitlPackage.eNS_URI) instanceof MinitlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(minitlTrace.States.minitl.MinitlPackage.eNS_URI) : minitlTrace.States.minitl.MinitlPackage.eINSTANCE);

		// Create package meta-data objects
		theMinitlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();
		theMinitlPackage_1.createPackageContents();

		// Initialize created meta-data
		theMinitlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();
		theMinitlPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMinitlTracePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MinitlTracePackage.eNS_URI, theMinitlTracePackage);
		return theMinitlTracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTrace() {
		return specificTraceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Minitl_Binding_Assign_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Minitl_Binding_Check_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Minitl_ObjectTemplate_Construct_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Minitl_ObjectTemplate_Match_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Minitl_Rule_Apply_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Minitl_Transformation_Execute_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecificTrace_Minitl_Transformation_Initialize_Sequence() {
		return (EReference)specificTraceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinitlTraceFactory getMinitlTraceFactory() {
		return (MinitlTraceFactory)getEFactoryInstance();
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
		specificTraceEClass = createEClass(SPECIFIC_TRACE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__MINITL_BINDING_ASSIGN_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__MINITL_BINDING_CHECK_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_CONSTRUCT_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_MATCH_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__MINITL_RULE_APPLY_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__MINITL_TRANSFORMATION_EXECUTE_SEQUENCE);
		createEReference(specificTraceEClass, SPECIFIC_TRACE__MINITL_TRANSFORMATION_INITIALIZE_SEQUENCE);
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
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theStepsPackage);
		getESubpackages().add(theStatesPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		EGenericType g1 = createEGenericType(theTracePackage.getTrace());
		EGenericType g2 = createEGenericType(theTracePackage.getSequentialStep());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		EGenericType g4 = createEGenericType(theStepsPackage.getSpecificStep());
		g3.setEUpperBound(g4);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g4 = createEGenericType(theStatesPackage.getSpecificState());
		g3.setEUpperBound(g4);
		g2 = createEGenericType(theStatesPackage.getSpecificTracedObject());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g4 = createEGenericType(theStatesPackage.getSpecificDimension());
		g3.setEUpperBound(g4);
		EGenericType g5 = createEGenericType();
		g4.getETypeArguments().add(g5);
		EGenericType g6 = createEGenericType(theStatesPackage.getSpecificValue());
		g5.setEUpperBound(g6);
		g2 = createEGenericType(theStatesPackage.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificTraceEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes and features; add operations and parameters
		initEClass(specificTraceEClass, SpecificTrace.class, "SpecificTrace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecificTrace_Minitl_Binding_Assign_Sequence(), theStepsPackage.getMinitl_Binding_Assign(), null, "Minitl_Binding_Assign_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Minitl_Binding_Check_Sequence(), theStepsPackage.getMinitl_Binding_Check(), null, "Minitl_Binding_Check_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Minitl_ObjectTemplate_Construct_Sequence(), theStepsPackage.getMinitl_ObjectTemplate_Construct(), null, "Minitl_ObjectTemplate_Construct_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Minitl_ObjectTemplate_Match_Sequence(), theStepsPackage.getMinitl_ObjectTemplate_Match(), null, "Minitl_ObjectTemplate_Match_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Minitl_Rule_Apply_Sequence(), theStepsPackage.getMinitl_Rule_Apply(), null, "Minitl_Rule_Apply_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Minitl_Transformation_Execute_Sequence(), theStepsPackage.getMinitl_Transformation_Execute(), null, "Minitl_Transformation_Execute_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecificTrace_Minitl_Transformation_Initialize_Sequence(), theStepsPackage.getMinitl_Transformation_Initialize(), null, "Minitl_Transformation_Initialize_Sequence", null, 0, -1, SpecificTrace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MinitlTracePackageImpl
