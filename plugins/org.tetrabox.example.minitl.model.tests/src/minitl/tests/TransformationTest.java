/**
 */
package minitl.tests;

import junit.textui.TestRunner;

import minitl.MinitlFactory;
import minitl.Transformation;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransformationTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransformationTest.class);
	}

	/**
	 * Constructs a new Transformation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Transformation getFixture() {
		return (Transformation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinitlFactory.eINSTANCE.createTransformation());
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

} //TransformationTest
