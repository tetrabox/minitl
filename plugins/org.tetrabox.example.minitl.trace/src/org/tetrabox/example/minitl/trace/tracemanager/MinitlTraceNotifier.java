package org.tetrabox.example.minitl.trace.tracemanager;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.BatchModelChangeListener;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange;
import org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NewObjectModelChange;

import fr.inria.diverse.trace.gemoc.api.ITraceListener;
import fr.inria.diverse.trace.gemoc.api.ITraceNotifier;

public class MinitlTraceNotifier implements ITraceNotifier {

	private BatchModelChangeListener traceListener;

	private final List<ITraceListener> listeners = new ArrayList<>();

	public MinitlTraceNotifier(BatchModelChangeListener traceListener) {
		this.traceListener = traceListener;
	}

	@Override
	public void notifyListeners() {
		for (ITraceListener listener : listeners) {
			notifyListener(listener);
		}
	}

	@Override
	public void notifyListener(ITraceListener listener) {
		final List<ModelChange> changes = traceListener.getChanges(listener);
		if (!changes.isEmpty()) {
			final List<EObject> startedSteps = new ArrayList<>();
			final List<EObject> endedSteps = new ArrayList<>();
			final List<EObject> newStates = new ArrayList<>();
			final List<EObject> newValues = new ArrayList<>();
			final List<List<? extends EObject>> newDimensions = new ArrayList<>();
			changes.forEach(c -> {
				if (c instanceof NewObjectModelChange) {
					final EObject o = c.getChangedObject();
					if (o instanceof minitlTrace.States.Value) {
						newValues.add((minitlTrace.States.Value) o);
					} else if (o instanceof minitlTrace.Steps.SpecificStep) {
						startedSteps.add((minitlTrace.Steps.SpecificStep) o);
					} else if (o instanceof minitlTrace.States.State) {
						final minitlTrace.States.State newState = (minitlTrace.States.State) o;
						newStates.add(newState);
						endedSteps.addAll(newState.getEndedSteps());
					} else if (o instanceof minitlTrace.States.minitl.TracedObjectTemplate) {
						newDimensions
								.add(((minitlTrace.States.minitl.TracedObjectTemplate) o).getCurrentObjectSequence());
					} else if (o instanceof minitlTrace.States.minitl.TracedTransformation) {
						newDimensions.add(((minitlTrace.States.minitl.TracedTransformation) o).getInputModelSequence());
						newDimensions
								.add(((minitlTrace.States.minitl.TracedTransformation) o).getInputModelURISequence());
						newDimensions
								.add(((minitlTrace.States.minitl.TracedTransformation) o).getOutputFilePathSequence());
						newDimensions
								.add(((minitlTrace.States.minitl.TracedTransformation) o).getOutputModelSequence());
					}
				}
			});
			listener.valuesAdded(newValues);
			listener.dimensionsAdded(newDimensions);
			listener.statesAdded(newStates);
			listener.stepsStarted(startedSteps);
			listener.stepsEnded(endedSteps);
		}
	}

	@Override
	public void addListener(ITraceListener listener) {
		listeners.add(listener);
		traceListener.registerObserver(listener);
	}

	@Override
	public void removeListener(ITraceListener listener) {
		listeners.remove(listener);
		traceListener.removeObserver(listener);
	}
}
