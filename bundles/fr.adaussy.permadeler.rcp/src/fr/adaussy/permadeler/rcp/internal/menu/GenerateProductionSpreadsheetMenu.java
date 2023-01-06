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

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;
import fr.adaussy.permadeler.rcp.services.LabelService;
import fr.adaussy.permadeler.rcp.services.MonthService;

public class GenerateProductionSpreadsheetMenu {

	@Execute
	public void execute(PermadelerSession session, Shell shell) throws IOException {

		ObjectSelectionDialog<Zone> selectionDialog = new ObjectSelectionDialog<Zone>(shell, Zone.class,
				e -> true, session.getRoot());

		if (selectionDialog.open() == IDialogConstants.OK_ID) {
			List<Zone> zones = selectionDialog.getSelection();

			List<Plant> plantationWithProd = zones.stream()
					.flatMap(z -> EMFUtils.allContainedObjectOfType(z, Plantation.class))//
					.filter(p -> p.getType() != null).map(p -> p.getType())//
					.filter(p -> !p.getProductions().isEmpty())//
					.distinct()//
					.sorted(Comparator.comparing(Plant::getName))//
					.toList();//

			if (!plantationWithProd.isEmpty()) {
				// Blank workbook
				try (XSSFWorkbook workbook = new XSSFWorkbook()) {
					int rownum = 0;
					// Create a blank sheet
					XSSFSheet sheet = workbook.createSheet("Plantation productions");
					createHeaders(sheet.createRow(rownum++));
					for (Plant p : plantationWithProd) {
						for (Production prod : p.getProductions()) {
							Row row = sheet.createRow(rownum++);
							fillRow(p, prod, row);

						}
					}

					Path reportFolder = session.getRootFolder().resolve("reports");
					if (!reportFolder.toFile().exists()) {
						reportFolder.toFile().mkdirs();
					}

					String fileName = "Productions_"
							+ new SimpleDateFormat("yyyyMMddHHmm'.xlsx'").format(new Date());
					File targetFile = reportFolder.resolve(fileName).toFile();
					try (FileOutputStream out = new FileOutputStream(targetFile)) {
						workbook.write(out);
					}
					Desktop.getDesktop().open(targetFile);
				}

			}
		}

	}

	private void createHeaders(Row row) {
		int cellnum = 0;
		row.createCell(cellnum++).setCellValue("Nom");
		row.createCell(cellnum++).setCellValue("Nom Latin");
		row.createCell(cellnum++).setCellValue("Espece");
		row.createCell(cellnum++).setCellValue("Type de production");
		row.createCell(cellnum++).setCellValue("Nom de Production");
		row.createCell(cellnum++).setCellValue("Comestible");
		row.createCell(cellnum++).setCellValue("Jan.");
		row.createCell(cellnum++).setCellValue("Fev.");
		row.createCell(cellnum++).setCellValue("Mars");
		row.createCell(cellnum++).setCellValue("Avr.");
		row.createCell(cellnum++).setCellValue("Mai");
		row.createCell(cellnum++).setCellValue("Juin");
		row.createCell(cellnum++).setCellValue("Jui.");
		row.createCell(cellnum++).setCellValue("Aout.");
		row.createCell(cellnum++).setCellValue("Step.");
		row.createCell(cellnum++).setCellValue("Oct.");
		row.createCell(cellnum++).setCellValue("Nov.");
		row.createCell(cellnum++).setCellValue("Dec.");
	}

	private void fillRow(Plant plant, Production p, Row row) {
		int cellnum = 0;
		row.createCell(cellnum++).setCellValue(plant.getName());
		row.createCell(cellnum++).setCellValue(plant.getLatinName());
		row.createCell(cellnum++).setCellValue(plant.getGenus() + " " + plant.getSpecies()); //$NON-NLS-1$
		row.createCell(cellnum++).setCellValue(LabelService.getEditLabel(p.getType())); // $NON-NLS-1$
		row.createCell(cellnum++).setCellValue(p.getName()); // $NON-NLS-1$
		row.createCell(cellnum++).setCellValue(p.isEatable() ? "x" : ""); // $NON-NLS-1$

		int nbHeaderColumn = cellnum;

		MonthService mService = new MonthService();
		for (int i = 1; i <= 12; i++) {
			Cell weekCell = row.createCell(nbHeaderColumn + i - 1);
			weekCell.setCellValue(mService.getMonthLabel(i, p.getPeriod()));

		}

	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null;
	}

}
