package org.tetrabox.example.minitl.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.tetrabox.example.minitl.minitl.BinaryExpression;
import org.tetrabox.example.minitl.minitl.Operator;
import org.tetrabox.example.minitl.minitl.Value;
import org.eclipse.emf.common.util.EList;
import org.tetrabox.example.minitl.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties;
import org.tetrabox.example.minitl.aspects.ValueAspect;

@Aspect(className = BinaryExpression.class)
@SuppressWarnings("all")
public class BinaryExpressionAspect extends ValueAspect {
  @OverrideAspectMethod
  public static Object evaluate(final BinaryExpression _self) {
    final org.tetrabox.example.minitl.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties _self_ = org.tetrabox.example.minitl.aspects.BinaryExpressionAspectBinaryExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.tetrabox.example.minitl.minitl.BinaryExpression){
    					result = org.tetrabox.example.minitl.aspects.BinaryExpressionAspect._privk3_evaluate(_self_, (org.tetrabox.example.minitl.minitl.BinaryExpression)_self);
    } else  if (_self instanceof org.tetrabox.example.minitl.minitl.Value){
    					result = org.tetrabox.example.minitl.aspects.ValueAspect.evaluate((org.tetrabox.example.minitl.minitl.Value)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Object _privk3_evaluate(final BinaryExpressionAspectBinaryExpressionAspectProperties _self_, final BinaryExpression _self) {
    EList<Value> _expressions = _self.getExpressions();
    final Value left = _expressions.get(0);
    EList<Value> _expressions_1 = _self.getExpressions();
    final Value right = _expressions_1.get(1);
    final Object leftComputedValue = ValueAspect.evaluate(left);
    final Object rightComputedValue = ValueAspect.evaluate(right);
    Operator _operator = _self.getOperator();
    if (_operator != null) {
      switch (_operator) {
        case ADD:
          boolean _or = false;
          if ((leftComputedValue instanceof String)) {
            _or = true;
          } else {
            _or = (rightComputedValue instanceof String);
          }
          if (_or) {
            String _string = leftComputedValue.toString();
            String _string_1 = rightComputedValue.toString();
            return (_string + _string_1);
          }
          boolean _and = false;
          if (!(leftComputedValue instanceof Integer)) {
            _and = false;
          } else {
            _and = (rightComputedValue instanceof Integer);
          }
          if (_and) {
            return new Integer(((((Integer) leftComputedValue)).intValue() + (((Integer) rightComputedValue)).intValue()));
          }
          throw new RuntimeException("Incompatible types for addition operator.");
        case SUB:
          boolean _and_1 = false;
          if (!(leftComputedValue instanceof Integer)) {
            _and_1 = false;
          } else {
            _and_1 = (rightComputedValue instanceof Integer);
          }
          if (_and_1) {
            return new Integer(((((Integer) leftComputedValue)).intValue() - (((Integer) rightComputedValue)).intValue()));
          }
          throw new RuntimeException("Incompatible types for addition operator.");
        default:
          throw new RuntimeException("Not a valid operator.");
      }
    } else {
      throw new RuntimeException("Not a valid operator.");
    }
  }
}
