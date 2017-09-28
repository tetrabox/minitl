/**
 */
package minitlTrace.Steps.impl;

import minitlTrace.States.SpecificState;

import minitlTrace.Steps.SpecificRootStep;
import minitlTrace.Steps.SpecificStep;
import minitlTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.gemoc.trace.commons.model.trace.impl.SequentialStepImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Root Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SpecificRootStepImpl extends SequentialStepImpl<SpecificStep, SpecificState> implements SpecificRootStep {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificRootStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.SPECIFIC_ROOT_STEP;
	}

} //SpecificRootStepImpl
