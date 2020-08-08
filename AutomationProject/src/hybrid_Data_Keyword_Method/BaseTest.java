package hybrid_Data_Keyword_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseTest implements IAutoConsts{
	
	public static WebDriver driver;
	
//openBrowser() method
	public void openBrowser() throws Throwable{
		FileLib flib=new FileLib();
		String browserValue=flib.getPropKeyValue(PROPERTY_PATH, "browser");
		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox")){
			System.setProperty(GECKO_KEY, GECKO_VALUE);
	     	driver=new FirefoxDriver();	 
		}
		else {
			System.out.println("please enter proper browser name");	
		}
		driver.manage().window().maximize();
		String appUrl=flib.getPropKeyValue(PROPERTY_PATH, "url");
		driver.get(appUrl);
		
		//verify loginpage is displayed
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verifyPage(wlib.getPageTitle(),flib.getPropKeyValue(PROPERTY_PATH, "loginTitle"),"LoginPage");
	}
	//closeBrowser() method
	public void closeBrowser() {
		driver.quit();
	}
		
		
			
	}
	
	
	


