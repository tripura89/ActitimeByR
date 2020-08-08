package testngPrograms;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
  @Test
  public void run() {
	  //It prints in console only
	 // System.out.println("I am run method in DemoTest class");
	  //But the main objective of TestNG is to display report so we should use Reporter.log
	  //It displays in report only as Message we can't check for single class in report 
	 // Reporter.log("I am run method in DemoTest class");
	  //so to overcome this we should print the console as well solution Report.log
	//  Reporter.log(String s, boolean logToStandardOut) method in testng
	  Reporter.log("I am run method in DemoTest Class",true);
	  //this will print in console as well as report
  }
  
}
 