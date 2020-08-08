package dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiValidLoginTest implements IAutoConstants{

	public static void main(String[] args) throws Throwable {
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com//login.do");
	FileLib flib=new FileLib();
	String un=flib.getCellData(EXCEL_PATH,"Valid", 1, 0);
	String pwd=flib.getCellData(EXCEL_PATH, "Valid", 1, 1);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	

	}

}
