
package fr.adaussy.permadeler.rcp.internal.handlers;

import java.util.Collections;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.actions.FocusOnElementAction;
import fr.adaussy.permadeler.rcp.internal.dialogs.NewSpeciesTypeDialog;
import fr.adaussy.permadeler.rcp.services.FillService;

/**
 * Handler used to create a Plant
 * 
 * @author Arthur Daussy
 */
public class AddPlantHandler {
	private static final String SPACE = " ";

	@Execute
	public void execute(Shell shell, PermadelerSession session) {
		NewSpeciesTypeDialog dialog = new NewSpeciesTypeDialog(shell);
		if (dialog.open() == Dialog.OK) {
			Plant[] newPlant = new Plant[1];
			session.modifyKnowledgeBase("Add plant", base -> {
				String genusName = dialog.getGenus();
				String subGenusName = dialog.getSubGenus();
				Genus genus = FillService.getOrCreateGenus(base, genusName.trim());

				if (dialog.getSubGenus() != null) {
					genus = FillService.getOrCreateSubGenus(genus,
							genusName.trim() + SPACE + subGenusName.trim());
				}

				Plant p = PermadelerFactory.eINSTANCE.createPlant();
				p.setName(dialog.getPlantName());
				p.setLatinName(dialog.getGenus() + SPACE
						+ (dialog.getSubGenus() != null ? (dialog.getSubGenus() + SPACE) : "")
						+ dialog.getPlantName());
				genus.getSpecies().add(p);

				newPlant[0] = p;
			});

			if (newPlant[0] != null) {
				shell.getDisplay().asyncExec(() -> {
					FocusOnElementAction.selectInViewExplorer(Collections.singletonList(newPlant[0]),
							PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
									.getActivePart().getSite().getId());
				});
			}
		}
	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null && session.getKnowledgeBase() != null;
	}

}
