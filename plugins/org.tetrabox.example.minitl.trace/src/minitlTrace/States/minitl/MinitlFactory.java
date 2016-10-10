/**
 */
package minitlTrace.States.minitl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see minitlTrace.States.minitl.MinitlPackage
 * @generated
 */
public interface MinitlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MinitlFactory eINSTANCE = minitlTrace.States.minitl.impl.MinitlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Traced Object Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Object Template</em>'.
	 * @generated
	 */
	TracedObjectTemplate createTracedObjectTemplate();

	/**
	 * Returns a new object of class '<em>Traced Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Rule</em>'.
	 * @generated
	 */
	TracedRule createTracedRule();

	/**
	 * Returns a new object of class '<em>Traced Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Traced Transformation</em>'.
	 * @generated
	 */
	TracedTransformation createTracedTransformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MinitlPackage getMinitlPackage();

} //MinitlFactory
