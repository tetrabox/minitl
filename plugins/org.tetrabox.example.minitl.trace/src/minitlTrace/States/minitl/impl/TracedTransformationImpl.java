/**
 */
package minitlTrace.States.minitl.impl;

import minitlTrace.States.SpecificDimension;
import minitlTrace.States.Transformation_inputModelURI_Dimension;
import minitlTrace.States.Transformation_inputModel_Dimension;
import minitlTrace.States.Transformation_outputFilePath_Dimension;
import minitlTrace.States.Transformation_outputModel_Dimension;

import minitlTrace.States.minitl.MinitlPackage;
import minitlTrace.States.minitl.TracedTransformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.tetrabox.example.minitl.minitl.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedTransformationImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedTransformationImpl#getTransformation_inputModelURI_Dimension <em>Transformation input Model URI Dimension</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedTransformationImpl#getTransformation_inputModel_Dimension <em>Transformation input Model Dimension</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedTransformationImpl#getTransformation_outputFilePath_Dimension <em>Transformation output File Path Dimension</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedTransformationImpl#getTransformation_outputModel_Dimension <em>Transformation output Model Dimension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedTransformationImpl extends TracedNamedElementImpl implements TracedTransformation {
	/**
	 * The cached value of the '{@link #getOriginalObject() <em>Original Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalObject()
	 * @generated
	 * @ordered
	 */
	protected Transformation originalObject;

	/**
	 * The cached value of the '{@link #getTransformation_inputModelURI_Dimension() <em>Transformation input Model URI Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_inputModelURI_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Transformation_inputModelURI_Dimension transformation_inputModelURI_Dimension;

	/**
	 * The cached value of the '{@link #getTransformation_inputModel_Dimension() <em>Transformation input Model Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_inputModel_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Transformation_inputModel_Dimension transformation_inputModel_Dimension;

	/**
	 * The cached value of the '{@link #getTransformation_outputFilePath_Dimension() <em>Transformation output File Path Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_outputFilePath_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Transformation_outputFilePath_Dimension transformation_outputFilePath_Dimension;

	/**
	 * The cached value of the '{@link #getTransformation_outputModel_Dimension() <em>Transformation output Model Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_outputModel_Dimension()
	 * @generated
	 * @ordered
	 */
	protected Transformation_outputModel_Dimension transformation_outputModel_Dimension;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedTransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinitlPackage.Literals.TRACED_TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation getOriginalObject() {
		if (originalObject != null && originalObject.eIsProxy()) {
			InternalEObject oldOriginalObject = (InternalEObject)originalObject;
			originalObject = (Transformation)eResolveProxy(oldOriginalObject);
			if (originalObject != oldOriginalObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MinitlPackage.TRACED_TRANSFORMATION__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
			}
		}
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation basicGetOriginalObject() {
		return originalObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalObject(Transformation newOriginalObject) {
		Transformation oldOriginalObject = originalObject;
		originalObject = newOriginalObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_TRANSFORMATION__ORIGINAL_OBJECT, oldOriginalObject, originalObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation_inputModelURI_Dimension getTransformation_inputModelURI_Dimension() {
		return transformation_inputModelURI_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation_inputModelURI_Dimension(Transformation_inputModelURI_Dimension newTransformation_inputModelURI_Dimension, NotificationChain msgs) {
		Transformation_inputModelURI_Dimension oldTransformation_inputModelURI_Dimension = transformation_inputModelURI_Dimension;
		transformation_inputModelURI_Dimension = newTransformation_inputModelURI_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_URI_DIMENSION, oldTransformation_inputModelURI_Dimension, newTransformation_inputModelURI_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation_inputModelURI_Dimension(Transformation_inputModelURI_Dimension newTransformation_inputModelURI_Dimension) {
		if (newTransformation_inputModelURI_Dimension != transformation_inputModelURI_Dimension) {
			NotificationChain msgs = null;
			if (transformation_inputModelURI_Dimension != null)
				msgs = ((InternalEObject)transformation_inputModelURI_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_URI_DIMENSION, null, msgs);
			if (newTransformation_inputModelURI_Dimension != null)
				msgs = ((InternalEObject)newTransformation_inputModelURI_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_URI_DIMENSION, null, msgs);
			msgs = basicSetTransformation_inputModelURI_Dimension(newTransformation_inputModelURI_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_URI_DIMENSION, newTransformation_inputModelURI_Dimension, newTransformation_inputModelURI_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation_inputModel_Dimension getTransformation_inputModel_Dimension() {
		return transformation_inputModel_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation_inputModel_Dimension(Transformation_inputModel_Dimension newTransformation_inputModel_Dimension, NotificationChain msgs) {
		Transformation_inputModel_Dimension oldTransformation_inputModel_Dimension = transformation_inputModel_Dimension;
		transformation_inputModel_Dimension = newTransformation_inputModel_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_DIMENSION, oldTransformation_inputModel_Dimension, newTransformation_inputModel_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation_inputModel_Dimension(Transformation_inputModel_Dimension newTransformation_inputModel_Dimension) {
		if (newTransformation_inputModel_Dimension != transformation_inputModel_Dimension) {
			NotificationChain msgs = null;
			if (transformation_inputModel_Dimension != null)
				msgs = ((InternalEObject)transformation_inputModel_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_DIMENSION, null, msgs);
			if (newTransformation_inputModel_Dimension != null)
				msgs = ((InternalEObject)newTransformation_inputModel_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_DIMENSION, null, msgs);
			msgs = basicSetTransformation_inputModel_Dimension(newTransformation_inputModel_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_DIMENSION, newTransformation_inputModel_Dimension, newTransformation_inputModel_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation_outputFilePath_Dimension getTransformation_outputFilePath_Dimension() {
		return transformation_outputFilePath_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation_outputFilePath_Dimension(Transformation_outputFilePath_Dimension newTransformation_outputFilePath_Dimension, NotificationChain msgs) {
		Transformation_outputFilePath_Dimension oldTransformation_outputFilePath_Dimension = transformation_outputFilePath_Dimension;
		transformation_outputFilePath_Dimension = newTransformation_outputFilePath_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION, oldTransformation_outputFilePath_Dimension, newTransformation_outputFilePath_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation_outputFilePath_Dimension(Transformation_outputFilePath_Dimension newTransformation_outputFilePath_Dimension) {
		if (newTransformation_outputFilePath_Dimension != transformation_outputFilePath_Dimension) {
			NotificationChain msgs = null;
			if (transformation_outputFilePath_Dimension != null)
				msgs = ((InternalEObject)transformation_outputFilePath_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION, null, msgs);
			if (newTransformation_outputFilePath_Dimension != null)
				msgs = ((InternalEObject)newTransformation_outputFilePath_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION, null, msgs);
			msgs = basicSetTransformation_outputFilePath_Dimension(newTransformation_outputFilePath_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION, newTransformation_outputFilePath_Dimension, newTransformation_outputFilePath_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation_outputModel_Dimension getTransformation_outputModel_Dimension() {
		return transformation_outputModel_Dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformation_outputModel_Dimension(Transformation_outputModel_Dimension newTransformation_outputModel_Dimension, NotificationChain msgs) {
		Transformation_outputModel_Dimension oldTransformation_outputModel_Dimension = transformation_outputModel_Dimension;
		transformation_outputModel_Dimension = newTransformation_outputModel_Dimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_MODEL_DIMENSION, oldTransformation_outputModel_Dimension, newTransformation_outputModel_Dimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformation_outputModel_Dimension(Transformation_outputModel_Dimension newTransformation_outputModel_Dimension) {
		if (newTransformation_outputModel_Dimension != transformation_outputModel_Dimension) {
			NotificationChain msgs = null;
			if (transformation_outputModel_Dimension != null)
				msgs = ((InternalEObject)transformation_outputModel_Dimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_MODEL_DIMENSION, null, msgs);
			if (newTransformation_outputModel_Dimension != null)
				msgs = ((InternalEObject)newTransformation_outputModel_Dimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_MODEL_DIMENSION, null, msgs);
			msgs = basicSetTransformation_outputModel_Dimension(newTransformation_outputModel_Dimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_MODEL_DIMENSION, newTransformation_outputModel_Dimension, newTransformation_outputModel_Dimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		result.add(getTransformation_inputModelURI_Dimension());
		result.add(getTransformation_outputModel_Dimension());
		result.add(getTransformation_inputModel_Dimension());
		result.add(getTransformation_outputFilePath_Dimension());
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
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_URI_DIMENSION:
				return basicSetTransformation_inputModelURI_Dimension(null, msgs);
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_DIMENSION:
				return basicSetTransformation_inputModel_Dimension(null, msgs);
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION:
				return basicSetTransformation_outputFilePath_Dimension(null, msgs);
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_MODEL_DIMENSION:
				return basicSetTransformation_outputModel_Dimension(null, msgs);
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
			case MinitlPackage.TRACED_TRANSFORMATION__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_URI_DIMENSION:
				return getTransformation_inputModelURI_Dimension();
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_DIMENSION:
				return getTransformation_inputModel_Dimension();
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION:
				return getTransformation_outputFilePath_Dimension();
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_MODEL_DIMENSION:
				return getTransformation_outputModel_Dimension();
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
			case MinitlPackage.TRACED_TRANSFORMATION__ORIGINAL_OBJECT:
				setOriginalObject((Transformation)newValue);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_URI_DIMENSION:
				setTransformation_inputModelURI_Dimension((Transformation_inputModelURI_Dimension)newValue);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_DIMENSION:
				setTransformation_inputModel_Dimension((Transformation_inputModel_Dimension)newValue);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION:
				setTransformation_outputFilePath_Dimension((Transformation_outputFilePath_Dimension)newValue);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_MODEL_DIMENSION:
				setTransformation_outputModel_Dimension((Transformation_outputModel_Dimension)newValue);
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
			case MinitlPackage.TRACED_TRANSFORMATION__ORIGINAL_OBJECT:
				setOriginalObject((Transformation)null);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_URI_DIMENSION:
				setTransformation_inputModelURI_Dimension((Transformation_inputModelURI_Dimension)null);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_DIMENSION:
				setTransformation_inputModel_Dimension((Transformation_inputModel_Dimension)null);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION:
				setTransformation_outputFilePath_Dimension((Transformation_outputFilePath_Dimension)null);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_MODEL_DIMENSION:
				setTransformation_outputModel_Dimension((Transformation_outputModel_Dimension)null);
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
			case MinitlPackage.TRACED_TRANSFORMATION__ORIGINAL_OBJECT:
				return originalObject != null;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_URI_DIMENSION:
				return transformation_inputModelURI_Dimension != null;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_INPUT_MODEL_DIMENSION:
				return transformation_inputModel_Dimension != null;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_FILE_PATH_DIMENSION:
				return transformation_outputFilePath_Dimension != null;
			case MinitlPackage.TRACED_TRANSFORMATION__TRANSFORMATION_OUTPUT_MODEL_DIMENSION:
				return transformation_outputModel_Dimension != null;
		}
		return super.eIsSet(featureID);
	}

} //TracedTransformationImpl
