package hybrid_Data_Keyword_Method;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonLib extends BaseTest{
	//getPageTitle() method
	public String getPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	//verifyPage() method
	public void verifyPage(String actualPage, String expectedPage, String pageName) {
		
		if(actualPage.equals(expectedPage))
		{
			System.out.println(pageName+" isDisplayed ==> passed");
		}
		else {
			System.out.println(pageName+"isDisplayed ==> Failed");
		}	
	}
	//waitForPageTitle() method 
	public void waitForPageTitle(String title) {
		
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.titleIs(title));
	}
	
	//waitForElementVisibility() method
	public void waitForElementVisibility(WebElement element) {
		
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOf(element));
		
	}
	//selectOption() with parameter int
	public void selectOption(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	//selectOption() with parameter String 
	public void selectOption(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.deselectByValue(value);
	}
	
	//selectOption() with parameter String of signature change
	
	public void selectOption(String text, WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	//frameSwitch() with parameter String
	public void frameSwitch(String attributeValue)
	{
		driver.switchTo().frame(attributeValue);
	}
	
	//frameSwitch() with parameter WebElement
		public void frameSwitch(WebElement element)
		{
			driver.switchTo().frame(element);
		}
   //frameSwitch() with parameter int
		public void frameSwitch(int index)
		{
			driver.switchTo().frame(index);
		}
		
   //mouseHover() method with WebElement parameter
		public void mouseHover(WebElement element) {
			Actions a=new Actions(driver);
			a.moveToElement(element).perform();

	}
}
