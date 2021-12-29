package com.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenWrite {

	public static void write() throws IOException {

		File f = new File("C:\\Users\\heman\\Desktop\\Sathish\\Project batch\\Task\\Data driven datas.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("Data Driven write").createRow(0).createCell(0).setCellValue("Email");

		wb.getSheet("Data Driven write").getRow(0).createCell(1).setCellValue("password");

		wb.getSheet("Data Driven write").createRow(1).createCell(0).setCellValue("sathish@12345");

		wb.getSheet("Data Driven write").getRow(1).createCell(1).setCellValue(12345);

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();

		System.out.println("write sucessfully");
	}

	public static void main(String[] args) throws IOException {

		write();

	}

}
