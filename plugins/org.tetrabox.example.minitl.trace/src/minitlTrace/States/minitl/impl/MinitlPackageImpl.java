/**
 */
package minitlTrace.States.minitl.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import minitlTrace.MinitlTracePackage;

import minitlTrace.States.StatesPackage;

import minitlTrace.States.impl.StatesPackageImpl;

import minitlTrace.States.minitl.MinitlFactory;
import minitlTrace.States.minitl.MinitlPackage;
import minitlTrace.States.minitl.TracedNamedElement;
import minitlTrace.States.minitl.TracedObjectTemplate;
import minitlTrace.States.minitl.TracedRule;
import minitlTrace.States.minitl.TracedTransformation;

import minitlTrace.Steps.StepsPackage;

import minitlTrace.Steps.impl.StepsPackageImpl;

import minitlTrace.impl.MinitlTracePackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinitlPackageImpl extends EPackageImpl implements MinitlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedObjectTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tracedTransformationEClass = null;

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
	 * @see minitlTrace.States.minitl.MinitlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MinitlPackageImpl() {
		super(eNS_URI, MinitlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MinitlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MinitlPackage init() {
		if (isInited) return (MinitlPackage)EPackage.Registry.INSTANCE.getEPackage(MinitlPackage.eNS_URI);

		// Obtain or create and register package
		MinitlPackageImpl theMinitlPackage = (MinitlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MinitlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MinitlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MinitlTracePackageImpl theMinitlTracePackage = (MinitlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MinitlTracePackage.eNS_URI) instanceof MinitlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MinitlTracePackage.eNS_URI) : MinitlTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI) : StatesPackage.eINSTANCE);

		// Create package meta-data objects
		theMinitlPackage.createPackageContents();
		theMinitlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theStatesPackage.createPackageContents();

		// Initialize created meta-data
		theMinitlPackage.initializePackageContents();
		theMinitlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theStatesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMinitlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MinitlPackage.eNS_URI, theMinitlPackage);
		return theMinitlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedNamedElement() {
		return tracedNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedObjectTemplate() {
		return tracedObjectTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjectTemplate_CurrentObjectSequence() {
		return (EReference)tracedObjectTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedObjectTemplate_OriginalObject() {
		return (EReference)tracedObjectTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedRule() {
		return tracedRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedRule_OriginalObject() {
		return (EReference)tracedRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTracedTransformation() {
		return tracedTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransformation_InputModelSequence() {
		return (EReference)tracedTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransformation_InputModelURISequence() {
		return (EReference)tracedTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransformation_OriginalObject() {
		return (EReference)tracedTransformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransformation_OutputFilePathSequence() {
		return (EReference)tracedTransformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTracedTransformation_OutputModelSequence() {
		return (EReference)tracedTransformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinitlFactory getMinitlFactory() {
		return (MinitlFactory)getEFactoryInstance();
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
		tracedNamedElementEClass = createEClass(TRACED_NAMED_ELEMENT);

		tracedObjectTemplateEClass = createEClass(TRACED_OBJECT_TEMPLATE);
		createEReference(tracedObjectTemplateEClass, TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE);
		createEReference(tracedObjectTemplateEClass, TRACED_OBJECT_TEMPLATE__ORIGINAL_OBJECT);

		tracedRuleEClass = createEClass(TRACED_RULE);
		createEReference(tracedRuleEClass, TRACED_RULE__ORIGINAL_OBJECT);

		tracedTransformationEClass = createEClass(TRACED_TRANSFORMATION);
		createEReference(tracedTransformationEClass, TRACED_TRANSFORMATION__INPUT_MODEL_SEQUENCE);
		createEReference(tracedTransformationEClass, TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE);
		createEReference(tracedTransformationEClass, TRACED_TRANSFORMATION__ORIGINAL_OBJECT);
		createEReference(tracedTransformationEClass, TRACED_TRANSFORMATION__OUTPUT_FILE_PATH_SEQUENCE);
		createEReference(tracedTransformationEClass, TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE);
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
		StatesPackage theStatesPackage = (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);
		org.tetrabox.example.minitl.minitl.MinitlPackage theMinitlPackage_1 = (org.tetrabox.example.minitl.minitl.MinitlPackage)EPackage.Registry.INSTANCE.getEPackage(org.tetrabox.example.minitl.minitl.MinitlPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tracedObjectTemplateEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedRuleEClass.getESuperTypes().add(this.getTracedNamedElement());
		tracedTransformationEClass.getESuperTypes().add(this.getTracedNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(tracedNamedElementEClass, TracedNamedElement.class, "TracedNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tracedObjectTemplateEClass, TracedObjectTemplate.class, "TracedObjectTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedObjectTemplate_CurrentObjectSequence(), theStatesPackage.getObjectTemplate_currentObject_Value(), theStatesPackage.getObjectTemplate_currentObject_Value_Parent(), "currentObjectSequence", null, 0, -1, TracedObjectTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedObjectTemplate_OriginalObject(), theMinitlPackage_1.getObjectTemplate(), null, "originalObject", null, 0, 1, TracedObjectTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedRuleEClass, TracedRule.class, "TracedRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedRule_OriginalObject(), theMinitlPackage_1.getRule(), null, "originalObject", null, 0, 1, TracedRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tracedTransformationEClass, TracedTransformation.class, "TracedTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTracedTransformation_InputModelSequence(), theStatesPackage.getTransformation_inputModel_Value(), theStatesPackage.getTransformation_inputModel_Value_Parent(), "inputModelSequence", null, 0, -1, TracedTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransformation_InputModelURISequence(), theStatesPackage.getTransformation_inputModelURI_Value(), theStatesPackage.getTransformation_inputModelURI_Value_Parent(), "inputModelURISequence", null, 0, -1, TracedTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransformation_OriginalObject(), theMinitlPackage_1.getTransformation(), null, "originalObject", null, 0, 1, TracedTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransformation_OutputFilePathSequence(), theStatesPackage.getTransformation_outputFilePath_Value(), theStatesPackage.getTransformation_outputFilePath_Value_Parent(), "outputFilePathSequence", null, 0, -1, TracedTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTracedTransformation_OutputModelSequence(), theStatesPackage.getTransformation_outputModel_Value(), theStatesPackage.getTransformation_outputModel_Value_Parent(), "outputModelSequence", null, 0, -1, TracedTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //MinitlPackageImpl
