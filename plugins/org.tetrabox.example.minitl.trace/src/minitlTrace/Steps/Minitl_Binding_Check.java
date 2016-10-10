/**
 */
package minitlTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SmallStep;

import org.tetrabox.example.minitl.minitl.Binding;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minitl Binding Check</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see minitlTrace.Steps.StepsPackage#getMinitl_Binding_Check()
 * @model
 * @generated
 */
public interface Minitl_Binding_Check extends SpecificStep, SmallStep, Minitl_ObjectTemplate_Match_AbstractSubStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (org.tetrabox.example.minitl.minitl.Binding) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	Binding getCaller();

} // Minitl_Binding_Check
