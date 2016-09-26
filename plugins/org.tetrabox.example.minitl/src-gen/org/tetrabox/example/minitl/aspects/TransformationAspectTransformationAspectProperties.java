package org.tetrabox.example.minitl.aspects;

import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class TransformationAspectTransformationAspectProperties {
  public final Set<EObject> inputModel = new HashSet<EObject>();
  
  public final Set<EObject> outputModel = new HashSet<EObject>();
  
  public String inputModelURI;
  
  public String outputFilePath;
}
