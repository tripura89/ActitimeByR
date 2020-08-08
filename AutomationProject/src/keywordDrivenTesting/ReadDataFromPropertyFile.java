package keywordDrivenTesting;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws Throwable{
		FileInputStream fis=new FileInputStream("./Data/config.property");
		//It's like a Workbook interface same as 
		Properties prop=new Properties();
		//WorkbookFactory.create(fis);
		prop.load(fis);
		//String propValue=prop.getProperty("browser"); -----chrome
		//String propValue=prop.getProperty("shloka");--------null
		//String propValue=prop.getProperty("waiter","No Such Key");------No Such Key
		//System.out.println(propValue);
		

	}

}
