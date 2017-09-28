package org.tetrabox.example.minitl.aspects;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.InitializeModel;
import fr.inria.diverse.k3.al.annotationprocessor.Main;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.tetrabox.example.minitl.minitl.Metamodel;
import org.tetrabox.example.minitl.minitl.Rule;
import org.tetrabox.example.minitl.minitl.Transformation;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.tetrabox.example.minitl.aspects.RuleAspect;
import org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties;

@Aspect(className = Transformation.class)
@SuppressWarnings("all")
public class TransformationAspect {
  @InitializeModel
  @Step
  public static void initialize(final Transformation _self, final List<String> args) {
    final org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties _self_ = org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectContext.getSelf(_self);
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    	@Override
    	public void execute() {
    		_privk3_initialize(_self_, _self,args);
    	}
    };
    fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    if (stepManager != null) {
    	stepManager.executeStep(_self,command,"Transformation","initialize");
    } else {
    	command.execute();
    }
    ;;
  }
  
  @Main
  @Step
  public static void execute(final Transformation _self) {
	final org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties _self_ = org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectContext
			.getSelf(_self);
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
		@Override
		public void execute() {
			_privk3_execute(_self_, _self);
		}
	};
	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager manager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry
			.getInstance().findStepManager(_self);
	if (manager != null) {
		manager.executeStep(_self, command, "Transformation", "execute");
	} else {
		command.execute();
	}
	;
	;
}
  
  public static List<EObject> inputModel(final Transformation _self) {
	final org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties _self_ = org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_inputModel(_self_, _self);
	;
	return (java.util.List) result;
}
  
  public static void inputModel(final Transformation _self, final List<EObject> inputModel) {
    final org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties _self_ = org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectContext.getSelf(_self);
    _privk3_inputModel(_self_, _self,inputModel);;
  }
  
  public static List<EObject> outputModel(final Transformation _self) {
	final org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties _self_ = org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_outputModel(_self_, _self);
	;
	return (java.util.List) result;
}
  
  public static void outputModel(final Transformation _self, final List<EObject> outputModel) {
    final org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties _self_ = org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectContext.getSelf(_self);
    _privk3_outputModel(_self_, _self,outputModel);;
  }
  
  public static String inputModelURI(final Transformation _self) {
	final org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties _self_ = org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_inputModelURI(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void inputModelURI(final Transformation _self, final String inputModelURI) {
	final org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties _self_ = org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectContext
			.getSelf(_self);
	_privk3_inputModelURI(_self_, _self, inputModelURI);
	;
}
  
  public static String outputFilePath(final Transformation _self) {
	final org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties _self_ = org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectContext
			.getSelf(_self);
	Object result = null;
	result = _privk3_outputFilePath(_self_, _self);
	;
	return (java.lang.String) result;
}
  
  public static void outputFilePath(final Transformation _self, final String outputFilePath) {
	final org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectProperties _self_ = org.tetrabox.example.minitl.aspects.TransformationAspectTransformationAspectContext
			.getSelf(_self);
	_privk3_outputFilePath(_self_, _self, outputFilePath);
	;
}
  
  protected static void _privk3_initialize(final TransformationAspectTransformationAspectProperties _self_, final Transformation _self, final List<String> args) {
    String _get = args.get(0);
    TransformationAspect.inputModelURI(_self, _get);
    String _get_1 = args.get(1);
    TransformationAspect.outputFilePath(_self, _get_1);
    Resource _eResource = _self.eResource();
    final ResourceSet rs = _eResource.getResourceSet();
    String _inputModelURI = TransformationAspect.inputModelURI(_self);
    URI _createURI = URI.createURI(_inputModelURI);
    final Resource inputModelResource = rs.getResource(_createURI, true);
    Metamodel _inputMetamodel = _self.getInputMetamodel();
    boolean _notEquals = (!Objects.equal(_inputMetamodel, null));
    if (_notEquals) {
      Metamodel _inputMetamodel_1 = _self.getInputMetamodel();
      EList<EPackage> _packages = _inputMetamodel_1.getPackages();
      final Function1<EPackage, Set<EClass>> _function = (EPackage p) -> {
        TreeIterator<EObject> _eAllContents = p.eAllContents();
        Iterator<EClass> _filter = Iterators.<EClass>filter(_eAllContents, EClass.class);
        return IteratorExtensions.<EClass>toSet(_filter);
      };
      List<Set<EClass>> _map = ListExtensions.<EPackage, Set<EClass>>map(_packages, _function);
      Iterable<EClass> _flatten = Iterables.<EClass>concat(_map);
      final Set<EClass> allInputMetamodelClasses = IterableExtensions.<EClass>toSet(_flatten);
      List<EObject> _inputModel = TransformationAspect.inputModel(_self);
      TreeIterator<EObject> _allContents = inputModelResource.getAllContents();
      Set<EObject> _set = IteratorExtensions.<EObject>toSet(_allContents);
      _inputModel.addAll(_set);
      List<EObject> _inputModel_1 = TransformationAspect.inputModel(_self);
      for (final EObject o : _inputModel_1) {
        EClass _eClass = o.eClass();
        boolean _contains = allInputMetamodelClasses.contains(_eClass);
        boolean _not = (!_contains);
        if (_not) {
          EClass _eClass_1 = o.eClass();
          String _plus = ("The input model does not conform to the input metamodel: type " + _eClass_1);
          String _plus_1 = (_plus + " of object ");
          String _plus_2 = (_plus_1 + o);
          String _plus_3 = (_plus_2 + " is unknown");
          throw new RuntimeException(_plus_3);
        }
      }
    }
  }
  
  protected static void _privk3_execute(final TransformationAspectTransformationAspectProperties _self_, final Transformation _self) {
    try {
      EList<Rule> _rules = _self.getRules();
      for (final Rule r : _rules) {
        RuleAspect.apply(r);
      }
      if (((!Objects.equal(TransformationAspect.outputFilePath(_self), null)) && (!Objects.equal(TransformationAspect.outputFilePath(_self), "")))) {
        Resource _eResource = _self.eResource();
        final ResourceSet rs = _eResource.getResourceSet();
        String _outputFilePath = TransformationAspect.outputFilePath(_self);
        final File outputFile = new File(_outputFilePath);
        boolean _exists = outputFile.exists();
        if (_exists) {
          outputFile.delete();
        }
        File _parentFile = outputFile.getParentFile();
        _parentFile.mkdirs();
        String _absolutePath = outputFile.getAbsolutePath();
        final URI outputModelURI = URI.createFileURI(_absolutePath);
        final Resource inputModelResource = rs.createResource(outputModelURI);
        EList<EObject> _contents = inputModelResource.getContents();
        List<EObject> _outputModel = TransformationAspect.outputModel(_self);
        _contents.addAll(_outputModel);
        inputModelResource.save(null);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected static List<EObject> _privk3_inputModel(final TransformationAspectTransformationAspectProperties _self_, final Transformation _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInputModel") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.inputModel;
  }
  
  protected static void _privk3_inputModel(final TransformationAspectTransformationAspectProperties _self_, final Transformation _self, final List<EObject> inputModel) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInputModel")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, inputModel);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.inputModel = inputModel;
    }
  }
  
  protected static List<EObject> _privk3_outputModel(final TransformationAspectTransformationAspectProperties _self_, final Transformation _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOutputModel") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.util.List) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.outputModel;
  }
  
  protected static void _privk3_outputModel(final TransformationAspectTransformationAspectProperties _self_, final Transformation _self, final List<EObject> outputModel) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOutputModel")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, outputModel);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.outputModel = outputModel;
    }
  }
  
  protected static String _privk3_inputModelURI(final TransformationAspectTransformationAspectProperties _self_, final Transformation _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getInputModelURI") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.inputModelURI;
  }
  
  protected static void _privk3_inputModelURI(final TransformationAspectTransformationAspectProperties _self_, final Transformation _self, final String inputModelURI) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setInputModelURI")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, inputModelURI);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.inputModelURI = inputModelURI;
    }
  }
  
  protected static String _privk3_outputFilePath(final TransformationAspectTransformationAspectProperties _self_, final Transformation _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getOutputFilePath") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (java.lang.String) ret;
    				} else {
    					return null;
    				}
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.outputFilePath;
  }
  
  protected static void _privk3_outputFilePath(final TransformationAspectTransformationAspectProperties _self_, final Transformation _self, final String outputFilePath) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setOutputFilePath")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, outputFilePath);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.outputFilePath = outputFilePath;
    }
  }
}
