/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.menu;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.PermadelerFactory;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.dialogs.SimplePropertiesFormDialog;

public class NewSpeciesAction {

	private static final String NEW_SPECIES_DIALOG_PAGE = "NewSpeciesDialog_Page"; //$NON-NLS-1$

	@Execute
	public void execute(PermadelerSession session, Shell shell) {
		Session siriusSession = session.getSession();
		TransactionalEditingDomain editingDomain = siriusSession.getTransactionalEditingDomain();
		editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {

			@Override
			protected void doExecute() {
				Species species = PermadelerFactory.eINSTANCE.createSpecies();
				session.getKnowledgeBase().getSpecies().add(species);

				SimplePropertiesFormDialog propertiesFormDialog = new SimplePropertiesFormDialog(shell, //
						species, siriusSession, CreateNewProjectMenu.DEFAULT_VIEWPOINT,
						NEW_SPECIES_DIALOG_PAGE);
				if (propertiesFormDialog.open() != IDialogConstants.OK_ID) {
					session.getKnowledgeBase().getSpecies().remove(species);
				}
			}

		});
	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null;
	}

}
