/**
 */
package minitlTrace.Steps;

import minitlTrace.States.SpecificState;

import minitlTrace.States.minitl.TracedTransformation;

import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Minitl Transformation Initialize</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see minitlTrace.Steps.StepsPackage#getMinitl_Transformation_Initialize()
 * @model
 * @generated
 */
public interface Minitl_Transformation_Initialize extends SpecificStep, SmallStep<SpecificState> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return (minitlTrace.States.minitl.TracedTransformation) this.getMseoccurrence().getMse().getCaller();'"
	 * @generated
	 */
	TracedTransformation getCaller();

} // Minitl_Transformation_Initialize
