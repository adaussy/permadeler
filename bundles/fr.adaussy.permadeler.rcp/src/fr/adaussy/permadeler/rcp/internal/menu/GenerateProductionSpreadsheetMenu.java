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

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.collections.impl.tuple.Tuples;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;
import fr.adaussy.permadeler.rcp.internal.spreadsheet.SpreadsheetExtractFactorys;
import fr.adaussy.permadeler.rcp.internal.spreadsheet.SpreadsheetWriter;

public class GenerateProductionSpreadsheetMenu {

	private static final String REPORTS = "reports"; //$NON-NLS-1$

	private List<Pair<Plant, Production>> provideCandidates(PermadelerSession session, Shell shell) {
		ObjectSelectionDialog<Zone> selectionDialog = new ObjectSelectionDialog<Zone>(shell, Zone.class,
				e -> true, session.getRoot());
		if (selectionDialog.open() == IDialogConstants.OK_ID) {
			List<Zone> zones = selectionDialog.getSelection();
			return zones.stream()//
					.flatMap(z -> getPhases(z, shell))//
					.flatMap(z -> EMFUtils.allContainedObjectOfType(z, Plantation.class))//
					.filter(p -> p.getType() != null)//
					.flatMap(p -> p.getType().getAllProductions().stream()
							.map(prod -> Tuples.pair(p.getType(), prod)))//
					.distinct()//
					.sorted(Comparator.comparing(pair -> pair.getOne().getName()))//
					.toList();//
		}
		return List.of();

	}

	@Execute
	public void execute(PermadelerSession session, Shell shell) throws IOException {

		SpreadsheetWriter<Pair<Plant, Production>> sWriter = SpreadsheetWriter
				.<Pair<Plant, Production>> builder()//
				.withCandidatesProdvider(() -> provideCandidates(session, shell))//
				.withTargetFolder(session.getRootFolder().resolve(REPORTS))//
				.withNameProvider(() -> "Plantation-productions")// //$NON-NLS-1$
				.withShellSupplier(() -> shell)//
				.withExtractors(SpreadsheetExtractFactorys.buildAllProductionExtractor())//
				.build();

		sWriter.writte(true);

	}

	private Stream<PlantationPhase> getPhases(Zone z, Shell shell) {
		EList<PlantationPhase> phases = z.getPhases();
		if (phases.isEmpty()) {
			return Stream.empty();
		} else if (phases.size() == 1) {
			return Stream.of(phases.get(0));
		} else {
			ObjectSelectionDialog<PlantationPhase> dialog = new ObjectSelectionDialog<PlantationPhase>(shell,
					PlantationPhase.class, e -> true, z);
			dialog.setInitialSelection(List.of(phases.get(0)));
			if (dialog.open() == IDialogConstants.OK_ID) {
				return dialog.getSelection().stream();
			} else {
				return Stream.empty();
			}
		}
	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null;
	}

}
