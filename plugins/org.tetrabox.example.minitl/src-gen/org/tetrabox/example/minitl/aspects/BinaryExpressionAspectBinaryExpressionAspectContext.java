package org.tetrabox.example.minitl.aspects;

import java.util.Map;
import org.tetrabox.example.minitl.minitl.BinaryExpression;
import org.tetrabox.example.minitl.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties;

@SuppressWarnings("all")
public class BinaryExpressionAspectBinaryExpressionAspectContext {
  public final static BinaryExpressionAspectBinaryExpressionAspectContext INSTANCE = new BinaryExpressionAspectBinaryExpressionAspectContext();
  
  public static BinaryExpressionAspectBinaryExpressionAspectProperties getSelf(final BinaryExpression _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.minitl.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BinaryExpression, BinaryExpressionAspectBinaryExpressionAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.minitl.minitl.BinaryExpression, org.tetrabox.example.minitl.aspects.BinaryExpressionAspectBinaryExpressionAspectProperties>();
  
  public Map<BinaryExpression, BinaryExpressionAspectBinaryExpressionAspectProperties> getMap() {
    return map;
  }
}
