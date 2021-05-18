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
import com.crm.vtiger.organizationpomclass.HomePage;
import com.crm.vtiger.organizationpomclass.OrganizationPage;

public class TC_27_SearchTheOrganizationByOrganizationName_test extends BaseClass1 {
	@Test
	public void searchOrganizationName() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		String orgname = eUtil.getExcelData("org","TC_27", "organization");
		String organizationname = eUtil.getExcelData("org", "TC_27", "organizationname");
		
	//Navigate to organization
		homePage=new HomePage(driver);
		homePage.clickOnOrganizationLink();
		Reporter.log("organization found",true);
		
	//search organization by organization name
		OrganizationPage orgPage=new OrganizationPage(driver);
		orgPage.searchOrgByOrgName(orgname, organizationname);
		
	//verification
		String actualSearchFor=orgPage.getSearchForTFText();
		Assert.assertTrue(actualSearchFor.contains(orgname));
				
	
	}
}*/
