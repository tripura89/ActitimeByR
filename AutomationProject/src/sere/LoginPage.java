package sere;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//storing all the page elements in one place is called element repository
	//declaration
	@FindBy(id="username") private WebElement untb;
	//utilization
	//Address returning methods
	public WebElement getUntb() {
		return untb;
	}
	//Action performing methods
	public void setUntb(String un) {
		untb.sendKeys(un);
	}
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
