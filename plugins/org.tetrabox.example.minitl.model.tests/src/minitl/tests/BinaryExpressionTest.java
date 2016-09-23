/**
 */
package minitl.tests;

import junit.textui.TestRunner;

import minitl.BinaryExpression;
import minitl.MinitlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Binary Expression</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryExpressionTest extends ValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BinaryExpressionTest.class);
	}

	/**
	 * Constructs a new Binary Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Binary Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BinaryExpression getFixture() {
		return (BinaryExpression)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinitlFactory.eINSTANCE.createBinaryExpression());
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

} //BinaryExpressionTest
