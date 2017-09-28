/**
 */
package minitlTrace;

import minitlTrace.States.SpecificDimension;
import minitlTrace.States.SpecificState;
import minitlTrace.States.SpecificTracedObject;
import minitlTrace.States.SpecificValue;

import minitlTrace.Steps.Minitl_Binding_Assign;
import minitlTrace.Steps.Minitl_Binding_Check;
import minitlTrace.Steps.Minitl_ObjectTemplate_Construct;
import minitlTrace.Steps.Minitl_ObjectTemplate_Match;
import minitlTrace.Steps.Minitl_Rule_Apply;
import minitlTrace.Steps.Minitl_Transformation_Execute;
import minitlTrace.Steps.Minitl_Transformation_Initialize;
import minitlTrace.Steps.SpecificStep;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gemoc.trace.commons.model.trace.SequentialStep;
import org.eclipse.gemoc.trace.commons.model.trace.Trace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.SpecificTrace#getMinitl_Binding_Assign_Sequence <em>Minitl Binding Assign Sequence</em>}</li>
 *   <li>{@link minitlTrace.SpecificTrace#getMinitl_Binding_Check_Sequence <em>Minitl Binding Check Sequence</em>}</li>
 *   <li>{@link minitlTrace.SpecificTrace#getMinitl_ObjectTemplate_Construct_Sequence <em>Minitl Object Template Construct Sequence</em>}</li>
 *   <li>{@link minitlTrace.SpecificTrace#getMinitl_ObjectTemplate_Match_Sequence <em>Minitl Object Template Match Sequence</em>}</li>
 *   <li>{@link minitlTrace.SpecificTrace#getMinitl_Rule_Apply_Sequence <em>Minitl Rule Apply Sequence</em>}</li>
 *   <li>{@link minitlTrace.SpecificTrace#getMinitl_Transformation_Execute_Sequence <em>Minitl Transformation Execute Sequence</em>}</li>
 *   <li>{@link minitlTrace.SpecificTrace#getMinitl_Transformation_Initialize_Sequence <em>Minitl Transformation Initialize Sequence</em>}</li>
 * </ul>
 *
 * @see minitlTrace.MinitlTracePackage#getSpecificTrace()
 * @model
 * @generated
 */
public interface SpecificTrace extends Trace<SequentialStep<? extends SpecificStep, ? extends SpecificState>, SpecificTracedObject<? extends SpecificDimension<? extends SpecificValue>>, SpecificState> {
	/**
	 * Returns the value of the '<em><b>Minitl Binding Assign Sequence</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.Steps.Minitl_Binding_Assign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minitl Binding Assign Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minitl Binding Assign Sequence</em>' reference list.
	 * @see minitlTrace.MinitlTracePackage#getSpecificTrace_Minitl_Binding_Assign_Sequence()
	 * @model
	 * @generated
	 */
	EList<Minitl_Binding_Assign> getMinitl_Binding_Assign_Sequence();

	/**
	 * Returns the value of the '<em><b>Minitl Binding Check Sequence</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.Steps.Minitl_Binding_Check}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minitl Binding Check Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minitl Binding Check Sequence</em>' reference list.
	 * @see minitlTrace.MinitlTracePackage#getSpecificTrace_Minitl_Binding_Check_Sequence()
	 * @model
	 * @generated
	 */
	EList<Minitl_Binding_Check> getMinitl_Binding_Check_Sequence();

	/**
	 * Returns the value of the '<em><b>Minitl Object Template Construct Sequence</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.Steps.Minitl_ObjectTemplate_Construct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minitl Object Template Construct Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minitl Object Template Construct Sequence</em>' reference list.
	 * @see minitlTrace.MinitlTracePackage#getSpecificTrace_Minitl_ObjectTemplate_Construct_Sequence()
	 * @model
	 * @generated
	 */
	EList<Minitl_ObjectTemplate_Construct> getMinitl_ObjectTemplate_Construct_Sequence();

	/**
	 * Returns the value of the '<em><b>Minitl Object Template Match Sequence</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.Steps.Minitl_ObjectTemplate_Match}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minitl Object Template Match Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minitl Object Template Match Sequence</em>' reference list.
	 * @see minitlTrace.MinitlTracePackage#getSpecificTrace_Minitl_ObjectTemplate_Match_Sequence()
	 * @model
	 * @generated
	 */
	EList<Minitl_ObjectTemplate_Match> getMinitl_ObjectTemplate_Match_Sequence();

	/**
	 * Returns the value of the '<em><b>Minitl Rule Apply Sequence</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.Steps.Minitl_Rule_Apply}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minitl Rule Apply Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minitl Rule Apply Sequence</em>' reference list.
	 * @see minitlTrace.MinitlTracePackage#getSpecificTrace_Minitl_Rule_Apply_Sequence()
	 * @model
	 * @generated
	 */
	EList<Minitl_Rule_Apply> getMinitl_Rule_Apply_Sequence();

	/**
	 * Returns the value of the '<em><b>Minitl Transformation Execute Sequence</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.Steps.Minitl_Transformation_Execute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minitl Transformation Execute Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minitl Transformation Execute Sequence</em>' reference list.
	 * @see minitlTrace.MinitlTracePackage#getSpecificTrace_Minitl_Transformation_Execute_Sequence()
	 * @model
	 * @generated
	 */
	EList<Minitl_Transformation_Execute> getMinitl_Transformation_Execute_Sequence();

	/**
	 * Returns the value of the '<em><b>Minitl Transformation Initialize Sequence</b></em>' reference list.
	 * The list contents are of type {@link minitlTrace.Steps.Minitl_Transformation_Initialize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minitl Transformation Initialize Sequence</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minitl Transformation Initialize Sequence</em>' reference list.
	 * @see minitlTrace.MinitlTracePackage#getSpecificTrace_Minitl_Transformation_Initialize_Sequence()
	 * @model
	 * @generated
	 */
	EList<Minitl_Transformation_Initialize> getMinitl_Transformation_Initialize_Sequence();

} // SpecificTrace
