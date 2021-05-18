package WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass1;
import com.crm.vtiger.GenericUtils.ExcelUtility;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebdriverUtility;
import com.crm.vtiger.organizationpomclass.CreateOrganizationPage;
import com.crm.vtiger.organizationpomclass.HomePage;
import com.crm.vtiger.organizationpomclass.OrganizationInformationPage;
import com.crm.vtiger.organizationpomclass.OrganizationPage;

import junit.framework.Assert;

public class CreateOrganizationWithIndustry extends BaseClass1{
	@Test
	public void createOrg() throws IOException, InterruptedException, ParseException, EncryptedDocumentException, InvalidFormatException
	{
		
		String orgname = eUtil.getExcelData("org", "TC_01", "organizationname")+"_"+JavaUtility.getRandomData();
		
		
		//Navigate to organization
		homePage=new HomePage(driver);
		homePage.clickOnOrganizationLink();
		
		//Click on create organization
		OrganizationPage orgPage=new OrganizationPage(driver);
		orgPage.clickOnCreateOrganizationIMG();
		
		//Create organization
		CreateOrganizationPage createOrgPage=new CreateOrganizationPage(driver);
		createOrgPage.createOrganization(orgname);
		
		//verification
		OrganizationInformationPage orgInfoPage=new OrganizationInformationPage(driver);
		String actualOrgName=orgInfoPage.getOrganizationText();
		Assert.assertTrue(actualOrgName.contains(orgname));
		
	}
	@Test
	public void createorgwithindustry() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String orgname = eUtil.getExcelData("org", "TC_01", "organizationname")+"_"+JavaUtility.getRandomData();
		String industryType = eUtil.getExcelData("org", 1, 3);
		
		//Navigate to organization
		homePage.clickOnOrganizationLink();
		
		//Click on create organization
		OrganizationPage orgPage=new OrganizationPage(driver);
		orgPage.clickOnCreateOrganizationIMG();
		
		//Create organization with industry
		CreateOrganizationPage createOrgPage=new CreateOrganizationPage(driver);
		createOrgPage.createOrganization(orgname,industryType);
		
		//verification
		OrganizationInformationPage orgInfoPage=new OrganizationInformationPage(driver);
		String actualOrgName=orgInfoPage.getOrganizationText();
		Assert.assertTrue(actualOrgName.contains(orgname));
		String actualIndustryType=orgInfoPage.getIndustryText();
		Assert.assertEquals(actualIndustryType, industryType);

		
	}
}