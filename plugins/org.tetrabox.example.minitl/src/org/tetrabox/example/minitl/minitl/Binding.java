/**
 */
package org.tetrabox.example.minitl.minitl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.minitl.minitl.Binding#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.tetrabox.example.minitl.minitl.Binding#getValue <em>Value</em>}</li>
 *   <li>{@link org.tetrabox.example.minitl.minitl.Binding#getObjectTemplate <em>Object Template</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.minitl.minitl.MinitlPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see org.tetrabox.example.minitl.minitl.MinitlPackage#getBinding_Feature()
	 * @model required="true"
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitl.minitl.Binding#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(Value)
	 * @see org.tetrabox.example.minitl.minitl.MinitlPackage#getBinding_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getValue();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitl.minitl.Binding#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Value value);

	/**
	 * Returns the value of the '<em><b>Object Template</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.example.minitl.minitl.ObjectTemplate#getBindings <em>Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Template</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Template</em>' container reference.
	 * @see #setObjectTemplate(ObjectTemplate)
	 * @see org.tetrabox.example.minitl.minitl.MinitlPackage#getBinding_ObjectTemplate()
	 * @see org.tetrabox.example.minitl.minitl.ObjectTemplate#getBindings
	 * @model opposite="bindings" required="true" transient="false"
	 * @generated
	 */
	ObjectTemplate getObjectTemplate();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitl.minitl.Binding#getObjectTemplate <em>Object Template</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Template</em>' container reference.
	 * @see #getObjectTemplate()
	 * @generated
	 */
	void setObjectTemplate(ObjectTemplate value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oDataType="org.tetrabox.example.minitl.minitl.EObject"
	 * @generated
	 */
	boolean check(EObject o);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void assign();

} // Binding
