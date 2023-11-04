/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 * Obeo - Method refreshRepresentations 
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.actions;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.model.Permadeler.KnowledgeBase;
import fr.adaussy.permadeler.model.Permadeler.PlantGroup;
import fr.adaussy.permadeler.model.Permadeler.Species;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.RcpPlugin;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;

public class AddToGroupAction extends AbstractModelAction {

	private final PlantGroup group;

	public AddToGroupAction(Session session, PlantGroup group) {
		super("Ajouter des plantes",
				RcpPlugin.imageDescriptorFromPlugin("fr.adaussy.permadeler.rcp", "/icons/add.gif"), session); //$NON-NLS-1$ //$NON-NLS-2$
		this.group = group;
	}

	@Override
	public void runWithEvent(Event event) {
		KnowledgeBase knowledge = EMFUtils.getAncestor(KnowledgeBase.class, group);
		ObjectSelectionDialog<Species> planSelectionDialog = new ObjectSelectionDialog<Species>(
				event.display.getActiveShell(), Species.class, e -> true, knowledge);
		planSelectionDialog.setMulti(true);
		if (planSelectionDialog.open() == IDialogConstants.OK_ID) {
			modifyModel(() -> {
				group.getSpecies().addAll(planSelectionDialog.getSelection());
			});
		}
		super.runWithEvent(event);
	}

}
