/**
 */
package minitlTrace.States.minitl;

import minitlTrace.States.ObjectTemplate_currentObject_Value;

import org.eclipse.emf.common.util.EList;

import org.tetrabox.example.minitl.minitl.ObjectTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Object Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.minitl.TracedObjectTemplate#getCurrentObjectSequence <em>Current Object Sequence</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.TracedObjectTemplate#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.minitl.MinitlPackage#getTracedObjectTemplate()
 * @model
 * @generated
 */
public interface TracedObjectTemplate extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Current Object Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link minitlTrace.States.ObjectTemplate_currentObject_Value}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Object Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Object Sequence</em>' containment reference list.
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedObjectTemplate_CurrentObjectSequence()
	 * @see minitlTrace.States.ObjectTemplate_currentObject_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ObjectTemplate_currentObject_Value> getCurrentObjectSequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(ObjectTemplate)
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedObjectTemplate_OriginalObject()
	 * @model
	 * @generated
	 */
	ObjectTemplate getOriginalObject();

	/**
	 * Sets the value of the '{@link minitlTrace.States.minitl.TracedObjectTemplate#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(ObjectTemplate value);

} // TracedObjectTemplate
