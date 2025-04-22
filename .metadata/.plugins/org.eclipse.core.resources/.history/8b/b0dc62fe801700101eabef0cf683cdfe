package dataDrivenTesting;

import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\dynamicfile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DynamicData");
		
		// access data from runtime
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many rows you want: ");
		int noOfRows= sc.nextInt();
		
		System.out.println("Enter how many cells you want: ");
		int noOfCells= sc.nextInt();
		
		for(int r =0; r<=noOfRows;r++) {
			//created a row 
			XSSFRow currentRow = sheet.createRow(r);
			
			for(int c=0;c<noOfCells;c++) {
				// created a cell
				XSSFCell cell = currentRow.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		
		workbook.write(file);// attach workbook to the file
		workbook.close();
		file.close();
		
		System.out.println("File created successfully...");
		
		
		
	}

}
