/**
 */
package minitlTrace.States;

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
 * </ul>
 *
 * @see minitlTrace.States.StatesPackage#getTransformation_outputModel_Value()
 * @model annotation="http://www.modelexecution.org/trace/XMOF executionMetamodelElement='null'"
 * @generated
 */
public interface Transformation_outputModel_Value extends SpecificAttributeValue {
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

} // Transformation_outputModel_Value
