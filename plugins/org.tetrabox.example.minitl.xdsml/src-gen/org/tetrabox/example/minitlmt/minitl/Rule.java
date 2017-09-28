/**
 */
package org.tetrabox.example.minitlmt.minitl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.Rule#getObjectTemplates <em>Object Templates</em>}</li>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.Rule#getTransformation <em>Transformation</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Object Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.example.minitlmt.minitl.ObjectTemplate}.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.example.minitlmt.minitl.ObjectTemplate#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Templates</em>' containment reference list.
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getRule_ObjectTemplates()
	 * @see org.tetrabox.example.minitlmt.minitl.ObjectTemplate#getRule
	 * @model opposite="rule" containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<ObjectTemplate> getObjectTemplates();

	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.example.minitlmt.minitl.Transformation#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' container reference.
	 * @see #setTransformation(Transformation)
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getRule_Transformation()
	 * @see org.tetrabox.example.minitlmt.minitl.Transformation#getRules
	 * @model opposite="rules" required="true" transient="false"
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitlmt.minitl.Rule#getTransformation <em>Transformation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' container reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void apply();

} // Rule
