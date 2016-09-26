package org.tetrabox.example.minitl.aspects;

import java.util.Map;
import org.tetrabox.example.minitl.minitl.Binding;
import org.tetrabox.example.minitl.aspects.BindingAspectBindingAspectProperties;

@SuppressWarnings("all")
public class BindingAspectBindingAspectContext {
  public final static BindingAspectBindingAspectContext INSTANCE = new BindingAspectBindingAspectContext();
  
  public static BindingAspectBindingAspectProperties getSelf(final Binding _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.minitl.aspects.BindingAspectBindingAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Binding, BindingAspectBindingAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.minitl.minitl.Binding, org.tetrabox.example.minitl.aspects.BindingAspectBindingAspectProperties>();
  
  public Map<Binding, BindingAspectBindingAspectProperties> getMap() {
    return map;
  }
}
