/*
 * generated by Xtext 2.27.0
 */
package org.tetrabox.example.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMinitlValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.tetrabox.example.minitl.MinitlPackage.eINSTANCE);
		return result;
	}
}