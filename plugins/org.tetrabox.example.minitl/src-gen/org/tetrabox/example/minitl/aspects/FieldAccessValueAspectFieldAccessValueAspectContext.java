package org.tetrabox.example.minitl.aspects;

import java.util.Map;
import org.tetrabox.example.minitl.minitl.FieldAccessValue;
import org.tetrabox.example.minitl.aspects.FieldAccessValueAspectFieldAccessValueAspectProperties;

@SuppressWarnings("all")
public class FieldAccessValueAspectFieldAccessValueAspectContext {
  public final static FieldAccessValueAspectFieldAccessValueAspectContext INSTANCE = new FieldAccessValueAspectFieldAccessValueAspectContext();
  
  public static FieldAccessValueAspectFieldAccessValueAspectProperties getSelf(final FieldAccessValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.minitl.aspects.FieldAccessValueAspectFieldAccessValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<FieldAccessValue, FieldAccessValueAspectFieldAccessValueAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.minitl.minitl.FieldAccessValue, org.tetrabox.example.minitl.aspects.FieldAccessValueAspectFieldAccessValueAspectProperties>();
  
  public Map<FieldAccessValue, FieldAccessValueAspectFieldAccessValueAspectProperties> getMap() {
    return map;
  }
}
