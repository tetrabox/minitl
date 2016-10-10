/**
 */
package minitlTrace.States.impl;

import java.util.Collection;

import minitlTrace.States.ObjectTemplate_currentObject_Value;
import minitlTrace.States.State;
import minitlTrace.States.StatesPackage;
import minitlTrace.States.Transformation_inputModelURI_Value;
import minitlTrace.States.Transformation_inputModel_Value;
import minitlTrace.States.Transformation_outputFilePath_Value;
import minitlTrace.States.Transformation_outputModel_Value;

import minitlTrace.Steps.SpecificStep;
import minitlTrace.Steps.StepsPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.impl.StateImpl#getEndedSteps <em>Ended Steps</em>}</li>
 *   <li>{@link minitlTrace.States.impl.StateImpl#getObjectTemplate_currentObject_Values <em>Object Template current Object Values</em>}</li>
 *   <li>{@link minitlTrace.States.impl.StateImpl#getStartedSteps <em>Started Steps</em>}</li>
 *   <li>{@link minitlTrace.States.impl.StateImpl#getTransformation_inputModelURI_Values <em>Transformation input Model URI Values</em>}</li>
 *   <li>{@link minitlTrace.States.impl.StateImpl#getTransformation_inputModel_Values <em>Transformation input Model Values</em>}</li>
 *   <li>{@link minitlTrace.States.impl.StateImpl#getTransformation_outputFilePath_Values <em>Transformation output File Path Values</em>}</li>
 *   <li>{@link minitlTrace.States.impl.StateImpl#getTransformation_outputModel_Values <em>Transformation output Model Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State {
	/**
	 * The cached value of the '{@link #getEndedSteps() <em>Ended Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> endedSteps;

	/**
	 * The cached value of the '{@link #getObjectTemplate_currentObject_Values() <em>Object Template current Object Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectTemplate_currentObject_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectTemplate_currentObject_Value> objectTemplate_currentObject_Values;

	/**
	 * The cached value of the '{@link #getStartedSteps() <em>Started Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartedSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecificStep> startedSteps;

	/**
	 * The cached value of the '{@link #getTransformation_inputModelURI_Values() <em>Transformation input Model URI Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_inputModelURI_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation_inputModelURI_Value> transformation_inputModelURI_Values;

	/**
	 * The cached value of the '{@link #getTransformation_inputModel_Values() <em>Transformation input Model Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_inputModel_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation_inputModel_Value> transformation_inputModel_Values;

	/**
	 * The cached value of the '{@link #getTransformation_outputFilePath_Values() <em>Transformation output File Path Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_outputFilePath_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation_outputFilePath_Value> transformation_outputFilePath_Values;

	/**
	 * The cached value of the '{@link #getTransformation_outputModel_Values() <em>Transformation output Model Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformation_outputModel_Values()
	 * @generated
	 * @ordered
	 */
	protected EList<Transformation_outputModel_Value> transformation_outputModel_Values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getEndedSteps() {
		if (endedSteps == null) {
			endedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__ENDED_STEPS, StepsPackage.SPECIFIC_STEP__ENDING_STATE);
		}
		return endedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectTemplate_currentObject_Value> getObjectTemplate_currentObject_Values() {
		if (objectTemplate_currentObject_Values == null) {
			objectTemplate_currentObject_Values = new EObjectWithInverseResolvingEList.ManyInverse<ObjectTemplate_currentObject_Value>(ObjectTemplate_currentObject_Value.class, this, StatesPackage.STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES, StatesPackage.OBJECT_TEMPLATE_CURRENT_OBJECT_VALUE__STATES);
		}
		return objectTemplate_currentObject_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificStep> getStartedSteps() {
		if (startedSteps == null) {
			startedSteps = new EObjectWithInverseResolvingEList<SpecificStep>(SpecificStep.class, this, StatesPackage.STATE__STARTED_STEPS, StepsPackage.SPECIFIC_STEP__STARTING_STATE);
		}
		return startedSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation_inputModelURI_Value> getTransformation_inputModelURI_Values() {
		if (transformation_inputModelURI_Values == null) {
			transformation_inputModelURI_Values = new EObjectWithInverseResolvingEList.ManyInverse<Transformation_inputModelURI_Value>(Transformation_inputModelURI_Value.class, this, StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES, StatesPackage.TRANSFORMATION_INPUT_MODEL_URI_VALUE__STATES);
		}
		return transformation_inputModelURI_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation_inputModel_Value> getTransformation_inputModel_Values() {
		if (transformation_inputModel_Values == null) {
			transformation_inputModel_Values = new EObjectWithInverseResolvingEList.ManyInverse<Transformation_inputModel_Value>(Transformation_inputModel_Value.class, this, StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_VALUES, StatesPackage.TRANSFORMATION_INPUT_MODEL_VALUE__STATES);
		}
		return transformation_inputModel_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation_outputFilePath_Value> getTransformation_outputFilePath_Values() {
		if (transformation_outputFilePath_Values == null) {
			transformation_outputFilePath_Values = new EObjectWithInverseResolvingEList.ManyInverse<Transformation_outputFilePath_Value>(Transformation_outputFilePath_Value.class, this, StatesPackage.STATE__TRANSFORMATION_OUTPUT_FILE_PATH_VALUES, StatesPackage.TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__STATES);
		}
		return transformation_outputFilePath_Values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transformation_outputModel_Value> getTransformation_outputModel_Values() {
		if (transformation_outputModel_Values == null) {
			transformation_outputModel_Values = new EObjectWithInverseResolvingEList.ManyInverse<Transformation_outputModel_Value>(Transformation_outputModel_Value.class, this, StatesPackage.STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES, StatesPackage.TRANSFORMATION_OUTPUT_MODEL_VALUE__STATES);
		}
		return transformation_outputModel_Values;
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
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getObjectTemplate_currentObject_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartedSteps()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformation_inputModelURI_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformation_inputModel_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_FILE_PATH_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformation_outputFilePath_Values()).basicAdd(otherEnd, msgs);
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransformation_outputModel_Values()).basicAdd(otherEnd, msgs);
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
			case StatesPackage.STATE__ENDED_STEPS:
				return ((InternalEList<?>)getEndedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES:
				return ((InternalEList<?>)getObjectTemplate_currentObject_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__STARTED_STEPS:
				return ((InternalEList<?>)getStartedSteps()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES:
				return ((InternalEList<?>)getTransformation_inputModelURI_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_VALUES:
				return ((InternalEList<?>)getTransformation_inputModel_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_FILE_PATH_VALUES:
				return ((InternalEList<?>)getTransformation_outputFilePath_Values()).basicRemove(otherEnd, msgs);
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES:
				return ((InternalEList<?>)getTransformation_outputModel_Values()).basicRemove(otherEnd, msgs);
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
			case StatesPackage.STATE__ENDED_STEPS:
				return getEndedSteps();
			case StatesPackage.STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES:
				return getObjectTemplate_currentObject_Values();
			case StatesPackage.STATE__STARTED_STEPS:
				return getStartedSteps();
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES:
				return getTransformation_inputModelURI_Values();
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_VALUES:
				return getTransformation_inputModel_Values();
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_FILE_PATH_VALUES:
				return getTransformation_outputFilePath_Values();
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES:
				return getTransformation_outputModel_Values();
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
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				getEndedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES:
				getObjectTemplate_currentObject_Values().clear();
				getObjectTemplate_currentObject_Values().addAll((Collection<? extends ObjectTemplate_currentObject_Value>)newValue);
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				getStartedSteps().addAll((Collection<? extends SpecificStep>)newValue);
				return;
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES:
				getTransformation_inputModelURI_Values().clear();
				getTransformation_inputModelURI_Values().addAll((Collection<? extends Transformation_inputModelURI_Value>)newValue);
				return;
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_VALUES:
				getTransformation_inputModel_Values().clear();
				getTransformation_inputModel_Values().addAll((Collection<? extends Transformation_inputModel_Value>)newValue);
				return;
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_FILE_PATH_VALUES:
				getTransformation_outputFilePath_Values().clear();
				getTransformation_outputFilePath_Values().addAll((Collection<? extends Transformation_outputFilePath_Value>)newValue);
				return;
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES:
				getTransformation_outputModel_Values().clear();
				getTransformation_outputModel_Values().addAll((Collection<? extends Transformation_outputModel_Value>)newValue);
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
			case StatesPackage.STATE__ENDED_STEPS:
				getEndedSteps().clear();
				return;
			case StatesPackage.STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES:
				getObjectTemplate_currentObject_Values().clear();
				return;
			case StatesPackage.STATE__STARTED_STEPS:
				getStartedSteps().clear();
				return;
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES:
				getTransformation_inputModelURI_Values().clear();
				return;
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_VALUES:
				getTransformation_inputModel_Values().clear();
				return;
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_FILE_PATH_VALUES:
				getTransformation_outputFilePath_Values().clear();
				return;
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES:
				getTransformation_outputModel_Values().clear();
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
			case StatesPackage.STATE__ENDED_STEPS:
				return endedSteps != null && !endedSteps.isEmpty();
			case StatesPackage.STATE__OBJECT_TEMPLATE_CURRENT_OBJECT_VALUES:
				return objectTemplate_currentObject_Values != null && !objectTemplate_currentObject_Values.isEmpty();
			case StatesPackage.STATE__STARTED_STEPS:
				return startedSteps != null && !startedSteps.isEmpty();
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_URI_VALUES:
				return transformation_inputModelURI_Values != null && !transformation_inputModelURI_Values.isEmpty();
			case StatesPackage.STATE__TRANSFORMATION_INPUT_MODEL_VALUES:
				return transformation_inputModel_Values != null && !transformation_inputModel_Values.isEmpty();
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_FILE_PATH_VALUES:
				return transformation_outputFilePath_Values != null && !transformation_outputFilePath_Values.isEmpty();
			case StatesPackage.STATE__TRANSFORMATION_OUTPUT_MODEL_VALUES:
				return transformation_outputModel_Values != null && !transformation_outputModel_Values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateImpl
