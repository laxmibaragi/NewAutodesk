package Assignments;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass1;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.WebdriverUtility;

public class TC_27_SearchTheOrganizationByOrganizationName_test extends BaseClass1 {
	@Test
	public void searchOrganizationName() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		String orgname = eUtil.getExcelData("Sheet1","TC_27", "organization");
		String organizationname = eUtil.getExcelData("Sheet1", "TC_27", "organizationname");
		
	//Navigate to organization
		driver.findElement(By.linkText("Organizations")).click();
		Reporter.log("Organization found",true);
		
	//Search the organization by OrganizationName
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(orgname);
		Reporter.log("Click on serach organization",true);
		WebElement search = driver.findElement(By.xpath("//td/div/select[@name='search_field']"));
		Reporter.log("Click on search",true);
		wUtil.mouseOver(driver, search);
		Reporter.log("mouse over operation performed",true);	
	//	driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@name='search_field']/option[@label='Organization Name']")).click();
		driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@name='search_field']")).sendKeys(organizationname);
		Reporter.log("click on industry type",true);
		
	//Validation
		String expData=driver.findElement(By.xpath("//select[@id='bas_searchfield']")).getText();
		Assert.assertTrue(expData.contains(organizationname));
		Reporter.log("Validation2 passed",true);
		//Step5:Click on search
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Reporter.log("Click on submit button",true);
	}
}
