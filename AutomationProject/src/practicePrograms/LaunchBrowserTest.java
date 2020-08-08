package practicePrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserTest {
 
	public static void main(String[] args) {
		
		//key means type of the browser
		/*String key="webdriver.gecko.driver";
		//value means path of the browser
		String value="./drivers/geckodriver.exe";
		System.setProperty(key, value);
		new FirefoxDriver().close();*/
				
		
		//System.setProperty("webdriver.gecko.driver","E:\\PracticeAutomation\\AutomationProject\\drivers\\geckodriver.exe");
		//new FirefoxDriver().close();
		
		
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.close();
		
		
	}

}
