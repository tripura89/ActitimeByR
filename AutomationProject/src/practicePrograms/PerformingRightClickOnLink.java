package practicePrograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingRightClickOnLink {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Html%20Programs/WebPageLinks.html");
		Thread.sleep(5000);
		WebElement Link=driver.findElement(By.id("i1"));
		Actions a=new Actions(driver);
		a.contextClick(Link).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);	
		

	}

}
