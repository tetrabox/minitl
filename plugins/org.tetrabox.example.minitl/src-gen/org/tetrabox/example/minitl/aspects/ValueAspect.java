package org.tetrabox.example.minitl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.tetrabox.example.minitl.minitl.Value;
import org.tetrabox.example.minitl.aspects.ValueAspectValueAspectProperties;

@Aspect(className = Value.class)
@SuppressWarnings("all")
public abstract class ValueAspect {
  @Abstract
  public static Object evaluate(final Value _self) {
	final org.tetrabox.example.minitl.aspects.ValueAspectValueAspectProperties _self_ = org.tetrabox.example.minitl.aspects.ValueAspectValueAspectContext
			.getSelf(_self);
	Object result = null;
	if (_self instanceof org.tetrabox.example.minitl.minitl.ObjectTemplateValue) {
		result = org.tetrabox.example.minitl.aspects.ObjectTemplateValueAspect
				.evaluate((org.tetrabox.example.minitl.minitl.ObjectTemplateValue) _self);
	} else if (_self instanceof org.tetrabox.example.minitl.minitl.FieldAccessValue) {
		result = org.tetrabox.example.minitl.aspects.FieldAccessValueAspect
				.evaluate((org.tetrabox.example.minitl.minitl.FieldAccessValue) _self);
	} else if (_self instanceof org.tetrabox.example.minitl.minitl.StringValue) {
		result = org.tetrabox.example.minitl.aspects.StringValueAspect
				.evaluate((org.tetrabox.example.minitl.minitl.StringValue) _self);
	} else if (_self instanceof org.tetrabox.example.minitl.minitl.BinaryExpression) {
		result = org.tetrabox.example.minitl.aspects.BinaryExpressionAspect
				.evaluate((org.tetrabox.example.minitl.minitl.BinaryExpression) _self);
	} else if (_self instanceof org.tetrabox.example.minitl.minitl.Value) {
		result = org.tetrabox.example.minitl.aspects.ValueAspect._privk3_evaluate(_self_,
				(org.tetrabox.example.minitl.minitl.Value) _self);
	} else {
		throw new IllegalArgumentException(
				"Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString());
	}
	;
	return (java.lang.Object) result;
}
  
  protected static Object _privk3_evaluate(final ValueAspectValueAspectProperties _self_, final Value _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
