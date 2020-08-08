package practicePrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdownClearTripList {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.cleartrip.com/");
	      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	      Thread.sleep(3000);
	      WebElement ddAddr=driver.findElement(By.id("FromTag"));
	      Thread.sleep(5000);
	      ddAddr.sendKeys("San");
	      Thread.sleep(3000); 
		 List<WebElement> allOptions=driver.findElements(By.xpath("//a[contains(@id,'ui-id')]"));
	      System.out.println(allOptions.size());
	      
	     for(int i=0;i<allOptions.size();i++)
	      {
	          String text=allOptions.get(i).getText();
	           System.out.println(text);
	     }
		} 
	    //  allOptions.get(allOptions.size()-1)

	}


