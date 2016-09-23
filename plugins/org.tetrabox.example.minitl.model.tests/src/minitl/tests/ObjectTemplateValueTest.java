/**
 */
package minitl.tests;

import junit.textui.TestRunner;

import minitl.MinitlFactory;
import minitl.ObjectTemplateValue;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Template Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectTemplateValueTest extends ValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectTemplateValueTest.class);
	}

	/**
	 * Constructs a new Object Template Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTemplateValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Template Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObjectTemplateValue getFixture() {
		return (ObjectTemplateValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinitlFactory.eINSTANCE.createObjectTemplateValue());
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

} //ObjectTemplateValueTest
