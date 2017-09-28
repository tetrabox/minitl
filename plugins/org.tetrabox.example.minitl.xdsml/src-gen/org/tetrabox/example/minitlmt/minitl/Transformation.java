/**
 */
package org.tetrabox.example.minitlmt.minitl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.Transformation#getInputMetamodel <em>Input Metamodel</em>}</li>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.Transformation#getRules <em>Rules</em>}</li>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.Transformation#getOutputMetamodel <em>Output Metamodel</em>}</li>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.Transformation#getInputModel <em>Input Model</em>}</li>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.Transformation#getOutputModel <em>Output Model</em>}</li>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.Transformation#getInputModelURI <em>Input Model URI</em>}</li>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.Transformation#getOutputFilePath <em>Output File Path</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Input Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Metamodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Metamodel</em>' containment reference.
	 * @see #setInputMetamodel(Metamodel)
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformation_InputMetamodel()
	 * @model containment="true"
	 * @generated
	 */
	Metamodel getInputMetamodel();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitlmt.minitl.Transformation#getInputMetamodel <em>Input Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Metamodel</em>' containment reference.
	 * @see #getInputMetamodel()
	 * @generated
	 */
	void setInputMetamodel(Metamodel value);

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.tetrabox.example.minitlmt.minitl.Rule}.
	 * It is bidirectional and its opposite is '{@link org.tetrabox.example.minitlmt.minitl.Rule#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformation_Rules()
	 * @see org.tetrabox.example.minitlmt.minitl.Rule#getTransformation
	 * @model opposite="transformation" containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

	/**
	 * Returns the value of the '<em><b>Output Metamodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Metamodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Metamodel</em>' containment reference.
	 * @see #setOutputMetamodel(Metamodel)
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformation_OutputMetamodel()
	 * @model containment="true"
	 * @generated
	 */
	Metamodel getOutputMetamodel();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitlmt.minitl.Transformation#getOutputMetamodel <em>Output Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Metamodel</em>' containment reference.
	 * @see #getOutputMetamodel()
	 * @generated
	 */
	void setOutputMetamodel(Metamodel value);

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
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformation_InputModel()
	 * @model unique="false" dataType="org.tetrabox.example.minitlmt.minitl.EObject"
	 * @generated
	 */
	EList<EObject> getInputModel();

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
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformation_OutputModel()
	 * @model unique="false" dataType="org.tetrabox.example.minitlmt.minitl.EObject"
	 * @generated
	 */
	EList<EObject> getOutputModel();

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
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformation_InputModelURI()
	 * @model unique="false"
	 * @generated
	 */
	String getInputModelURI();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitlmt.minitl.Transformation#getInputModelURI <em>Input Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Model URI</em>' attribute.
	 * @see #getInputModelURI()
	 * @generated
	 */
	void setInputModelURI(String value);

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
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformation_OutputFilePath()
	 * @model unique="false"
	 * @generated
	 */
	String getOutputFilePath();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitlmt.minitl.Transformation#getOutputFilePath <em>Output File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output File Path</em>' attribute.
	 * @see #getOutputFilePath()
	 * @generated
	 */
	void setOutputFilePath(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model argsMany="true"
	 * @generated
	 */
	void initialize(EList<String> args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // Transformation
