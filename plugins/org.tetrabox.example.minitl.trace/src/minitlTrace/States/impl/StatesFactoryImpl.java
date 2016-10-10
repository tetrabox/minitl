/**
 */
package minitlTrace.States.impl;

import minitlTrace.States.*;

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
public class StatesFactoryImpl extends EFactoryImpl implements StatesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatesFactory init() {
		try {
			StatesFactory theStatesFactory = (StatesFactory)EPackage.Registry.INSTANCE.getEFactory(StatesPackage.eNS_URI);
			if (theStatesFactory != null) {
				return theStatesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesFactoryImpl() {
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
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE: return createObjectTemplate_currentObject_Value();
			case StatesPackage.STATE: return createState();
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE: return createTransformation_inputModelURI_Value();
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_VALUE: return createTransformation_inputModel_Value();
			case StatesPackage.TRANSFORMATION_OUTPUT_FILE_PATH_VALUE: return createTransformation_outputFilePath_Value();
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE: return createTransformation_outputModel_Value();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTemplate_currentObject_Value createObjectTemplate_currentObject_Value() {
		ObjectTemplate_currentObject_ValueImpl objectTemplate_currentObject_Value = new ObjectTemplate_currentObject_ValueImpl();
		return objectTemplate_currentObject_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation_inputModelURI_Value createTransformation_inputModelURI_Value() {
		Transformation_inputModelURI_ValueImpl transformation_inputModelURI_Value = new Transformation_inputModelURI_ValueImpl();
		return transformation_inputModelURI_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation_inputModel_Value createTransformation_inputModel_Value() {
		Transformation_inputModel_ValueImpl transformation_inputModel_Value = new Transformation_inputModel_ValueImpl();
		return transformation_inputModel_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation_outputFilePath_Value createTransformation_outputFilePath_Value() {
		Transformation_outputFilePath_ValueImpl transformation_outputFilePath_Value = new Transformation_outputFilePath_ValueImpl();
		return transformation_outputFilePath_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation_outputModel_Value createTransformation_outputModel_Value() {
		Transformation_outputModel_ValueImpl transformation_outputModel_Value = new Transformation_outputModel_ValueImpl();
		return transformation_outputModel_Value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesPackage getStatesPackage() {
		return (StatesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatesPackage getPackage() {
		return StatesPackage.eINSTANCE;
	}

} //StatesFactoryImpl
