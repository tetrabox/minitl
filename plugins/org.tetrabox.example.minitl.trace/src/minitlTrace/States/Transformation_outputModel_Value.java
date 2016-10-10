/**
 */
package minitlTrace.States;

import minitlTrace.States.minitl.TracedTransformation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation output Model Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.Transformation_outputModel_Value#getOutputModel <em>Output Model</em>}</li>
 *   <li>{@link minitlTrace.States.Transformation_outputModel_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link minitlTrace.States.Transformation_outputModel_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.StatesPackage#getTransformation_outputModel_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transformation_outputModel_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Output Model</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Model</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Model</em>' attribute list.
	 * @see minitlTrace.States.StatesPackage#getTransformation_outputModel_Value_OutputModel()
	 * @model unique="false" dataType="org.tetrabox.example.minitl.minitl.EObject"
	 * @generated
	 */
	EList<EObject> getOutputModel();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.minitl.TracedTransformation#getOutputModelSequence <em>Output Model Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedTransformation)
	 * @see minitlTrace.States.StatesPackage#getTransformation_outputModel_Value_Parent()
	 * @see minitlTrace.States.minitl.TracedTransformation#getOutputModelSequence
	 * @model opposite="outputModelSequence" required="true" transient="false"
	 * @generated
	 */
	TracedTransformation getParent();

	/**
	 * Sets the value of the '{@link minitlTrace.States.Transformation_outputModel_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.State#getTransformation_outputModel_Values <em>Transformation output Model Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getTransformation_outputModel_Value_States()
	 * @see minitlTrace.States.State#getTransformation_outputModel_Values
	 * @model opposite="transformation_outputModel_Values" required="true"
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

} // Transformation_outputModel_Value
