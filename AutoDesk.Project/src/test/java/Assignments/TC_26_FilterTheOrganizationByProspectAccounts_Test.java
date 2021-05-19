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
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass1;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.WebdriverUtility;
import com.crm.vtiger.organizationpomclass.HomePage;
import com.crm.vtiger.organizationpomclass.OrganizationPage;

public class TC_26_FilterTheOrganizationByProspectAccounts_Test extends BaseClass1{
	@Test
	public void filterProspectAccounts() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		String option=eUtil.getExcelData("org", "TC_26", "Filter");
	
		//Navigate to organization
		homePage=new HomePage(driver);
		homePage.clickOnOrganizationLink();
		Reporter.log("organization found",true);
		
		//FilterTheorganizationByProsectAccount
		OrganizationPage orgPage=new OrganizationPage(driver);
		orgPage.filterOrganization(option);
		Reporter.log("filter the organization by prospectAccount",true);
	
	   //verificaton
		String actualfilterDropDown=orgPage.getprospectAccountText();
		Assert.assertEquals(actualfilterDropDown, option);
		Reporter.log("actualfilterDropDown and option are equal");
	}
	@Test
	public void tests()
	{
		System.out.println("tests");
	}

}
