/**
 */
package minitlTrace.States.minitl.impl;

import java.util.Collection;

import minitlTrace.States.StatesPackage;
import minitlTrace.States.Transformation_inputModelURI_Value;
import minitlTrace.States.Transformation_inputModel_Value;
import minitlTrace.States.Transformation_outputFilePath_Value;
import minitlTrace.States.Transformation_outputModel_Value;

import minitlTrace.States.minitl.MinitlPackage;
import minitlTrace.States.minitl.TracedTransformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.tetrabox.example.minitl.minitl.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedTransformationImpl#getInputModelSequence <em>Input Model Sequence</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedTransformationImpl#getInputModelURISequence <em>Input Model URI Sequence</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedTransformationImpl#getOriginalObject <em>Original Object</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedTransformationImpl#getOutputFilePathSequence <em>Output File Path Sequence</em>}</li>
 *   <li>{@link minitlTrace.States.minitl.impl.TracedTransformationImpl#getOutputModelSequence <em>Output Model Sequence</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracedTransformationImpl extends TracedNamedElementImpl implements TracedTransformation {
	/**
	 * The cached value of the '{@link #getInputModelSequence() <em>Input Model Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputModelSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation_inputModel_Value> inputModelSequence;

	/**
	 * The cached value of the '{@link #getInputModelURISequence() <em>Input Model URI Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputModelURISequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation_inputModelURI_Value> inputModelURISequence;

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
	 * The cached value of the '{@link #getOutputFilePathSequence() <em>Output File Path Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFilePathSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation_outputFilePath_Value> outputFilePathSequence;

	/**
	 * The cached value of the '{@link #getOutputModelSequence() <em>Output Model Sequence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputModelSequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation_outputModel_Value> outputModelSequence;

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
	public EList<Transformation_inputModel_Value> getInputModelSequence() {
		if (inputModelSequence == null) {
			inputModelSequence = new EObjectContainmentWithInverseEList<Transformation_inputModel_Value>(Transformation_inputModel_Value.class, this, MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_SEQUENCE, StatesPackage.TRANSFORMATION_INPUT_MODEL_VALUE__PARENT);
		}
		return inputModelSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation_inputModelURI_Value> getInputModelURISequence() {
		if (inputModelURISequence == null) {
			inputModelURISequence = new EObjectContainmentWithInverseEList<Transformation_inputModelURI_Value>(Transformation_inputModelURI_Value.class, this, MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE, StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__PARENT);
		}
		return inputModelURISequence;
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
	public EList<Transformation_outputFilePath_Value> getOutputFilePathSequence() {
		if (outputFilePathSequence == null) {
			outputFilePathSequence = new EObjectContainmentWithInverseEList<Transformation_outputFilePath_Value>(Transformation_outputFilePath_Value.class, this, MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_FILE_PATH_SEQUENCE, StatesPackage.TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__PARENT);
		}
		return outputFilePathSequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation_outputModel_Value> getOutputModelSequence() {
		if (outputModelSequence == null) {
			outputModelSequence = new EObjectContainmentWithInverseEList<Transformation_outputModel_Value>(Transformation_outputModel_Value.class, this, MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE, StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__PARENT);
		}
		return outputModelSequence;
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
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputModelSequence()).basicAdd(otherEnd, msgs);
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputModelURISequence()).basicAdd(otherEnd, msgs);
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_FILE_PATH_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputFilePathSequence()).basicAdd(otherEnd, msgs);
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputModelSequence()).basicAdd(otherEnd, msgs);
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
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_SEQUENCE:
				return ((InternalEList<?>)getInputModelSequence()).basicRemove(otherEnd, msgs);
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE:
				return ((InternalEList<?>)getInputModelURISequence()).basicRemove(otherEnd, msgs);
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_FILE_PATH_SEQUENCE:
				return ((InternalEList<?>)getOutputFilePathSequence()).basicRemove(otherEnd, msgs);
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE:
				return ((InternalEList<?>)getOutputModelSequence()).basicRemove(otherEnd, msgs);
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
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_SEQUENCE:
				return getInputModelSequence();
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE:
				return getInputModelURISequence();
			case MinitlPackage.TRACED_TRANSFORMATION__ORIGINAL_OBJECT:
				if (resolve) return getOriginalObject();
				return basicGetOriginalObject();
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_FILE_PATH_SEQUENCE:
				return getOutputFilePathSequence();
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE:
				return getOutputModelSequence();
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
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_SEQUENCE:
				getInputModelSequence().clear();
				getInputModelSequence().addAll((Collection<? extends Transformation_inputModel_Value>)newValue);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE:
				getInputModelURISequence().clear();
				getInputModelURISequence().addAll((Collection<? extends Transformation_inputModelURI_Value>)newValue);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__ORIGINAL_OBJECT:
				setOriginalObject((Transformation)newValue);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_FILE_PATH_SEQUENCE:
				getOutputFilePathSequence().clear();
				getOutputFilePathSequence().addAll((Collection<? extends Transformation_outputFilePath_Value>)newValue);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE:
				getOutputModelSequence().clear();
				getOutputModelSequence().addAll((Collection<? extends Transformation_outputModel_Value>)newValue);
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
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_SEQUENCE:
				getInputModelSequence().clear();
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE:
				getInputModelURISequence().clear();
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__ORIGINAL_OBJECT:
				setOriginalObject((Transformation)null);
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_FILE_PATH_SEQUENCE:
				getOutputFilePathSequence().clear();
				return;
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE:
				getOutputModelSequence().clear();
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
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_SEQUENCE:
				return inputModelSequence != null && !inputModelSequence.isEmpty();
			case MinitlPackage.TRACED_TRANSFORMATION__INPUT_MODEL_URI_SEQUENCE:
				return inputModelURISequence != null && !inputModelURISequence.isEmpty();
			case MinitlPackage.TRACED_TRANSFORMATION__ORIGINAL_OBJECT:
				return originalObject != null;
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_FILE_PATH_SEQUENCE:
				return outputFilePathSequence != null && !outputFilePathSequence.isEmpty();
			case MinitlPackage.TRACED_TRANSFORMATION__OUTPUT_MODEL_SEQUENCE:
				return outputModelSequence != null && !outputModelSequence.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracedTransformationImpl
