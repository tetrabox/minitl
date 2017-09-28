/**
 */
package minitlTrace.States.minitl.impl;

import minitlTrace.States.SpecificDimension;

import minitlTrace.States.impl.SpecificTracedObjectImpl;

import minitlTrace.States.minitl.MinitlPackage;
import minitlTrace.States.minitl.TracedNamedElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traced Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class TracedNamedElementImpl extends SpecificTracedObjectImpl<SpecificDimension<?>> implements TracedNamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracedNamedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinitlPackage.Literals.TRACED_NAMED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecificDimension<?>> getDimensionsInternal() {
		final EList<SpecificDimension<?>> result = new org.eclipse.emf.ecore.util.BasicInternalEList<SpecificDimension<?>>(Object.class);
		result.addAll(super.getDimensionsInternal());
		return result;
		
	}

} //TracedNamedElementImpl
