/**
 */
package minitl.impl;

import java.util.Collection;

import minitl.Metamodel;
import minitl.MinitlPackage;
import minitl.Rule;
import minitl.Transformation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitl.impl.TransformationImpl#getInputMetamodel <em>Input Metamodel</em>}</li>
 *   <li>{@link minitl.impl.TransformationImpl#getRules <em>Rules</em>}</li>
 *   <li>{@link minitl.impl.TransformationImpl#getOutputMetamodel <em>Output Metamodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationImpl extends NamedElementImpl implements Transformation {
	/**
	 * The cached value of the '{@link #getInputMetamodel() <em>Input Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Metamodel inputMetamodel;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * The cached value of the '{@link #getOutputMetamodel() <em>Output Metamodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMetamodel()
	 * @generated
	 * @ordered
	 */
	protected Metamodel outputMetamodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinitlPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getInputMetamodel() {
		return inputMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputMetamodel(Metamodel newInputMetamodel, NotificationChain msgs) {
		Metamodel oldInputMetamodel = inputMetamodel;
		inputMetamodel = newInputMetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinitlPackage.TRANSFORMATION__INPUT_METAMODEL, oldInputMetamodel, newInputMetamodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputMetamodel(Metamodel newInputMetamodel) {
		if (newInputMetamodel != inputMetamodel) {
			NotificationChain msgs = null;
			if (inputMetamodel != null)
				msgs = ((InternalEObject)inputMetamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRANSFORMATION__INPUT_METAMODEL, null, msgs);
			if (newInputMetamodel != null)
				msgs = ((InternalEObject)newInputMetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRANSFORMATION__INPUT_METAMODEL, null, msgs);
			msgs = basicSetInputMetamodel(newInputMetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinitlPackage.TRANSFORMATION__INPUT_METAMODEL, newInputMetamodel, newInputMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metamodel getOutputMetamodel() {
		return outputMetamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputMetamodel(Metamodel newOutputMetamodel, NotificationChain msgs) {
		Metamodel oldOutputMetamodel = outputMetamodel;
		outputMetamodel = newOutputMetamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MinitlPackage.TRANSFORMATION__OUTPUT_METAMODEL, oldOutputMetamodel, newOutputMetamodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputMetamodel(Metamodel newOutputMetamodel) {
		if (newOutputMetamodel != outputMetamodel) {
			NotificationChain msgs = null;
			if (outputMetamodel != null)
				msgs = ((InternalEObject)outputMetamodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRANSFORMATION__OUTPUT_METAMODEL, null, msgs);
			if (newOutputMetamodel != null)
				msgs = ((InternalEObject)newOutputMetamodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MinitlPackage.TRANSFORMATION__OUTPUT_METAMODEL, null, msgs);
			msgs = basicSetOutputMetamodel(newOutputMetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MinitlPackage.TRANSFORMATION__OUTPUT_METAMODEL, newOutputMetamodel, newOutputMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentWithInverseEList<Rule>(Rule.class, this, MinitlPackage.TRANSFORMATION__RULES, MinitlPackage.RULE__TRANSFORMATION);
		}
		return rules;
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
			case MinitlPackage.TRANSFORMATION__RULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRules()).basicAdd(otherEnd, msgs);
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
			case MinitlPackage.TRANSFORMATION__INPUT_METAMODEL:
				return basicSetInputMetamodel(null, msgs);
			case MinitlPackage.TRANSFORMATION__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
			case MinitlPackage.TRANSFORMATION__OUTPUT_METAMODEL:
				return basicSetOutputMetamodel(null, msgs);
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
			case MinitlPackage.TRANSFORMATION__INPUT_METAMODEL:
				return getInputMetamodel();
			case MinitlPackage.TRANSFORMATION__RULES:
				return getRules();
			case MinitlPackage.TRANSFORMATION__OUTPUT_METAMODEL:
				return getOutputMetamodel();
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
			case MinitlPackage.TRANSFORMATION__INPUT_METAMODEL:
				setInputMetamodel((Metamodel)newValue);
				return;
			case MinitlPackage.TRANSFORMATION__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
				return;
			case MinitlPackage.TRANSFORMATION__OUTPUT_METAMODEL:
				setOutputMetamodel((Metamodel)newValue);
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
			case MinitlPackage.TRANSFORMATION__INPUT_METAMODEL:
				setInputMetamodel((Metamodel)null);
				return;
			case MinitlPackage.TRANSFORMATION__RULES:
				getRules().clear();
				return;
			case MinitlPackage.TRANSFORMATION__OUTPUT_METAMODEL:
				setOutputMetamodel((Metamodel)null);
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
			case MinitlPackage.TRANSFORMATION__INPUT_METAMODEL:
				return inputMetamodel != null;
			case MinitlPackage.TRANSFORMATION__RULES:
				return rules != null && !rules.isEmpty();
			case MinitlPackage.TRANSFORMATION__OUTPUT_METAMODEL:
				return outputMetamodel != null;
		}
		return super.eIsSet(featureID);
	}

} //TransformationImpl
