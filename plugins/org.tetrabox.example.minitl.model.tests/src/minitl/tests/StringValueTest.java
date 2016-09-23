/**
 */
package minitl.tests;

import junit.textui.TestRunner;

import minitl.MinitlFactory;
import minitl.StringValue;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringValueTest extends ValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringValueTest.class);
	}

	/**
	 * Constructs a new String Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this String Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected StringValue getFixture() {
		return (StringValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinitlFactory.eINSTANCE.createStringValue());
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

} //StringValueTest
