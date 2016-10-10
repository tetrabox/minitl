/**
 */
package minitlTrace.States;

import minitlTrace.States.minitl.TracedTransformation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation output File Path Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.Transformation_outputFilePath_Value#getOutputFilePath <em>Output File Path</em>}</li>
 *   <li>{@link minitlTrace.States.Transformation_outputFilePath_Value#getParent <em>Parent</em>}</li>
 *   <li>{@link minitlTrace.States.Transformation_outputFilePath_Value#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.StatesPackage#getTransformation_outputFilePath_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transformation_outputFilePath_Value extends Value {
	/**
	 * Returns the value of the '<em><b>Output File Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File Path</em>' attribute.
	 * @see #setOutputFilePath(String)
	 * @see minitlTrace.States.StatesPackage#getTransformation_outputFilePath_Value_OutputFilePath()
	 * @model unique="false"
	 * @generated
	 */
	String getOutputFilePath();

	/**
	 * Sets the value of the '{@link minitlTrace.States.Transformation_outputFilePath_Value#getOutputFilePath <em>Output File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output File Path</em>' attribute.
	 * @see #getOutputFilePath()
	 * @generated
	 */
	void setOutputFilePath(String value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.minitl.TracedTransformation#getOutputFilePathSequence <em>Output File Path Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TracedTransformation)
	 * @see minitlTrace.States.StatesPackage#getTransformation_outputFilePath_Value_Parent()
	 * @see minitlTrace.States.minitl.TracedTransformation#getOutputFilePathSequence
	 * @model opposite="outputFilePathSequence" required="true" transient="false"
	 * @generated
	 */
	TracedTransformation getParent();

	/**
	 * Sets the value of the '{@link minitlTrace.States.Transformation_outputFilePath_Value#getParent <em>Parent</em>}' container reference.
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
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.State#getTransformation_outputFilePath_Values <em>Transformation output File Path Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getTransformation_outputFilePath_Value_States()
	 * @see minitlTrace.States.State#getTransformation_outputFilePath_Values
	 * @model opposite="transformation_outputFilePath_Values" required="true"
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

} // Transformation_outputFilePath_Value
