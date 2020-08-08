package hybrid_Data_Keyword_Method;

public class ActiValidLogin extends BaseTest{

	public static void main(String[] args) throws Throwable{
		//open the Browser enter the test url
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		FileLib flib=new FileLib();
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		//Input valid username, valid password and click login button
		LoginPage lp=new LoginPage(driver);
		lp.login(flib.getPropKeyValue(PROPERTY_PATH, "username"),flib.getPropKeyValue(PROPERTY_PATH, "password"));
		
		//wait until home page is loaded and title is changed
		wlib.waitForPageTitle(flib.getPropKeyValue(PROPERTY_PATH, "homeTitle"));
		//verify home page is displayed
		wlib.verifyPage(wlib.getPageTitle(),flib.getPropKeyValue(PROPERTY_PATH, "homeTitle"),"HomePage");
		
		

	}

}
