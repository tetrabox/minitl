package org.tetrabox.example.minitl.trace.tracemanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.gemoc.executionframework.engine.core.CommandExecution;

import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.commons.model.trace.Step;
import fr.inria.diverse.trace.gemoc.api.ITraceExplorer;
import fr.inria.diverse.trace.gemoc.api.ITraceListener;

public class MinitlTraceExplorer implements ITraceExplorer {
	private minitlTrace.SpecificTrace traceRoot;
	private Resource modelResource;
	private final Map<EObject, EObject> tracedToExe;

	private int lastJumpIndex = -1;
	private minitlTrace.States.State currentState = null;
	final private List<Step> callStack = new ArrayList<>();

	final private List<List<? extends minitlTrace.States.Value>> valueTraces = new ArrayList<>();

	private List<minitlTrace.States.State> statesTrace;

	private minitlTrace.Steps.SpecificStep stepIntoResult;
	private minitlTrace.Steps.SpecificStep stepOverResult;
	private minitlTrace.Steps.SpecificStep stepReturnResult;

	private minitlTrace.Steps.SpecificStep stepBackIntoResult;
	private minitlTrace.Steps.SpecificStep stepBackOverResult;
	private minitlTrace.Steps.SpecificStep stepBackOutResult;

	final private Map<minitlTrace.Steps.SpecificStep, Integer> stepToStartingIndex = new HashMap<>();
	final private Map<minitlTrace.Steps.SpecificStep, Integer> stepToEndingIndex = new HashMap<>();

	private final HashMap<Integer, Boolean> canBackValueCache = new HashMap<>();

	final private List<ITraceListener> listeners = new ArrayList<>();

	public MinitlTraceExplorer(Map<EObject, EObject> tracedToExe) {
		this.tracedToExe = tracedToExe;
	}

	public MinitlTraceExplorer() {
		this.tracedToExe = null;
	}

	private List<List<? extends minitlTrace.States.Value>> getAllValueTraces() {
		final List<List<? extends minitlTrace.States.Value>> result = new ArrayList<>();
		for (minitlTrace.States.minitl.TracedObjectTemplate tracedObject : traceRoot
				.getMinitl_tracedObjectTemplates()) {
			result.add(tracedObject.getCurrentObjectSequence());
		}
		for (minitlTrace.States.minitl.TracedTransformation tracedObject : traceRoot
				.getMinitl_tracedTransformations()) {
			result.add(tracedObject.getInputModelSequence());
			result.add(tracedObject.getInputModelURISequence());
			result.add(tracedObject.getOutputFilePathSequence());
			result.add(tracedObject.getOutputModelSequence());
		}
		return result;
	}

	private minitlTrace.States.Value getActiveValue(List<? extends minitlTrace.States.Value> valueTrace,
			minitlTrace.States.State state) {
		minitlTrace.States.Value result = null;
		for (minitlTrace.States.Value value : valueTrace) {
			if (value.getStatesNoOpposite().contains(state)) {
				result = value;
				break;
			}
		}
		return result;
	}

	private int getPreviousValueIndex(final List<? extends minitlTrace.States.Value> valueTrace) {
		minitlTrace.States.Value value = getActiveValue(valueTrace, currentState);
		if (value != null) {
			return valueTrace.indexOf(value) - 1;
		} else {
			int i = getCurrentStateIndex() - 1;
			while (i > -1 && value == null) {
				value = getActiveValue(valueTrace, statesTrace.get(i));
				i--;
			}
			if (value == null) {
				return -1;
			} else {
				return valueTrace.indexOf(value) - 1;
			}
		}
	}

	private int getNextValueIndex(List<? extends minitlTrace.States.Value> valueTrace) {
		minitlTrace.States.Value value = getActiveValue(valueTrace, currentState);
		if (value != null) {
			final int idx = valueTrace.indexOf(value) + 1;
			if (idx < valueTrace.size()) {
				return idx;
			}
			return -1;
		} else {
			int i = getCurrentStateIndex() + 1;
			final int traceLength = valueTrace.size();
			while (i < traceLength && value == null) {
				value = getActiveValue(valueTrace, statesTrace.get(i));
				i++;
			}
			if (value == null) {
				return -1;
			} else {
				final int idx = valueTrace.indexOf(value) + 1;
				if (idx < valueTrace.size()) {
					return idx;
				}
				return -1;
			}
		}
	}

	private int getStartingIndex(minitlTrace.Steps.SpecificStep step) {
		return stepToStartingIndex.computeIfAbsent(step, s -> {
			return statesTrace.indexOf(s.getStartingState());
		});
	}

	private int getEndingIndex(minitlTrace.Steps.SpecificStep step) {
		if (step.getEndingState() != null) {
			return stepToEndingIndex.computeIfAbsent(step, s -> {
				return statesTrace.indexOf(s.getEndingState());
			});
		}
		return -1;
	}

	@SuppressWarnings("unchecked")
	private minitlTrace.Steps.SpecificStep findNextStep(final List<minitlTrace.Steps.SpecificStep> stepPath,
			final minitlTrace.Steps.SpecificStep previousStep, final int start) {
		final List<minitlTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		minitlTrace.Steps.SpecificStep result = null;
		int i = start;
		int depth = stepPath.size();
		minitlTrace.Steps.SpecificStep previous = previousStep;
		while (result == null && i < depth) {
			final minitlTrace.Steps.SpecificStep currentStep = stepPath.get(depth - i - 1);
			final List<minitlTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
			if (currentStep instanceof SequentialStep<?>) {
				currentSubSteps.addAll(((SequentialStep<minitlTrace.Steps.SpecificStep>) currentStep).getSubSteps());
			}
			if (currentSubSteps.isEmpty()) {
				// No substep to step into, we thus have to explore the substeps
				// of the parent step
				previous = currentStep;
			} else {
				if (previous == null) {
					// First time we step into
					result = currentSubSteps.get(0);
				} else {
					final int idx = currentSubSteps.indexOf(previous) + 1;
					if (idx < currentSubSteps.size()) {
						// We step into the next step
						result = currentSubSteps.get(idx);
					} else {
						previous = currentStep;
					}
				}
			}
			i++;
		}
		if (result == null) {
			final int idx = rootSteps.indexOf(previous) + 1;
			if (idx < rootSteps.size()) {
				result = rootSteps.get(idx);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private minitlTrace.Steps.SpecificStep computeBackInto(List<minitlTrace.Steps.SpecificStep> stepPath) {
		final List<minitlTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		minitlTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final minitlTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final minitlTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<minitlTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) parentStep;
			final List<? extends minitlTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else if (idx > 0) {
				// Otherwise, return the deepest substep in the previous sibling
				// step
				final minitlTrace.Steps.SpecificStep previousSiblingStep = parentSubSteps.get(idx - 1);
				minitlTrace.Steps.SpecificStep tmpStep = previousSiblingStep;
				final List<minitlTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<minitlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<minitlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		} else if (depth == 1) {
			final minitlTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				minitlTrace.Steps.SpecificStep tmpStep = rootSteps.get(idx - 1);
				final List<minitlTrace.Steps.SpecificStep> tmpSubSteps = new ArrayList<>();
				tmpSubSteps.clear();
				if (tmpStep instanceof SequentialStep<?>) {
					SequentialStep<minitlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) tmpStep;
					tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
				}
				while (!tmpSubSteps.isEmpty()) {
					tmpStep = tmpSubSteps.get(tmpSubSteps.size() - 1);
					tmpSubSteps.clear();
					if (tmpStep instanceof SequentialStep<?>) {
						SequentialStep<minitlTrace.Steps.SpecificStep> tmpStep_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) tmpStep;
						tmpSubSteps.addAll(tmpStep_cast.getSubSteps());
					}
				}
				result = tmpStep;
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	private minitlTrace.Steps.SpecificStep computeBackOver(List<minitlTrace.Steps.SpecificStep> stepPath) {
		final List<minitlTrace.Steps.SpecificStep> rootSteps = traceRoot.getRootStep().getSubSteps();
		final int depth = stepPath.size();
		minitlTrace.Steps.SpecificStep result = null;
		if (depth > 1) {
			final minitlTrace.Steps.SpecificStep currentStep = stepPath.get(depth - 1);
			final minitlTrace.Steps.SpecificStep parentStep = stepPath.get(depth - 2);
			final SequentialStep<minitlTrace.Steps.SpecificStep> parentStep_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) parentStep;
			final List<minitlTrace.Steps.SpecificStep> parentSubSteps = parentStep_cast.getSubSteps();
			final int idx = parentSubSteps.indexOf(currentStep);
			if (idx == 0) {
				// If the current step is the first in its parents substeps,
				// return parent step
				result = parentStep;
			} else {
				// Otherwise, return the previous sibling step
				result = parentSubSteps.get(idx - 1);
			}
		} else if (depth == 1) {
			final minitlTrace.Steps.SpecificStep currentStep = stepPath.get(0);
			final int idx = rootSteps.indexOf(currentStep);
			if (idx > 0) {
				result = rootSteps.get(idx - 1);
			}
		}
		return result;
	}

	private minitlTrace.Steps.SpecificStep computeBackOut(List<minitlTrace.Steps.SpecificStep> stepPath) {
		if (stepPath.size() > 1) {
			return stepPath.get(stepPath.size() - 2);
		}
		return null;
	}

	private minitlTrace.Steps.SpecificStep computeStepInto(List<minitlTrace.Steps.SpecificStep> stepPath,
			List<minitlTrace.Steps.SpecificStep> rootSteps) {
		return findNextStep(stepPath, null, 0);
	}

	private minitlTrace.Steps.SpecificStep computeStepOver(List<minitlTrace.Steps.SpecificStep> stepPath,
			List<minitlTrace.Steps.SpecificStep> rootSteps) {
		if (!stepPath.isEmpty()) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 1), 1);
		}
		return null;
	}

	private minitlTrace.Steps.SpecificStep computeStepReturn(List<minitlTrace.Steps.SpecificStep> stepPath,
			List<minitlTrace.Steps.SpecificStep> rootSteps) {
		if (stepPath.size() > 1) {
			return findNextStep(stepPath, stepPath.get(stepPath.size() - 2), 2);
		}
		return null;
	}

	private void computeExplorerState(List<minitlTrace.Steps.SpecificStep> stepPath) {
		final List<minitlTrace.Steps.SpecificStep> rootSteps = getStepsForStates(0, statesTrace.size());

		final List<minitlTrace.Steps.SpecificStep> stepPathUnmodifiable = Collections.unmodifiableList(stepPath);

		stepIntoResult = computeStepInto(stepPathUnmodifiable, rootSteps);
		stepOverResult = computeStepOver(stepPathUnmodifiable, rootSteps);
		stepReturnResult = computeStepReturn(stepPathUnmodifiable, rootSteps);

		stepBackIntoResult = computeBackInto(stepPathUnmodifiable);
		stepBackOverResult = computeBackOver(stepPathUnmodifiable);
		stepBackOutResult = computeBackOut(stepPathUnmodifiable);

		callStack.clear();
		callStack.addAll(stepPathUnmodifiable.stream().map(s -> (Step) s).collect(Collectors.toList()));
	}

	private void goTo(EObject eObject) {
		if (eObject instanceof minitlTrace.States.State) {
			minitlTrace.States.State stateToGo = (minitlTrace.States.State) eObject;
			for (minitlTrace.States.ObjectTemplate_currentObject_Value value : stateToGo
					.getObjectTemplate_currentObject_Values()) {
				if (value.getParent() instanceof minitlTrace.States.minitl.TracedObjectTemplate) {
					minitlTrace.States.minitl.TracedObjectTemplate parent_cast = (minitlTrace.States.minitl.TracedObjectTemplate) value
							.getParent();
					org.eclipse.emf.ecore.EObject toset = value.getCurrentObject();
					org.eclipse.emf.ecore.EObject current = ((org.tetrabox.example.minitl.minitl.ObjectTemplate) parent_cast
							.getOriginalObject()).getCurrentObject();
					if (current != toset) {
						((org.tetrabox.example.minitl.minitl.ObjectTemplate) parent_cast.getOriginalObject())
								.setCurrentObject((org.eclipse.emf.ecore.EObject) toset);
					}
				}
			}
			for (minitlTrace.States.Transformation_inputModel_Value value : stateToGo
					.getTransformation_inputModel_Values()) {
				if (value.getParent() instanceof minitlTrace.States.minitl.TracedTransformation) {
					minitlTrace.States.minitl.TracedTransformation parent_cast = (minitlTrace.States.minitl.TracedTransformation) value
							.getParent();
					org.tetrabox.example.minitl.minitl.Transformation originalObject = (org.tetrabox.example.minitl.minitl.Transformation) parent_cast
							.getOriginalObject();
					originalObject.getInputModel().clear();
					originalObject.getInputModel().addAll(value.getInputModel());
				}
			}
			for (minitlTrace.States.Transformation_inputModelURI_Value value : stateToGo
					.getTransformation_inputModelURI_Values()) {
				if (value.getParent() instanceof minitlTrace.States.minitl.TracedTransformation) {
					minitlTrace.States.minitl.TracedTransformation parent_cast = (minitlTrace.States.minitl.TracedTransformation) value
							.getParent();
					java.lang.String toset = value.getInputModelURI();
					java.lang.String current = ((org.tetrabox.example.minitl.minitl.Transformation) parent_cast
							.getOriginalObject()).getInputModelURI();
					if (current != toset) {
						((org.tetrabox.example.minitl.minitl.Transformation) parent_cast.getOriginalObject())
								.setInputModelURI((java.lang.String) toset);
					}
				}
			}
			for (minitlTrace.States.Transformation_outputFilePath_Value value : stateToGo
					.getTransformation_outputFilePath_Values()) {
				if (value.getParent() instanceof minitlTrace.States.minitl.TracedTransformation) {
					minitlTrace.States.minitl.TracedTransformation parent_cast = (minitlTrace.States.minitl.TracedTransformation) value
							.getParent();
					java.lang.String toset = value.getOutputFilePath();
					java.lang.String current = ((org.tetrabox.example.minitl.minitl.Transformation) parent_cast
							.getOriginalObject()).getOutputFilePath();
					if (current != toset) {
						((org.tetrabox.example.minitl.minitl.Transformation) parent_cast.getOriginalObject())
								.setOutputFilePath((java.lang.String) toset);
					}
				}
			}
			for (minitlTrace.States.Transformation_outputModel_Value value : stateToGo
					.getTransformation_outputModel_Values()) {
				if (value.getParent() instanceof minitlTrace.States.minitl.TracedTransformation) {
					minitlTrace.States.minitl.TracedTransformation parent_cast = (minitlTrace.States.minitl.TracedTransformation) value
							.getParent();
					org.tetrabox.example.minitl.minitl.Transformation originalObject = (org.tetrabox.example.minitl.minitl.Transformation) parent_cast
							.getOriginalObject();
					originalObject.getOutputModel().clear();
					originalObject.getOutputModel().addAll(value.getOutputModel());
				}
			}
		} else if (eObject instanceof minitlTrace.States.Value) {
			goTo(((minitlTrace.States.Value) eObject).getStatesNoOpposite().get(0));
		}
	}

	private void goTo(int stateNumber) {
		if (modelResource != null) {
			try {
				final TransactionalEditingDomain ed = TransactionUtil.getEditingDomain(modelResource);
				if (ed != null) {
					final RecordingCommand command = new RecordingCommand(ed, "") {
						protected void doExecute() {
							goTo(statesTrace.get(stateNumber));
						}
					};
					CommandExecution.execute(ed, command);
				}
			} catch (Exception e) {
				throw e;
			}
		}
	}

	private void jumpBeforeStep(minitlTrace.Steps.SpecificStep step) {
		if (step != null) {
			final int i = getStartingIndex(step);
			if (i == statesTrace.size() - 1) {
				lastJumpIndex = -1;
				currentState = statesTrace.get(statesTrace.size() - 1);
			} else {
				lastJumpIndex = i;
				currentState = statesTrace.get(i);
			}
			if (tracedToExe != null) {
				goTo(i);
			}
			updateCallStack(step);
		}
	}

	public void loadTrace(minitlTrace.SpecificTrace root) {
		traceRoot = root;
		statesTrace = traceRoot.getStatesTrace();
		if (!statesTrace.isEmpty()) {
			currentState = statesTrace.get(0);
		}
		valueTraces.addAll(getAllValueTraces());
	}

	public void loadTrace(Resource modelResource, minitlTrace.SpecificTrace root) {
		loadTrace(root);
		this.modelResource = modelResource;
	}

	@Override
	public boolean canBackValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			return canBackValueCache.computeIfAbsent(traceIndex, i -> {
				final List<? extends minitlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
				final int previousValueIndex = getPreviousValueIndex(valueTrace);
				return previousValueIndex > -1;
			});
		}
		return false;
	}

	@Override
	public boolean canStepValue(int traceIndex) {
		return true;
	}

	@Override
	public void backValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends minitlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int previousValueIndex = getPreviousValueIndex(valueTrace);
			if (previousValueIndex > -1) {
				jump(valueTrace.get(previousValueIndex));
			}
		}
	}

	@Override
	public void stepValue(int traceIndex) {
		if (traceIndex > -1 && traceIndex < valueTraces.size()) {
			final List<? extends minitlTrace.States.Value> valueTrace = valueTraces.get(traceIndex);
			final int nextValueIndex = getNextValueIndex(valueTrace);
			if (nextValueIndex > -1) {
				jump(valueTrace.get(nextValueIndex));
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void jump(int i) {
		final List<minitlTrace.States.State> states = statesTrace;
		if (i < states.size()) {
			final List<minitlTrace.Steps.SpecificStep> rootSteps = getStepsForStates(i, i);
			final List<minitlTrace.Steps.SpecificStep> searchPath = new ArrayList<>();
			minitlTrace.Steps.SpecificStep firstStepOfState = null;
			if (!rootSteps.isEmpty()) {
				final Predicate<minitlTrace.Steps.SpecificStep> p = s -> {
					final int stepStartingState = getStartingIndex(s);
					final int stepEndingState = getEndingIndex(s);
					return (stepEndingState == -1 || stepEndingState >= i) && stepStartingState <= i;
				};
				minitlTrace.Steps.SpecificStep currentStep = rootSteps.get(0);
				final List<minitlTrace.Steps.SpecificStep> siblingSteps = new ArrayList<>(rootSteps);
				final List<minitlTrace.Steps.SpecificStep> currentSubSteps = new ArrayList<>();
				if (currentStep instanceof SequentialStep<?>) {
					final SequentialStep<minitlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) currentStep;
					currentSubSteps
							.addAll(currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
				}
				while (firstStepOfState == null) {
					final int startingIndex = getStartingIndex(currentStep);
					final int endingIndex = getEndingIndex(currentStep);
					if (startingIndex < i && (endingIndex > i || endingIndex == -1)) {
						if (currentSubSteps.isEmpty()) {
							throw new IllegalStateException("Unreachable state");
						} else {
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<minitlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (endingIndex == i && startingIndex != i) {
						if (currentSubSteps.isEmpty()) {
							// We need to explore the next sibling step
							minitlTrace.Steps.SpecificStep tmp = currentStep;
							currentStep = null;
							while (currentStep == null) {
								final int idx = siblingSteps.indexOf(tmp) + 1;
								if (idx < siblingSteps.size()) {
									currentStep = siblingSteps.get(idx);
									if (currentStep instanceof SequentialStep<?>) {
										final SequentialStep<minitlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) currentStep;
										currentSubSteps.addAll(currentStep_cast.getSubSteps().stream().filter(p)
												.collect(Collectors.toList()));
									}
								} else {
									if (searchPath.isEmpty()) {
										throw new IllegalStateException("Unreachable state");
									} else {
										tmp = searchPath.remove(0);
										siblingSteps.clear();
										if (searchPath.isEmpty()) {
											siblingSteps.addAll(rootSteps);
										} else {
											final minitlTrace.Steps.SpecificStep s = searchPath.get(0);
											if (s instanceof SequentialStep<?>) {
												final SequentialStep<minitlTrace.Steps.SpecificStep> s_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) s;
												siblingSteps.addAll((s_cast).getSubSteps().stream().filter(p)
														.collect(Collectors.toList()));
											}
										}
									}
								}
							}
						} else {
							// We need to explore the substeps in case one of them starts on i
							searchPath.add(0, currentStep);
							siblingSteps.clear();
							siblingSteps.addAll(currentSubSteps);
							currentStep = siblingSteps.get(0);
							currentSubSteps.clear();
							if (currentStep instanceof SequentialStep<?>) {
								final SequentialStep<minitlTrace.Steps.SpecificStep> currentStep_cast = (SequentialStep<minitlTrace.Steps.SpecificStep>) currentStep;
								currentSubSteps.addAll(
										currentStep_cast.getSubSteps().stream().filter(p).collect(Collectors.toList()));
							}
						}
					} else if (startingIndex == i) {
						firstStepOfState = currentStep;
					}
				}
			}
			jumpBeforeStep(firstStepOfState);
		}
	}

	@Override
	public boolean canStepBackInto() {
		return stepBackIntoResult != null;
	}

	@Override
	public boolean canStepBackOver() {
		return stepBackOverResult != null;
	}

	@Override
	public boolean canStepBackOut() {
		return stepBackOutResult != null;
	}

	@Override
	public int getCurrentStateIndex() {
		if (lastJumpIndex != -1) {
			return lastJumpIndex;
		}
		return statesTrace.size() - 1;
	}

	@Override
	public List<Step> getCallStack() {
		return callStack;
	}

	private List<minitlTrace.Steps.SpecificStep> getStepsForStates(int startingState, int endingState) {
		Predicate<minitlTrace.Steps.SpecificStep> predicate = s -> {
			final int stepStartingState = getStartingIndex(s);
			final int stepEndingState = getEndingIndex(s);
			return (stepEndingState == -1 || stepEndingState >= startingState) && stepStartingState <= endingState;
		};
		return traceRoot.getRootStep().getSubSteps().stream().filter(predicate).collect(Collectors.toList());
	}

	@Override
	public void notifyListeners() {
		for (ITraceListener listener : listeners) {
			listener.update();
		}
	}

	@Override
	public void addListener(ITraceListener listener) {
		if (listener != null) {
			listeners.add(listener);
		}
	}

	@Override
	public void removeListener(ITraceListener listener) {
		if (listener != null) {
			listeners.remove(listener);
		}
	}

	@Override
	public void update() {
		valueTraces.clear();
		valueTraces.addAll(getAllValueTraces());
		canBackValueCache.clear();
		notifyListeners();
	}

	@Override
	public Step getCurrentForwardStep() {
		if (!callStack.isEmpty()) {
			return callStack.get(callStack.size() - 1);
		}
		return null;
	}

	@Override
	public Step getCurrentBackwardStep() {
		return stepBackOverResult;
	}

	@Override
	public Step getCurrentBigStep() {
		return stepBackOutResult;
	}

	@Override
	public void jump(EObject o) {
		int idx = -1;
		if (o instanceof minitlTrace.States.State) {
			idx = statesTrace.indexOf(o);
		} else if (o instanceof minitlTrace.States.Value) {
			final minitlTrace.States.State state = ((minitlTrace.States.Value) o).getStatesNoOpposite().get(0);
			idx = statesTrace.indexOf(state);
		}
		if (idx != -1) {
			jump(idx);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void loadLastState() {
		final int idx = statesTrace.size() - 1;
		final List<minitlTrace.Steps.SpecificStep> steps = getStepsForStates(idx, idx);
		minitlTrace.Steps.SpecificStep lastStep = null;
		while (!steps.isEmpty()) {
			lastStep = steps.get(steps.size() - 1);
			steps.clear();
			if (lastStep instanceof SequentialStep<?>) {
				steps.addAll(((SequentialStep<minitlTrace.Steps.SpecificStep>) lastStep).getSubSteps());
			}
		}
		final int endingIndex = getEndingIndex(lastStep);
		if (endingIndex == -1 || endingIndex == idx) {
			jumpBeforeStep(lastStep);
		}
	}

	@Override
	public boolean stepInto() {
		if (stepIntoResult != null) {
			jumpBeforeStep(stepIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepOver() {
		if (stepOverResult != null) {
			jumpBeforeStep(stepOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepReturn() {
		if (stepReturnResult != null) {
			jumpBeforeStep(stepReturnResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackInto() {
		if (stepBackIntoResult != null) {
			jumpBeforeStep(stepBackIntoResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOver() {
		if (stepBackOverResult != null) {
			jumpBeforeStep(stepBackOverResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean stepBackOut() {
		if (stepBackOutResult != null) {
			jumpBeforeStep(stepBackOutResult);
			return true;
		}
		return false;
	}

	@Override
	public boolean isInReplayMode() {
		return stepIntoResult != null;
	}

	@Override
	public void updateCallStack(Step step) {
		if (step instanceof minitlTrace.Steps.SpecificStep) {
			minitlTrace.Steps.SpecificStep step_cast = (minitlTrace.Steps.SpecificStep) step;
			final List<minitlTrace.Steps.SpecificStep> newPath = new ArrayList<>();
			newPath.add(step_cast);
			EObject container = step.eContainer();
			while (container != null && container instanceof minitlTrace.Steps.SpecificStep) {
				newPath.add(0, (minitlTrace.Steps.SpecificStep) container);
				container = container.eContainer();
			}
			computeExplorerState(newPath);
			update();
		} else {
			throw new IllegalArgumentException(
					"MinitlTraceExplorer expects specific steps and cannot handle this: " + step);
		}
	}
}
