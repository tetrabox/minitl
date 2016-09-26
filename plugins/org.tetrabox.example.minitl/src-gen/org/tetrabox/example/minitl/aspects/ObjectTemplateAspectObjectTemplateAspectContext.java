package org.tetrabox.example.minitl.aspects;

import java.util.Map;
import org.tetrabox.example.minitl.minitl.ObjectTemplate;
import org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectProperties;

@SuppressWarnings("all")
public class ObjectTemplateAspectObjectTemplateAspectContext {
  public final static ObjectTemplateAspectObjectTemplateAspectContext INSTANCE = new ObjectTemplateAspectObjectTemplateAspectContext();
  
  public static ObjectTemplateAspectObjectTemplateAspectProperties getSelf(final ObjectTemplate _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ObjectTemplate, ObjectTemplateAspectObjectTemplateAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.minitl.minitl.ObjectTemplate, org.tetrabox.example.minitl.aspects.ObjectTemplateAspectObjectTemplateAspectProperties>();
  
  public Map<ObjectTemplate, ObjectTemplateAspectObjectTemplateAspectProperties> getMap() {
    return map;
  }
}
