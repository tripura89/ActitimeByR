package practicePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopupsinChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
     
        driver.findElement(By.xpath("//div[.='Login ']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings']//div[@class='menu_icon']")).click();
        Thread.sleep(1000);
         driver.findElement(By.xpath("//a[.='Logo Settings']")).click();
         driver.findElement(By.id("uploadNewLogoOption")).click();
        
       Thread.sleep(5000);
        
        WebElement browsebtn = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
        //here button type is file so we can't perform click action otherwise button type should be button or submit
        //go to specific file shift+rightclick and one option comes copy as path and paste it here
        
       browsebtn.sendKeys("C:\\Users\\tripu\\Desktop\\New folder\\New folder\\Resume.rtf");

	}

}
