/**
 */
package minitlTrace.States.impl;

import java.util.Collection;

import minitlTrace.States.State;
import minitlTrace.States.StatesPackage;
import minitlTrace.States.Transformation_outputModel_Value;

import minitlTrace.States.minitl.MinitlPackage;
import minitlTrace.States.minitl.TracedTransformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation output Model Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.impl.Transformation_outputModel_ValueImpl#getStatesNoOpposite <em>States No Opposite</em>}</li>
 *   <li>{@link minitlTrace.States.impl.Transformation_outputModel_ValueImpl#getOutputModel <em>Output Model</em>}</li>
 *   <li>{@link minitlTrace.States.impl.Transformation_outputModel_ValueImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link minitlTrace.States.impl.Transformation_outputModel_ValueImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transformation_outputModel_ValueImpl extends MinimalEObjectImpl.Container implements Transformation_outputModel_Value {
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
	public EList<State> getStatesNoOpposite() {
		return this.getStates();
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
	public TracedTransformation getParent() {
		if (eContainerFeatureID() != StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT) return null;
		return (TracedTransformation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(TracedTransformation newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(TracedTransformation newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE, TracedTransformation.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectWithInverseResolvingEList.ManyInverse<State>(State.class, this, StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES, StatesPackage.STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES);
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
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TracedTransformation)otherEnd, msgs);
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES:
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
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT:
				return basicSetParent(null, msgs);
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES:
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
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT:
				return eInternalContainer().eInverseRemove(this, MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE, TracedTransformation.class, msgs);
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
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES_NO_OPPOSITE:
				return getStatesNoOpposite();
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL:
				return getOutputModel();
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT:
				return getParent();
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES:
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
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL:
				getOutputModel().clear();
				getOutputModel().addAll((Collection<? extends EObject>)newValue);
				return;
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT:
				setParent((TracedTransformation)newValue);
				return;
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES:
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
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL:
				getOutputModel().clear();
				return;
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT:
				setParent((TracedTransformation)null);
				return;
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES:
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
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES_NO_OPPOSITE:
				return !getStatesNoOpposite().isEmpty();
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__OUTPUT_MODEL:
				return outputModel != null && !outputModel.isEmpty();
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT:
				return getParent() != null;
			case StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES:
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
		result.append(" (outputModel: ");
		result.append(outputModel);
		result.append(')');
		return result.toString();
	}

} //Transformation_outputModel_ValueImpl
