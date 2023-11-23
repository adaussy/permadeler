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

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.spreadsheet.SpreadsheetExtractFactorys;
import fr.adaussy.permadeler.rcp.internal.spreadsheet.SpreadsheetWriter;
import fr.adaussy.permadeler.rcp.internal.utils.DiagramSelectionHelper;

public class GeneratePlanationLegendSpreadsheetMenu {

	private static final String REPORTS = "reports"; //$NON-NLS-1$

	@Execute
	public void execute(PermadelerSession session, Shell shell) throws IOException {

		SpreadsheetWriter<Plantation> sWriter = SpreadsheetWriter.<Plantation> builder()//
				.withCandidatesProdvider(() -> DiagramSelectionHelper.getPlantationMapDiagramPlantations(session, shell))//
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
