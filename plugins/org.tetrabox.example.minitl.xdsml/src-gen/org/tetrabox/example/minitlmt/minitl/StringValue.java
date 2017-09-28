/**
 */
package org.tetrabox.example.minitlmt.minitl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.StringValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getStringValue()
 * @model
 * @generated
 */
public interface StringValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getStringValue_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitlmt.minitl.StringValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.tetrabox.example.minitlmt.minitl.Object"
	 * @generated
	 */
	Object evaluate();

} // StringValue
