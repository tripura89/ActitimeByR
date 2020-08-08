package practicePrograms;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileInputStreamReadData {

	public static void main(String[] args) throws Throwable{
		//Apache
		//POI jars poor obfuscation Implementation
		//open the file in read mode
		FileInputStream fis=new FileInputStream("./Data/InputData.xlsx");
		//keep the file ready for reading purpose
		Workbook wb = WorkbookFactory.create(fis);
		//Go to a particular sheet
		Sheet sh = wb.getSheet("Sheet1");
		//Go to particular row
		Row r = sh.getRow(6);
		//Go to particular cell
		Cell c = r.getCell(2);
		//Get the String data present inside the cell
		String excelvalue = c.getStringCellValue();
		System.out.println(excelvalue);
		
		//2nd shotcut way to read the string value in excel
		
		FileInputStream fis1=new FileInputStream("./Data/InputData.xlsx");
		
		Workbook wb1 = WorkbookFactory.create(fis1);
		String val=wb.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
		System.out.println(val);
		
		
	//3rd shotcut way to read data in excel
//		System.out.println(WorkbookFactory.create(new FileInputStream(".\\Data\\InputData.xlsx")).getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue());
//		System.out.println(WorkbookFactory.create(new FileInputStream("./Data/InputData.xlsx")).getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue());
	}

}
