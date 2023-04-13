package readExcelExample;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel2 {

	public static void main(String[] args) throws Exception {
		
		
		
		
		FileInputStream fis = new FileInputStream("./data/RegisterStudent.xls");
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		//workbook.getSheetAt(1);     //index
		HSSFSheet sheet = workbook.getSheet("Student");
		
		
		
		int rowCount = sheet.getLastRowNum();
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Row Count: " + rowCount);
		System.out.println("Column Count: " + columnCount);
		
		
		
		
		for (int i = 1; i <= rowCount; i++) {
			
			
			String firstName = sheet.getRow(i).getCell(0).toString();
			String add = sheet.getRow(i).getCell(4).toString();
			System.out.println("FirstName : " + i + " : "+ firstName);
			System.out.println("Address : " + i + " : "+ add);
			System.out.println("=================================");
		}

	}

}
