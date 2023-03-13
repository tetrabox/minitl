package org.tetrabox.example.minitl.semantics.test.nogemoc

import com.google.inject.Injector
import java.nio.file.Path
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.tetrabox.example.MinitlStandaloneSetup
import org.tetrabox.example.minitl.Transformation

import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertNotNull

import static extension org.tetrabox.example.minitl.semantics.TransformationAspect.*

class SemanticsTest {

	@Test
	def void test() {

		// Loading metamodels and transformation model
		val Injector injector = new MinitlStandaloneSetup().createInjectorAndDoEMFRegistration();	
		val XtextResourceSet rs = injector.getInstance(XtextResourceSet);
		rs.getResource(URI.createPlatformPluginURI("/org.tetrabox.example.minitl.examples/simpleAtoB/metamodelA.ecore", true), true);
		rs.getResource(URI.createPlatformPluginURI("/org.tetrabox.example.minitl.examples/simpleAtoB/metamodelB.ecore", true), true);
		val transfoResource = rs.getResource(URI.createPlatformPluginURI("/org.tetrabox.example.minitl.examples/simpleAtoB/simpleAtoB.minitl", true), true);


		// Extract element from loaded model		
		val Transformation transformation = transfoResource.contents.head as Transformation
		assertNotNull(transformation.inputMetamodel.packages.get(0).name)

		// Executing transformation on test input model
		val String inputModelURIString = URI.createPlatformPluginURI("/org.tetrabox.example.minitl.examples/simpleAtoB/input/modelA.xmi", true).toString
		val String outputModelFilePath = "out/output_model.xmi"
		transformation.initialize(#[inputModelURIString, outputModelFilePath])
		transformation.execute

		// Oracle on nb elements
		val outputModel = transformation.outputModel
		val int nbOutput = outputModel.size
		assertEquals(nbOutput, 2)
	}
}
