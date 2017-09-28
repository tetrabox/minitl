/**
 */
package minitlTrace.States.minitl;

import minitlTrace.States.SpecificDimension;
import minitlTrace.States.Transformation_inputModelURI_Dimension;
import minitlTrace.States.Transformation_inputModel_Dimension;
import minitlTrace.States.Transformation_outputFilePath_Dimension;
import minitlTrace.States.Transformation_outputModel_Dimension;

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
 *   <li>{@link minitlTrace.States.minitl.TracedTransformation#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.TracedTransformation#getTransformation_inputModelURI_Dimension <em>Transformation input Model URI Dimension</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.TracedTransformation#getTransformation_inputModel_Dimension <em>Transformation input Model Dimension</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.TracedTransformation#getTransformation_outputFilePath_Dimension <em>Transformation output File Path Dimension</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.TracedTransformation#getTransformation_outputModel_Dimension <em>Transformation output Model Dimension</em>}</li>
 * </ul>
 *
 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation()
 * @model
 * @generated
 */
public interface TracedTransformation extends TracedNamedElement {
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
	 * Returns the value of the '<em><b>Transformation input Model URI Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation input Model URI Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation input Model URI Dimension</em>' containment reference.
	 * @see #setTransformation_inputModelURI_Dimension(Transformation_inputModelURI_Dimension)
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation_Transformation_inputModelURI_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Transformation_inputModelURI_Dimension getTransformation_inputModelURI_Dimension();

	/**
	 * Sets the value of the '{@link minitlTrace.States.minitl.TracedTransformation#getTransformation_inputModelURI_Dimension <em>Transformation input Model URI Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation input Model URI Dimension</em>' containment reference.
	 * @see #getTransformation_inputModelURI_Dimension()
	 * @generated
	 */
	void setTransformation_inputModelURI_Dimension(Transformation_inputModelURI_Dimension value);

	/**
	 * Returns the value of the '<em><b>Transformation input Model Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation input Model Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation input Model Dimension</em>' containment reference.
	 * @see #setTransformation_inputModel_Dimension(Transformation_inputModel_Dimension)
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation_Transformation_inputModel_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Transformation_inputModel_Dimension getTransformation_inputModel_Dimension();

	/**
	 * Sets the value of the '{@link minitlTrace.States.minitl.TracedTransformation#getTransformation_inputModel_Dimension <em>Transformation input Model Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation input Model Dimension</em>' containment reference.
	 * @see #getTransformation_inputModel_Dimension()
	 * @generated
	 */
	void setTransformation_inputModel_Dimension(Transformation_inputModel_Dimension value);

	/**
	 * Returns the value of the '<em><b>Transformation output File Path Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation output File Path Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation output File Path Dimension</em>' containment reference.
	 * @see #setTransformation_outputFilePath_Dimension(Transformation_outputFilePath_Dimension)
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation_Transformation_outputFilePath_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Transformation_outputFilePath_Dimension getTransformation_outputFilePath_Dimension();

	/**
	 * Sets the value of the '{@link minitlTrace.States.minitl.TracedTransformation#getTransformation_outputFilePath_Dimension <em>Transformation output File Path Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation output File Path Dimension</em>' containment reference.
	 * @see #getTransformation_outputFilePath_Dimension()
	 * @generated
	 */
	void setTransformation_outputFilePath_Dimension(Transformation_outputFilePath_Dimension value);

	/**
	 * Returns the value of the '<em><b>Transformation output Model Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation output Model Dimension</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation output Model Dimension</em>' containment reference.
	 * @see #setTransformation_outputModel_Dimension(Transformation_outputModel_Dimension)
	 * @see minitlTrace.States.minitl.MinitlPackage#getTracedTransformation_Transformation_outputModel_Dimension()
	 * @model containment="true"
	 * @generated
	 */
	Transformation_outputModel_Dimension getTransformation_outputModel_Dimension();

	/**
	 * Sets the value of the '{@link minitlTrace.States.minitl.TracedTransformation#getTransformation_outputModel_Dimension <em>Transformation output Model Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation output Model Dimension</em>' containment reference.
	 * @see #getTransformation_outputModel_Dimension()
	 * @generated
	 */
	void setTransformation_outputModel_Dimension(Transformation_outputModel_Dimension value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);\nresult.addAll(super.getDimensionsInternal());\nresult.add(getTransformation_inputModelURI_Dimension());\nresult.add(getTransformation_outputModel_Dimension());\nresult.add(getTransformation_inputModel_Dimension());\nresult.add(getTransformation_outputFilePath_Dimension());\nreturn result;\n'"
	 * @generated
	 */
	EList<SpecificDimension<?>> getDimensionsInternal();

} // TracedTransformation
