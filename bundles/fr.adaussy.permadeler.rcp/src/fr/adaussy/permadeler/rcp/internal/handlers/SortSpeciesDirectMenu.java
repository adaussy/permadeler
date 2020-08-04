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

import static java.util.stream.Collectors.toList;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.ECollections;

import fr.adaussy.permadeler.model.Permadeler.Genus;
import fr.adaussy.permadeler.model.utils.Comparators;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;

public class SortSpeciesDirectMenu {
	@Execute
	public void execute(PermadelerSession session) {
		session.modifyKnowledgeBase("Sort plants", base -> {
			ECollections.sort(base.getPlantTypes(), Comparators.GENUS_CMP);
			for (Genus genus : base.getPlantTypes()) {
				ECollections.sort(genus.getSubGenus(), Comparators.GENUS_CMP);
			}
			for (Genus g : EMFUtils.getChildren(base, Genus.class).collect(toList())) {
				ECollections.sort(g.getSpecies(), Comparators.SPECIES_CMP);
			}
		});
	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null;
	}

}
