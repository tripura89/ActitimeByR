package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:81/login.do");
		WebElement untb=driver.findElement(By.name("username"));
		Thread.sleep(3000);
		untb.sendKeys("admin");
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.doubleClick(untb).perform();	

	}

}
