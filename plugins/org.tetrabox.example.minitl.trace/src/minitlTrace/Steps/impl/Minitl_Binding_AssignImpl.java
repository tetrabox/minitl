/**
 */
package minitlTrace.Steps.impl;

import minitlTrace.Steps.Minitl_Binding_Assign;
import minitlTrace.Steps.StepsPackage;

import org.eclipse.emf.ecore.EClass;

import org.tetrabox.example.minitl.minitl.Binding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Minitl Binding Assign</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Minitl_Binding_AssignImpl extends SpecificStepImpl implements Minitl_Binding_Assign {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Minitl_Binding_AssignImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StepsPackage.Literals.MINITL_BINDING_ASSIGN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binding getCaller() {
		return (org.tetrabox.example.minitl.minitl.Binding) this.getMseoccurrence().getMse().getCaller();
	}

} //Minitl_Binding_AssignImpl
