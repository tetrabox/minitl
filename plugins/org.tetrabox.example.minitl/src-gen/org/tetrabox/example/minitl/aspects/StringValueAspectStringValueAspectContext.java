package org.tetrabox.example.minitl.aspects;

import java.util.Map;
import org.tetrabox.example.minitl.minitl.StringValue;
import org.tetrabox.example.minitl.aspects.StringValueAspectStringValueAspectProperties;

@SuppressWarnings("all")
public class StringValueAspectStringValueAspectContext {
  public final static StringValueAspectStringValueAspectContext INSTANCE = new StringValueAspectStringValueAspectContext();
  
  public static StringValueAspectStringValueAspectProperties getSelf(final StringValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.minitl.aspects.StringValueAspectStringValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<StringValue, StringValueAspectStringValueAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.minitl.minitl.StringValue, org.tetrabox.example.minitl.aspects.StringValueAspectStringValueAspectProperties>();
  
  public Map<StringValue, StringValueAspectStringValueAspectProperties> getMap() {
    return map;
  }
}
