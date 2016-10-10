/**
 */
package minitlTrace.States.impl;

import java.util.Collection;

import minitlTrace.States.ObjectTemplate_currentObject_Value;
import minitlTrace.States.State;
import minitlTrace.States.StatesPackage;

import minitlTrace.States.minitl.MinitlPackage;
import minitlTrace.States.minitl.TracedObjectTemplate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Template current Object Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl#getCurrentObject <em>Current Object</em>}</li>
 *   <li>{@link minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link minitlTrace.States.impl.ObjectTemplate_currentObject_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectTemplate_currentObject_ValueImpl extends MinimalEObjectImpl.Container implements ObjectTemplate_currentObject_Value {
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
	 * The cached value of the '{@link #getStates() <em>States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

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
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
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
	public TracedObjectTemplate getParent() {
		if (eContainerFeatureID() != StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT) return null;
		return (TracedObjectTemplate)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedObjectTemplate newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedObjectTemplate newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MinitlPackage.TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE, TracedObjectTemplate.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES, StatesPackage.STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedObjectTemplate)otherEnd, msgs);
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, MinitlPackage.TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE, TracedObjectTemplate.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT:
				return getCurrentObject();
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT:
				return getParent();
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES:
				return getStates();
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
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT:
				setCurrentObject((EObject)newValue);
				return;
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT:
				setParent((TracedObjectTemplate)newValue);
				return;
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
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
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT:
				setParent((TracedObjectTemplate)null);
				return;
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES:
				getStates().clear();
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
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__CURRENT_OBJECT:
				return CURRENT_OBJECT_EDEFAULT == null ? currentObject != null : !CURRENT_OBJECT_EDEFAULT.equals(currentObject);
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES:
				return states != null && !states.isEmpty();
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
