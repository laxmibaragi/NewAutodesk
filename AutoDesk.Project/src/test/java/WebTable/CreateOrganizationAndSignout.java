package WebTable;

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
import org.testng.asserts.SoftAssert;

import com.crm.vtiger.GenericUtils.BaseClass;
import com.crm.vtiger.GenericUtils.BaseClass1;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebdriverUtility;

public class CreateOrganizationAndSignout extends BaseClass1{
	
	@Test
	public void createOrgandSo() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
	
		String orgname = eUtil.getExcelData("Sheet1", 1, 2);
		//Step3: navigate to organizations
		driver.findElement(By.linkText("Organizations")).click();
		Reporter.log("Navigate to organization",true);
		
		//Step4:Click on create organization
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		Reporter.log("click on create organization",true);
		//Step5:Create orgamization
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname+JavaUtility.getRandomData());
		Reporter.log("Create organization with orgname",true);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		Reporter.log("click on save button",true);
		
		//verifcation
		String expData=driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		Reporter.log("expected data is"+expData,true);
		//Assert.assertTrue(expData.contains(orgname));
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(expData.contains(orgname));
		Reporter.log("Expected data is true",true);
		
		
		
		
		
		
		
		
		


	}

}
