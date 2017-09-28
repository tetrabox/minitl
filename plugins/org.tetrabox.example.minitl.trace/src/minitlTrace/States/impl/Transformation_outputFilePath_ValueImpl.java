/**
 */
package minitlTrace.States.impl;

import minitlTrace.States.StatesPackage;
import minitlTrace.States.Transformation_outputFilePath_Value;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation output File Path Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link minitlTrace.States.impl.Transformation_outputFilePath_ValueImpl#getOutputFilePath <em>Output File Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Transformation_outputFilePath_ValueImpl extends SpecificValueImpl implements Transformation_outputFilePath_Value {
	/**
	 * The default value of the '{@link #getOutputFilePath() <em>Output File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFilePath()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FILE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFilePath() <em>Output File Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFilePath()
	 * @generated
	 * @ordered
	 */
	protected String outputFilePath = OUTPUT_FILE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Transformation_outputFilePath_ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatesPackage.Literals.TRANSFORMATION_OUTPUT_FILE_PATH_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFilePath() {
		return outputFilePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFilePath(String newOutputFilePath) {
		String oldOutputFilePath = outputFilePath;
		outputFilePath = newOutputFilePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatesPackage.TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__OUTPUT_FILE_PATH, oldOutputFilePath, outputFilePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatesPackage.TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__OUTPUT_FILE_PATH:
				return getOutputFilePath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatesPackage.TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__OUTPUT_FILE_PATH:
				setOutputFilePath((String)newValue);
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
			case StatesPackage.TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__OUTPUT_FILE_PATH:
				setOutputFilePath(OUTPUT_FILE_PATH_EDEFAULT);
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
			case StatesPackage.TRANSFORMATION_OUTPUT_FILE_PATH_VALUE__OUTPUT_FILE_PATH:
				return OUTPUT_FILE_PATH_EDEFAULT == null ? outputFilePath != null : !OUTPUT_FILE_PATH_EDEFAULT.equals(outputFilePath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (outputFilePath: ");
		result.append(outputFilePath);
		result.append(')');
		return result.toString();
	}

} //Transformation_outputFilePath_ValueImpl
