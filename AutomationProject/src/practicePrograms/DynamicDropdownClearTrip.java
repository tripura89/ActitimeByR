package practicePrograms;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdownClearTrip {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.cleartrip.com/");
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      Thread.sleep(3000);
      //Dynamic dropdown tab can be //input,//span,<li>,<ul>
      WebElement ddAddr=driver.findElement(By.id("FromTag"));
      Thread.sleep(5000);
      ddAddr.sendKeys("San");
      Thread.sleep(3000); 
      ddAddr.sendKeys(Keys.DOWN);
      Thread.sleep(3000);
      ddAddr.sendKeys(Keys.DOWN);
      Thread.sleep(3000);
     ddAddr.sendKeys(Keys.DOWN);
      Thread.sleep(3000);
      ddAddr.sendKeys(Keys.DOWN);
      Thread.sleep(3000);
      ddAddr.sendKeys(Keys.ENTER);
      //To get selected element to print on console use getAttribute(value) gives the specific dropdown value
      WebElement selectedtab = driver.findElement(By.xpath("//input[@tabindex='4']"));
      System.out.println(selectedtab.getAttribute("value"));
    		  
  
//      List<WebElement> allOptions=driver.findElements(By.xpath("//a[contains(@id,'ui-id')]"));
//      System.out.println(allOptions.size());
//      
//     for(int i=0;i<allOptions.size();i++)
//      {
//      String text=allOptions.get(i).getText();
//     System.out.println(text);
//     }
//	}} 
//     // allOptions.get(allOptions.size()-1).click();
//			  
	}
}


//output
//Santa Ana, US - John Wayne (SNA)