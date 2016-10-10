
package org.tetrabox.example.minitl.trace.tracemanager;

import java.util.List;
import fr.inria.diverse.trace.gemoc.api.IStepFactory;

public class MinitlTraceStepFactory implements IStepFactory {

	@Override
	public fr.inria.diverse.trace.commons.model.trace.Step createStep(
			fr.inria.diverse.trace.commons.model.trace.MSE mse, List<Object> parameters, List<Object> result) {

		fr.inria.diverse.trace.commons.model.trace.Step step = null;
		org.eclipse.emf.ecore.EClass ec = mse.getCaller().eClass();
		String stepRule = fr.inria.diverse.trace.commons.EcoreCraftingUtil.getFQN(ec, ".") + "."
				+ mse.getAction().getName();

		if (mse.getAction().getName().equalsIgnoreCase("assign")
				&& (ec.getClassifierID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE.getBinding()
						.getClassifierID()))

		{
			step = minitlTrace.Steps.StepsFactory.eINSTANCE.createMinitl_Binding_Assign();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("check")
				&& (ec.getClassifierID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE.getBinding()
						.getClassifierID()))

		{
			step = minitlTrace.Steps.StepsFactory.eINSTANCE.createMinitl_Binding_Check();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("construct")
				&& (ec.getClassifierID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE
						.getObjectTemplate().getClassifierID()))

		{
			step = minitlTrace.Steps.StepsFactory.eINSTANCE.createMinitl_ObjectTemplate_Construct();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("match")
				&& (ec.getClassifierID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE
						.getObjectTemplate().getClassifierID()))

		{
			step = minitlTrace.Steps.StepsFactory.eINSTANCE.createMinitl_ObjectTemplate_Match();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("apply")
				&& (ec.getClassifierID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE.getRule()
						.getClassifierID()))

		{
			step = minitlTrace.Steps.StepsFactory.eINSTANCE.createMinitl_Rule_Apply();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("execute")
				&& (ec.getClassifierID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE
						.getTransformation().getClassifierID()))

		{
			step = minitlTrace.Steps.StepsFactory.eINSTANCE.createMinitl_Transformation_Execute();
		} else

		if (mse.getAction().getName().equalsIgnoreCase("initialize")
				&& (ec.getClassifierID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE
						.getTransformation().getClassifierID()))

		{
			step = minitlTrace.Steps.StepsFactory.eINSTANCE.createMinitl_Transformation_Initialize();
		}

		else {
			step = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createGenericSequentialStep();
		}

		fr.inria.diverse.trace.commons.model.trace.MSEOccurrence mseocc = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createMSEOccurrence();
		mseocc.setMse(mse);
		mseocc.getParameters().addAll(parameters);
		mseocc.getResult().addAll(result);
		step.setMseoccurrence(mseocc);

		return step;
	}
}
