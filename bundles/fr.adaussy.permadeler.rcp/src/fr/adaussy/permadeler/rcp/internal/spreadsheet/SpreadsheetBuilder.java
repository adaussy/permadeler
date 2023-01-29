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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

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
import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.collections.impl.tuple.Tuples;

import fr.adaussy.permadeler.rcp.RcpMessages;

public class SpreadsheetBuilder<T> {

	private static final String FONT = "Caveat"; //$NON-NLS-1$

	private final List<ColumnExtractor<T>> extractors;

	public SpreadsheetBuilder(List<ColumnExtractor<T>> extractors) {
		super();
		this.extractors = extractors;
	}

	public void generate(Path targetFile, List<T> input) throws FileNotFoundException, IOException {
		try (XSSFWorkbook workbook = new XSSFWorkbook()) {
			int rownum = 0;

			XSSFCellStyle headerCellStyle = createHeaderStyle(workbook);

			XSSFCellStyle otherCellStyle = createOtherCellStyle(workbook);

			XSSFSheet sheet = workbook.createSheet(RcpMessages.GenerateProductionSpreadsheetMenu_1);
			sheet.setDisplayGridlines(false);

			XSSFRow headerRow = sheet.createRow(rownum++);
			int nbOfColumn = createHeaders(headerRow, headerCellStyle);

			fillData(input, rownum, sheet, otherCellStyle, nbOfColumn);

			configureSheet(sheet, headerRow);

			try (FileOutputStream out = new FileOutputStream(targetFile.toFile())) {
				workbook.write(out);
			}

		}
	}

	protected void fillData(List<T> inputs, int rownum, XSSFSheet sheet, XSSFCellStyle otherCellStyle,
			int nbOfColumn) {
		for (T input : inputs) {
			int rowIndex = rownum++;
			Row row = sheet.createRow(rowIndex);
			fillRow(input, row, otherCellStyle);

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
	}

	private List<Pair<T, Row>> rows = new ArrayList<>();

	private void fillRow(T input, Row row, XSSFCellStyle cellStyle) {
		int cellnum = 0;
		for (var extractor : extractors) {
			createCell(cellnum++, row, cellStyle).setCellValue(extractor.extract(input));
		}
		rows.add(Tuples.pair(input, row));

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

	protected void configureSheet(XSSFSheet sheet, XSSFRow headerRow) {
		sheet.setAutoFilter(new CellRangeAddress(headerRow.getRowNum(), headerRow.getRowNum(),
				headerRow.getFirstCellNum(), headerRow.getLastCellNum()));
		autoSizeAllColumns(sheet, headerRow);

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
		for (ColumnExtractor<T> extractor : extractors) {
			createCell(cellnum++, row, cellStyle).setCellValue(extractor.getName());
		}
		return cellnum;
	}

	private Cell createCell(int index, Row row, XSSFCellStyle cellStyle) {
		Cell cell = row.createCell(index);
		cell.setCellStyle(cellStyle);
		return cell;
	}

}
