/*package com.comcast.crm.organizationTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
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

public class TC_30_SearchTheOrganizationByRating_test extends BaseClass1{
	@Test
	public void searchOrganizationName() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		String rating1 = eUtil.getExcelData("Sheet1", "TC_30", "organization");
		String rate = eUtil.getExcelData("Sheet1", "TC_30", "organizationname");
		//Navigate to organization
		driver.findElement(By.linkText("Organizations")).click();
		Reporter.log("organization found",true);
		
		//Search organization by rating
		driver.findElement(By.linkText("Go to Advanced Search")).click();
		Reporter.log("click on advance search",true);
		WebElement rating = driver.findElement(By.xpath("//select[@class='detailedViewTextBox']"));
		Reporter.log("Click on in opton",true);
		wUtil.mouseOver(driver, rating);
		Reporter.log("mouse operator performed",true);
	//	driver.findElement(By.xpath("//optgroup[@label='Organization Information']/option[.='Rating']")).click();
		driver.findElement(By.xpath("//select[@class='detailedViewTextBox']")).sendKeys(rating1);
		Reporter.log("click on rating",true);
		WebElement SelectRating = driver.findElement(By.xpath("//select[@onchange='addRequiredElements(0);']"));
		wUtil.mouseOver(driver, SelectRating);
		Reporter.log("select rating as equal",true);
		driver.findElement(By.xpath("//select[@onchange='addRequiredElements(0);']")).sendKeys(rate);
	
	//Click on search now
		driver.findElement(By.xpath("//td[@align='center']/input[@class='crmbutton small create']")).click();
		Reporter.log("click on submit button",true);
		
	//Validation
		String expData=driver.findElement(By.xpath("//select[@onchange='addRequiredElements(0);']")).getText();
		Assert.assertTrue(expData.contains(rate));
		Reporter.log("Validation passed",true);
	}

}*/
