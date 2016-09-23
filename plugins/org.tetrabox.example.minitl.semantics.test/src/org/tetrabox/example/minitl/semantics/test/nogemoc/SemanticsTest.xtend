package org.tetrabox.example.minitl.semantics.test.nogemoc

import minitl.Transformation
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Test

import static org.junit.Assert.assertEquals

import static extension org.tetrabox.example.minitl.semantics.TransformationAspect.*

class SemanticsTest {

	@Test
	def void test() {

		// Loading transformation model
		val URI inputTransformationURI = URI.createPlatformPluginURI(
			"/org.tetrabox.example.minitl.model/examples/smalltransfo.xmi", true)
		val ResourceSet rs = new ResourceSetImpl
		val transfoResource = rs.getResource(inputTransformationURI, true)
		val Transformation transformation = transfoResource.contents.head as Transformation

		// Executing transformation on test input model
		val String inputModelURIString = "platform:/plugin/org.tetrabox.example.minitl.model/examples/input_model.xmi"
		val String outputModelFilePath = "out/output_model.xmi"
		transformation.initialize(#[inputModelURIString, outputModelFilePath])
		transformation.execute

		// Oracle on nb elements
		val int nbOutput = transformation.outputModel.size
		assertEquals(nbOutput, 4)
	}
}
