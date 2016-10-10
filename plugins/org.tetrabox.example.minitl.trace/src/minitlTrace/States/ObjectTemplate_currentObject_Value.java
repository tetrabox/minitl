/**
 */
package minitlTrace.States;

import minitlTrace.States.minitl.TracedObjectTemplate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Template current Object Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getCurrentObject <em>Current Object</em>}</li>
 *   <li>{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.StatesPackage#getObjectTemplate_currentObject_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ObjectTemplate_currentObject_Value extends Value {
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
	 * @see minitlTrace.States.StatesPackage#getObjectTemplate_currentObject_Value_CurrentObject()
	 * @model unique="false" dataType="org.tetrabox.example.minitl.minitl.EObject"
	 * @generated
	 */
	EObject getCurrentObject();

	/**
	 * Sets the value of the '{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getCurrentObject <em>Current Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Object</em>' attribute.
	 * @see #getCurrentObject()
	 * @generated
	 */
	void setCurrentObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.minitl.TracedObjectTemplate#getCurrentObjectSequence <em>Current Object Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedObjectTemplate)
	 * @see minitlTrace.States.StatesPackage#getObjectTemplate_currentObject_Value_Parent()
	 * @see minitlTrace.States.minitl.TracedObjectTemplate#getCurrentObjectSequence
	 * @model opposite="currentObjectSequence" required="true" transient="false"
	 * @generated
	 */
	TracedObjectTemplate getParent();

	/**
	 * Sets the value of the '{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedObjectTemplate value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.State#getObjectTemplate_currentObject_Values <em>Object Template current Object Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getObjectTemplate_currentObject_Value_States()
	 * @see minitlTrace.States.State#getObjectTemplate_currentObject_Values
	 * @model opposite="objectTemplate_currentObject_Values" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return this.getStates();'"
	 * @generated
	 */
	EList<State> getStatesNoOpposite();

} // ObjectTemplate_currentObject_Value
