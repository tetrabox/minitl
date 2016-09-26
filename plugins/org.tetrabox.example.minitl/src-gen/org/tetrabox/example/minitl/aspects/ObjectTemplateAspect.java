package org.tetrabox.example.minitl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.tetrabox.example.minitl.minitl.Binding;
import org.tetrabox.example.minitl.minitl.ObjectTemplate;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.tetrabox.example.minitl.aspects.BindingAspect;
import org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectProperties;

@Aspect(className = ObjectTemplate.class)
@SuppressWarnings("all")
public class ObjectTemplateAspect {
  public static void reset(final ObjectTemplate _self) {
    final org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectProperties _self_ = org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectContext.getSelf(_self);
    _privk3_reset(_self_, _self);;
  }
  
  public static void match(final ObjectTemplate _self, final EObject o) {
    final org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectProperties _self_ = org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectContext.getSelf(_self);
    _privk3_match(_self_, _self,o);;
  }
  
  @Step
  public static void construct(final ObjectTemplate _self) {
    final org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectProperties _self_ = org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_construct(_self_, _self);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (manager != null) {
    	manager.executeStep(_self,command,"ObjectTemplate","construct");
    } else {
    	command.execute();
    }
    ;;
  }
  
  public static EObject currentObject(final ObjectTemplate _self) {
    final org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectProperties _self_ = org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_currentObject(_self_, _self);;
    return (org.eclipse.emf.ecore.EObject)result;
  }
  
  public static void currentObject(final ObjectTemplate _self, final EObject currentObject) {
    final org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectProperties _self_ = org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectContext.getSelf(_self);
    _privk3_currentObject(_self_, _self,currentObject);;
  }
  
  protected static void _privk3_reset(final ObjectTemplateAspectObjectTemplateAspectProperties _self_, final ObjectTemplate _self) {
    ObjectTemplateAspect.currentObject(_self, null);
  }
  
  protected static void _privk3_match(final ObjectTemplateAspectObjectTemplateAspectProperties _self_, final ObjectTemplate _self, final EObject o) {
    EClass _eClass = o.eClass();
    int _classifierID = _eClass.getClassifierID();
    EClass _type = _self.getType();
    int _classifierID_1 = _type.getClassifierID();
    boolean _equals = (_classifierID == _classifierID_1);
    if (_equals) {
      EList<Binding> _bindings = _self.getBindings();
      final Function1<Binding, Boolean> _function = (Binding b) -> {
        return Boolean.valueOf(BindingAspect.check(b, o));
      };
      boolean _forall = IterableExtensions.<Binding>forall(_bindings, _function);
      if (_forall) {
        ObjectTemplateAspect.currentObject(_self, o);
      }
    } else {
      ObjectTemplateAspect.currentObject(_self, null);
    }
  }
  
  protected static void _privk3_construct(final ObjectTemplateAspectObjectTemplateAspectProperties _self_, final ObjectTemplate _self) {
    EClass _type = _self.getType();
    EObject _create = EcoreUtil.create(_type);
    ObjectTemplateAspect.currentObject(_self, _create);
    EList<Binding> _bindings = _self.getBindings();
    for (final Binding b : _bindings) {
      BindingAspect.assign(b);
    }
  }
  
  protected static EObject _privk3_currentObject(final ObjectTemplateAspectObjectTemplateAspectProperties _self_, final ObjectTemplate _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getCurrentObject") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (org.eclipse.emf.ecore.EObject) ret;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.currentObject;
  }
  
  protected static void _privk3_currentObject(final ObjectTemplateAspectObjectTemplateAspectProperties _self_, final ObjectTemplate _self, final EObject currentObject) {
    _self_.currentObject = currentObject; try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setCurrentObject")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, currentObject);
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
  }
}
