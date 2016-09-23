/**
 */
package minitl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitl.Metamodel#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @see minitl.MinitlPackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' reference list.
	 * @see minitl.MinitlPackage#getMetamodel_Packages()
	 * @model required="true"
	 * @generated
	 */
	EList<EPackage> getPackages();

} // Metamodel
