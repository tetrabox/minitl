package org.tetrabox.example.minitl.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gemoc.executionframework.engine.core.CommandExecution;

import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;
import org.eclipse.gemoc.trace.gemoc.api.IStateManager;

public class MinitlTraceStateManager implements IStateManager<State<?, ?>> {

	private final Resource modelResource;

	private final Map<TracedObject<?>, EObject> tracedToExe;

	public MinitlTraceStateManager(Resource modelResource, Map<TracedObject<?>, EObject> tracedToExe) {
		this.modelResource = modelResource;
		this.tracedToExe = tracedToExe;
	}

	@Override
	public void restoreState(State<?, ?> state) {
		if (modelResource != null && state instanceof minitlTrace.States.SpecificState) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							restoreStateExecute((minitlTrace.States.SpecificState) state);
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private EObject getTracedToExe(EObject tracedObject) {
		return tracedToExe.get(tracedObject);
	}

	private Collection<? extends EObject> getTracedToExe(Collection<? extends EObject> tracedObjects) {
		Collection<EObject> result = new ArrayList<EObject>();
		for (EObject tracedObject : tracedObjects) {
			result.add(tracedToExe.get(tracedObject));
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private void restoreStateExecute(minitlTrace.States.SpecificState state) {
		for (minitlTrace.States.SpecificValue value : state.getValues()) {
			if (value instanceof minitlTrace.States.ObjectTemplate_currentObject_Value) {
				final minitlTrace.States.minitl.TracedObjectTemplate tracedObject = (minitlTrace.States.minitl.TracedObjectTemplate) value
						.eContainer().eContainer();
				org.tetrabox.example.minitl.minitl.ObjectTemplate exeObject = (org.tetrabox.example.minitl.minitl.ObjectTemplate) getTracedToExe(
						tracedObject);
				exeObject.setCurrentObject(
						(org.eclipse.emf.ecore.EObject) ((minitlTrace.States.ObjectTemplate_currentObject_Value) value)
								.getCurrentObject());
			} else if (value instanceof minitlTrace.States.Transformation_inputModel_Value) {
				final minitlTrace.States.minitl.TracedTransformation tracedObject = (minitlTrace.States.minitl.TracedTransformation) value
						.eContainer().eContainer();
				org.tetrabox.example.minitl.minitl.Transformation exeObject = (org.tetrabox.example.minitl.minitl.Transformation) getTracedToExe(
						tracedObject);
				exeObject.getInputModel().clear();
				exeObject.getInputModel()
						.addAll((Collection<? extends org.eclipse.emf.ecore.EObject>) ((minitlTrace.States.Transformation_inputModel_Value) value)
								.getInputModel());
			} else if (value instanceof minitlTrace.States.Transformation_inputModelURI_Value) {
				final minitlTrace.States.minitl.TracedTransformation tracedObject = (minitlTrace.States.minitl.TracedTransformation) value
						.eContainer().eContainer();
				org.tetrabox.example.minitl.minitl.Transformation exeObject = (org.tetrabox.example.minitl.minitl.Transformation) getTracedToExe(
						tracedObject);
				exeObject.setInputModelURI(
						(java.lang.String) ((minitlTrace.States.Transformation_inputModelURI_Value) value)
								.getInputModelURI());
			} else if (value instanceof minitlTrace.States.Transformation_outputFilePath_Value) {
				final minitlTrace.States.minitl.TracedTransformation tracedObject = (minitlTrace.States.minitl.TracedTransformation) value
						.eContainer().eContainer();
				org.tetrabox.example.minitl.minitl.Transformation exeObject = (org.tetrabox.example.minitl.minitl.Transformation) getTracedToExe(
						tracedObject);
				exeObject.setOutputFilePath(
						(java.lang.String) ((minitlTrace.States.Transformation_outputFilePath_Value) value)
								.getOutputFilePath());
			} else if (value instanceof minitlTrace.States.Transformation_outputModel_Value) {
				final minitlTrace.States.minitl.TracedTransformation tracedObject = (minitlTrace.States.minitl.TracedTransformation) value
						.eContainer().eContainer();
				org.tetrabox.example.minitl.minitl.Transformation exeObject = (org.tetrabox.example.minitl.minitl.Transformation) getTracedToExe(
						tracedObject);
				exeObject.getOutputModel().clear();
				exeObject.getOutputModel()
						.addAll((Collection<? extends org.eclipse.emf.ecore.EObject>) ((minitlTrace.States.Transformation_outputModel_Value) value)
								.getOutputModel());
			}
		}
	}
}
