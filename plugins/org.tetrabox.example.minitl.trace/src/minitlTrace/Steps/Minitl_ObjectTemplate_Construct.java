/**
 */
package minitlTrace.Steps;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import minitlTrace.States.minitl.TracedObjectTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minitl Object Template Construct</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see minitlTrace.Steps.StepsPackage#getMinitl_ObjectTemplate_Construct()
 * @model
 * @generated
 */
public interface Minitl_ObjectTemplate_Construct extends Minitl_Rule_Apply_AbstractSubStep, SpecificStep, SequentialStep<Minitl_ObjectTemplate_Construct_AbstractSubStep> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (minitlTrace.States.minitl.TracedObjectTemplate) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedObjectTemplate getCaller();

} // Minitl_ObjectTemplate_Construct