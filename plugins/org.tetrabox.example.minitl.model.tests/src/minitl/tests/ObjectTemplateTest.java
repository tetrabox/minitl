/**
 */
package minitl.tests;

import junit.textui.TestRunner;

import minitl.MinitlFactory;
import minitl.ObjectTemplate;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Object Template</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ObjectTemplateTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectTemplateTest.class);
	}

	/**
	 * Constructs a new Object Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectTemplateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Object Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ObjectTemplate getFixture() {
		return (ObjectTemplate)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinitlFactory.eINSTANCE.createObjectTemplate());
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

} //ObjectTemplateTest
