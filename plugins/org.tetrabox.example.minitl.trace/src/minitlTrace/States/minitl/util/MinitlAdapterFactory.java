/**
 */
package minitlTrace.States.minitl.util;

import minitlTrace.States.SpecificDimension;
import minitlTrace.States.SpecificTracedObject;
import minitlTrace.States.SpecificValue;

import minitlTrace.States.minitl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gemoc.trace.commons.model.trace.Dimension;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see minitlTrace.States.minitl.MinitlPackage
 * @generated
 */
public class MinitlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MinitlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinitlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MinitlPackage.eINSTANCE;
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
	protected MinitlSwitch<Adapter> modelSwitch =
		new MinitlSwitch<Adapter>() {
			@Override
			public Adapter caseTracedNamedElement(TracedNamedElement object) {
				return createTracedNamedElementAdapter();
			}
			@Override
			public Adapter caseTracedObjectTemplate(TracedObjectTemplate object) {
				return createTracedObjectTemplateAdapter();
			}
			@Override
			public Adapter caseTracedRule(TracedRule object) {
				return createTracedRuleAdapter();
			}
			@Override
			public Adapter caseTracedTransformation(TracedTransformation object) {
				return createTracedTransformationAdapter();
			}
			@Override
			public <DimensionSubType extends Dimension<?>> Adapter caseTracedObject(TracedObject<DimensionSubType> object) {
				return createTracedObjectAdapter();
			}
			@Override
			public <DimensionSubType extends SpecificDimension<? extends SpecificValue>> Adapter caseSpecificTracedObject(SpecificTracedObject<DimensionSubType> object) {
				return createSpecificTracedObjectAdapter();
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
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.minitl.TracedNamedElement <em>Traced Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.minitl.TracedNamedElement
	 * @generated
	 */
	public Adapter createTracedNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.minitl.TracedObjectTemplate <em>Traced Object Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.minitl.TracedObjectTemplate
	 * @generated
	 */
	public Adapter createTracedObjectTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.minitl.TracedRule <em>Traced Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.minitl.TracedRule
	 * @generated
	 */
	public Adapter createTracedRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link minitlTrace.States.minitl.TracedTransformation <em>Traced Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see minitlTrace.States.minitl.TracedTransformation
	 * @generated
	 */
	public Adapter createTracedTransformationAdapter() {
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

} //MinitlAdapterFactory
