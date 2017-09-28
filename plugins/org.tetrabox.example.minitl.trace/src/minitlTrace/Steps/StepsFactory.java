/**
 */
package minitlTrace.Steps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see minitlTrace.Steps.StepsPackage
 * @generated
 */
public interface StepsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StepsFactory eINSTANCE = minitlTrace.Steps.impl.StepsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Minitl Binding Assign</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Binding Assign</em>'.
	 * @generated
	 */
	Minitl_Binding_Assign createMinitl_Binding_Assign();

	/**
	 * Returns a new object of class '<em>Minitl Binding Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Binding Check</em>'.
	 * @generated
	 */
	Minitl_Binding_Check createMinitl_Binding_Check();

	/**
	 * Returns a new object of class '<em>Minitl Object Template Construct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Object Template Construct</em>'.
	 * @generated
	 */
	Minitl_ObjectTemplate_Construct createMinitl_ObjectTemplate_Construct();

	/**
	 * Returns a new object of class '<em>Minitl Object Template Construct Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Object Template Construct Implicit Step</em>'.
	 * @generated
	 */
	Minitl_ObjectTemplate_Construct_ImplicitStep createMinitl_ObjectTemplate_Construct_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Minitl Object Template Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Object Template Match</em>'.
	 * @generated
	 */
	Minitl_ObjectTemplate_Match createMinitl_ObjectTemplate_Match();

	/**
	 * Returns a new object of class '<em>Minitl Object Template Match Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Object Template Match Implicit Step</em>'.
	 * @generated
	 */
	Minitl_ObjectTemplate_Match_ImplicitStep createMinitl_ObjectTemplate_Match_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Minitl Rule Apply</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Rule Apply</em>'.
	 * @generated
	 */
	Minitl_Rule_Apply createMinitl_Rule_Apply();

	/**
	 * Returns a new object of class '<em>Minitl Rule Apply Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Rule Apply Implicit Step</em>'.
	 * @generated
	 */
	Minitl_Rule_Apply_ImplicitStep createMinitl_Rule_Apply_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Minitl Transformation Execute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Transformation Execute</em>'.
	 * @generated
	 */
	Minitl_Transformation_Execute createMinitl_Transformation_Execute();

	/**
	 * Returns a new object of class '<em>Minitl Transformation Execute Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Transformation Execute Implicit Step</em>'.
	 * @generated
	 */
	Minitl_Transformation_Execute_ImplicitStep createMinitl_Transformation_Execute_ImplicitStep();

	/**
	 * Returns a new object of class '<em>Minitl Transformation Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Minitl Transformation Initialize</em>'.
	 * @generated
	 */
	Minitl_Transformation_Initialize createMinitl_Transformation_Initialize();

	/**
	 * Returns a new object of class '<em>Root Implicit Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Implicit Step</em>'.
	 * @generated
	 */
	RootImplicitStep createRootImplicitStep();

	/**
	 * Returns a new object of class '<em>Specific Root Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specific Root Step</em>'.
	 * @generated
	 */
	SpecificRootStep createSpecificRootStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StepsPackage getStepsPackage();

} //StepsFactory
