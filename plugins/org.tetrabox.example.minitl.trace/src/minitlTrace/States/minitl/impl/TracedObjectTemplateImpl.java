/**
 */
package minitlTrace.States.minitl.impl;

import minitlTrace.States.ObjectTemplate_currentObject_Dimension;
import minitlTrace.States.SpecificDimension;

import minitlTrace.States.minitl.MinitlPackage;
import minitlTrace.States.minitl.TracedObjectTemplate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.example.minitl.minitl.ObjectTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Object Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedObjectTemplateImpl#getObjectTemplate_currentObject_Dimension <em>Object Template current Object Dimension</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedObjectTemplateImpl#getOriginalObject <em>Original Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedObjectTemplateImpl extends TracedNamedElementImpl implements TracedObjectTemplate {
	/**
	 * The cached value of the '{@link #getObjectTemplate_currentObject_Dimension() <em>Object Template current Object Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTemplate_currentObject_Dimension()
	 * @generated
	 * @ordered
	 */
	protected ObjectTemplate_currentObject_Dimension objectTemplate_currentObject_Dimension;

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
	public ObjectTemplate_currentObject_Dimension getObjectTemplate_currentObject_Dimension() {
		return objectTemplate_currentObject_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectTemplate_currentObject_Dimension(ObjectTemplate_currentObject_Dimension newObjectTemplate_currentObject_Dimension, NotificationChain msgs) {
		ObjectTemplate_currentObject_Dimension oldObjectTemplate_currentObject_Dimension = objectTemplate_currentObject_Dimension;
		objectTemplate_currentObject_Dimension = newObjectTemplate_currentObject_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_OBJECT_TEMPLATE__OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION, oldObjectTemplate_currentObject_Dimension, newObjectTemplate_currentObject_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectTemplate_currentObject_Dimension(ObjectTemplate_currentObject_Dimension newObjectTemplate_currentObject_Dimension) {
		if (newObjectTemplate_currentObject_Dimension != objectTemplate_currentObject_Dimension) {
			NotificationChain msgs = null;
			if (objectTemplate_currentObject_Dimension != null)
				msgs = ((InternalEObject)objectTemplate_currentObject_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRACED_OBJECT_TEMPLATE__OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION, null, msgs);
			if (newObjectTemplate_currentObject_Dimension != null)
				msgs = ((InternalEObject)newObjectTemplate_currentObject_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRACED_OBJECT_TEMPLATE__OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION, null, msgs);
			msgs = basicSetObjectTemplate_currentObject_Dimension(newObjectTemplate_currentObject_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_OBJECT_TEMPLATE__OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION, newObjectTemplate_currentObject_Dimension, newObjectTemplate_currentObject_Dimension));
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
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getObjectTemplate_currentObject_Dimension());
		return result;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION:
				return basicSetObjectTemplate_currentObject_Dimension(null, msgs);
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
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION:
				return getObjectTemplate_currentObject_Dimension();
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION:
				setObjectTemplate_currentObject_Dimension((ObjectTemplate_currentObject_Dimension)newValue);
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
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION:
				setObjectTemplate_currentObject_Dimension((ObjectTemplate_currentObject_Dimension)null);
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
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__OBJECT_TEMPLATE_CURRENT_OBJECT_DIMENSION:
				return objectTemplate_currentObject_Dimension != null;
			case MinitlPackage.TRACED_OBJECT_TEMPLATE__ORIGINAL_OBJECT:
				return originalObject != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedObjectTemplateImpl
