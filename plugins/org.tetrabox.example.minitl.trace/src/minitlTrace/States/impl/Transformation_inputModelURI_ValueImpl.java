/**
 */
package minitlTrace.States.impl;

import minitlTrace.States.StatesPackage;
import minitlTrace.States.Transformation_inputModelURI_Value;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation input Model URI Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl#getInputModelURI <em>Input Model URI</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transformation_inputModelURI_ValueImpl extends SpecificValueImpl implements Transformation_inputModelURI_Value {
	/**
	 * The default value of the '{@link #getInputModelURI() <em>Input Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputModelURI()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_MODEL_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputModelURI() <em>Input Model URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputModelURI()
	 * @generated
	 * @ordered
	 */
	protected String inputModelURI = INPUT_MODEL_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transformation_inputModelURI_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TRANSFORMATION_INPUT_MODEL_URI_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputModelURI() {
		return inputModelURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputModelURI(String newInputModelURI) {
		String oldInputModelURI = inputModelURI;
		inputModelURI = newInputModelURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI, oldInputModelURI, inputModelURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI:
				return getInputModelURI();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI:
				setInputModelURI((String)newValue);
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
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI:
				setInputModelURI(INPUT_MODEL_URI_EDEFAULT);
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
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI:
				return INPUT_MODEL_URI_EDEFAULT == null ? inputModelURI != null : !INPUT_MODEL_URI_EDEFAULT.equals(inputModelURI);
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
		result.append(" (inputModelURI: ");
		result.append(inputModelURI);
		result.append(')');
		return result.toString();
	}

} //Transformation_inputModelURI_ValueImpl
