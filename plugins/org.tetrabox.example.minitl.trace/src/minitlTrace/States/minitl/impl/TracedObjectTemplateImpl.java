/**
 */
package minitlTrace.States.minitl.impl;

import java.util.Collection;

import minitlTrace.States.ObjectTemplate_currentObject_Value;
import minitlTrace.States.StatesPackage;

import minitlTrace.States.minitl.MinitlPackage;
import minitlTrace.States.minitl.TracedObjectTemplate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.example.minitl.minitl.ObjectTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Object Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedObjectTemplateImpl#getCurrentObjectSequence <em>Current Object Sequence</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedObjectTemplateImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedObjectTemplateImpl extends TracedNamedElementImpl implements TracedObjectTemplate {
	/**
	 * The cached value of the '{@link #getCurrentObjectSequence() <em>Current Object Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentObjectSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectTemplate_currentObject_Value> currentObjectSequence;

	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected ObjectTemplate originalObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedObjectTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinitlPackage.Literals.TRACED_OBJECT_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTemplate_currentObject_Value> getCurrentObjectSequence() {
		if (currentObjectSequence == null) {
			currentObjectSequence = new EObjectContainmentWithInverseEList<ObjectTemplate_currentObject_Value>(ObjectTemplate_currentObject_Value.class, this, MinitlPackage.TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE, StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__PARENT);
		}
		return currentObjectSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTemplate getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (ObjectTemplate)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinitlPackage.TRACED_OBJECT_TEMPLATE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTemplate basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(ObjectTemplate newOriginalObject) {
		ObjectTemplate oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_OBJECT_TEMPLATE__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
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
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCurrentObjectSequence()).basicAdd(otherEnd, msgs);
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
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE:
				return ((InternalEList<?>)getCurrentObjectSequence()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE:
				return getCurrentObjectSequence();
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
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
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE:
				getCurrentObjectSequence().clear();
				getCurrentObjectSequence().addAll((Collection<? extends ObjectTemplate_currentObject_Value>)newValue);
				return;
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__ORIGINAL_OBJECT:
				setOriginalObject((ObjectTemplate)newValue);
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
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE:
				getCurrentObjectSequence().clear();
				return;
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__ORIGINAL_OBJECT:
				setOriginalObject((ObjectTemplate)null);
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
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__CURRENT_OBJECT_SEQUENCE:
				return currentObjectSequence != null && !currentObjectSequence.isEmpty();
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedObjectTemplateImpl
