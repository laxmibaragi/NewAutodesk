package WebTable;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.FileUtility;

public class createtest {
	FileUtility futil=new FileUtility();
	@Test
	public void create() throws IOException, ParseException
	{
		WebDriver driver=null;
		String browserName=futil.getDataFromJson("browser");
		String url=futil.getDataFromJson("url");
		String username=futil.getDataFromJson("username");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		driver.get(url);
		
	}

}
