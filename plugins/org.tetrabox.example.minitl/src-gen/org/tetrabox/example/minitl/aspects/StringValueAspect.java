package org.tetrabox.example.minitl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.tetrabox.example.minitl.minitl.StringValue;
import org.tetrabox.example.minitl.aspects.StringValueAspectStringValueAspectProperties;
import org.tetrabox.example.minitl.aspects.ValueAspect;

@Aspect(className = StringValue.class)
@SuppressWarnings("all")
public class StringValueAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Object evaluate(final StringValue _self) {
	final org.tetrabox.example.minitl.aspects.StringValueAspectStringValueAspectProperties _self_ = org.tetrabox.example.minitl.aspects.StringValueAspectStringValueAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
}
  
  protected static Object _privk3_evaluate(final StringValueAspectStringValueAspectProperties _self_, final StringValue _self) {
    return _self.getValue();
  }
}
