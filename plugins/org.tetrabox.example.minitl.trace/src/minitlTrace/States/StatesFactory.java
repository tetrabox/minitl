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
	 * Returns a new object of class '<em>Object Template current Object Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Template current Object Value</em>'.
	 * @generated
	 */
	ObjectTemplate_currentObject_Value createObjectTemplate_currentObject_Value();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transformation input Model URI Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation input Model URI Value</em>'.
	 * @generated
	 */
	Transformation_inputModelURI_Value createTransformation_inputModelURI_Value();

	/**
	 * Returns a new object of class '<em>Transformation input Model Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation input Model Value</em>'.
	 * @generated
	 */
	Transformation_inputModel_Value createTransformation_inputModel_Value();

	/**
	 * Returns a new object of class '<em>Transformation output File Path Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation output File Path Value</em>'.
	 * @generated
	 */
	Transformation_outputFilePath_Value createTransformation_outputFilePath_Value();

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
