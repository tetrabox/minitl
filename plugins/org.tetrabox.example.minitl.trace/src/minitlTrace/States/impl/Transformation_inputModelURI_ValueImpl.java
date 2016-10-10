/**
 */
package minitlTrace.States.impl;

import java.util.Collection;

import minitlTrace.States.State;
import minitlTrace.States.StatesPackage;
import minitlTrace.States.Transformation_inputModelURI_Value;

import minitlTrace.States.minitl.MinitlPackage;
import minitlTrace.States.minitl.TracedTransformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation input Model URI Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl#getInputModelURI <em>Input Model URI</em>}</li>
 *   <li>{@link minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link minitlTrace.States.impl.Transformation_inputModelURI_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transformation_inputModelURI_ValueImpl extends MinimalEObjectImpl.Container implements Transformation_inputModelURI_Value {
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
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
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
	public TracedTransformation getParent() {
		if (eContainerFeatureID() != StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT) return null;
		return (TracedTransformation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedTransformation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedTransformation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE, TracedTransformation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES, StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES);
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
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedTransformation)otherEnd, msgs);
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES:
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
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES:
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
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE, TracedTransformation.class, msgs);
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
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI:
				return getInputModelURI();
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT:
				return getParent();
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES:
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
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI:
				setInputModelURI((String)newValue);
				return;
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT:
				setParent((TracedTransformation)newValue);
				return;
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES:
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
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI:
				setInputModelURI(INPUT_MODEL_URI_EDEFAULT);
				return;
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT:
				setParent((TracedTransformation)null);
				return;
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES:
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
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__INPUT_MODEL_URI:
				return INPUT_MODEL_URI_EDEFAULT == null ? inputModelURI != null : !INPUT_MODEL_URI_EDEFAULT.equals(inputModelURI);
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES:
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
		result.append(" (inputModelURI: ");
		result.append(inputModelURI);
		result.append(')');
		return result.toString();
	}

} //Transformation_inputModelURI_ValueImpl
