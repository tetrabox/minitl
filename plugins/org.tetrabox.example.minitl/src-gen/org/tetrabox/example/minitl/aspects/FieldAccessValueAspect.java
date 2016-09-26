package org.tetrabox.example.minitl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.tetrabox.example.minitl.minitl.FieldAccessValue;
import org.tetrabox.example.minitl.minitl.Value;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tetrabox.example.minitl.aspects.FieldAccessValueAspectFieldAccessValueAspectProperties;
import org.tetrabox.example.minitl.aspects.ValueAspect;

@Aspect(className = FieldAccessValue.class)
@SuppressWarnings("all")
public class FieldAccessValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Object evaluate(final FieldAccessValue _self) {
    final org.tetrabox.example.minitl.aspects.FieldAccessValueAspectFieldAccessValueAspectProperties _self_ = org.tetrabox.example.minitl.aspects.FieldAccessValueAspectFieldAccessValueAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.example.minitl.minitl.FieldAccessValue){
    					result = org.tetrabox.example.minitl.aspects.FieldAccessValueAspect._privk3_evaluate(_self_, (org.tetrabox.example.minitl.minitl.FieldAccessValue)_self);
    } else  if (_self instanceof org.tetrabox.example.minitl.minitl.Value){
    					result = org.tetrabox.example.minitl.aspects.ValueAspect.evaluate((org.tetrabox.example.minitl.minitl.Value)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_evaluate(final FieldAccessValueAspectFieldAccessValueAspectProperties _self_, final FieldAccessValue _self) {
    Value _object = _self.getObject();
    Object _evaluate = ValueAspect.evaluate(_object);
    EStructuralFeature _feature = _self.getFeature();
    return ((EObject) _evaluate).eGet(_feature);
  }
}
