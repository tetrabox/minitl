package org.tetrabox.example.minitl.aspects;

import java.util.Map;
import org.tetrabox.example.minitl.minitl.Transformation;
import org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties;

@SuppressWarnings("all")
public class TransformationAspectTransformationAspectContext {
  public final static TransformationAspectTransformationAspectContext INSTANCE = new TransformationAspectTransformationAspectContext();
  
  public static TransformationAspectTransformationAspectProperties getSelf(final Transformation _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Transformation, TransformationAspectTransformationAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.minitl.minitl.Transformation, org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties>();
  
  public Map<Transformation, TransformationAspectTransformationAspectProperties> getMap() {
    return map;
  }
}
