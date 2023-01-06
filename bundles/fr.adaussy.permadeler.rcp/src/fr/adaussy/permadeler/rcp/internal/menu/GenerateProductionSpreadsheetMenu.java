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
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.util.RegionUtil;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

import fr.adaussy.permadeler.model.Permadeler.Plant;
import fr.adaussy.permadeler.model.Permadeler.Plantation;
import fr.adaussy.permadeler.model.Permadeler.PlantationPhase;
import fr.adaussy.permadeler.model.Permadeler.Production;
import fr.adaussy.permadeler.model.Permadeler.Zone;
import fr.adaussy.permadeler.model.utils.EMFUtils;
import fr.adaussy.permadeler.rcp.RcpMessages;
import fr.adaussy.permadeler.rcp.internal.PermadelerSession;
import fr.adaussy.permadeler.rcp.internal.dialogs.ObjectSelectionDialog;
import fr.adaussy.permadeler.rcp.services.LabelService;
import fr.adaussy.permadeler.rcp.services.MonthService;

public class GenerateProductionSpreadsheetMenu {

	private static final String FONT = "Caveat"; //$NON-NLS-1$

	@Execute
	public void execute(PermadelerSession session, Shell shell) throws IOException {

		ObjectSelectionDialog<Zone> selectionDialog = new ObjectSelectionDialog<Zone>(shell, Zone.class,
				e -> true, session.getRoot());

		if (selectionDialog.open() == IDialogConstants.OK_ID) {
			List<Zone> zones = selectionDialog.getSelection();

			String fileName = "Productions-" //$NON-NLS-1$
					+ zones.stream().map(z -> sanitizeFilename(z.getName())).collect(Collectors.joining("-")) //$NON-NLS-1$
					+ ".xlsx"; //$NON-NLS-1$

			List<Plant> plantationWithProd = zones.stream()//
					.flatMap(z -> getPhases(z, shell))//
					.flatMap(z -> EMFUtils.allContainedObjectOfType(z, Plantation.class))//
					.filter(p -> p.getType() != null).map(p -> p.getType())//
					.filter(p -> !p.getProductions().isEmpty())//
					.distinct()//
					.sorted(Comparator.comparing(Plant::getName))//
					.toList();//

			if (!plantationWithProd.isEmpty()) {

				try (XSSFWorkbook workbook = new XSSFWorkbook()) {
					int rownum = 0;

					XSSFCellStyle headerCellStyle = createHeaderStyle(workbook);

					XSSFCellStyle otherCellStyle = createOtherCellStyle(workbook);

					XSSFSheet sheet = workbook.createSheet(RcpMessages.GenerateProductionSpreadsheetMenu_1);
					sheet.setDisplayGridlines(false);

					XSSFRow headerRow = sheet.createRow(rownum++);
					int nbOfColumn = createHeaders(headerRow, headerCellStyle);

					fillData(plantationWithProd, rownum, sheet, otherCellStyle, nbOfColumn);

					Path reportFolder = session.getRootFolder().resolve("reports"); //$NON-NLS-1$
					if (!reportFolder.toFile().exists()) {
						reportFolder.toFile().mkdirs();
					}

					configureSheet(sheet, headerRow);

					File targetFile = computeTargetFile(reportFolder, fileName);

					if (targetFile.exists()) {
						if (!MessageDialog.openConfirm(shell, RcpMessages.GenerateProductionSpreadsheetMenu_2,
								RcpMessages.GenerateProductionSpreadsheetMenu_3)) {
							return;
						} else {
							try {
								targetFile.delete();
							} catch (SecurityException e) {
								MessageDialog.openError(shell, RcpMessages.GenerateProductionSpreadsheetMenu_4,
										RcpMessages.GenerateProductionSpreadsheetMenu_5);
								return;
							}
						}
					}

					try (FileOutputStream out = new FileOutputStream(targetFile)) {
						workbook.write(out);
					}
					Desktop.getDesktop().open(targetFile);
				}

			}
		}

	}

	public String sanitizeFilename(String filename) {
		return filename.replaceAll("[^a-zA-Z0-9.-]", "-"); //$NON-NLS-1$ //$NON-NLS-2$
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

	protected XSSFCellStyle createOtherCellStyle(XSSFWorkbook workbook) {
		XSSFCellStyle otherCellStyle = workbook.createCellStyle();
		otherCellStyle.setAlignment(HorizontalAlignment.CENTER);
		otherCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);

		XSSFFont defaultFont = workbook.createFont();
		defaultFont.setFontHeightInPoints((short)14);
		defaultFont.setFontName(FONT);
		defaultFont.setColor(IndexedColors.BLACK.getIndex());
		defaultFont.setBold(false);
		defaultFont.setItalic(false);

		otherCellStyle.setFont(defaultFont);

		return otherCellStyle;
	}

	protected XSSFCellStyle createHeaderStyle(XSSFWorkbook workbook) {
		XSSFCellStyle headerCellStyle = workbook.createCellStyle();

		XSSFFont defaultFont = workbook.createFont();
		defaultFont.setFontHeightInPoints((short)16);
		defaultFont.setFontName(FONT);
		defaultFont.setColor(IndexedColors.BLACK.getIndex());
		defaultFont.setBold(true);
		defaultFont.setItalic(false);

		headerCellStyle.setAlignment(HorizontalAlignment.CENTER);
		headerCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
		headerCellStyle.setFont(defaultFont);
		return headerCellStyle;
	}

	protected void fillData(List<Plant> plantationWithProd, int rownum, XSSFSheet sheet,
			XSSFCellStyle otherCellStyle, int nbOfColumn) {
		for (Plant p : plantationWithProd) {
			int initalRow = rownum;
			for (Production prod : p.getProductions()) {
				int rowIndex = rownum++;
				Row row = sheet.createRow(rowIndex);
				fillRow(p, prod, row, otherCellStyle);

				CellRangeAddress region = new CellRangeAddress(rowIndex, rowIndex, 0, nbOfColumn - 1);
				RegionUtil.setBorderTop(BorderStyle.THIN, region, sheet);
				RegionUtil.setBorderBottom(BorderStyle.THIN, region, sheet);
				RegionUtil.setBorderLeft(BorderStyle.THIN, region, sheet);
				RegionUtil.setBorderRight(BorderStyle.THIN, region, sheet);
				RegionUtil.setTopBorderColor(IndexedColors.GREY_25_PERCENT.index, region, sheet);
				RegionUtil.setBottomBorderColor(IndexedColors.GREY_25_PERCENT.index, region, sheet);
				RegionUtil.setLeftBorderColor(IndexedColors.GREY_25_PERCENT.index, region, sheet);
				RegionUtil.setRightBorderColor(IndexedColors.GREY_25_PERCENT.index, region, sheet);
			}
			int endRow = rownum - 1;
			// Add border
			if (initalRow != endRow) {
				// Merge cells
				sheet.addMergedRegion(new CellRangeAddress(initalRow, endRow, 0, 0));
				sheet.addMergedRegion(new CellRangeAddress(initalRow, endRow, 1, 1));
			}
		}
	}

	protected void configureSheet(XSSFSheet sheet, XSSFRow headerRow) {
		sheet.setAutoFilter(new CellRangeAddress(headerRow.getRowNum(), headerRow.getRowNum(),
				headerRow.getFirstCellNum(), headerRow.getLastCellNum()));
		autoSizeAllColumns(sheet, headerRow);

	}

	protected File computeTargetFile(Path reportFolder, String fileName) {
		File targetFile = reportFolder.resolve(fileName).toFile();
		return targetFile;
	}

	protected void autoSizeAllColumns(XSSFSheet sheet, XSSFRow headerRow) {
		for (int col = headerRow.getFirstCellNum(); col < headerRow.getLastCellNum(); col++) {
			sheet.autoSizeColumn(col);
			if (col >= 5) {
				sheet.setColumnWidth(col, 10 * 255);
			}
		}

	}

	private int createHeaders(Row row, XSSFCellStyle cellStyle) {
		int cellnum = 0;
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_6);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_7);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_8);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_9);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_10);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_11);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_12);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_13);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_14);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_15);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_16);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_17);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_18);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_19);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_20);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_21);
		createCell(cellnum++, row, cellStyle).setCellValue(RcpMessages.GenerateProductionSpreadsheetMenu_22);
		return cellnum;
	}

	private Cell createCell(int index, Row row, XSSFCellStyle cellStyle) {
		Cell cell = row.createCell(index);
		cell.setCellStyle(cellStyle);
		return cell;
	}

	private void fillRow(Plant plant, Production p, Row row, XSSFCellStyle cellStyle) {
		int cellnum = 0;
		createCell(cellnum++, row, cellStyle).setCellValue(plant.getName());
		createCell(cellnum++, row, cellStyle).setCellValue(plant.getGenus() + " " + plant.getSpecies()); //$NON-NLS-1$
		createCell(cellnum++, row, cellStyle).setCellValue(LabelService.getEditLabel(p.getType())); // $NON-NLS-1$
		createCell(cellnum++, row, cellStyle).setCellValue(p.getName()); // $NON-NLS-1$
		createCell(cellnum++, row, cellStyle).setCellValue(p.isEatable() ? RcpMessages.GenerateProductionSpreadsheetMenu_23 : RcpMessages.GenerateProductionSpreadsheetMenu_24); // $NON-NLS-1$

		int nbHeaderColumn = cellnum;

		MonthService mService = new MonthService();
		for (int i = 1; i <= 12; i++) {
			Cell weekCell = createCell(nbHeaderColumn + i - 1, row, cellStyle);
			weekCell.setCellValue(mService.getMonthLabel(i, p.getPeriod()));

		}

	}

	@CanExecute
	public boolean canExecute(PermadelerSession session) {
		return session != null;
	}

}
