package hybrid_Data_Keyword_Method;

public class ActiInvalidLogin extends BaseTest{

	public static void main(String[] args) throws Throwable{
		//open the browser and enter the url
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		FileLib flib=new FileLib();
		int lastRowNum=flib.getRowCount(EXCEL_PATH, "Invalid");
		for(int i=0;i<=lastRowNum;i++)
		{
			WebDriverCommonLib wlib=new WebDriverCommonLib();
			//Input InValid username,Invalid password and click login button
			LoginPage lp=new LoginPage(driver);
			lp.login(flib.getCellData(EXCEL_PATH, "Invalid", i, 0),flib.getCellData(EXCEL_PATH, "Invalid", i, 1));
			wlib.verifyPage(wlib.getPageTitle(),flib.getPropKeyValue(PROPERTY_PATH, "loginTitle"),"Loginpage");
			flib.setCellData(EXCEL_PATH, "InValid", i, 2, "pass");
		}
		System.out.println(lastRowNum); 

	}

}
