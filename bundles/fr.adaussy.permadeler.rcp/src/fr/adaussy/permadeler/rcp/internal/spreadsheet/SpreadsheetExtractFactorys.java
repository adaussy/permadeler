/*******************************************************************************
 * Copyright (c) 2023 Arthur Daussy.
 *
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License 2.0 
 * which is available at https://www.eclipse.org/legal/epl-2.0/ 
 * Contributors:
 * Arthur Daussy - initial API and implementation.
 ******************************************************************************/
package fr.adaussy.permadeler.rcp.internal.spreadsheet;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.sirius.business.api.session.SessionManager;

import fr.adaussy.permadeler.model.Permadeler.PermadelerPackage;
import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.services.LabelService;
import fr.adaussy.permadeler.rcp.services.MonthService;

public class SpreadsheetExtractFactorys {

	public static List<ColumnExtractor<Pair<Plant, Production>>> buildAllProductionExtractor() {
		List<ColumnExtractor<Pair<Plant, Production>>> columns = new ArrayList<ColumnExtractor<Pair<Plant, Production>>>();

		columns.add(ColumnExtractor.build(RcpMessages.GenerateProductionSpreadsheetMenu_6,
				p -> p.getOne().getName()));
		columns.add(ColumnExtractor.build(RcpMessages.GenerateProductionSpreadsheetMenu_7,
				p -> p.getOne().getFullLatinName()));
		columns.add(ColumnExtractor.build(RcpMessages.GenerateProductionSpreadsheetMenu_8,
				p -> LabelService.getEditLabel(p.getTwo().getType())));
		columns.add(ColumnExtractor.build(RcpMessages.GenerateProductionSpreadsheetMenu_9,
				p -> p.getTwo().getName()));
		columns.add(ColumnExtractor.build(RcpMessages.SpreadsheetExtractFactorys_30,
				p -> String.valueOf(getPlantationOfType(p.getOne()).size())));

		columns.add(ColumnExtractor.build(RcpMessages.GenerateProductionSpreadsheetMenu_10,
				p -> p.getTwo().isEatable() ? RcpMessages.GenerateProductionSpreadsheetMenu_23
						: RcpMessages.GenerateProductionSpreadsheetMenu_24));

		MonthService mService = new MonthService();
		String[] months = new DateFormatSymbols().getShortMonths();
		for (int i = 1; i <= 12; i++) {
			final int month = i;
			columns.add(ColumnExtractor.build(months[i - 1],
					p -> mService.getMonthLabel(month, p.getTwo().getPeriod())));

		}

		return columns;
	}

	public static List<ColumnExtractor<Pair<Plant, Production>>> buildHoneyPlantProductionExtractor() {
		List<ColumnExtractor<Pair<Plant, Production>>> columns = new ArrayList<ColumnExtractor<Pair<Plant, Production>>>();

		columns.add(ColumnExtractor.build(RcpMessages.GenerateProductionSpreadsheetMenu_6,
				p -> p.getOne().getName()));
		columns.add(ColumnExtractor.build(RcpMessages.GenerateProductionSpreadsheetMenu_7,
				p -> p.getOne().getFullLatinName()));
		columns.add(ColumnExtractor.build(RcpMessages.SpreadsheetExtractFactorys_30, // $NON-NLS-1$
				p -> String.valueOf(getPlantationOfType(p.getOne()).size())));

		MonthService mService = new MonthService();
		String[] months = new DateFormatSymbols().getShortMonths();
		for (int i = 1; i <= 12; i++) {
			final int month = i;
			columns.add(ColumnExtractor.build(months[i - 1],
					p -> mService.getMonthLabel(month, p.getTwo().getPeriod())));

		}

		return columns;
	}

	private static List<Plantation> getPlantationOfType(Plant p) {
		ECrossReferenceAdapter semanticCrossReferencer = SessionManager.INSTANCE.getSession(p)
				.getSemanticCrossReferencer();
		return EMFUtils.getInverse(p, Plantation.class, PermadelerPackage.eINSTANCE.getPlantation_Type(),
				semanticCrossReferencer);
	}
}
