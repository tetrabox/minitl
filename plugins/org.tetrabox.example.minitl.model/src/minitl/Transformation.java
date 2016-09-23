/**
 */
package minitl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitl.Transformation#getInputMetamodel <em>Input Metamodel</em>}</li>
 *   <li>{@link minitl.Transformation#getRules <em>Rules</em>}</li>
 *   <li>{@link minitl.Transformation#getOutputMetamodel <em>Output Metamodel</em>}</li>
 * </ul>
 *
 * @see minitl.MinitlPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Input Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Metamodel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Metamodel</em>' containment reference.
	 * @see #setInputMetamodel(Metamodel)
	 * @see minitl.MinitlPackage#getTransformation_InputMetamodel()
	 * @model containment="true"
	 * @generated
	 */
	Metamodel getInputMetamodel();

	/**
	 * Sets the value of the '{@link minitl.Transformation#getInputMetamodel <em>Input Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Metamodel</em>' containment reference.
	 * @see #getInputMetamodel()
	 * @generated
	 */
	void setInputMetamodel(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Output Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Metamodel</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Metamodel</em>' containment reference.
	 * @see #setOutputMetamodel(Metamodel)
	 * @see minitl.MinitlPackage#getTransformation_OutputMetamodel()
	 * @model containment="true"
	 * @generated
	 */
	Metamodel getOutputMetamodel();

	/**
	 * Sets the value of the '{@link minitl.Transformation#getOutputMetamodel <em>Output Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Metamodel</em>' containment reference.
	 * @see #getOutputMetamodel()
	 * @generated
	 */
	void setOutputMetamodel(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link minitl.Rule}.
	 * It is bidirectional and its opposite is '{@link minitl.Rule#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see minitl.MinitlPackage#getTransformation_Rules()
	 * @see minitl.Rule#getTransformation
	 * @model opposite="transformation" containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Transformation
