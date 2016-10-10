/**
 */
package minitlTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import minitlTrace.States.minitl.TracedRule;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minitl Rule Apply</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see minitlTrace.Steps.StepsPackage#getMinitl_Rule_Apply()
 * @model
 * @generated
 */
public interface Minitl_Rule_Apply extends Minitl_Transformation_Execute_AbstractSubStep, SpecificStep, SequentialStep<Minitl_Rule_Apply_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (minitlTrace.States.minitl.TracedRule) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedRule getCaller();

} // Minitl_Rule_Apply
