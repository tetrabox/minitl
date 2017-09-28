/**
 */
package minitlTrace.States.impl;

import minitlTrace.States.ObjectTemplate_currentObject_Value;
import minitlTrace.States.StatesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Template current Object Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl#getCurrentObject <em>Current Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTemplate_currentObject_ValueImpl extends SpecificValueImpl implements ObjectTemplate_currentObject_Value {
	/**
	 * The default value of the '{@link #getCurrentObject() <em>Current Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentObject()
	 * @generated
	 * @ordered
	 */
	protected static final EObject CURRENT_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentObject() <em>Current Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentObject()
	 * @generated
	 * @ordered
	 */
	protected EObject currentObject = CURRENT_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectTemplate_currentObject_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getCurrentObject() {
		return currentObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentObject(EObject newCurrentObject) {
		EObject oldCurrentObject = currentObject;
		currentObject = newCurrentObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT, oldCurrentObject, currentObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT:
				return getCurrentObject();
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
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT:
				setCurrentObject((EObject)newValue);
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
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT:
				setCurrentObject(CURRENT_OBJECT_EDEFAULT);
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
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT:
				return CURRENT_OBJECT_EDEFAULT == null ? currentObject != null : !CURRENT_OBJECT_EDEFAULT.equals(currentObject);
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
		result.append(" (currentObject: ");
		result.append(currentObject);
		result.append(')');
		return result.toString();
	}

} //ObjectTemplate_currentObject_ValueImpl
