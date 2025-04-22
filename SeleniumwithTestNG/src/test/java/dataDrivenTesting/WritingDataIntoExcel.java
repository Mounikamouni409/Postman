package dataDrivenTesting;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myfile.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// created sheet with data name
		XSSFSheet sheet = workbook.createSheet("Data");
		
		
		// create row 1 for 3 cells
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("Welcome");
		row1.createCell(1).setCellValue(123456);
		row1.createCell(2).setCellValue("java");

		// create row 2 for 3 cells
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("helloo");
		row2.createCell(1).setCellValue(12);
		row2.createCell(2).setCellValue("python");

		// create row 3 for 3 cells
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("hey");
		row3.createCell(1).setCellValue(4386);
		row3.createCell(2).setCellValue("C");
		
		// 
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File is created....");

	}

}
