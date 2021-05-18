package practice.ddt;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class CreateCustomerTest {

	@Test
	public void createCustomerTest()
	{
		String USERNAME1=System.getProperty("username");
		String PASSWORD1=System.getProperty("password");
		String BROWSER1=System.getProperty("browser");
		System.out.println("Executing test1");
		System.out.println("===========>"+USERNAME1);
		System.out.println("===========>"+PASSWORD1);
		System.out.println("============>"+BROWSER1);
	
	}
}
