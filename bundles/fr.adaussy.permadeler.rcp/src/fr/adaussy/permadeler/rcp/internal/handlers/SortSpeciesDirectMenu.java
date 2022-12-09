/*******************************************************************************
 * Copyright (c) 2020 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.ECollections;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.utils.Comparators;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class SortSpeciesDirectMenu {
	@Execute
	public void execute(PermadelerSession session) {
		session.modifyKnowledgeBase(RcpMessages.SortSpeciesDirectMenu_0, base -> {
			ECollections.sort(base.getPlantTypes(), Comparators.<Plant> buildComparator());
		});
	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null;
	}

}
