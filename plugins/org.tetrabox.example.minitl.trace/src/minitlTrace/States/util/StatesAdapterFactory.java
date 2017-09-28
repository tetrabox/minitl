/**
 */
package minitlTrace.States.util;

import minitlTrace.States.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gemoc.trace.commons.model.trace.Dimension;
import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.commons.model.trace.Step;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;
import org.eclipse.gemoc.trace.commons.model.trace.Value;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see minitlTrace.States.StatesPackage
 * @generated
 */
public class StatesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StatesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StatesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatesSwitch<Adapter> modelSwitch =
		new StatesSwitch<Adapter>() {
			@Override
			public Adapter caseObjectTemplate_currentObject_Dimension(ObjectTemplate_currentObject_Dimension object) {
				return createObjectTemplate_currentObject_DimensionAdapter();
			}
			@Override
			public Adapter caseObjectTemplate_currentObject_Value(ObjectTemplate_currentObject_Value object) {
				return createObjectTemplate_currentObject_ValueAdapter();
			}
			@Override
			public Adapter caseSpecificAttributeValue(SpecificAttributeValue object) {
				return createSpecificAttributeValueAdapter();
			}
			@Override
			public <ValueSubType extends SpecificValue> Adapter caseSpecificDimension(SpecificDimension<ValueSubType> object) {
				return createSpecificDimensionAdapter();
			}
			@Override
			public <T> Adapter caseSpecificReferenceValue(SpecificReferenceValue<T> object) {
				return createSpecificReferenceValueAdapter();
			}
			@Override
			public Adapter caseSpecificState(SpecificState object) {
				return createSpecificStateAdapter();
			}
			@Override
			public <DimensionSubType extends SpecificDimension<? extends SpecificValue>> Adapter caseSpecificTracedObject(SpecificTracedObject<DimensionSubType> object) {
				return createSpecificTracedObjectAdapter();
			}
			@Override
			public Adapter caseSpecificValue(SpecificValue object) {
				return createSpecificValueAdapter();
			}
			@Override
			public Adapter caseTransformation_inputModelURI_Dimension(Transformation_inputModelURI_Dimension object) {
				return createTransformation_inputModelURI_DimensionAdapter();
			}
			@Override
			public Adapter caseTransformation_inputModelURI_Value(Transformation_inputModelURI_Value object) {
				return createTransformation_inputModelURI_ValueAdapter();
			}
			@Override
			public Adapter caseTransformation_inputModel_Dimension(Transformation_inputModel_Dimension object) {
				return createTransformation_inputModel_DimensionAdapter();
			}
			@Override
			public Adapter caseTransformation_inputModel_Value(Transformation_inputModel_Value object) {
				return createTransformation_inputModel_ValueAdapter();
			}
			@Override
			public Adapter caseTransformation_outputFilePath_Dimension(Transformation_outputFilePath_Dimension object) {
				return createTransformation_outputFilePath_DimensionAdapter();
			}
			@Override
			public Adapter caseTransformation_outputFilePath_Value(Transformation_outputFilePath_Value object) {
				return createTransformation_outputFilePath_ValueAdapter();
			}
			@Override
			public Adapter caseTransformation_outputModel_Dimension(Transformation_outputModel_Dimension object) {
				return createTransformation_outputModel_DimensionAdapter();
			}
			@Override
			public Adapter caseTransformation_outputModel_Value(Transformation_outputModel_Value object) {
				return createTransformation_outputModel_ValueAdapter();
			}
			@Override
			public <ValueSubType extends Value<?>> Adapter caseDimension(Dimension<ValueSubType> object) {
				return createDimensionAdapter();
			}
			@Override
			public <StateSubType extends State<?, ?>> Adapter caseValue(Value<StateSubType> object) {
				return createValueAdapter();
			}
			@Override
			public <StepSubType extends Step<?>, ValueSubType extends Value<?>> Adapter caseState(State<StepSubType, ValueSubType> object) {
				return createStateAdapter();
			}
			@Override
			public <DimensionSubType extends Dimension<?>> Adapter caseTracedObject(TracedObject<DimensionSubType> object) {
				return createTracedObjectAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.ObjectTemplate_currentObject_Dimension <em>Object Template current Object Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.ObjectTemplate_currentObject_Dimension
	 * @generated
	 */
	public Adapter createObjectTemplate_currentObject_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.ObjectTemplate_currentObject_Value <em>Object Template current Object Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.ObjectTemplate_currentObject_Value
	 * @generated
	 */
	public Adapter createObjectTemplate_currentObject_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.SpecificAttributeValue <em>Specific Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.SpecificAttributeValue
	 * @generated
	 */
	public Adapter createSpecificAttributeValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.SpecificDimension <em>Specific Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.SpecificDimension
	 * @generated
	 */
	public Adapter createSpecificDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.SpecificReferenceValue <em>Specific Reference Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.SpecificReferenceValue
	 * @generated
	 */
	public Adapter createSpecificReferenceValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.SpecificState <em>Specific State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.SpecificState
	 * @generated
	 */
	public Adapter createSpecificStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.SpecificTracedObject <em>Specific Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.SpecificTracedObject
	 * @generated
	 */
	public Adapter createSpecificTracedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.SpecificValue <em>Specific Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.SpecificValue
	 * @generated
	 */
	public Adapter createSpecificValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.Transformation_inputModelURI_Dimension <em>Transformation input Model URI Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.Transformation_inputModelURI_Dimension
	 * @generated
	 */
	public Adapter createTransformation_inputModelURI_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.Transformation_inputModelURI_Value <em>Transformation input Model URI Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.Transformation_inputModelURI_Value
	 * @generated
	 */
	public Adapter createTransformation_inputModelURI_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.Transformation_inputModel_Dimension <em>Transformation input Model Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.Transformation_inputModel_Dimension
	 * @generated
	 */
	public Adapter createTransformation_inputModel_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.Transformation_inputModel_Value <em>Transformation input Model Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.Transformation_inputModel_Value
	 * @generated
	 */
	public Adapter createTransformation_inputModel_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.Transformation_outputFilePath_Dimension <em>Transformation output File Path Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.Transformation_outputFilePath_Dimension
	 * @generated
	 */
	public Adapter createTransformation_outputFilePath_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.Transformation_outputFilePath_Value <em>Transformation output File Path Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.Transformation_outputFilePath_Value
	 * @generated
	 */
	public Adapter createTransformation_outputFilePath_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.Transformation_outputModel_Dimension <em>Transformation output Model Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.Transformation_outputModel_Dimension
	 * @generated
	 */
	public Adapter createTransformation_outputModel_DimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.Transformation_outputModel_Value <em>Transformation output Model Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.Transformation_outputModel_Value
	 * @generated
	 */
	public Adapter createTransformation_outputModel_ValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.Dimension
	 * @generated
	 */
	public Adapter createDimensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.TracedObject <em>Traced Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.TracedObject
	 * @generated
	 */
	public Adapter createTracedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StatesAdapterFactory
