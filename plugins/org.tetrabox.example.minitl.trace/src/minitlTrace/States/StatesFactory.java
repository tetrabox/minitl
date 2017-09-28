/**
 */
package minitlTrace.States;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see minitlTrace.States.StatesPackage
 * @generated
 */
public interface StatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatesFactory eINSTANCE = minitlTrace.States.impl.StatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Object Template current Object Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Template current Object Dimension</em>'.
	 * @generated
	 */
	ObjectTemplate_currentObject_Dimension createObjectTemplate_currentObject_Dimension();

	/**
	 * Returns a new object of class '<em>Object Template current Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Template current Object Value</em>'.
	 * @generated
	 */
	ObjectTemplate_currentObject_Value createObjectTemplate_currentObject_Value();

	/**
	 * Returns a new object of class '<em>Specific State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific State</em>'.
	 * @generated
	 */
	SpecificState createSpecificState();

	/**
	 * Returns a new object of class '<em>Transformation input Model URI Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation input Model URI Dimension</em>'.
	 * @generated
	 */
	Transformation_inputModelURI_Dimension createTransformation_inputModelURI_Dimension();

	/**
	 * Returns a new object of class '<em>Transformation input Model URI Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation input Model URI Value</em>'.
	 * @generated
	 */
	Transformation_inputModelURI_Value createTransformation_inputModelURI_Value();

	/**
	 * Returns a new object of class '<em>Transformation input Model Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation input Model Dimension</em>'.
	 * @generated
	 */
	Transformation_inputModel_Dimension createTransformation_inputModel_Dimension();

	/**
	 * Returns a new object of class '<em>Transformation input Model Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation input Model Value</em>'.
	 * @generated
	 */
	Transformation_inputModel_Value createTransformation_inputModel_Value();

	/**
	 * Returns a new object of class '<em>Transformation output File Path Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation output File Path Dimension</em>'.
	 * @generated
	 */
	Transformation_outputFilePath_Dimension createTransformation_outputFilePath_Dimension();

	/**
	 * Returns a new object of class '<em>Transformation output File Path Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation output File Path Value</em>'.
	 * @generated
	 */
	Transformation_outputFilePath_Value createTransformation_outputFilePath_Value();

	/**
	 * Returns a new object of class '<em>Transformation output Model Dimension</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation output Model Dimension</em>'.
	 * @generated
	 */
	Transformation_outputModel_Dimension createTransformation_outputModel_Dimension();

	/**
	 * Returns a new object of class '<em>Transformation output Model Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation output Model Value</em>'.
	 * @generated
	 */
	Transformation_outputModel_Value createTransformation_outputModel_Value();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StatesPackage getStatesPackage();

} //StatesFactory
