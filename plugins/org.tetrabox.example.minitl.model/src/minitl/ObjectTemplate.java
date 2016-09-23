/**
 */
package minitl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitl.ObjectTemplate#getBindings <em>Bindings</em>}</li>
 *   <li>{@link minitl.ObjectTemplate#getType <em>Type</em>}</li>
 *   <li>{@link minitl.ObjectTemplate#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see minitl.MinitlPackage#getObjectTemplate()
 * @model
 * @generated
 */
public interface ObjectTemplate extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Bindings</b></em>' containment reference list.
	 * The list contents are of type {@link minitl.Binding}.
	 * It is bidirectional and its opposite is '{@link minitl.Binding#getObjectTemplate <em>Object Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bindings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bindings</em>' containment reference list.
	 * @see minitl.MinitlPackage#getObjectTemplate_Bindings()
	 * @see minitl.Binding#getObjectTemplate
	 * @model opposite="objectTemplate" containment="true"
	 * @generated
	 */
	EList<Binding> getBindings();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(EClass)
	 * @see minitl.MinitlPackage#getObjectTemplate_Type()
	 * @model required="true"
	 * @generated
	 */
	EClass getType();

	/**
	 * Sets the value of the '{@link minitl.ObjectTemplate#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(EClass value);

	/**
	 * Returns the value of the '<em><b>Rule</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link minitl.Rule#getObjectTemplates <em>Object Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rule</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rule</em>' container reference.
	 * @see #setRule(Rule)
	 * @see minitl.MinitlPackage#getObjectTemplate_Rule()
	 * @see minitl.Rule#getObjectTemplates
	 * @model opposite="objectTemplates" required="true" transient="false"
	 * @generated
	 */
	Rule getRule();

	/**
	 * Sets the value of the '{@link minitl.ObjectTemplate#getRule <em>Rule</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rule</em>' container reference.
	 * @see #getRule()
	 * @generated
	 */
	void setRule(Rule value);

} // ObjectTemplate
