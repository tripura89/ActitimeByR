package practicePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		//driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
         driver.findElement(By.xpath("//span[.='Cart']")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//span[.='Login']")).click();
	}

}
