/*package com.comcast.crm.organizationTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass1;

public class FilterOrganizationTest extends BaseClass1{
	@Test(groups = "smokeTest")
	public void filterTheOrganizationByProspectAccounts() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		String prospectAccount=eUtil.getExcelData("org", "TC_26", "Filter");
	
		//Navigate to organization
		driver.findElement(By.linkText("Organizations")).click();
		Reporter.log("Navigate to organization",true);
	
		//FilterOrganizationByProspectAccounts
		WebElement filter = driver.findElement(By.xpath("//select[@name='viewname']"));
		Reporter.log("Click on Filters",true);
		wUtil.mouseOver(driver, filter);
		Reporter.log("Performing mouse over operation",true);
		
		
		//driver.findElement(By.xpath("//option[.='Prospect Accounts']")).click();
		driver.findElement(By.xpath("//select[@name='viewname']")).sendKeys(prospectAccount);
		Reporter.log("Click on Prospect Accounts",true);
		
		//verification
		String expData=driver.findElement(By.xpath("//option[.='Prospect Accounts']")).getText();
		Assert.assertTrue(expData.contains(prospectAccount));
		Reporter.log("Validation passed",true);
	}

}
*/