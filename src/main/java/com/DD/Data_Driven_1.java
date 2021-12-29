package com.DD;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_1 {

	public static void particular_Data() throws IOException {

		File f = new File("C:\\Users\\heman\\Desktop\\Sathish\\Project batch\\Task\\Data driven datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheetAt(0);

		Row row = sheetAt.getRow(2);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {

			String cellValue = cell.getStringCellValue();
			System.out.println(cellValue);
		}

		else if (cellType.equals(CellType.NUMERIC)) {

			double cellValue = cell.getNumericCellValue();

			int value = (int) cellValue;

			System.out.println(value);

		}

	}

	public static void all_data() throws IOException {

		File f = new File("C:\\Users\\heman\\Desktop\\Sathish\\Project batch\\Task\\Data driven datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fis);

		Sheet sheetAt = w.getSheet("Automation Practice Credentials");

		int numberOfRows = sheetAt.getPhysicalNumberOfRows();

		for (int i = 0; i < numberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			int numberOfCells = row.getPhysicalNumberOfCells();

			for (int j = 0; j < numberOfCells; j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {
					String cellValue = cell.getStringCellValue();
					System.out.println(cellValue);
				} else if (cellType.equals(CellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();

					int value = (int) cellValue;
					System.out.println(value);
				}

			}

		}

	}

	public static void main(String[] args) throws Throwable {
		particular_Data();
		all_data();
	}

}
