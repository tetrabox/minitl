/**
 */
package minitlTrace.States.minitl;

import minitlTrace.States.ObjectTemplate_currentObject_Dimension;
import minitlTrace.States.SpecificDimension;

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
 *   <li>{@link minitlTrace.States.minitl.TracedObjectTemplate#getObjectTemplate_currentObject_Dimension <em>Object Template current Object Dimension</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.TracedObjectTemplate#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.minitl.MinitlPackage#getTracedObjectTemplate()
 * @model
 * @generated
 */
public interface TracedObjectTemplate extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Object Template current Object Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Template current Object Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Template current Object Dimension</em>' containment reference.
	 * @see #setObjectTemplate_currentObject_Dimension(ObjectTemplate_currentObject_Dimension)
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedObjectTemplate_ObjectTemplate_currentObject_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	ObjectTemplate_currentObject_Dimension getObjectTemplate_currentObject_Dimension();

	/**
	 * Sets the value of the '{@link minitlTrace.States.minitl.TracedObjectTemplate#getObjectTemplate_currentObject_Dimension <em>Object Template current Object Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Template current Object Dimension</em>' containment reference.
	 * @see #getObjectTemplate_currentObject_Dimension()
	 * @generated
	 */
	void setObjectTemplate_currentObject_Dimension(ObjectTemplate_currentObject_Dimension value);

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getObjectTemplate_currentObject_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedObjectTemplate
