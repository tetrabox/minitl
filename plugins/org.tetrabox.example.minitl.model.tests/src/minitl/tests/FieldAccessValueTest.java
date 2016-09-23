/**
 */
package minitl.tests;

import junit.textui.TestRunner;

import minitl.FieldAccessValue;
import minitl.MinitlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Field Access Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FieldAccessValueTest extends ValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FieldAccessValueTest.class);
	}

	/**
	 * Constructs a new Field Access Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldAccessValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Field Access Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FieldAccessValue getFixture() {
		return (FieldAccessValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinitlFactory.eINSTANCE.createFieldAccessValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //FieldAccessValueTest
