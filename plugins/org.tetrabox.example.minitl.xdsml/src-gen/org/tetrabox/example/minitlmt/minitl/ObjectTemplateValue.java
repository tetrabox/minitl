/**
 */
package org.tetrabox.example.minitlmt.minitl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Template Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.ObjectTemplateValue#getObjecttemplate <em>Objecttemplate</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getObjectTemplateValue()
 * @model
 * @generated
 */
public interface ObjectTemplateValue extends Value {
	/**
	 * Returns the value of the '<em><b>Objecttemplate</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objecttemplate</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objecttemplate</em>' reference.
	 * @see #setObjecttemplate(ObjectTemplate)
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getObjectTemplateValue_Objecttemplate()
	 * @model
	 * @generated
	 */
	ObjectTemplate getObjecttemplate();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitlmt.minitl.ObjectTemplateValue#getObjecttemplate <em>Objecttemplate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objecttemplate</em>' reference.
	 * @see #getObjecttemplate()
	 * @generated
	 */
	void setObjecttemplate(ObjectTemplate value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.tetrabox.example.minitlmt.minitl.Object"
	 * @generated
	 */
	Object evaluate();

} // ObjectTemplateValue
