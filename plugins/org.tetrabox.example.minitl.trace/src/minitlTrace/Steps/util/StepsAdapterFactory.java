/**
 */
package minitlTrace.Steps.util;

import minitlTrace.Steps.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gemoc.trace.commons.model.trace.BigStep;
import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.SmallStep;
import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.commons.model.trace.Step;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see minitlTrace.Steps.StepsPackage
 * @generated
 */
public class StepsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StepsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StepsPackage.eINSTANCE;
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
	protected StepsSwitch<Adapter> modelSwitch =
		new StepsSwitch<Adapter>() {
			@Override
			public Adapter caseMinitl_Binding_Assign(Minitl_Binding_Assign object) {
				return createMinitl_Binding_AssignAdapter();
			}
			@Override
			public Adapter caseMinitl_Binding_Check(Minitl_Binding_Check object) {
				return createMinitl_Binding_CheckAdapter();
			}
			@Override
			public Adapter caseMinitl_ObjectTemplate_Construct(Minitl_ObjectTemplate_Construct object) {
				return createMinitl_ObjectTemplate_ConstructAdapter();
			}
			@Override
			public Adapter caseMinitl_ObjectTemplate_Construct_AbstractSubStep(Minitl_ObjectTemplate_Construct_AbstractSubStep object) {
				return createMinitl_ObjectTemplate_Construct_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseMinitl_ObjectTemplate_Construct_ImplicitStep(Minitl_ObjectTemplate_Construct_ImplicitStep object) {
				return createMinitl_ObjectTemplate_Construct_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseMinitl_ObjectTemplate_Match(Minitl_ObjectTemplate_Match object) {
				return createMinitl_ObjectTemplate_MatchAdapter();
			}
			@Override
			public Adapter caseMinitl_ObjectTemplate_Match_AbstractSubStep(Minitl_ObjectTemplate_Match_AbstractSubStep object) {
				return createMinitl_ObjectTemplate_Match_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseMinitl_ObjectTemplate_Match_ImplicitStep(Minitl_ObjectTemplate_Match_ImplicitStep object) {
				return createMinitl_ObjectTemplate_Match_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseMinitl_Rule_Apply(Minitl_Rule_Apply object) {
				return createMinitl_Rule_ApplyAdapter();
			}
			@Override
			public Adapter caseMinitl_Rule_Apply_AbstractSubStep(Minitl_Rule_Apply_AbstractSubStep object) {
				return createMinitl_Rule_Apply_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseMinitl_Rule_Apply_ImplicitStep(Minitl_Rule_Apply_ImplicitStep object) {
				return createMinitl_Rule_Apply_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseMinitl_Transformation_Execute(Minitl_Transformation_Execute object) {
				return createMinitl_Transformation_ExecuteAdapter();
			}
			@Override
			public Adapter caseMinitl_Transformation_Execute_AbstractSubStep(Minitl_Transformation_Execute_AbstractSubStep object) {
				return createMinitl_Transformation_Execute_AbstractSubStepAdapter();
			}
			@Override
			public Adapter caseMinitl_Transformation_Execute_ImplicitStep(Minitl_Transformation_Execute_ImplicitStep object) {
				return createMinitl_Transformation_Execute_ImplicitStepAdapter();
			}
			@Override
			public Adapter caseMinitl_Transformation_Initialize(Minitl_Transformation_Initialize object) {
				return createMinitl_Transformation_InitializeAdapter();
			}
			@Override
			public Adapter caseRootImplicitStep(RootImplicitStep object) {
				return createRootImplicitStepAdapter();
			}
			@Override
			public Adapter caseSpecificRootStep(SpecificRootStep object) {
				return createSpecificRootStepAdapter();
			}
			@Override
			public Adapter caseSpecificStep(SpecificStep object) {
				return createSpecificStepAdapter();
			}
			@Override
			public <StateSubType extends State<?, ?>> Adapter caseStep(Step<StateSubType> object) {
				return createStepAdapter();
			}
			@Override
			public <StateSubType extends State<?, ?>> Adapter caseSmallStep(SmallStep<StateSubType> object) {
				return createSmallStepAdapter();
			}
			@Override
			public <StepSubtype extends Step<StateSubType>, StateSubType extends State<?, ?>> Adapter caseBigStep(BigStep<StepSubtype, StateSubType> object) {
				return createBigStepAdapter();
			}
			@Override
			public <StepSubtype extends Step<StateSubType>, StateSubType extends State<?, ?>> Adapter caseSequentialStep(SequentialStep<StepSubtype, StateSubType> object) {
				return createSequentialStepAdapter();
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
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_Binding_Assign <em>Minitl Binding Assign</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_Binding_Assign
	 * @generated
	 */
	public Adapter createMinitl_Binding_AssignAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_Binding_Check <em>Minitl Binding Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_Binding_Check
	 * @generated
	 */
	public Adapter createMinitl_Binding_CheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Construct <em>Minitl Object Template Construct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Construct
	 * @generated
	 */
	public Adapter createMinitl_ObjectTemplate_ConstructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Construct_AbstractSubStep <em>Minitl Object Template Construct Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Construct_AbstractSubStep
	 * @generated
	 */
	public Adapter createMinitl_ObjectTemplate_Construct_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Construct_ImplicitStep <em>Minitl Object Template Construct Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Construct_ImplicitStep
	 * @generated
	 */
	public Adapter createMinitl_ObjectTemplate_Construct_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Match <em>Minitl Object Template Match</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Match
	 * @generated
	 */
	public Adapter createMinitl_ObjectTemplate_MatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Match_AbstractSubStep <em>Minitl Object Template Match Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Match_AbstractSubStep
	 * @generated
	 */
	public Adapter createMinitl_ObjectTemplate_Match_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_ObjectTemplate_Match_ImplicitStep <em>Minitl Object Template Match Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_ObjectTemplate_Match_ImplicitStep
	 * @generated
	 */
	public Adapter createMinitl_ObjectTemplate_Match_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_Rule_Apply <em>Minitl Rule Apply</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_Rule_Apply
	 * @generated
	 */
	public Adapter createMinitl_Rule_ApplyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_Rule_Apply_AbstractSubStep <em>Minitl Rule Apply Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_Rule_Apply_AbstractSubStep
	 * @generated
	 */
	public Adapter createMinitl_Rule_Apply_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_Rule_Apply_ImplicitStep <em>Minitl Rule Apply Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_Rule_Apply_ImplicitStep
	 * @generated
	 */
	public Adapter createMinitl_Rule_Apply_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_Transformation_Execute <em>Minitl Transformation Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_Transformation_Execute
	 * @generated
	 */
	public Adapter createMinitl_Transformation_ExecuteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_Transformation_Execute_AbstractSubStep <em>Minitl Transformation Execute Abstract Sub Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_Transformation_Execute_AbstractSubStep
	 * @generated
	 */
	public Adapter createMinitl_Transformation_Execute_AbstractSubStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_Transformation_Execute_ImplicitStep <em>Minitl Transformation Execute Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_Transformation_Execute_ImplicitStep
	 * @generated
	 */
	public Adapter createMinitl_Transformation_Execute_ImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.Minitl_Transformation_Initialize <em>Minitl Transformation Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.Minitl_Transformation_Initialize
	 * @generated
	 */
	public Adapter createMinitl_Transformation_InitializeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.RootImplicitStep <em>Root Implicit Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.RootImplicitStep
	 * @generated
	 */
	public Adapter createRootImplicitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.SpecificRootStep <em>Specific Root Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.SpecificRootStep
	 * @generated
	 */
	public Adapter createSpecificRootStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.Steps.SpecificStep <em>Specific Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.Steps.SpecificStep
	 * @generated
	 */
	public Adapter createSpecificStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.Step
	 * @generated
	 */
	public Adapter createStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.SmallStep <em>Small Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.SmallStep
	 * @generated
	 */
	public Adapter createSmallStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.BigStep <em>Big Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.BigStep
	 * @generated
	 */
	public Adapter createBigStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gemoc.trace.commons.model.trace.SequentialStep <em>Sequential Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gemoc.trace.commons.model.trace.SequentialStep
	 * @generated
	 */
	public Adapter createSequentialStepAdapter() {
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

} //StepsAdapterFactory
