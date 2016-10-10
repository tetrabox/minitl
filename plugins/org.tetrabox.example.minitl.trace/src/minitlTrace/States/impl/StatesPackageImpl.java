/**
 */
package minitlTrace.States.impl;

import fr.inria.diverse.trace.commons.model.trace.TracePackage;

import minitlTrace.MinitlTracePackage;

import minitlTrace.States.ObjectTemplate_currentObject_Value;
import minitlTrace.States.State;
import minitlTrace.States.StatesFactory;
import minitlTrace.States.StatesPackage;
import minitlTrace.States.Transformation_inputModelURI_Value;
import minitlTrace.States.Transformation_inputModel_Value;
import minitlTrace.States.Transformation_outputFilePath_Value;
import minitlTrace.States.Transformation_outputModel_Value;
import minitlTrace.States.Value;

import minitlTrace.States.minitl.impl.MinitlPackageImpl;

import minitlTrace.Steps.StepsPackage;

import minitlTrace.Steps.impl.StepsPackageImpl;

import minitlTrace.impl.MinitlTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.tetrabox.example.minitl.minitl.MinitlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatesPackageImpl extends EPackageImpl implements StatesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTemplate_currentObject_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformation_inputModelURI_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformation_inputModel_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformation_outputFilePath_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformation_outputModel_ValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

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
	 * @see minitlTrace.States.StatesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StatesPackageImpl() {
		super(eNS_URI, StatesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StatesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StatesPackage init() {
		if (isInited) return (StatesPackage)EPackage.Registry.INSTANCE.getEPackage(StatesPackage.eNS_URI);

		// Obtain or create and register package
		StatesPackageImpl theStatesPackage = (StatesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StatesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StatesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TracePackage.eINSTANCE.eClass();
		MinitlPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		MinitlTracePackageImpl theMinitlTracePackage = (MinitlTracePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MinitlTracePackage.eNS_URI) instanceof MinitlTracePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MinitlTracePackage.eNS_URI) : MinitlTracePackage.eINSTANCE);
		StepsPackageImpl theStepsPackage = (StepsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) instanceof StepsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI) : StepsPackage.eINSTANCE);
		MinitlPackageImpl theMinitlPackage_1 = (MinitlPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(minitlTrace.States.minitl.MinitlPackage.eNS_URI) instanceof MinitlPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(minitlTrace.States.minitl.MinitlPackage.eNS_URI) : minitlTrace.States.minitl.MinitlPackage.eINSTANCE);

		// Create package meta-data objects
		theStatesPackage.createPackageContents();
		theMinitlTracePackage.createPackageContents();
		theStepsPackage.createPackageContents();
		theMinitlPackage_1.createPackageContents();

		// Initialize created meta-data
		theStatesPackage.initializePackageContents();
		theMinitlTracePackage.initializePackageContents();
		theStepsPackage.initializePackageContents();
		theMinitlPackage_1.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStatesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StatesPackage.eNS_URI, theStatesPackage);
		return theStatesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectTemplate_currentObject_Value() {
		return objectTemplate_currentObject_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectTemplate_currentObject_Value_CurrentObject() {
		return (EAttribute)objectTemplate_currentObject_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTemplate_currentObject_Value_Parent() {
		return (EReference)objectTemplate_currentObject_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectTemplate_currentObject_Value_States() {
		return (EReference)objectTemplate_currentObject_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectTemplate_currentObject_Value__GetStatesNoOpposite() {
		return objectTemplate_currentObject_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_EndedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ObjectTemplate_currentObject_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StartedSteps() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transformation_inputModelURI_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transformation_inputModel_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transformation_outputFilePath_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Transformation_outputModel_Values() {
		return (EReference)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation_inputModelURI_Value() {
		return transformation_inputModelURI_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_inputModelURI_Value_InputModelURI() {
		return (EAttribute)transformation_inputModelURI_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_inputModelURI_Value_Parent() {
		return (EReference)transformation_inputModelURI_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_inputModelURI_Value_States() {
		return (EReference)transformation_inputModelURI_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransformation_inputModelURI_Value__GetStatesNoOpposite() {
		return transformation_inputModelURI_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation_inputModel_Value() {
		return transformation_inputModel_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_inputModel_Value_InputModel() {
		return (EAttribute)transformation_inputModel_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_inputModel_Value_Parent() {
		return (EReference)transformation_inputModel_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_inputModel_Value_States() {
		return (EReference)transformation_inputModel_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransformation_inputModel_Value__GetStatesNoOpposite() {
		return transformation_inputModel_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation_outputFilePath_Value() {
		return transformation_outputFilePath_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_outputFilePath_Value_OutputFilePath() {
		return (EAttribute)transformation_outputFilePath_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_outputFilePath_Value_Parent() {
		return (EReference)transformation_outputFilePath_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_outputFilePath_Value_States() {
		return (EReference)transformation_outputFilePath_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransformation_outputFilePath_Value__GetStatesNoOpposite() {
		return transformation_outputFilePath_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation_outputModel_Value() {
		return transformation_outputModel_ValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformation_outputModel_Value_OutputModel() {
		return (EAttribute)transformation_outputModel_ValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_outputModel_Value_Parent() {
		return (EReference)transformation_outputModel_ValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformation_outputModel_Value_States() {
		return (EReference)transformation_outputModel_ValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransformation_outputModel_Value__GetStatesNoOpposite() {
		return transformation_outputModel_ValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValue_StatesNoOpposite() {
		return (EReference)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactory getStatesFactory() {
		return (StatesFactory)getEFactoryInstance();
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
		objectTemplate_currentObject_ValueEClass = createEClass(OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE);
		createEAttribute(objectTemplate_currentObject_ValueEClass, OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT);
		createEReference(objectTemplate_currentObject_ValueEClass, OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT);
		createEReference(objectTemplate_currentObject_ValueEClass, OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES);
		createEOperation(objectTemplate_currentObject_ValueEClass, OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE___GET_STATES_NO_OPPOSITE);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__ENDED_STEPS);
		createEReference(stateEClass, STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES);
		createEReference(stateEClass, STATE__STARTED_STEPS);
		createEReference(stateEClass, STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES);
		createEReference(stateEClass, STATE__TRANSFORMATION_INPUT_MODEL_VALUES);
		createEReference(stateEClass, STATE__TRANSFORMATION_OUTPUT_FILE_PATH_VALUES);
		createEReference(stateEClass, STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES);

		transformation_inputModelURI_ValueEClass = createEClass(TRANSFORMATION_INPUT_MODEL_URI_VALUE);
		createEAttribute(transformation_inputModelURI_ValueEClass, TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI);
		createEReference(transformation_inputModelURI_ValueEClass, TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT);
		createEReference(transformation_inputModelURI_ValueEClass, TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES);
		createEOperation(transformation_inputModelURI_ValueEClass, TRANSFORMATION_INPUT_MODEL_URI_VALUE___GET_STATES_NO_OPPOSITE);

		transformation_inputModel_ValueEClass = createEClass(TRANSFORMATION_INPUT_MODEL_VALUE);
		createEAttribute(transformation_inputModel_ValueEClass, TRANSFORMATION_INPUT_MODEL_VALUE__INPUT_MODEL);
		createEReference(transformation_inputModel_ValueEClass, TRANSFORMATION_INPUT_MODEL_VALUE__PARENT);
		createEReference(transformation_inputModel_ValueEClass, TRANSFORMATION_INPUT_MODEL_VALUE__STATES);
		createEOperation(transformation_inputModel_ValueEClass, TRANSFORMATION_INPUT_MODEL_VALUE___GET_STATES_NO_OPPOSITE);

		transformation_outputFilePath_ValueEClass = createEClass(TRANSFORMATION_OUTPUT_FILE_PATH_VALUE);
		createEAttribute(transformation_outputFilePath_ValueEClass, TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__OUTPUT_FILE_PATH);
		createEReference(transformation_outputFilePath_ValueEClass, TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__PARENT);
		createEReference(transformation_outputFilePath_ValueEClass, TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__STATES);
		createEOperation(transformation_outputFilePath_ValueEClass, TRANSFORMATION_OUTPUT_FILE_PATH_VALUE___GET_STATES_NO_OPPOSITE);

		transformation_outputModel_ValueEClass = createEClass(TRANSFORMATION_OUTPUT_MODEL_VALUE);
		createEAttribute(transformation_outputModel_ValueEClass, TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL);
		createEReference(transformation_outputModel_ValueEClass, TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT);
		createEReference(transformation_outputModel_ValueEClass, TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES);
		createEOperation(transformation_outputModel_ValueEClass, TRANSFORMATION_OUTPUT_MODEL_VALUE___GET_STATES_NO_OPPOSITE);

		valueEClass = createEClass(VALUE);
		createEReference(valueEClass, VALUE__STATES_NO_OPPOSITE);
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
		minitlTrace.States.minitl.MinitlPackage theMinitlPackage_1 = (minitlTrace.States.minitl.MinitlPackage)EPackage.Registry.INSTANCE.getEPackage(minitlTrace.States.minitl.MinitlPackage.eNS_URI);
		MinitlPackage theMinitlPackage = (MinitlPackage)EPackage.Registry.INSTANCE.getEPackage(MinitlPackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theMinitlPackage_1);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		objectTemplate_currentObject_ValueEClass.getESuperTypes().add(this.getValue());
		transformation_inputModelURI_ValueEClass.getESuperTypes().add(this.getValue());
		transformation_inputModel_ValueEClass.getESuperTypes().add(this.getValue());
		transformation_outputFilePath_ValueEClass.getESuperTypes().add(this.getValue());
		transformation_outputModel_ValueEClass.getESuperTypes().add(this.getValue());

		// Initialize classes, features, and operations; add parameters
		initEClass(objectTemplate_currentObject_ValueEClass, ObjectTemplate_currentObject_Value.class, "ObjectTemplate_currentObject_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectTemplate_currentObject_Value_CurrentObject(), theMinitlPackage.getEObject(), "currentObject", null, 0, 1, ObjectTemplate_currentObject_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectTemplate_currentObject_Value_Parent(), theMinitlPackage_1.getTracedObjectTemplate(), theMinitlPackage_1.getTracedObjectTemplate_CurrentObjectSequence(), "parent", null, 1, 1, ObjectTemplate_currentObject_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectTemplate_currentObject_Value_States(), this.getState(), this.getState_ObjectTemplate_currentObject_Values(), "states", null, 1, -1, ObjectTemplate_currentObject_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getObjectTemplate_currentObject_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_EndedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_EndingState(), "endedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_ObjectTemplate_currentObject_Values(), this.getObjectTemplate_currentObject_Value(), this.getObjectTemplate_currentObject_Value_States(), "objectTemplate_currentObject_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_StartedSteps(), theStepsPackage.getSpecificStep(), theStepsPackage.getSpecificStep_StartingState(), "startedSteps", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Transformation_inputModelURI_Values(), this.getTransformation_inputModelURI_Value(), this.getTransformation_inputModelURI_Value_States(), "transformation_inputModelURI_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Transformation_inputModel_Values(), this.getTransformation_inputModel_Value(), this.getTransformation_inputModel_Value_States(), "transformation_inputModel_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Transformation_outputFilePath_Values(), this.getTransformation_outputFilePath_Value(), this.getTransformation_outputFilePath_Value_States(), "transformation_outputFilePath_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Transformation_outputModel_Values(), this.getTransformation_outputModel_Value(), this.getTransformation_outputModel_Value_States(), "transformation_outputModel_Values", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transformation_inputModelURI_ValueEClass, Transformation_inputModelURI_Value.class, "Transformation_inputModelURI_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_inputModelURI_Value_InputModelURI(), ecorePackage.getEString(), "inputModelURI", null, 0, 1, Transformation_inputModelURI_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_inputModelURI_Value_Parent(), theMinitlPackage_1.getTracedTransformation(), theMinitlPackage_1.getTracedTransformation_InputModelURISequence(), "parent", null, 1, 1, Transformation_inputModelURI_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_inputModelURI_Value_States(), this.getState(), this.getState_Transformation_inputModelURI_Values(), "states", null, 1, -1, Transformation_inputModelURI_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransformation_inputModelURI_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(transformation_inputModel_ValueEClass, Transformation_inputModel_Value.class, "Transformation_inputModel_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_inputModel_Value_InputModel(), theMinitlPackage.getEObject(), "inputModel", null, 0, -1, Transformation_inputModel_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_inputModel_Value_Parent(), theMinitlPackage_1.getTracedTransformation(), theMinitlPackage_1.getTracedTransformation_InputModelSequence(), "parent", null, 1, 1, Transformation_inputModel_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_inputModel_Value_States(), this.getState(), this.getState_Transformation_inputModel_Values(), "states", null, 1, -1, Transformation_inputModel_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransformation_inputModel_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(transformation_outputFilePath_ValueEClass, Transformation_outputFilePath_Value.class, "Transformation_outputFilePath_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_outputFilePath_Value_OutputFilePath(), ecorePackage.getEString(), "outputFilePath", null, 0, 1, Transformation_outputFilePath_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_outputFilePath_Value_Parent(), theMinitlPackage_1.getTracedTransformation(), theMinitlPackage_1.getTracedTransformation_OutputFilePathSequence(), "parent", null, 1, 1, Transformation_outputFilePath_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_outputFilePath_Value_States(), this.getState(), this.getState_Transformation_outputFilePath_Values(), "states", null, 1, -1, Transformation_outputFilePath_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransformation_outputFilePath_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(transformation_outputModel_ValueEClass, Transformation_outputModel_Value.class, "Transformation_outputModel_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_outputModel_Value_OutputModel(), theMinitlPackage.getEObject(), "outputModel", null, 0, -1, Transformation_outputModel_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_outputModel_Value_Parent(), theMinitlPackage_1.getTracedTransformation(), theMinitlPackage_1.getTracedTransformation_OutputModelSequence(), "parent", null, 1, 1, Transformation_outputModel_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransformation_outputModel_Value_States(), this.getState(), this.getState_Transformation_outputModel_Values(), "states", null, 1, -1, Transformation_outputModel_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransformation_outputModel_Value__GetStatesNoOpposite(), this.getState(), "getStatesNoOpposite", 1, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValue_StatesNoOpposite(), this.getState(), null, "statesNoOpposite", null, 1, -1, Value.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create annotations
		// http://www.modelexecution.org/trace/XMOF
		createXMOFAnnotations();
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.modelexecution.org/trace/XMOF</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXMOFAnnotations() {
		String source = "http://www.modelexecution.org/trace/XMOF";	
		addAnnotation
		  (objectTemplate_currentObject_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (transformation_inputModelURI_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (transformation_inputModel_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (transformation_outputFilePath_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });	
		addAnnotation
		  (transformation_outputModel_ValueEClass, 
		   source, 
		   new String[] {
			 "executionMetamodelElement", null
		   });
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";	
		addAnnotation
		  (getObjectTemplate_currentObject_Value_CurrentObject(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransformation_inputModelURI_Value_InputModelURI(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransformation_inputModel_Value_InputModel(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransformation_outputFilePath_Value_OutputFilePath(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getTransformation_outputModel_Value_OutputModel(), 
		   source, 
		   new String[] {
		   });
	}

} //StatesPackageImpl
