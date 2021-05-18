/*package com.comcast.crm.organizationTest;

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

public class TC_28_SearchTheOrganizationByPhone_test extends BaseClass1{
	@Test
	public void searchOrganizationName() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		String orgname = eUtil.getExcelData("Sheet1", "TC_28", "organization");
		String phone = eUtil.getExcelData("Sheet1", "TC_28", "organizationphone");
		//Navigate to organization
		driver.findElement(By.linkText("Organizations")).click();
		Reporter.log("Organization found",true);
		
		//Step4:Search the organization by Phone
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(orgname);
		Reporter.log("search the orgname",true);
		WebElement search = driver.findElement(By.xpath("//td/div/select[@name='search_field']"));
		Reporter.log("Click on in field",true);
		wUtil.mouseOver(driver, search);
		Reporter.log("performed mousehover action",true);
		//driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@name='search_field']/option[@label='Phone']")).click();
		driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@name='search_field']")).sendKeys(phone);
		Reporter.log("Search the organization by phone",true);
		
		//Step5:Click on search
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Reporter.log("Click on submit",true);
		
		//Validations
		String expData=driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@id='bas_searchfield']")).getText();
		Assert.assertTrue(expData.contains(phone));
		Reporter.log("Validation passed",true);
	}
}*/
