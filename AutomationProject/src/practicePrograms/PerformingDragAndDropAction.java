package practicePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformingDragAndDropAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Thread.sleep(3000);
        WebElement from=driver.findElement(By.id("box3"));
        WebElement to=driver.findElement(By.id("box103"));
        Actions a=new Actions(driver);
        a.dragAndDrop(from, to).perform();;
	}

}
