package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		
		//Open workbook
		XSSFWorkbook wb = new XSSFWorkbook ("./data/ReadData.xlsx");
		
		//Get sheet
		XSSFSheet sheet = wb.getSheet("Data");
		
		//Get Row count
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Get Column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
		for (int i = 1; i <= rowCount; i++) {
			//Get row
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
						
			//Get cell
			XSSFCell cell = row.getCell(j);
			
			//Action- Read/print particular Cell value 
			String Svalue = cell.getStringCellValue();
			System.out.println(Svalue);
			
			}//ends column loop
		}	//ends row loop
		

	}

}
