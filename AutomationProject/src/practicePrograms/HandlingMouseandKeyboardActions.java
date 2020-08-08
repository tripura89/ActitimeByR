package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseandKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
           
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement electronics=driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(electronics).perform();
	}

}
