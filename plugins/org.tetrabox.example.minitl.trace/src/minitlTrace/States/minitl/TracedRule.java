/**
 */
package minitlTrace.States.minitl;

import minitlTrace.States.SpecificDimension;

import org.eclipse.emf.common.util.EList;

import org.tetrabox.example.minitl.minitl.Rule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.minitl.TracedRule#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.minitl.MinitlPackage#getTracedRule()
 * @model
 * @generated
 */
public interface TracedRule extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Rule)
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedRule_OriginalObject()
	 * @model
	 * @generated
	 */
	Rule getOriginalObject();

	/**
	 * Sets the value of the '{@link minitlTrace.States.minitl.TracedRule#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Rule value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedRule
