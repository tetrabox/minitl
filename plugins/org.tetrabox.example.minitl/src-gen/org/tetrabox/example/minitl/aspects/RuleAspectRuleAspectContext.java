package org.tetrabox.example.minitl.aspects;

import java.util.Map;
import org.tetrabox.example.minitl.minitl.Rule;
import org.tetrabox.example.minitl.aspects.RuleAspectRuleAspectProperties;

@SuppressWarnings("all")
public class RuleAspectRuleAspectContext {
  public final static RuleAspectRuleAspectContext INSTANCE = new RuleAspectRuleAspectContext();
  
  public static RuleAspectRuleAspectProperties getSelf(final Rule _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.tetrabox.example.minitl.aspects.RuleAspectRuleAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Rule, RuleAspectRuleAspectProperties> map = new java.util.WeakHashMap<org.tetrabox.example.minitl.minitl.Rule, org.tetrabox.example.minitl.aspects.RuleAspectRuleAspectProperties>();
  
  public Map<Rule, RuleAspectRuleAspectProperties> getMap() {
    return map;
  }
}
