package practice.ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.testng.xml.XmlTest;


import org.testng.annotations.Test;

public class ReadDataFromPropertyFileTest {
	@Test
	public void readDataTest() throws IOException
	{
		/* read the data from properties fle*/
		/*Step1-get the java representation object of the physical file...*/
		FileInputStream fis=new FileInputStream("./data/commondata.properties");
		/*Step2-create an object of the properties class and load the all keys:value pair..*/
		Properties p=new Properties();
		p.load(fis);
		/*Step3-read the value using getProperty(key)..*/
		String URL=p.getProperty("url");
		String BROWSER=p.getProperty("browser");
		String TIMEOUT=p.getProperty("timeout");
		String USERNAME=p.getProperty("username");
		String PASSWORD=p.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(TIMEOUT);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}

}
