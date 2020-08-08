package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLinks {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("हिन्दी")).click();
		System.out.println("Hindi is clicked");
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("বাংলা")).click();
		System.out.println("Tamil is clicked");
		driver.findElement(By.linkText("తెలుగు")).click();
		System.out.println("Telugu is clicked");
		driver.findElement(By.linkText("मराठी")).click();
		System.out.println("Marati is clicked");
		driver.findElement(By.linkText("தமிழ்")).click();
		System.out.println("malayalam is clicked");
		driver.close();
		

	}

}
