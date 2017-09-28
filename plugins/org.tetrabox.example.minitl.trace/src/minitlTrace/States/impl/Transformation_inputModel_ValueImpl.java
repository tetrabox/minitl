/**
 */
package minitlTrace.States.impl;

import java.util.Collection;

import minitlTrace.States.StatesPackage;
import minitlTrace.States.Transformation_inputModel_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation input Model Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.impl.Transformation_inputModel_ValueImpl#getInputModel <em>Input Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transformation_inputModel_ValueImpl extends SpecificValueImpl implements Transformation_inputModel_Value {
	/**
	 * The cached value of the '{@link #getInputModel() <em>Input Model</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputModel()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> inputModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transformation_inputModel_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TRANSFORMATION_INPUT_MODEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInputModel() {
		if (inputModel == null) {
			inputModel = new EDataTypeEList<EObject>(EObject.class, this, StatesPackage.TRANSFORMATION_INPUT_MODEL_VALUE__INPUT_MODEL);
		}
		return inputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_VALUE__INPUT_MODEL:
				return getInputModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_VALUE__INPUT_MODEL:
				getInputModel().clear();
				getInputModel().addAll((Collection<? extends EObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_VALUE__INPUT_MODEL:
				getInputModel().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_VALUE__INPUT_MODEL:
				return inputModel != null && !inputModel.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (inputModel: ");
		result.append(inputModel);
		result.append(')');
		return result.toString();
	}

} //Transformation_inputModel_ValueImpl
