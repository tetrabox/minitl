/**
 */
package minitlTrace.impl;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;

import fr.inria.diverse.trace.commons.model.trace.impl.TraceImpl;

import java.util.Collection;

import minitlTrace.MinitlTracePackage;
import minitlTrace.SpecificTrace;

import minitlTrace.States.State;

import minitlTrace.States.minitl.TracedObjectTemplate;
import minitlTrace.States.minitl.TracedRule;
import minitlTrace.States.minitl.TracedTransformation;

import minitlTrace.Steps.Minitl_Binding_Assign;
import minitlTrace.Steps.Minitl_Binding_Check;
import minitlTrace.Steps.Minitl_ObjectTemplate_Construct;
import minitlTrace.Steps.Minitl_ObjectTemplate_Match;
import minitlTrace.Steps.Minitl_Rule_Apply;
import minitlTrace.Steps.Minitl_Transformation_Execute;
import minitlTrace.Steps.Minitl_Transformation_Initialize;
import minitlTrace.Steps.SpecificStep;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getMinitl_Binding_Assign_Sequence <em>Minitl Binding Assign Sequence</em>}</li>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getMinitl_Binding_Check_Sequence <em>Minitl Binding Check Sequence</em>}</li>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getMinitl_ObjectTemplate_Construct_Sequence <em>Minitl Object Template Construct Sequence</em>}</li>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getMinitl_ObjectTemplate_Match_Sequence <em>Minitl Object Template Match Sequence</em>}</li>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getMinitl_Rule_Apply_Sequence <em>Minitl Rule Apply Sequence</em>}</li>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getMinitl_Transformation_Execute_Sequence <em>Minitl Transformation Execute Sequence</em>}</li>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getMinitl_Transformation_Initialize_Sequence <em>Minitl Transformation Initialize Sequence</em>}</li>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getMinitl_tracedObjectTemplates <em>Minitl traced Object Templates</em>}</li>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getMinitl_tracedRules <em>Minitl traced Rules</em>}</li>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getMinitl_tracedTransformations <em>Minitl traced Transformations</em>}</li>
 *   <li>{@link minitlTrace.impl.SpecificTraceImpl#getStatesTrace <em>States Trace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificTraceImpl extends TraceImpl<SequentialStep<SpecificStep>> implements SpecificTrace {
	/**
	 * The cached value of the '{@link #getMinitl_Binding_Assign_Sequence() <em>Minitl Binding Assign Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinitl_Binding_Assign_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Minitl_Binding_Assign> minitl_Binding_Assign_Sequence;

	/**
	 * The cached value of the '{@link #getMinitl_Binding_Check_Sequence() <em>Minitl Binding Check Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinitl_Binding_Check_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Minitl_Binding_Check> minitl_Binding_Check_Sequence;

	/**
	 * The cached value of the '{@link #getMinitl_ObjectTemplate_Construct_Sequence() <em>Minitl Object Template Construct Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinitl_ObjectTemplate_Construct_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Minitl_ObjectTemplate_Construct> minitl_ObjectTemplate_Construct_Sequence;

	/**
	 * The cached value of the '{@link #getMinitl_ObjectTemplate_Match_Sequence() <em>Minitl Object Template Match Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinitl_ObjectTemplate_Match_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Minitl_ObjectTemplate_Match> minitl_ObjectTemplate_Match_Sequence;

	/**
	 * The cached value of the '{@link #getMinitl_Rule_Apply_Sequence() <em>Minitl Rule Apply Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinitl_Rule_Apply_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Minitl_Rule_Apply> minitl_Rule_Apply_Sequence;

	/**
	 * The cached value of the '{@link #getMinitl_Transformation_Execute_Sequence() <em>Minitl Transformation Execute Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinitl_Transformation_Execute_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Minitl_Transformation_Execute> minitl_Transformation_Execute_Sequence;

	/**
	 * The cached value of the '{@link #getMinitl_Transformation_Initialize_Sequence() <em>Minitl Transformation Initialize Sequence</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinitl_Transformation_Initialize_Sequence()
	 * @generated
	 * @ordered
	 */
	protected EList<Minitl_Transformation_Initialize> minitl_Transformation_Initialize_Sequence;

	/**
	 * The cached value of the '{@link #getMinitl_tracedObjectTemplates() <em>Minitl traced Object Templates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinitl_tracedObjectTemplates()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedObjectTemplate> minitl_tracedObjectTemplates;

	/**
	 * The cached value of the '{@link #getMinitl_tracedRules() <em>Minitl traced Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinitl_tracedRules()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedRule> minitl_tracedRules;

	/**
	 * The cached value of the '{@link #getMinitl_tracedTransformations() <em>Minitl traced Transformations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinitl_tracedTransformations()
	 * @generated
	 * @ordered
	 */
	protected EList<TracedTransformation> minitl_tracedTransformations;

	/**
	 * The cached value of the '{@link #getStatesTrace() <em>States Trace</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatesTrace()
	 * @generated
	 * @ordered
	 */
	protected EList<State> statesTrace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificTraceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MinitlTracePackage.Literals.SPECIFIC_TRACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetRootStep(SequentialStep<SpecificStep> newRootStep, NotificationChain msgs) {
		return super.basicSetRootStep(newRootStep, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Minitl_Binding_Assign> getMinitl_Binding_Assign_Sequence() {
		if (minitl_Binding_Assign_Sequence == null) {
			minitl_Binding_Assign_Sequence = new EObjectResolvingEList<Minitl_Binding_Assign>(Minitl_Binding_Assign.class, this, MinitlTracePackage.SPECIFIC_TRACE__MINITL_BINDING_ASSIGN_SEQUENCE);
		}
		return minitl_Binding_Assign_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Minitl_Binding_Check> getMinitl_Binding_Check_Sequence() {
		if (minitl_Binding_Check_Sequence == null) {
			minitl_Binding_Check_Sequence = new EObjectResolvingEList<Minitl_Binding_Check>(Minitl_Binding_Check.class, this, MinitlTracePackage.SPECIFIC_TRACE__MINITL_BINDING_CHECK_SEQUENCE);
		}
		return minitl_Binding_Check_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Minitl_ObjectTemplate_Construct> getMinitl_ObjectTemplate_Construct_Sequence() {
		if (minitl_ObjectTemplate_Construct_Sequence == null) {
			minitl_ObjectTemplate_Construct_Sequence = new EObjectResolvingEList<Minitl_ObjectTemplate_Construct>(Minitl_ObjectTemplate_Construct.class, this, MinitlTracePackage.SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_CONSTRUCT_SEQUENCE);
		}
		return minitl_ObjectTemplate_Construct_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Minitl_ObjectTemplate_Match> getMinitl_ObjectTemplate_Match_Sequence() {
		if (minitl_ObjectTemplate_Match_Sequence == null) {
			minitl_ObjectTemplate_Match_Sequence = new EObjectResolvingEList<Minitl_ObjectTemplate_Match>(Minitl_ObjectTemplate_Match.class, this, MinitlTracePackage.SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_MATCH_SEQUENCE);
		}
		return minitl_ObjectTemplate_Match_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Minitl_Rule_Apply> getMinitl_Rule_Apply_Sequence() {
		if (minitl_Rule_Apply_Sequence == null) {
			minitl_Rule_Apply_Sequence = new EObjectResolvingEList<Minitl_Rule_Apply>(Minitl_Rule_Apply.class, this, MinitlTracePackage.SPECIFIC_TRACE__MINITL_RULE_APPLY_SEQUENCE);
		}
		return minitl_Rule_Apply_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Minitl_Transformation_Execute> getMinitl_Transformation_Execute_Sequence() {
		if (minitl_Transformation_Execute_Sequence == null) {
			minitl_Transformation_Execute_Sequence = new EObjectResolvingEList<Minitl_Transformation_Execute>(Minitl_Transformation_Execute.class, this, MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRANSFORMATION_EXECUTE_SEQUENCE);
		}
		return minitl_Transformation_Execute_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Minitl_Transformation_Initialize> getMinitl_Transformation_Initialize_Sequence() {
		if (minitl_Transformation_Initialize_Sequence == null) {
			minitl_Transformation_Initialize_Sequence = new EObjectResolvingEList<Minitl_Transformation_Initialize>(Minitl_Transformation_Initialize.class, this, MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRANSFORMATION_INITIALIZE_SEQUENCE);
		}
		return minitl_Transformation_Initialize_Sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedObjectTemplate> getMinitl_tracedObjectTemplates() {
		if (minitl_tracedObjectTemplates == null) {
			minitl_tracedObjectTemplates = new EObjectContainmentEList<TracedObjectTemplate>(TracedObjectTemplate.class, this, MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_OBJECT_TEMPLATES);
		}
		return minitl_tracedObjectTemplates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedRule> getMinitl_tracedRules() {
		if (minitl_tracedRules == null) {
			minitl_tracedRules = new EObjectContainmentEList<TracedRule>(TracedRule.class, this, MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_RULES);
		}
		return minitl_tracedRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracedTransformation> getMinitl_tracedTransformations() {
		if (minitl_tracedTransformations == null) {
			minitl_tracedTransformations = new EObjectContainmentEList<TracedTransformation>(TracedTransformation.class, this, MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_TRANSFORMATIONS);
		}
		return minitl_tracedTransformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStatesTrace() {
		if (statesTrace == null) {
			statesTrace = new EObjectContainmentEList<State>(State.class, this, MinitlTracePackage.SPECIFIC_TRACE__STATES_TRACE);
		}
		return statesTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_OBJECT_TEMPLATES:
				return ((InternalEList<?>)getMinitl_tracedObjectTemplates()).basicRemove(otherEnd, msgs);
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_RULES:
				return ((InternalEList<?>)getMinitl_tracedRules()).basicRemove(otherEnd, msgs);
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_TRANSFORMATIONS:
				return ((InternalEList<?>)getMinitl_tracedTransformations()).basicRemove(otherEnd, msgs);
			case MinitlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return ((InternalEList<?>)getStatesTrace()).basicRemove(otherEnd, msgs);
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
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_BINDING_ASSIGN_SEQUENCE:
				return getMinitl_Binding_Assign_Sequence();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_BINDING_CHECK_SEQUENCE:
				return getMinitl_Binding_Check_Sequence();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_CONSTRUCT_SEQUENCE:
				return getMinitl_ObjectTemplate_Construct_Sequence();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_MATCH_SEQUENCE:
				return getMinitl_ObjectTemplate_Match_Sequence();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_RULE_APPLY_SEQUENCE:
				return getMinitl_Rule_Apply_Sequence();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRANSFORMATION_EXECUTE_SEQUENCE:
				return getMinitl_Transformation_Execute_Sequence();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRANSFORMATION_INITIALIZE_SEQUENCE:
				return getMinitl_Transformation_Initialize_Sequence();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_OBJECT_TEMPLATES:
				return getMinitl_tracedObjectTemplates();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_RULES:
				return getMinitl_tracedRules();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_TRANSFORMATIONS:
				return getMinitl_tracedTransformations();
			case MinitlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return getStatesTrace();
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
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_BINDING_ASSIGN_SEQUENCE:
				getMinitl_Binding_Assign_Sequence().clear();
				getMinitl_Binding_Assign_Sequence().addAll((Collection<? extends Minitl_Binding_Assign>)newValue);
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_BINDING_CHECK_SEQUENCE:
				getMinitl_Binding_Check_Sequence().clear();
				getMinitl_Binding_Check_Sequence().addAll((Collection<? extends Minitl_Binding_Check>)newValue);
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_CONSTRUCT_SEQUENCE:
				getMinitl_ObjectTemplate_Construct_Sequence().clear();
				getMinitl_ObjectTemplate_Construct_Sequence().addAll((Collection<? extends Minitl_ObjectTemplate_Construct>)newValue);
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_MATCH_SEQUENCE:
				getMinitl_ObjectTemplate_Match_Sequence().clear();
				getMinitl_ObjectTemplate_Match_Sequence().addAll((Collection<? extends Minitl_ObjectTemplate_Match>)newValue);
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_RULE_APPLY_SEQUENCE:
				getMinitl_Rule_Apply_Sequence().clear();
				getMinitl_Rule_Apply_Sequence().addAll((Collection<? extends Minitl_Rule_Apply>)newValue);
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRANSFORMATION_EXECUTE_SEQUENCE:
				getMinitl_Transformation_Execute_Sequence().clear();
				getMinitl_Transformation_Execute_Sequence().addAll((Collection<? extends Minitl_Transformation_Execute>)newValue);
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRANSFORMATION_INITIALIZE_SEQUENCE:
				getMinitl_Transformation_Initialize_Sequence().clear();
				getMinitl_Transformation_Initialize_Sequence().addAll((Collection<? extends Minitl_Transformation_Initialize>)newValue);
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_OBJECT_TEMPLATES:
				getMinitl_tracedObjectTemplates().clear();
				getMinitl_tracedObjectTemplates().addAll((Collection<? extends TracedObjectTemplate>)newValue);
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_RULES:
				getMinitl_tracedRules().clear();
				getMinitl_tracedRules().addAll((Collection<? extends TracedRule>)newValue);
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_TRANSFORMATIONS:
				getMinitl_tracedTransformations().clear();
				getMinitl_tracedTransformations().addAll((Collection<? extends TracedTransformation>)newValue);
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
				getStatesTrace().addAll((Collection<? extends State>)newValue);
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
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_BINDING_ASSIGN_SEQUENCE:
				getMinitl_Binding_Assign_Sequence().clear();
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_BINDING_CHECK_SEQUENCE:
				getMinitl_Binding_Check_Sequence().clear();
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_CONSTRUCT_SEQUENCE:
				getMinitl_ObjectTemplate_Construct_Sequence().clear();
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_MATCH_SEQUENCE:
				getMinitl_ObjectTemplate_Match_Sequence().clear();
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_RULE_APPLY_SEQUENCE:
				getMinitl_Rule_Apply_Sequence().clear();
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRANSFORMATION_EXECUTE_SEQUENCE:
				getMinitl_Transformation_Execute_Sequence().clear();
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRANSFORMATION_INITIALIZE_SEQUENCE:
				getMinitl_Transformation_Initialize_Sequence().clear();
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_OBJECT_TEMPLATES:
				getMinitl_tracedObjectTemplates().clear();
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_RULES:
				getMinitl_tracedRules().clear();
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_TRANSFORMATIONS:
				getMinitl_tracedTransformations().clear();
				return;
			case MinitlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				getStatesTrace().clear();
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
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_BINDING_ASSIGN_SEQUENCE:
				return minitl_Binding_Assign_Sequence != null && !minitl_Binding_Assign_Sequence.isEmpty();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_BINDING_CHECK_SEQUENCE:
				return minitl_Binding_Check_Sequence != null && !minitl_Binding_Check_Sequence.isEmpty();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_CONSTRUCT_SEQUENCE:
				return minitl_ObjectTemplate_Construct_Sequence != null && !minitl_ObjectTemplate_Construct_Sequence.isEmpty();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_OBJECT_TEMPLATE_MATCH_SEQUENCE:
				return minitl_ObjectTemplate_Match_Sequence != null && !minitl_ObjectTemplate_Match_Sequence.isEmpty();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_RULE_APPLY_SEQUENCE:
				return minitl_Rule_Apply_Sequence != null && !minitl_Rule_Apply_Sequence.isEmpty();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRANSFORMATION_EXECUTE_SEQUENCE:
				return minitl_Transformation_Execute_Sequence != null && !minitl_Transformation_Execute_Sequence.isEmpty();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRANSFORMATION_INITIALIZE_SEQUENCE:
				return minitl_Transformation_Initialize_Sequence != null && !minitl_Transformation_Initialize_Sequence.isEmpty();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_OBJECT_TEMPLATES:
				return minitl_tracedObjectTemplates != null && !minitl_tracedObjectTemplates.isEmpty();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_RULES:
				return minitl_tracedRules != null && !minitl_tracedRules.isEmpty();
			case MinitlTracePackage.SPECIFIC_TRACE__MINITL_TRACED_TRANSFORMATIONS:
				return minitl_tracedTransformations != null && !minitl_tracedTransformations.isEmpty();
			case MinitlTracePackage.SPECIFIC_TRACE__STATES_TRACE:
				return statesTrace != null && !statesTrace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecificTraceImpl
