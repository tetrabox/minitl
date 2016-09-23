/**
 */
package minitl.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import minitl.Metamodel;
import minitl.MinitlFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelTest extends TestCase {

	/**
	 * The fixture for this Metamodel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Metamodel fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MetamodelTest.class);
	}

	/**
	 * Constructs a new Metamodel test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Metamodel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Metamodel fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Metamodel test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Metamodel getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MinitlFactory.eINSTANCE.createMetamodel());
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

} //MetamodelTest
