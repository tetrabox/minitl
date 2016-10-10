package org.tetrabox.example.minitl.trace.tracemanager;

import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.diverse.trace.commons.model.trace.LaunchConfiguration;
import fr.inria.diverse.trace.commons.model.trace.MSEModel;
import fr.inria.diverse.trace.commons.model.trace.SequentialStep;
import fr.inria.diverse.trace.gemoc.api.ITraceConstructor;

public class MinitlTraceConstructor implements ITraceConstructor {
	private minitlTrace.SpecificTrace traceRoot;
	private MSEModel mseModel;
	private Resource executedModel;
	private final Map<EObject, EObject> exeToTraced;

	private minitlTrace.States.State lastState;

	private Resource traceResource;
	private final Deque<minitlTrace.Steps.SpecificStep> context = new LinkedList<minitlTrace.Steps.SpecificStep>();

	public MinitlTraceConstructor(Resource exeModel, Resource traceResource, Map<EObject, EObject> exeToTraced) {
		this.traceResource = traceResource;
		this.executedModel = exeModel;
		this.exeToTraced = exeToTraced;
	}

	private void addInitialState() {
		if (lastState == null) {
			// Creation of the initial state
			Set<Resource> allResources = getAllExecutedModelResources();
			lastState = minitlTrace.States.StatesFactory.eINSTANCE.createState();
			for (Resource r : allResources) {
				for (TreeIterator<EObject> i = r.getAllContents(); i.hasNext();) {
					EObject o = i.next();

					if (o instanceof org.tetrabox.example.minitl.minitl.NamedElement) {
						org.tetrabox.example.minitl.minitl.NamedElement o_cast = (org.tetrabox.example.minitl.minitl.NamedElement) o;
						addNewObjectToState(o_cast, lastState);
					}
				}
			}
			this.traceRoot.getStatesTrace().add(lastState);
		}
	}

	private boolean addNewObjectToState(org.tetrabox.example.minitl.minitl.NamedElement o_cast,
			minitlTrace.States.State newState) {
		boolean added = false;
		if (o_cast instanceof org.tetrabox.example.minitl.minitl.Rule) {
			added = addNewObjectToState((org.tetrabox.example.minitl.minitl.Rule) o_cast, newState);
		} else if (o_cast instanceof org.tetrabox.example.minitl.minitl.ObjectTemplate) {
			added = addNewObjectToState((org.tetrabox.example.minitl.minitl.ObjectTemplate) o_cast, newState);
		} else if (o_cast instanceof org.tetrabox.example.minitl.minitl.Transformation) {
			added = addNewObjectToState((org.tetrabox.example.minitl.minitl.Transformation) o_cast, newState);
		}

		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.tetrabox.example.minitl.minitl.ObjectTemplate o_cast,
			minitlTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			minitlTrace.States.minitl.TracedObjectTemplate tracedObject = minitlTrace.States.minitl.MinitlFactory.eINSTANCE
					.createTracedObjectTemplate();
			tracedObject.setOriginalObject((org.tetrabox.example.minitl.minitl.ObjectTemplate) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getMinitl_tracedObjectTemplates().add(tracedObject);

			// Creation of the first value of the field currentObject
			minitlTrace.States.ObjectTemplate_currentObject_Value firstValue_currentObject = minitlTrace.States.StatesFactory.eINSTANCE
					.createObjectTemplate_currentObject_Value();

			firstValue_currentObject.setCurrentObject((org.eclipse.emf.ecore.EObject) o_cast.getCurrentObject());
			tracedObject.getCurrentObjectSequence().add(firstValue_currentObject);
			newState.getObjectTemplate_currentObject_Values().add(firstValue_currentObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.tetrabox.example.minitl.minitl.Rule o_cast,
			minitlTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			minitlTrace.States.minitl.TracedRule tracedObject = minitlTrace.States.minitl.MinitlFactory.eINSTANCE
					.createTracedRule();
			tracedObject.setOriginalObject((org.tetrabox.example.minitl.minitl.Rule) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getMinitl_tracedRules().add(tracedObject);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean addNewObjectToState(org.tetrabox.example.minitl.minitl.Transformation o_cast,
			minitlTrace.States.State newState) {
		boolean added = false;

		if (!added && !exeToTraced.containsKey(o_cast)) {
			minitlTrace.States.minitl.TracedTransformation tracedObject = minitlTrace.States.minitl.MinitlFactory.eINSTANCE
					.createTracedTransformation();
			tracedObject.setOriginalObject((org.tetrabox.example.minitl.minitl.Transformation) o_cast);
			exeToTraced.put(o_cast, tracedObject);
			traceRoot.getMinitl_tracedTransformations().add(tracedObject);

			// Creation of the first value of the field inputModel
			minitlTrace.States.Transformation_inputModel_Value firstValue_inputModel = minitlTrace.States.StatesFactory.eINSTANCE
					.createTransformation_inputModel_Value();

			firstValue_inputModel.getInputModel()
					.addAll((Collection<? extends org.eclipse.emf.ecore.EObject>) o_cast.getInputModel());

			tracedObject.getInputModelSequence().add(firstValue_inputModel);
			newState.getTransformation_inputModel_Values().add(firstValue_inputModel);

			// Creation of the first value of the field inputModelURI
			minitlTrace.States.Transformation_inputModelURI_Value firstValue_inputModelURI = minitlTrace.States.StatesFactory.eINSTANCE
					.createTransformation_inputModelURI_Value();

			firstValue_inputModelURI.setInputModelURI((java.lang.String) o_cast.getInputModelURI());
			tracedObject.getInputModelURISequence().add(firstValue_inputModelURI);
			newState.getTransformation_inputModelURI_Values().add(firstValue_inputModelURI);

			// Creation of the first value of the field outputFilePath
			minitlTrace.States.Transformation_outputFilePath_Value firstValue_outputFilePath = minitlTrace.States.StatesFactory.eINSTANCE
					.createTransformation_outputFilePath_Value();

			firstValue_outputFilePath.setOutputFilePath((java.lang.String) o_cast.getOutputFilePath());
			tracedObject.getOutputFilePathSequence().add(firstValue_outputFilePath);
			newState.getTransformation_outputFilePath_Values().add(firstValue_outputFilePath);

			// Creation of the first value of the field outputModel
			minitlTrace.States.Transformation_outputModel_Value firstValue_outputModel = minitlTrace.States.StatesFactory.eINSTANCE
					.createTransformation_outputModel_Value();

			firstValue_outputModel.getOutputModel()
					.addAll((Collection<? extends org.eclipse.emf.ecore.EObject>) o_cast.getOutputModel());

			tracedObject.getOutputModelSequence().add(firstValue_outputModel);
			newState.getTransformation_outputModel_Values().add(firstValue_outputModel);

		} // end if (!exeToTraced.containsKey
		return added;
	}// end addNewObjectToState

	private boolean copiedState = false;

	private minitlTrace.States.State copyState(minitlTrace.States.State oldState) {
		minitlTrace.States.State newState = minitlTrace.States.StatesFactory.eINSTANCE.createState();
		newState.getObjectTemplate_currentObject_Values().addAll(oldState.getObjectTemplate_currentObject_Values());
		newState.getTransformation_inputModel_Values().addAll(oldState.getTransformation_inputModel_Values());
		newState.getTransformation_inputModelURI_Values().addAll(oldState.getTransformation_inputModelURI_Values());
		newState.getTransformation_outputFilePath_Values().addAll(oldState.getTransformation_outputFilePath_Values());
		newState.getTransformation_outputModel_Values().addAll(oldState.getTransformation_outputModel_Values());
		copiedState = true;
		return newState;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addState(List<org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange> changes) {
		if (lastState == null) {
			addInitialState();
		}
		if (!changes.isEmpty()) {
			boolean stateChanged = false;
			// We start by a (shallow) copy of the last state
			// But we will have to rollback a little by replacing values that changed
			minitlTrace.States.State newState = copyState(lastState);
			for (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.ModelChange modelChange : changes) {
				EObject o = modelChange.getChangedObject();
				// Here we must look at non-collection mutable fields
				// We must rollback the last values from the copied state, and add new values as well
				// ie. mix of remove and new
				if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) {
					stateChanged = true;

					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.NonCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();

					if (o instanceof org.tetrabox.example.minitl.minitl.ObjectTemplate) {
						org.tetrabox.example.minitl.minitl.ObjectTemplate o_cast = (org.tetrabox.example.minitl.minitl.ObjectTemplate) o;

						if (p.getFeatureID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE
								.getObjectTemplate_CurrentObject().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							minitlTrace.States.minitl.TracedObjectTemplate traced = (minitlTrace.States.minitl.TracedObjectTemplate) exeToTraced
									.get(o);
							minitlTrace.States.ObjectTemplate_currentObject_Value lastValue = traced
									.getCurrentObjectSequence().get(traced.getCurrentObjectSequence().size() - 1);
							newState.getObjectTemplate_currentObject_Values().remove(lastValue);

							// And we create a proper new value
							minitlTrace.States.ObjectTemplate_currentObject_Value newValue = minitlTrace.States.StatesFactory.eINSTANCE
									.createObjectTemplate_currentObject_Value();

							org.eclipse.emf.ecore.EObject value = o_cast.getCurrentObject();

							newValue.setCurrentObject((org.eclipse.emf.ecore.EObject) value);

							traced.getCurrentObjectSequence().add(newValue);
							newState.getObjectTemplate_currentObject_Values().add(newValue);
						}
					}

					if (o instanceof org.tetrabox.example.minitl.minitl.Transformation) {
						org.tetrabox.example.minitl.minitl.Transformation o_cast = (org.tetrabox.example.minitl.minitl.Transformation) o;

						if (p.getFeatureID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE
								.getTransformation_OutputFilePath().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							minitlTrace.States.minitl.TracedTransformation traced = (minitlTrace.States.minitl.TracedTransformation) exeToTraced
									.get(o);
							minitlTrace.States.Transformation_outputFilePath_Value lastValue = traced
									.getOutputFilePathSequence().get(traced.getOutputFilePathSequence().size() - 1);
							newState.getTransformation_outputFilePath_Values().remove(lastValue);

							// And we create a proper new value
							minitlTrace.States.Transformation_outputFilePath_Value newValue = minitlTrace.States.StatesFactory.eINSTANCE
									.createTransformation_outputFilePath_Value();

							java.lang.String value = o_cast.getOutputFilePath();

							newValue.setOutputFilePath((java.lang.String) value);

							traced.getOutputFilePathSequence().add(newValue);
							newState.getTransformation_outputFilePath_Values().add(newValue);
						} else

						if (p.getFeatureID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE
								.getTransformation_InputModelURI().getFeatureID()) {

							// Rollback: we remove the last value of this field from the new state
							minitlTrace.States.minitl.TracedTransformation traced = (minitlTrace.States.minitl.TracedTransformation) exeToTraced
									.get(o);
							minitlTrace.States.Transformation_inputModelURI_Value lastValue = traced
									.getInputModelURISequence().get(traced.getInputModelURISequence().size() - 1);
							newState.getTransformation_inputModelURI_Values().remove(lastValue);

							// And we create a proper new value
							minitlTrace.States.Transformation_inputModelURI_Value newValue = minitlTrace.States.StatesFactory.eINSTANCE
									.createTransformation_inputModelURI_Value();

							java.lang.String value = o_cast.getInputModelURI();

							newValue.setInputModelURI((java.lang.String) value);

							traced.getInputModelURISequence().add(newValue);
							newState.getTransformation_inputModelURI_Values().add(newValue);
						}
					}
				}
				// Here we look at collection mutable fields
				// We must first manually find out if the collection changed...
				// If it changed we must rollback the last values from the copied state, and add new values as well
				else if (modelChange instanceof org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) {
					org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange modelChange_cast = (org.gemoc.xdsmlframework.api.engine_addon.modelchangelistener.PotentialCollectionFieldModelChange) modelChange;
					org.eclipse.emf.ecore.EStructuralFeature p = modelChange_cast.getChangedField();
					if (o instanceof org.tetrabox.example.minitl.minitl.Transformation) {
						org.tetrabox.example.minitl.minitl.Transformation o_cast = (org.tetrabox.example.minitl.minitl.Transformation) o;
						minitlTrace.States.minitl.TracedTransformation tracedObject = (minitlTrace.States.minitl.TracedTransformation) exeToTraced
								.get(o_cast);
						if (p.getFeatureID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE
								.getTransformation_InputModel().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<minitlTrace.States.Transformation_inputModel_Value> valueSequence = tracedObject
									.getInputModelSequence();
							minitlTrace.States.Transformation_inputModel_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getInputModel().size() == o_cast.getInputModel().size()) {
									java.util.Iterator<org.eclipse.emf.ecore.EObject> it = o_cast.getInputModel()
											.iterator();
									for (org.eclipse.emf.ecore.EObject aPreviousValue : previousValue.getInputModel()) {
										org.eclipse.emf.ecore.EObject aCurrentValue = it.next();
										if (!aPreviousValue.equals(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								minitlTrace.States.Transformation_inputModel_Value lastValue = tracedObject
										.getInputModelSequence().get(tracedObject.getInputModelSequence().size() - 1);
								newState.getTransformation_inputModel_Values().remove(lastValue);
								// And we create a proper new value							
								minitlTrace.States.Transformation_inputModel_Value newValue = minitlTrace.States.StatesFactory.eINSTANCE
										.createTransformation_inputModel_Value();
								newValue.getInputModel().addAll(
										(Collection<? extends org.eclipse.emf.ecore.EObject>) o_cast.getInputModel());
								tracedObject.getInputModelSequence().add(newValue);
								newState.getTransformation_inputModel_Values().add(newValue);
							}
						} else if (p.getFeatureID() == org.tetrabox.example.minitl.minitl.MinitlPackage.eINSTANCE
								.getTransformation_OutputModel().getFeatureID()) {
							// We compare the last collection in the value sequence, and the current one in the potentially changed object
							List<minitlTrace.States.Transformation_outputModel_Value> valueSequence = tracedObject
									.getOutputModelSequence();
							minitlTrace.States.Transformation_outputModel_Value previousValue = null;
							if (!valueSequence.isEmpty()) {
								previousValue = valueSequence.get(valueSequence.size() - 1);
							}
							boolean change = false;
							if (previousValue != null) {
								if (previousValue.getOutputModel().size() == o_cast.getOutputModel().size()) {
									java.util.Iterator<org.eclipse.emf.ecore.EObject> it = o_cast.getOutputModel()
											.iterator();
									for (org.eclipse.emf.ecore.EObject aPreviousValue : previousValue
											.getOutputModel()) {
										org.eclipse.emf.ecore.EObject aCurrentValue = it.next();
										if (!aPreviousValue.equals(aCurrentValue)) {
											change = true;
											break;
										}
									}
								} else {
									change = true;
								}
							} else {
								change = true;
							}
							if (change) {
								stateChanged = true;
								// Rollback: we remove the last value of this field from the new state
								minitlTrace.States.Transformation_outputModel_Value lastValue = tracedObject
										.getOutputModelSequence().get(tracedObject.getOutputModelSequence().size() - 1);
								newState.getTransformation_outputModel_Values().remove(lastValue);
								// And we create a proper new value							
								minitlTrace.States.Transformation_outputModel_Value newValue = minitlTrace.States.StatesFactory.eINSTANCE
										.createTransformation_outputModel_Value();
								newValue.getOutputModel().addAll(
										(Collection<? extends org.eclipse.emf.ecore.EObject>) o_cast.getOutputModel());
								tracedObject.getOutputModelSequence().add(newValue);
								newState.getTransformation_outputModel_Values().add(newValue);
							}
						}
					}
				}
			}
			if (stateChanged) {
				final minitlTrace.Steps.SpecificStep currentStep = context.peekFirst();
				if (currentStep != null && currentStep instanceof fr.inria.diverse.trace.commons.model.trace.BigStep) {
					final minitlTrace.States.State startingState = lastState;
					final minitlTrace.States.State endingState = newState;
					addImplicitStep(currentStep, startingState, endingState);
				}
				lastState = newState;
				traceRoot.getStatesTrace().add(lastState);
			} else if (copiedState) {
				newState.getObjectTemplate_currentObject_Values().clear();
				newState.getTransformation_inputModel_Values().clear();
				newState.getTransformation_inputModelURI_Values().clear();
				newState.getTransformation_outputFilePath_Values().clear();
				newState.getTransformation_outputModel_Values().clear();
			}
			copiedState = false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		minitlTrace.Steps.SpecificStep step_cast = null;
		if (step != null && step instanceof minitlTrace.Steps.SpecificStep) {
			step_cast = (minitlTrace.Steps.SpecificStep) step;
			if (mseModel == null) {
				mseModel = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE.createMSEModel();
				traceResource.getContents().add(mseModel);
			}
			mseModel.getOwnedMSEs().add(step_cast.getMseoccurrence().getMse());

			// Creating generic (or almost generic) links
			minitlTrace.States.State state = traceRoot.getStatesTrace().get(traceRoot.getStatesTrace().size() - 1);
			step_cast.setStartingState(state);
			if (!context.isEmpty() && context.getFirst() != null) {
				((SequentialStep<minitlTrace.Steps.SpecificStep>) context.getFirst()).getSubSteps().add(step_cast);
			} else {
				traceRoot.getRootStep().getSubSteps().add(step_cast);
			}

			// Adding step in its dedicated sequence/dimension
			if (step_cast instanceof minitlTrace.Steps.Minitl_Binding_Assign) {
				minitlTrace.Steps.Minitl_Binding_Assign minitl_Binding_AssignInstance = (minitlTrace.Steps.Minitl_Binding_Assign) step_cast;
				traceRoot.getMinitl_Binding_Assign_Sequence().add(minitl_Binding_AssignInstance);
			} else if (step_cast instanceof minitlTrace.Steps.Minitl_Binding_Check) {
				minitlTrace.Steps.Minitl_Binding_Check minitl_Binding_CheckInstance = (minitlTrace.Steps.Minitl_Binding_Check) step_cast;
				traceRoot.getMinitl_Binding_Check_Sequence().add(minitl_Binding_CheckInstance);
			} else if (step_cast instanceof minitlTrace.Steps.Minitl_ObjectTemplate_Construct) {
				minitlTrace.Steps.Minitl_ObjectTemplate_Construct minitl_ObjectTemplate_ConstructInstance = (minitlTrace.Steps.Minitl_ObjectTemplate_Construct) step_cast;
				traceRoot.getMinitl_ObjectTemplate_Construct_Sequence().add(minitl_ObjectTemplate_ConstructInstance);
			} else if (step_cast instanceof minitlTrace.Steps.Minitl_ObjectTemplate_Match) {
				minitlTrace.Steps.Minitl_ObjectTemplate_Match minitl_ObjectTemplate_MatchInstance = (minitlTrace.Steps.Minitl_ObjectTemplate_Match) step_cast;
				traceRoot.getMinitl_ObjectTemplate_Match_Sequence().add(minitl_ObjectTemplate_MatchInstance);
			} else if (step_cast instanceof minitlTrace.Steps.Minitl_Rule_Apply) {
				minitlTrace.Steps.Minitl_Rule_Apply minitl_Rule_ApplyInstance = (minitlTrace.Steps.Minitl_Rule_Apply) step_cast;
				traceRoot.getMinitl_Rule_Apply_Sequence().add(minitl_Rule_ApplyInstance);
			} else if (step_cast instanceof minitlTrace.Steps.Minitl_Transformation_Execute) {
				minitlTrace.Steps.Minitl_Transformation_Execute minitl_Transformation_ExecuteInstance = (minitlTrace.Steps.Minitl_Transformation_Execute) step_cast;
				traceRoot.getMinitl_Transformation_Execute_Sequence().add(minitl_Transformation_ExecuteInstance);
			} else if (step_cast instanceof minitlTrace.Steps.Minitl_Transformation_Initialize) {
				minitlTrace.Steps.Minitl_Transformation_Initialize minitl_Transformation_InitializeInstance = (minitlTrace.Steps.Minitl_Transformation_Initialize) step_cast;
				traceRoot.getMinitl_Transformation_Initialize_Sequence().add(minitl_Transformation_InitializeInstance);
			}
		}
		context.push(step_cast);
	}

	@SuppressWarnings("unchecked")
	private void addImplicitStep(minitlTrace.Steps.SpecificStep currentStep, minitlTrace.States.State startingState,
			minitlTrace.States.State endingState) {

		minitlTrace.Steps.SpecificStep implicitStep = null;
		if (currentStep instanceof minitlTrace.Steps.Minitl_ObjectTemplate_Construct) {
			implicitStep = minitlTrace.Steps.StepsFactory.eINSTANCE
					.createMinitl_ObjectTemplate_Construct_ImplicitStep();
		} else if (currentStep instanceof minitlTrace.Steps.Minitl_ObjectTemplate_Match) {
			implicitStep = minitlTrace.Steps.StepsFactory.eINSTANCE.createMinitl_ObjectTemplate_Match_ImplicitStep();
		} else if (currentStep instanceof minitlTrace.Steps.Minitl_Rule_Apply) {
			implicitStep = minitlTrace.Steps.StepsFactory.eINSTANCE.createMinitl_Rule_Apply_ImplicitStep();
		} else if (currentStep instanceof minitlTrace.Steps.Minitl_Transformation_Execute) {
			implicitStep = minitlTrace.Steps.StepsFactory.eINSTANCE.createMinitl_Transformation_Execute_ImplicitStep();
		}
		if (implicitStep != null) {
			implicitStep.setStartingState(startingState);
			implicitStep.setEndingState(endingState);
			((SequentialStep<minitlTrace.Steps.SpecificStep>) currentStep).getSubSteps().add(implicitStep);

		}
	}

	@Override
	public void endStep(fr.inria.diverse.trace.commons.model.trace.Step step) {
		minitlTrace.Steps.SpecificStep popped = context.pop();
		if (popped != null)
			popped.setEndingState(lastState);
	}

	@Override
	public EObject initTrace(LaunchConfiguration launchConfiguration) {
		// Create root
		traceRoot = minitlTrace.MinitlTraceFactory.eINSTANCE.createSpecificTrace();
		traceRoot.setLaunchconfiguration(launchConfiguration);

		// Create root sequential step
		fr.inria.diverse.trace.commons.model.trace.SequentialStep<minitlTrace.Steps.SpecificStep> rootStep = fr.inria.diverse.trace.commons.model.trace.TraceFactory.eINSTANCE
				.createSequentialStep();
		traceRoot.setRootStep(rootStep);

		// Put in the resource
		traceResource.getContents().add(traceRoot);

		return traceRoot;
	}

	@Override
	public void save() {
		try {
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(URI uri) {
		try {
			traceResource.setURI(uri);
			traceResource.save(null);
		} catch (java.io.IOException e) {
			e.printStackTrace();
		}
	}

	private Set<Resource> getAllExecutedModelResources() {
		Set<Resource> allResources = new HashSet<>();
		allResources.add(executedModel);
		allResources.addAll(org.gemoc.commons.eclipse.emf.EMFResource.getRelatedResources(executedModel));
		allResources.removeIf(r -> r == null);
		return allResources;
	}

	@Override
	public boolean isPartialTraceConstructor() {
		return false;
	}
}
