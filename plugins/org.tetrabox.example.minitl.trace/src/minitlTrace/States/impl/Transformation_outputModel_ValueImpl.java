/**
 */
package minitlTrace.States.impl;

import java.util.Collection;

import minitlTrace.States.StatesPackage;
import minitlTrace.States.Transformation_outputModel_Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation output Model Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.impl.Transformation_outputModel_ValueImpl#getOutputModel <em>Output Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transformation_outputModel_ValueImpl extends SpecificValueImpl implements Transformation_outputModel_Value {
	/**
	 * The cached value of the '{@link #getOutputModel() <em>Output Model</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputModel()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> outputModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transformation_outputModel_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TRANSFORMATION_OUTPUT_MODEL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getOutputModel() {
		if (outputModel == null) {
			outputModel = new EDataTypeEList<EObject>(EObject.class, this, StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL);
		}
		return outputModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL:
				return getOutputModel();
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
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL:
				getOutputModel().clear();
				getOutputModel().addAll((Collection<? extends EObject>)newValue);
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
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL:
				getOutputModel().clear();
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
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL:
				return outputModel != null && !outputModel.isEmpty();
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
		result.append(" (outputModel: ");
		result.append(outputModel);
		result.append(')');
		return result.toString();
	}

} //Transformation_outputModel_ValueImpl
