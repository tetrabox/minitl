/**
 */
package minitlTrace.States;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation input Model URI Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.Transformation_inputModelURI_Value#getInputModelURI <em>Input Model URI</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.StatesPackage#getTransformation_inputModelURI_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transformation_inputModelURI_Value extends SpecificAttributeValue {
	/**
	 * Returns the value of the '<em><b>Input Model URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Model URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Model URI</em>' attribute.
	 * @see #setInputModelURI(String)
	 * @see minitlTrace.States.StatesPackage#getTransformation_inputModelURI_Value_InputModelURI()
	 * @model unique="false"
	 * @generated
	 */
	String getInputModelURI();

	/**
	 * Sets the value of the '{@link minitlTrace.States.Transformation_inputModelURI_Value#getInputModelURI <em>Input Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Model URI</em>' attribute.
	 * @see #getInputModelURI()
	 * @generated
	 */
	void setInputModelURI(String value);

} // Transformation_inputModelURI_Value
