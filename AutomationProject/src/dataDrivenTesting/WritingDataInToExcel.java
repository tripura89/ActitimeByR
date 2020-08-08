package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataInToExcel {

	public static void main(String[] args) throws Throwable{
      //open the file in read mode
		FileInputStream fis=new FileInputStream("C:\\Users\\tripu\\Desktop\\WritingData.xlsx");
		//prepare the excel file
		Workbook wb=WorkbookFactory.create(fis);
		//go to a particular Sheet
		Sheet sh = wb.getSheet("Sheet1");
		//go to a particular Row
		//Row r = sh.createRow(13);
		Row r = sh.getRow(9);
		Cell c = r.createCell(1);		
		c.setCellValue("Baba");
		Row r1=sh.getRow(4);
		Cell c1 = r1.createCell(1);		
		c1.setCellValue("Baba");
		//Row r = sh.getRow(0);
		//goto a particular cell
		//Cell c = r.createCell(4);
		
		//open the file in write mode
		FileOutputStream fos=new FileOutputStream("C:\\Users\\tripu\\Desktop\\WritingData.xlsx");
		//save the file
		wb.write(fos);
		//confirmation message
		System.out.println("Wrote in Excel");
	
		
		
	}

}
