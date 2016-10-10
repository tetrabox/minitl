package org.tetrabox.example.minitl.trace.tracemanager;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.gemoc.api.IStepFactory;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceExtractor;
import fr.inria.diverse.trace.gemoc.traceaddon.AbstractTraceAddon;

public class MinitlTraceEngineAddon extends AbstractTraceAddon {

	private MinitlTraceStepFactory factory = null;

	@Override
	public ITraceConstructor constructTraceConstructor(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> exeToTraced) {
		return new MinitlTraceConstructor(modelResource, traceResource, exeToTraced);
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource traceResource) {
		MinitlTraceExplorer explorer = new MinitlTraceExplorer();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof minitlTrace.SpecificTrace) {
			explorer.loadTrace((minitlTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExplorer constructTraceExplorer(Resource modelResource, Resource traceResource,
			Map<EObject, EObject> tracedToExe) {
		MinitlTraceExplorer explorer = new MinitlTraceExplorer(tracedToExe);
		EObject root = traceResource.getContents().get(0);
		if (root instanceof minitlTrace.SpecificTrace) {
			explorer.loadTrace(modelResource, (minitlTrace.SpecificTrace) root);
			return explorer;
		}
		return null;
	}

	@Override
	public ITraceExtractor constructTraceExtractor(Resource traceResource) {
		MinitlTraceExtractor extractor = new MinitlTraceExtractor();
		EObject root = traceResource.getContents().get(0);
		if (root instanceof minitlTrace.SpecificTrace) {
			extractor.loadTrace((minitlTrace.SpecificTrace) root);
			return extractor;
		}
		return null;
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