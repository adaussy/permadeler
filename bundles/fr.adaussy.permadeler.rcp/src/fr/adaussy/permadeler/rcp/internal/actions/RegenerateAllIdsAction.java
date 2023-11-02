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

import java.text.MessageFormat;
import java.util.List;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.swt.widgets.Event;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.util.IDUtils;
import fr.adaussy.permadeler.rcp.RcpPlugin;

public class RegenerateAllIdsAction extends AbstractModelAction {

	private List<Plant> plants;

	public RegenerateAllIdsAction(Session session, List<Plant> plants) {
		super("Regénerer les noms court", RcpPlugin.imageDescriptorFromPlugin("org.eclipse.jdt.ui",
				"/icons/full/obj16/classf_generate.png"), session);
		this.plants = plants;
	}

	@Override
	public void runWithEvent(Event event) {

		if (!MessageDialog.openConfirm(event.display.getActiveShell(), "Confirmation", MessageFormat.format(
				"Vous êtes sur le point de regénerer les noms courts de {0} plantes et tous les IDs de vos plantations. Voulez vous continuer?",
				plants.size()))) {
			return;
		}

		modifyModel(() -> {
			// Regenerate all plant id
			for (Plant s : plants) {
				s.setShortName(IDUtils.generateShortName(s));
				s.getPlantations().forEach(plantation -> {
					plantation.setId(IDUtils.generateId(plantation));
				});
			}

		});
	}

}
