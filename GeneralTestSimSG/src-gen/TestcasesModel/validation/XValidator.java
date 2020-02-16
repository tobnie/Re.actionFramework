/**
 *
 * $Id$
 */
package TestcasesModel.validation;

import TestcasesModel.P_s;
import TestcasesModel.U_s;

import reactionContainer.Agent;

/**
 * A sample validator interface for {@link TestcasesModel.X}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface XValidator {
	boolean validate();

	boolean validateX_y(Agent value);

	boolean validateX_z(Agent value);

	boolean validateX_z_u(U_s value);

	boolean validateX_z_p(P_s value);
}
