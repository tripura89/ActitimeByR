package practicePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownOptions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Html%20Programs/multple%20dropdown.html");
		WebElement ddAddr=driver.findElement(By.name("paradise"));
		System.out.println(ddAddr);
		Select s=new Select(ddAddr);
		List<WebElement> AllOptions=s.getOptions();
		System.out.println(AllOptions);
		System.out.println("Total no.of options in dropdown are" +AllOptions.size());
		
		for(int i=0;i<AllOptions.size();i++)
		{
			String text=AllOptions.get(i).getText();
			System.out.println(text);
		
		}
		//To select last option in dropdown
		AllOptions.get(AllOptions.size()-1).click();
		
		
		
		
		
		

	}

}
