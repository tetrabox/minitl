package org.tetrabox.example.minitl.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gemoc.trace.commons.model.trace.State;
import org.eclipse.gemoc.trace.gemoc.api.IStateManager;
import org.eclipse.gemoc.trace.gemoc.api.IStepFactory;
import org.eclipse.gemoc.trace.commons.model.trace.TracedObject;
import org.eclipse.gemoc.trace.gemoc.api.ITraceConstructor;
import org.eclipse.gemoc.trace.gemoc.traceaddon.AbstractTraceAddon;

public class MinitlTraceEngineAddon extends AbstractTraceAddon {

	private MinitlTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, TracedObject<?>> exeToTraced) {
		return new MinitlTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public IStateManager<State<?, ?>> constructStateManager(Resource modelResource,
			Map<TracedObject<?>, EObject> tracedToExe) {
		return new MinitlTraceStateManager(modelResource, tracedToExe);
	}

	@Override
	public IStepFactory getFactory() {
		if (factory == null)
			factory = new MinitlTraceStepFactory();
		return factory;
	}

	@Override
	public boolean isAddonForTrace(EObject root) {
		return root instanceof minitlTrace.SpecificTrace;
	}

}