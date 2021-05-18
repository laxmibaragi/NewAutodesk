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

public class TC_29_SearchTheOrganizationByWebsite_test extends BaseClass1{
	@Test
	public void searchOrganizationName() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		String orgname = eUtil.getExcelData("Sheet1", "TC_29", "organization");
		String website = eUtil.getExcelData("Sheet1", "TC_29", "organizatonname");
		//Navigate to organization
		driver.findElement(By.linkText("Organizations")).click();
		Reporter.log("Organization found",true);
		
		//Search the organization by Website
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys(orgname);
		Reporter.log("serach for organization",true);
		WebElement search = driver.findElement(By.xpath("//td/div/select[@name='search_field']"));
		wUtil.mouseOver(driver, search);
		Reporter.log("Mouseover opertaion perform",true);
		//driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@name='search_field']/option[@label='Website']")).click();
		driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@name='search_field']")).sendKeys(website);
		Reporter.log("Click on website",true);
		
		//Click on search
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Reporter.log("Click on submit",true);
		
		//Validation
		String expData=driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select[@id='bas_searchfield']")).getText();
		Assert.assertTrue(expData.contains(website));
		Reporter.log("Validation passed",true);
	}
}*/
