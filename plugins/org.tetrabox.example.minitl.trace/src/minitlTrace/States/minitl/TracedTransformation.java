/**
 */
package minitlTrace.States.minitl;

import minitlTrace.States.Transformation_inputModelURI_Value;
import minitlTrace.States.Transformation_inputModel_Value;
import minitlTrace.States.Transformation_outputFilePath_Value;
import minitlTrace.States.Transformation_outputModel_Value;

import org.eclipse.emf.common.util.EList;

import org.tetrabox.example.minitl.minitl.Transformation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Traced Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.minitl.TracedTransformation#getInputModelSequence <em>Input Model Sequence</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.TracedTransformation#getInputModelURISequence <em>Input Model URI Sequence</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.TracedTransformation#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.TracedTransformation#getOutputFilePathSequence <em>Output File Path Sequence</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.TracedTransformation#getOutputModelSequence <em>Output Model Sequence</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation()
 * @model
 * @generated
 */
public interface TracedTransformation extends TracedNamedElement {
	/**
	 * Returns the value of the '<em><b>Input Model Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link minitlTrace.States.Transformation_inputModel_Value}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.Transformation_inputModel_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Model Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Model Sequence</em>' containment reference list.
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation_InputModelSequence()
	 * @see minitlTrace.States.Transformation_inputModel_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Transformation_inputModel_Value> getInputModelSequence();

	/**
	 * Returns the value of the '<em><b>Input Model URI Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link minitlTrace.States.Transformation_inputModelURI_Value}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.Transformation_inputModelURI_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Model URI Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Model URI Sequence</em>' containment reference list.
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation_InputModelURISequence()
	 * @see minitlTrace.States.Transformation_inputModelURI_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Transformation_inputModelURI_Value> getInputModelURISequence();

	/**
	 * Returns the value of the '<em><b>Original Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Original Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Original Object</em>' reference.
	 * @see #setOriginalObject(Transformation)
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation_OriginalObject()
	 * @model
	 * @generated
	 */
	Transformation getOriginalObject();

	/**
	 * Sets the value of the '{@link minitlTrace.States.minitl.TracedTransformation#getOriginalObject <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Object</em>' reference.
	 * @see #getOriginalObject()
	 * @generated
	 */
	void setOriginalObject(Transformation value);

	/**
	 * Returns the value of the '<em><b>Output File Path Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link minitlTrace.States.Transformation_outputFilePath_Value}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.Transformation_outputFilePath_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output File Path Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output File Path Sequence</em>' containment reference list.
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation_OutputFilePathSequence()
	 * @see minitlTrace.States.Transformation_outputFilePath_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Transformation_outputFilePath_Value> getOutputFilePathSequence();

	/**
	 * Returns the value of the '<em><b>Output Model Sequence</b></em>' containment reference list.
	 * The list contents are of type {@link minitlTrace.States.Transformation_outputModel_Value}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.Transformation_outputModel_Value#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Model Sequence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Model Sequence</em>' containment reference list.
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation_OutputModelSequence()
	 * @see minitlTrace.States.Transformation_outputModel_Value#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Transformation_outputModel_Value> getOutputModelSequence();

} // TracedTransformation
