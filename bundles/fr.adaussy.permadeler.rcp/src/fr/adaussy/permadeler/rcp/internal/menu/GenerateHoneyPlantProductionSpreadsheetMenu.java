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

import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.collections.impl.tuple.Tuples;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;

import com.google.common.base.Strings;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.ProductionType;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.spreadsheet.SpreadsheetExtractFactorys;
import fr.adaussy.permadeler.rcp.internal.spreadsheet.SpreadsheetWriter;
import fr.adaussy.permadeler.rcp.internal.utils.SemanticSelectionHelper;

public class GenerateHoneyPlantProductionSpreadsheetMenu {

	private static final String REPORTS = "reports"; //$NON-NLS-1$

	private List<Pair<Plant, Production>> provideCandidates(PermadelerSession session, Shell shell) {

		return SemanticSelectionHelper.selectZone(shell, session)
				.<List<Plantation>> map(z -> z.getAllPlantations())//
				.orElse(List.of()).stream()//
				.flatMap(p -> p.getType().getAllProductions().stream()
						.filter(pr -> pr.getType() == ProductionType.FLOWER)
						.map(prod -> Tuples.pair(p.getType(), prod)))//
				.distinct()//
				.sorted(Comparator.comparing(pair -> Strings.nullToEmpty(pair.getOne().getName())))//
				.toList();//

	}

	@Execute
	public void execute(PermadelerSession session, Shell shell) throws IOException {

		SpreadsheetWriter<Pair<Plant, Production>> sWriter = SpreadsheetWriter
				.<Pair<Plant, Production>> builder()//
				.withCandidatesProdvider(() -> provideCandidates(session, shell))//
				.withTargetFolder(session.getRootFolder().resolve(REPORTS))//
				.withNameProvider(() -> "HoneyPlant-flower-productions")// //$NON-NLS-1$
				.withShellSupplier(() -> shell)//
				.withExtractors(SpreadsheetExtractFactorys.buildHoneyPlantProductionExtractor())//
				.build();

		sWriter.writte(true);

	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null;
	}

}
