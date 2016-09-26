package org.tetrabox.example.minitl.aspects;

import java.util.Map;
import org.tetrabox.example.minitl.minitl.ObjectTemplateValue;
import org.tetrabox.example.minitl.aspects.ObjectTemplateValueAspectObjectTemplateValueAspectProperties;

@SuppressWarnings("all")
public class ObjectTemplateValueAspectObjectTemplateValueAspectContext {
  public final static ObjectTemplateValueAspectObjectTemplateValueAspectContext INSTANCE = new ObjectTemplateValueAspectObjectTemplateValueAspectContext();
  
  public static ObjectTemplateValueAspectObjectTemplateValueAspectProperties getSelf(final ObjectTemplateValue _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.minitl.aspects.ObjectTemplateValueAspectObjectTemplateValueAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ObjectTemplateValue, ObjectTemplateValueAspectObjectTemplateValueAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.minitl.minitl.ObjectTemplateValue, org.tetrabox.example.minitl.aspects.ObjectTemplateValueAspectObjectTemplateValueAspectProperties>();
  
  public Map<ObjectTemplateValue, ObjectTemplateValueAspectObjectTemplateValueAspectProperties> getMap() {
    return map;
  }
}
