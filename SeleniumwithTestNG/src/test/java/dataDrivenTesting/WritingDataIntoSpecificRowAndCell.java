package dataDrivenTesting;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoSpecificRowAndCell {

	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\specificData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("SpecficData");
		
		XSSFRow row =sheet.createRow(3);
		XSSFCell cell = row.createCell(5);
		cell.setCellValue("welcome");
		
		workbook.write(file);// attach workbook to the file
		workbook.close();
		file.close();
		
		System.out.println("File created successfully...");
	}

}
