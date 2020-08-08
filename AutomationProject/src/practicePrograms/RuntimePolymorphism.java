package practicePrograms;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RuntimePolymorphism {

	public static void main(String[] args) {
        WebDriver driver=null;
		System.out.println("please enter BrowserName:Chrome/FireFox??");
		Scanner sc=new Scanner(System.in);
		String browsername=sc.next();
	System.out.println("wait maadi");
	if(browsername.equalsIgnoreCase("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("successfully chrome is login ");
	}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println("successfull firefox is login");
	}
	else
		System.out.println("Enter valid proper url");	
	}

}
