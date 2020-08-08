package dataDrivenTesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UsingToStringMethodReadDataExcel {

	public static void main(String[] args) throws Throwable{
		FileInputStream fis=new FileInputStream("./Data/InputData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		
		
		
		Row r=sh.getRow(10);
		Cell c= r.getCell(2);
		String val=c.toString();
// sif we have any numeric data in cell we can print by converting that value to String and print using toString()
		System.out.println(val);
				
		
		

	}

}
