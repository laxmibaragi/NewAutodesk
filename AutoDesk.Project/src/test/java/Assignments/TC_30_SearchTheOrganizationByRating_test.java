package Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass1;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.WebdriverUtility;
import com.crm.vtiger.organizationpomclass.HomePage;
import com.crm.vtiger.organizationpomclass.OrganizationPage;

public class TC_30_SearchTheOrganizationByRating_test extends BaseClass1{
	@Test
	public void searchOrganizationName() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		String rate = eUtil.getExcelData("org", "TC_30", "organization");
		String rating1 = eUtil.getExcelData("org", "TC_30", "organizationname");
		//Navigate to organization
        homePage = new HomePage(driver);
        homePage.clickOnOrganizationLink();
        
        //Search the organization by rating
        OrganizationPage orgPage=new OrganizationPage(driver);
        orgPage.clickOnAdvanceSearchLink();
        orgPage.searchTheOrgByRating(rate);
        orgPage.searchTheOrgByOption(rating1);
		
	}

}
