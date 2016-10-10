/**
 */
package minitlTrace.States;

import minitlTrace.States.minitl.TracedTransformation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation input Model Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.Transformation_inputModel_Value#getInputModel <em>Input Model</em>}</li>
 *   <li>{@link minitlTrace.States.Transformation_inputModel_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link minitlTrace.States.Transformation_inputModel_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.StatesPackage#getTransformation_inputModel_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transformation_inputModel_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Input Model</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Model</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Model</em>' attribute list.
	 * @see minitlTrace.States.StatesPackage#getTransformation_inputModel_Value_InputModel()
	 * @model unique="false" dataType="org.tetrabox.example.minitl.minitl.EObject"
	 * @generated
	 */
	EList<EObject> getInputModel();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.minitl.TracedTransformation#getInputModelSequence <em>Input Model Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedTransformation)
	 * @see minitlTrace.States.StatesPackage#getTransformation_inputModel_Value_Parent()
	 * @see minitlTrace.States.minitl.TracedTransformation#getInputModelSequence
	 * @model opposite="inputModelSequence" required="true" transient="false"
	 * @generated
	 */
	TracedTransformation getParent();

	/**
	 * Sets the value of the '{@link minitlTrace.States.Transformation_inputModel_Value#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(TracedTransformation value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.States.State}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.State#getTransformation_inputModel_Values <em>Transformation input Model Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getTransformation_inputModel_Value_States()
	 * @see minitlTrace.States.State#getTransformation_inputModel_Values
	 * @model opposite="transformation_inputModel_Values" required="true"
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

} // Transformation_inputModel_Value
