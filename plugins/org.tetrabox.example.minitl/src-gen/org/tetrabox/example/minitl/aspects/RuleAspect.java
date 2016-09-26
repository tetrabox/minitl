package org.tetrabox.example.minitl.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.util.Set;
import org.tetrabox.example.minitl.minitl.ObjectTemplate;
import org.tetrabox.example.minitl.minitl.Rule;
import org.tetrabox.example.minitl.minitl.Transformation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.tetrabox.example.minitl.aspects.ObjectTemplateAspect;
import org.tetrabox.example.minitl.aspects.RuleAspectRuleAspectProperties;
import org.tetrabox.example.minitl.aspects.TransformationAspect;

@Aspect(className = Rule.class)
@SuppressWarnings("all")
public class RuleAspect {
  @Step
  public static void apply(final Rule _self) {
    final org.tetrabox.example.minitl.aspects.RuleAspectRuleAspectProperties _self_ = org.tetrabox.example.minitl.aspects.RuleAspectRuleAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_apply(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"Rule","apply");
    } else {
    	command.execute();
    }
    ;;
  }
  
  protected static void _privk3_apply(final RuleAspectRuleAspectProperties _self_, final Rule _self) {
    EList<ObjectTemplate> _objectTemplates = _self.getObjectTemplates();
    final ObjectTemplate inputObjectTemplate = _objectTemplates.get(0);
    EList<ObjectTemplate> _objectTemplates_1 = _self.getObjectTemplates();
    final ObjectTemplate outputObjectTemplate = _objectTemplates_1.get(1);
    Transformation _transformation = _self.getTransformation();
    Set<EObject> _inputModel = TransformationAspect.inputModel(_transformation);
    for (final EObject o : _inputModel) {
      {
        ObjectTemplateAspect.match(inputObjectTemplate, o);
        EObject _currentObject = ObjectTemplateAspect.currentObject(inputObjectTemplate);
        boolean _notEquals = (!Objects.equal(_currentObject, null));
        if (_notEquals) {
          ObjectTemplateAspect.construct(outputObjectTemplate);
          Transformation _transformation_1 = _self.getTransformation();
          Set<EObject> _outputModel = TransformationAspect.outputModel(_transformation_1);
          EObject _currentObject_1 = ObjectTemplateAspect.currentObject(outputObjectTemplate);
          _outputModel.add(_currentObject_1);
        }
        ObjectTemplateAspect.reset(inputObjectTemplate);
        ObjectTemplateAspect.reset(outputObjectTemplate);
      }
    }
  }
}
