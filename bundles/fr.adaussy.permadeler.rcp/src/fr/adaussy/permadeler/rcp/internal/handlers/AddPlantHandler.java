
package fr.adaussy.permadeler.rcp.internal.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.wizards.NewSpeciesWizard;

/**
 * Handler used to create a Plant
 * 
 * @author Arthur Daussy
 */
public class AddPlantHandler {

	@Execute
	public void execute(Shell shell, PermadelerSession session) {
		NewSpeciesWizard wizard = new NewSpeciesWizard(session);
		WizardDialog dialog = new WizardDialog(shell, wizard);

		dialog.open();
	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null && session.getKnowledgeBase() != null;
	}

}
