/**
 */
package org.tetrabox.example.minitlmt.minitl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Template Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.ObjectTemplateAspect#getCurrentObject <em>Current Object</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getObjectTemplateAspect()
 * @model
 * @generated
 */
public interface ObjectTemplateAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Current Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Object</em>' attribute.
	 * @see #setCurrentObject(EObject)
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getObjectTemplateAspect_CurrentObject()
	 * @model unique="false" dataType="org.tetrabox.example.minitlmt.minitl.EObject"
	 * @generated
	 */
	EObject getCurrentObject();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitlmt.minitl.ObjectTemplateAspect#getCurrentObject <em>Current Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Object</em>' attribute.
	 * @see #getCurrentObject()
	 * @generated
	 */
	void setCurrentObject(EObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void reset();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void match();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void construct();

} // ObjectTemplateAspect
