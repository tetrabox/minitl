/**
 */
package minitlTrace.States.impl;

import minitlTrace.MinitlTracePackage;

import minitlTrace.States.ObjectTemplate_currentObject_Dimension;
import minitlTrace.States.ObjectTemplate_currentObject_Value;
import minitlTrace.States.SpecificAttributeValue;
import minitlTrace.States.SpecificDimension;
import minitlTrace.States.SpecificReferenceValue;
import minitlTrace.States.SpecificState;
import minitlTrace.States.SpecificTracedObject;
import minitlTrace.States.SpecificValue;
import minitlTrace.States.StatesFactory;
import minitlTrace.States.StatesPackage;
import minitlTrace.States.Transformation_inputModelURI_Dimension;
import minitlTrace.States.Transformation_inputModelURI_Value;
import minitlTrace.States.Transformation_inputModel_Dimension;
import minitlTrace.States.Transformation_inputModel_Value;
import minitlTrace.States.Transformation_outputFilePath_Dimension;
import minitlTrace.States.Transformation_outputFilePath_Value;
import minitlTrace.States.Transformation_outputModel_Dimension;
import minitlTrace.States.Transformation_outputModel_Value;

import minitlTrace.States.minitl.impl.MinitlPackageImpl;

import minitlTrace.Steps.StepsPackage;

import minitlTrace.Steps.impl.StepsPackageImpl;

import minitlTrace.impl.MinitlTracePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gemoc.trace.commons.model.trace.TracePackage;

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
	private EClass objectTemplate_currentObject_DimensionEClass = null;

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
	private EClass specificAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificDimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificReferenceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificTracedObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformation_inputModelURI_DimensionEClass = null;

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
	private EClass transformation_inputModel_DimensionEClass = null;

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
	private EClass transformation_outputFilePath_DimensionEClass = null;

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
	private EClass transformation_outputModel_DimensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformation_outputModel_ValueEClass = null;

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
	public EClass getObjectTemplate_currentObject_Dimension() {
		return objectTemplate_currentObject_DimensionEClass;
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
	public EClass getSpecificAttributeValue() {
		return specificAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificDimension() {
		return specificDimensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificReferenceValue() {
		return specificReferenceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificState() {
		return specificStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificTracedObject() {
		return specificTracedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificValue() {
		return specificValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformation_inputModelURI_Dimension() {
		return transformation_inputModelURI_DimensionEClass;
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
	public EClass getTransformation_inputModel_Dimension() {
		return transformation_inputModel_DimensionEClass;
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
	public EClass getTransformation_outputFilePath_Dimension() {
		return transformation_outputFilePath_DimensionEClass;
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
	public EClass getTransformation_outputModel_Dimension() {
		return transformation_outputModel_DimensionEClass;
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
		objectTemplate_currentObject_DimensionEClass = createEClass(OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION);

		objectTemplate_currentObject_ValueEClass = createEClass(OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE);
		createEAttribute(objectTemplate_currentObject_ValueEClass, OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT);

		specificAttributeValueEClass = createEClass(SPECIFIC_ATTRIBUTE_VALUE);

		specificDimensionEClass = createEClass(SPECIFIC_DIMENSION);

		specificReferenceValueEClass = createEClass(SPECIFIC_REFERENCE_VALUE);

		specificStateEClass = createEClass(SPECIFIC_STATE);

		specificTracedObjectEClass = createEClass(SPECIFIC_TRACED_OBJECT);

		specificValueEClass = createEClass(SPECIFIC_VALUE);

		transformation_inputModelURI_DimensionEClass = createEClass(TRANSFORMATION_INPUT_MODEL_URI_DIMENSION);

		transformation_inputModelURI_ValueEClass = createEClass(TRANSFORMATION_INPUT_MODEL_URI_VALUE);
		createEAttribute(transformation_inputModelURI_ValueEClass, TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI);

		transformation_inputModel_DimensionEClass = createEClass(TRANSFORMATION_INPUT_MODEL_DIMENSION);

		transformation_inputModel_ValueEClass = createEClass(TRANSFORMATION_INPUT_MODEL_VALUE);
		createEAttribute(transformation_inputModel_ValueEClass, TRANSFORMATION_INPUT_MODEL_VALUE__INPUT_MODEL);

		transformation_outputFilePath_DimensionEClass = createEClass(TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION);

		transformation_outputFilePath_ValueEClass = createEClass(TRANSFORMATION_OUTPUT_FILE_PATH_VALUE);
		createEAttribute(transformation_outputFilePath_ValueEClass, TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__OUTPUT_FILE_PATH);

		transformation_outputModel_DimensionEClass = createEClass(TRANSFORMATION_OUTPUT_MODEL_DIMENSION);

		transformation_outputModel_ValueEClass = createEClass(TRANSFORMATION_OUTPUT_MODEL_VALUE);
		createEAttribute(transformation_outputModel_ValueEClass, TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL);
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
		TracePackage theTracePackage = (TracePackage)EPackage.Registry.INSTANCE.getEPackage(TracePackage.eNS_URI);
		StepsPackage theStepsPackage = (StepsPackage)EPackage.Registry.INSTANCE.getEPackage(StepsPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theMinitlPackage_1);

		// Create type parameters
		ETypeParameter specificDimensionEClass_ValueSubType = addETypeParameter(specificDimensionEClass, "ValueSubType");
		addETypeParameter(specificReferenceValueEClass, "T");
		ETypeParameter specificTracedObjectEClass_DimensionSubType = addETypeParameter(specificTracedObjectEClass, "DimensionSubType");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSpecificValue());
		specificDimensionEClass_ValueSubType.getEBounds().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType(this.getSpecificValue());
		g2.setEUpperBound(g3);
		specificTracedObjectEClass_DimensionSubType.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getObjectTemplate_currentObject_Value());
		g1.getETypeArguments().add(g2);
		objectTemplate_currentObject_DimensionEClass.getEGenericSuperTypes().add(g1);
		objectTemplate_currentObject_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		specificAttributeValueEClass.getESuperTypes().add(this.getSpecificValue());
		g1 = createEGenericType(theTracePackage.getDimension());
		g2 = createEGenericType(specificDimensionEClass_ValueSubType);
		g1.getETypeArguments().add(g2);
		specificDimensionEClass.getEGenericSuperTypes().add(g1);
		specificReferenceValueEClass.getESuperTypes().add(this.getSpecificValue());
		g1 = createEGenericType(theTracePackage.getState());
		g2 = createEGenericType(theStepsPackage.getSpecificStep());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(this.getSpecificValue());
		g1.getETypeArguments().add(g2);
		specificStateEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getTracedObject());
		g2 = createEGenericType(specificTracedObjectEClass_DimensionSubType);
		g1.getETypeArguments().add(g2);
		specificTracedObjectEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(theTracePackage.getValue());
		g2 = createEGenericType(this.getSpecificState());
		g1.getETypeArguments().add(g2);
		specificValueEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getTransformation_inputModelURI_Value());
		g1.getETypeArguments().add(g2);
		transformation_inputModelURI_DimensionEClass.getEGenericSuperTypes().add(g1);
		transformation_inputModelURI_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getTransformation_inputModel_Value());
		g1.getETypeArguments().add(g2);
		transformation_inputModel_DimensionEClass.getEGenericSuperTypes().add(g1);
		transformation_inputModel_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getTransformation_outputFilePath_Value());
		g1.getETypeArguments().add(g2);
		transformation_outputFilePath_DimensionEClass.getEGenericSuperTypes().add(g1);
		transformation_outputFilePath_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());
		g1 = createEGenericType(this.getSpecificDimension());
		g2 = createEGenericType(this.getTransformation_outputModel_Value());
		g1.getETypeArguments().add(g2);
		transformation_outputModel_DimensionEClass.getEGenericSuperTypes().add(g1);
		transformation_outputModel_ValueEClass.getESuperTypes().add(this.getSpecificAttributeValue());

		// Initialize classes and features; add operations and parameters
		initEClass(objectTemplate_currentObject_DimensionEClass, ObjectTemplate_currentObject_Dimension.class, "ObjectTemplate_currentObject_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectTemplate_currentObject_ValueEClass, ObjectTemplate_currentObject_Value.class, "ObjectTemplate_currentObject_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectTemplate_currentObject_Value_CurrentObject(), theMinitlPackage.getEObject(), "currentObject", null, 0, 1, ObjectTemplate_currentObject_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificAttributeValueEClass, SpecificAttributeValue.class, "SpecificAttributeValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificDimensionEClass, SpecificDimension.class, "SpecificDimension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificReferenceValueEClass, SpecificReferenceValue.class, "SpecificReferenceValue", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificStateEClass, SpecificState.class, "SpecificState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificTracedObjectEClass, SpecificTracedObject.class, "SpecificTracedObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(specificValueEClass, SpecificValue.class, "SpecificValue", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformation_inputModelURI_DimensionEClass, Transformation_inputModelURI_Dimension.class, "Transformation_inputModelURI_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformation_inputModelURI_ValueEClass, Transformation_inputModelURI_Value.class, "Transformation_inputModelURI_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_inputModelURI_Value_InputModelURI(), ecorePackage.getEString(), "inputModelURI", null, 0, 1, Transformation_inputModelURI_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformation_inputModel_DimensionEClass, Transformation_inputModel_Dimension.class, "Transformation_inputModel_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformation_inputModel_ValueEClass, Transformation_inputModel_Value.class, "Transformation_inputModel_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_inputModel_Value_InputModel(), theMinitlPackage.getEObject(), "inputModel", null, 0, -1, Transformation_inputModel_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformation_outputFilePath_DimensionEClass, Transformation_outputFilePath_Dimension.class, "Transformation_outputFilePath_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformation_outputFilePath_ValueEClass, Transformation_outputFilePath_Value.class, "Transformation_outputFilePath_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_outputFilePath_Value_OutputFilePath(), ecorePackage.getEString(), "outputFilePath", null, 0, 1, Transformation_outputFilePath_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformation_outputModel_DimensionEClass, Transformation_outputModel_Dimension.class, "Transformation_outputModel_Dimension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transformation_outputModel_ValueEClass, Transformation_outputModel_Value.class, "Transformation_outputModel_Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_outputModel_Value_OutputModel(), theMinitlPackage.getEObject(), "outputModel", null, 0, -1, Transformation_outputModel_Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
