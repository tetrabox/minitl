/**
 */
package org.tetrabox.example.minitlmt.minitl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.TransformationAspect#getInputModel <em>Input Model</em>}</li>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.TransformationAspect#getOutputModel <em>Output Model</em>}</li>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.TransformationAspect#getInputModelURI <em>Input Model URI</em>}</li>
 *   <li>{@link org.tetrabox.example.minitlmt.minitl.TransformationAspect#getOutputFilePath <em>Output File Path</em>}</li>
 * </ul>
 *
 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformationAspect()
 * @model
 * @generated
 */
public interface TransformationAspect extends EObject {
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
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformationAspect_InputModel()
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
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformationAspect_OutputModel()
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
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformationAspect_InputModelURI()
	 * @model unique="false"
	 * @generated
	 */
	String getInputModelURI();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitlmt.minitl.TransformationAspect#getInputModelURI <em>Input Model URI</em>}' attribute.
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
	 * @see org.tetrabox.example.minitlmt.minitl.MinitlPackage#getTransformationAspect_OutputFilePath()
	 * @model unique="false"
	 * @generated
	 */
	String getOutputFilePath();

	/**
	 * Sets the value of the '{@link org.tetrabox.example.minitlmt.minitl.TransformationAspect#getOutputFilePath <em>Output File Path</em>}' attribute.
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
	 * @model
	 * @generated
	 */
	void initialize();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // TransformationAspect
