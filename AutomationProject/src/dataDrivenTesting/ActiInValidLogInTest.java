package dataDrivenTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//git6 Actitime
public class ActiInValidLogInTest implements IAutoConstants{
	public static void main(String[] args) throws Throwable {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com//login.do");
		FileLib flib=new FileLib();
		int rowCount=flib.getRowCount(EXCEL_PATH,"Invalid");
		System.out.println(rowCount);
		
	  for(int i=1;i<=rowCount;i++)
	  {
		  String un=flib.getCellData(EXCEL_PATH, "Invalid", i,0);
		  String pwd=flib.getCellData(EXCEL_PATH, "Invalid", i, 1);
		  System.out.println(un+"     "+pwd);
	  }

	}

}
