/**
 */
package minitlTrace.States;

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
 * </ul>
 *
 * @see minitlTrace.States.StatesPackage#getObjectTemplate_currentObject_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface ObjectTemplate_currentObject_Value extends SpecificAttributeValue {
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

} // ObjectTemplate_currentObject_Value
