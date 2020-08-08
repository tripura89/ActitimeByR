package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersOptions {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
     // Thread.sleep(2000);
     // driver.findElement(By.id("fakebox-input")).sendKeys("qspiders Hyderabad");

	}

}
