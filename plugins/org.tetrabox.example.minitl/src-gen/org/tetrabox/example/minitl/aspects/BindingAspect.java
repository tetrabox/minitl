package org.tetrabox.example.minitl.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.tetrabox.example.minitl.minitl.Binding;
import org.tetrabox.example.minitl.minitl.ObjectTemplate;
import org.tetrabox.example.minitl.minitl.Value;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tetrabox.example.minitl.aspects.BindingAspectBindingAspectProperties;
import org.tetrabox.example.minitl.aspects.ObjectTemplateAspect;
import org.tetrabox.example.minitl.aspects.ValueAspect;

@Aspect(className = Binding.class)
@SuppressWarnings("all")
public class BindingAspect {
  @Step
  public static boolean check(final Binding _self, final EObject o) {
	final org.tetrabox.example.minitl.aspects.BindingAspectBindingAspectProperties _self_ = org.tetrabox.example.minitl.aspects.BindingAspectBindingAspectContext
			.getSelf(_self);
	Object result = null;
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			addToResult(_privk3_check(_self_, _self, o));
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Binding", "check");
	} else {
		command.execute();
	}
	result = command.getResult();
	;
	;
	return (boolean) result;
}
  
  @Step
  public static void assign(final Binding _self) {
	final org.tetrabox.example.minitl.aspects.BindingAspectBindingAspectProperties _self_ = org.tetrabox.example.minitl.aspects.BindingAspectBindingAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_assign(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Binding", "assign");
	} else {
		command.execute();
	}
	;
	;
}
  
  protected static boolean _privk3_check(final BindingAspectBindingAspectProperties _self_, final Binding _self, final EObject o) {
    EStructuralFeature _feature = _self.getFeature();
    final Object existingValue = o.eGet(_feature);
    Value _value = _self.getValue();
    final Object patternValue = ValueAspect.evaluate(_value);
    return Objects.equal(existingValue, patternValue);
  }
  
  protected static void _privk3_assign(final BindingAspectBindingAspectProperties _self_, final Binding _self) {
    Value _value = _self.getValue();
    final Object value = ValueAspect.evaluate(_value);
    ObjectTemplate _objectTemplate = _self.getObjectTemplate();
    EObject _currentObject = ObjectTemplateAspect.currentObject(_objectTemplate);
    EStructuralFeature _feature = _self.getFeature();
    _currentObject.eSet(_feature, value);
  }
}
