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
import com.crm.vtiger.organizationpomclass.HomePage;
import com.crm.vtiger.organizationpomclass.OrganizationPage;

public class TC_29_SearchTheOrganizationByWebsite_test extends BaseClass1{
	@Test
	public void searchOrganizationName() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		String orgname = eUtil.getExcelData("org", "TC_29", "organization");
		String website = eUtil.getExcelData("org", "TC_29", "organizatonname");
		//Navigate to organization
        homePage=new HomePage(driver);
        homePage.clickOnOrganizationLink();
        
        //search the organization by website
        OrganizationPage orgPage=new OrganizationPage(driver);
        orgPage.searchOrgByOrgName(orgname, website);
	}
}
