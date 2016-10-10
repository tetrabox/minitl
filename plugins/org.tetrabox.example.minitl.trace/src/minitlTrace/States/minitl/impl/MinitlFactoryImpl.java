/**
 */
package minitlTrace.States.minitl.impl;

import minitlTrace.States.minitl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MinitlFactoryImpl extends EFactoryImpl implements MinitlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MinitlFactory init() {
		try {
			MinitlFactory theMinitlFactory = (MinitlFactory)EPackage.Registry.INSTANCE.getEFactory(MinitlPackage.eNS_URI);
			if (theMinitlFactory != null) {
				return theMinitlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MinitlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinitlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MinitlPackage.TRACED_OBJECT_TEMPLATE: return createTracedObjectTemplate();
			case MinitlPackage.TRACED_RULE: return createTracedRule();
			case MinitlPackage.TRACED_TRANSFORMATION: return createTracedTransformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedObjectTemplate createTracedObjectTemplate() {
		TracedObjectTemplateImpl tracedObjectTemplate = new TracedObjectTemplateImpl();
		return tracedObjectTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedRule createTracedRule() {
		TracedRuleImpl tracedRule = new TracedRuleImpl();
		return tracedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracedTransformation createTracedTransformation() {
		TracedTransformationImpl tracedTransformation = new TracedTransformationImpl();
		return tracedTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinitlPackage getMinitlPackage() {
		return (MinitlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MinitlPackage getPackage() {
		return MinitlPackage.eINSTANCE;
	}

} //MinitlFactoryImpl
