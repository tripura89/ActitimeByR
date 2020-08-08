package keywordDrivenTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenTesting.IAutoConstants;

//Avoids repeatitive tasks like open browser and close browser
public class BaseTest implements IAutoConstants{
	public static WebDriver driver;

public void openBrowser() throws Throwable{
	FileLib flib=new FileLib();
	String browserValue=flib.getPropertyKeyValue(PROPERTY_PATH, "browser");
	if(browserValue.equalsIgnoreCase("chrome"))
	{
		System.setProperty(CHROME_KEY,CHROME_VALUE);
		driver=new ChromeDriver();
	}
	
}
}
