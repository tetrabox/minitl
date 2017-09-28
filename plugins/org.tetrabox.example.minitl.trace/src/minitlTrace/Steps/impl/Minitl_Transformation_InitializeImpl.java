/**
 */
package minitlTrace.Steps.impl;

import minitlTrace.States.minitl.TracedTransformation;

import minitlTrace.Steps.Minitl_Transformation_Initialize;
import minitlTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minitl Transformation Initialize</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Minitl_Transformation_InitializeImpl extends SpecificStepImpl implements Minitl_Transformation_Initialize {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Minitl_Transformation_InitializeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.MINITL_TRANSFORMATION_INITIALIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTransformation getCaller() {
		return (minitlTrace.States.minitl.TracedTransformation) this.getMseoccurrence().getMse().getCaller();
	}

} //Minitl_Transformation_InitializeImpl
