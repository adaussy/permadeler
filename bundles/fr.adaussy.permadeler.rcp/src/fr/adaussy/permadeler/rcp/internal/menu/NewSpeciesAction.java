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

import java.util.Collections;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.actions.FocusOnElementAction;
import fr.adaussy.permadeler.rcp.internal.dialogs.SimplePropertiesFormDialog;
import fr.adaussy.permadeler.rcp.internal.dialogs.TemplateSelectionDialog;
import fr.adaussy.permadeler.rcp.internal.parts.KnowledgeViewerPart;

public class NewSpeciesAction {

	public static final String NEW_SPECIES_DIALOG_PAGE = "NewSpeciesDialog_Page"; //$NON-NLS-1$

	@Execute
	public void execute(PermadelerSession session, Shell shell) {

		TemplateSelectionDialog templateSelection = new TemplateSelectionDialog(shell, session);

		if (templateSelection.open() == IDialogConstants.OK_ID && templateSelection.getSelection() != null) {

			Species template = templateSelection.getSelection();
			Species species = EcoreUtil.copy(template);
			species.setName("");
			species.setShortName(null);

			Session siriusSession = session.getSession();
			TransactionalEditingDomain editingDomain = siriusSession.getTransactionalEditingDomain();
			editingDomain.getCommandStack().execute(new RecordingCommand(editingDomain) {

				@Override
				protected void doExecute() {
					session.getKnowledgeBase().getSpecies().add(species);

					SimplePropertiesFormDialog propertiesFormDialog = new SimplePropertiesFormDialog(shell, //
							species, siriusSession, CreateNewProjectMenu.DEFAULT_VIEWPOINT,
							NEW_SPECIES_DIALOG_PAGE);
					if (propertiesFormDialog.open() != IDialogConstants.OK_ID) {
						session.getKnowledgeBase().getSpecies().remove(species);
					} else {
						FocusOnElementAction.selectInViewExplorer(Collections.singletonList(species),
								KnowledgeViewerPart.ID);
					}
				}

			});
		}

	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null;
	}

}
