/**
 */
package minitlTrace.States;


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
 * </ul>
 *
 * @see minitlTrace.States.StatesPackage#getTransformation_outputFilePath_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transformation_outputFilePath_Value extends SpecificAttributeValue {
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

} // Transformation_outputFilePath_Value
