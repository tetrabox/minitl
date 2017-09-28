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
	final org.tetrabox.example.minitl.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties _self_ = org.tetrabox.example.minitl.aspects.BinaryExpressionAspectBinaryExpressionAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_evaluate(_self_, _self);
	;
	return (java.lang.Object) result;
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
          if (((leftComputedValue instanceof String) || (rightComputedValue instanceof String))) {
            String _string = leftComputedValue.toString();
            String _string_1 = rightComputedValue.toString();
            return (_string + _string_1);
          }
          if (((leftComputedValue instanceof Integer) && (rightComputedValue instanceof Integer))) {
            return new Integer(((((Integer) leftComputedValue)).intValue() + (((Integer) rightComputedValue)).intValue()));
          }
          throw new RuntimeException("Incompatible types for addition operator.");
        case SUB:
          if (((leftComputedValue instanceof Integer) && (rightComputedValue instanceof Integer))) {
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
