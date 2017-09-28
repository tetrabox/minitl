/**
 */
package minitlTrace.Steps;

import minitlTrace.States.SpecificState;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

import org.tetrabox.example.minitl.minitl.Binding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minitl Binding Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see minitlTrace.Steps.StepsPackage#getMinitl_Binding_Assign()
 * @model
 * @generated
 */
public interface Minitl_Binding_Assign extends Minitl_ObjectTemplate_Construct_AbstractSubStep, SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.tetrabox.example.minitl.minitl.Binding) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Binding getCaller();

} // Minitl_Binding_Assign
