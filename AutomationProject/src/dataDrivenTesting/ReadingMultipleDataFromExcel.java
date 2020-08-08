package dataDrivenTesting;

public class ReadingMultipleDataFromExcel implements IAutoConstants{

	public static void main(String[] args) throws Throwable {
		FileLib flib=new FileLib();
		int rCount=flib.getRowCount(EXCEL_PATH, "Sheet1");
		System.out.println(rCount);
		for(int i=0;i<=rCount;i++)
		{
			flib=new FileLib();
			String excelVal=flib.getCellData(EXCEL_PATH, "Sheet1", i, 1);
			System.out.println(excelVal);		
			
		}

	}


}