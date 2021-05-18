package com.comcast.crm.organizationTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass1;
import com.crm.vtiger.organizationpomclass.HomePage;
import com.crm.vtiger.organizationpomclass.OrganizationPage;

public class searchOrganizationTest extends BaseClass1{
	@Test(groups="smokeTest")
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
	@Test(groups="smokeTest")
	public void searchOrganizationNameByOrgName() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
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
		/*String actualSearchFor=orgPage.getSearchForTFText();
		Assert.assertTrue(actualSearchFor.contains(orgname));*/
				
	
	}
	@Test(groups="regressionTest")
	public void searchOrganizationNameByPhone() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		String orgname = eUtil.getExcelData("org", "TC_28", "organization");
		String phone = eUtil.getExcelData("org", "TC_28", "organizationphone");
		//Navigate to organization
		homePage=new HomePage(driver);
		homePage.clickOnOrganizationLink();
		
		//serach the organization by phone
		OrganizationPage orgPage=new OrganizationPage(driver);
		orgPage.searchOrgByOrgName(orgname, phone);
	}
	
	@Test(groups="regressionTest")
	public void searchOrganizationNameByWebsite() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
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
	
	@Test(groups="regressionTest")
	public void searchOrganizationNameByRating() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
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
