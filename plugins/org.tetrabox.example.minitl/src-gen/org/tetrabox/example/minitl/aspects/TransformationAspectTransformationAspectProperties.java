package org.tetrabox.example.minitl.aspects;

import java.util.List;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;

@SuppressWarnings("all")
public class TransformationAspectTransformationAspectProperties {
  public List<EObject> inputModel = new UniqueEList<EObject>();
  
  public List<EObject> outputModel = new UniqueEList<EObject>();
  
  public String inputModelURI;
  
  public String outputFilePath;
}
