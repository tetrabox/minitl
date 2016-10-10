/**
 */
package minitlTrace.States;

import minitlTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.State#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link minitlTrace.States.State#getObjectTemplate_currentObject_Values <em>Object Template current Object Values</em>}</li>
 *   <li>{@link minitlTrace.States.State#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link minitlTrace.States.State#getTransformation_inputModelURI_Values <em>Transformation input Model URI Values</em>}</li>
 *   <li>{@link minitlTrace.States.State#getTransformation_inputModel_Values <em>Transformation input Model Values</em>}</li>
 *   <li>{@link minitlTrace.States.State#getTransformation_outputFilePath_Values <em>Transformation output File Path Values</em>}</li>
 *   <li>{@link minitlTrace.States.State#getTransformation_outputModel_Values <em>Transformation output Model Values</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.StatesPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Ended Steps</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.Steps.SpecificStep#getEndingState <em>Ending State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ended Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ended Steps</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getState_EndedSteps()
	 * @see minitlTrace.Steps.SpecificStep#getEndingState
	 * @model opposite="endingState"
	 * @generated
	 */
	EList<SpecificStep> getEndedSteps();

	/**
	 * Returns the value of the '<em><b>Object Template current Object Values</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.States.ObjectTemplate_currentObject_Value}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.ObjectTemplate_currentObject_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Template current Object Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Template current Object Values</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getState_ObjectTemplate_currentObject_Values()
	 * @see minitlTrace.States.ObjectTemplate_currentObject_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<ObjectTemplate_currentObject_Value> getObjectTemplate_currentObject_Values();

	/**
	 * Returns the value of the '<em><b>Started Steps</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.Steps.SpecificStep}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.Steps.SpecificStep#getStartingState <em>Starting State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started Steps</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started Steps</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getState_StartedSteps()
	 * @see minitlTrace.Steps.SpecificStep#getStartingState
	 * @model opposite="startingState"
	 * @generated
	 */
	EList<SpecificStep> getStartedSteps();

	/**
	 * Returns the value of the '<em><b>Transformation input Model URI Values</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.States.Transformation_inputModelURI_Value}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.Transformation_inputModelURI_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation input Model URI Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation input Model URI Values</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getState_Transformation_inputModelURI_Values()
	 * @see minitlTrace.States.Transformation_inputModelURI_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Transformation_inputModelURI_Value> getTransformation_inputModelURI_Values();

	/**
	 * Returns the value of the '<em><b>Transformation input Model Values</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.States.Transformation_inputModel_Value}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.Transformation_inputModel_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation input Model Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation input Model Values</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getState_Transformation_inputModel_Values()
	 * @see minitlTrace.States.Transformation_inputModel_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Transformation_inputModel_Value> getTransformation_inputModel_Values();

	/**
	 * Returns the value of the '<em><b>Transformation output File Path Values</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.States.Transformation_outputFilePath_Value}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.Transformation_outputFilePath_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation output File Path Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation output File Path Values</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getState_Transformation_outputFilePath_Values()
	 * @see minitlTrace.States.Transformation_outputFilePath_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Transformation_outputFilePath_Value> getTransformation_outputFilePath_Values();

	/**
	 * Returns the value of the '<em><b>Transformation output Model Values</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.States.Transformation_outputModel_Value}.
	 * It is bidirectional and its opposite is '{@link minitlTrace.States.Transformation_outputModel_Value#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation output Model Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation output Model Values</em>' reference list.
	 * @see minitlTrace.States.StatesPackage#getState_Transformation_outputModel_Values()
	 * @see minitlTrace.States.Transformation_outputModel_Value#getStates
	 * @model opposite="states" ordered="false"
	 * @generated
	 */
	EList<Transformation_outputModel_Value> getTransformation_outputModel_Values();

} // State
