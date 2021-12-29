package com.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenRead {

	public static void particularData() throws IOException {

		File f = new File("C:\\Users\\heman\\Desktop\\Sathish\\Project batch\\Task\\Data driven datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheet = w.getSheet("Automation Practice Credentials");

		Row row = sheet.getRow(4);

		Cell cell = row.getCell(0);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String value = cell.getStringCellValue();
			System.out.println(value);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double cellvalue = cell.getNumericCellValue();
			int value = (int) cellvalue;
			System.out.println(value);
		}

	}

	public static void allData() throws IOException {

		File f = new File("C:\\Users\\heman\\Desktop\\Sathish\\Project batch\\Task\\Data driven datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String value = cell.getStringCellValue();
					System.out.println(value);

				}

				else if (cellType.equals(CellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();

					int value = (int) cellValue;
					System.out.println(value);
				}

			}

		}

	}

	public static void rowData() throws IOException {

		// C:\\Users\\heman\\Desktop\\Sathish\\Project batch\\Task\\Data driven
		// datas.xlsx

		File f = new File("C:\\Users\\heman\\Desktop\\Sathish\\Project batch\\Task\\Data driven datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheet = w.getSheet("Automation Practice Credentials");

		Row row = sheet.getRow(3);

		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < numberOfCells; i++) {

			Cell cell = row.getCell(i);

			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.STRING)) {

				String value = cell.getStringCellValue();
				System.out.println(value);

			} else if (cellType.equals(CellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;
				System.out.println(value);
			}
		}

	}

	public static void cellData() throws IOException {

		File f = new File("C:\\Users\\heman\\Desktop\\Sathish\\Project batch\\Task\\Data driven datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheet = w.getSheet("Automation Practice Credentials");

		int numberOfRows = sheet.getPhysicalNumberOfRows();

		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheet.getRow(i);

			Cell cell = row.getCell(0);

			CellType cellType = cell.getCellType();

			if (cellType.equals(CellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.println(value);

			} else if (cellType.equals(CellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int value = (int) cellValue;

				System.out.println(value);
			}

		}

	}

	public static void main(String[] args) throws Throwable {
		
		
		System.out.println("Particular data on row: 4 cell:0");
		particularData();
		System.out.println();
		System.out.println("Particular row data row: 3");
		rowData();
		System.out.println();
		System.out.println("particular cell data cell : 0");
		cellData();
		System.out.println();
		System.out.println("All data");
		allData();

	}

}
