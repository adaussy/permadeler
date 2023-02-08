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

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;
import fr.adaussy.permadeler.rcp.internal.spreadsheet.SpreadsheetExtractFactorys;
import fr.adaussy.permadeler.rcp.internal.spreadsheet.SpreadsheetWriter;

public class GeneratePlanationLegendSpreadsheetMenu {

	private static final String REPORTS = "reports"; //$NON-NLS-1$

	private List<Plantation> provideCandidates(PermadelerSession session, Shell shell) {
		ObjectSelectionDialog<PlantationPhase> selectionDialog = new ObjectSelectionDialog<PlantationPhase>(
				shell, PlantationPhase.class, e -> true, session.getRoot());
		if (selectionDialog.open() == IDialogConstants.OK_ID) {
			List<PlantationPhase> zones = selectionDialog.getSelection();
			return zones.stream()//
					.flatMap(z -> EMFUtils.allContainedObjectOfType(z, Plantation.class))//
					.filter(p -> p.getType() != null)//
					.distinct()//
					.sorted(Comparator.comparing(p -> p.getId()))//
					.toList();//
		}
		return List.of();

	}

	@Execute
	public void execute(PermadelerSession session, Shell shell) throws IOException {

		SpreadsheetWriter<Plantation> sWriter = SpreadsheetWriter.<Plantation> builder()//
				.withCandidatesProdvider(() -> provideCandidates(session, shell))//
				.withTargetFolder(session.getRootFolder().resolve(REPORTS))//
				.withNameProvider(() -> "Plantation-legend")// //$NON-NLS-1$
				.withShellSupplier(() -> shell)//
				.withExtractors(SpreadsheetExtractFactorys.buildPlantationLegendExtractor())//
				.build();

		sWriter.writte(true);

	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null;
	}

}
