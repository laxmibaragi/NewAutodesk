package WebTable;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.vtiger.GenericUtils.BaseClass1;
import com.crm.vtiger.GenericUtils.FileUtility;
import com.crm.vtiger.GenericUtils.JavaUtility;
import com.crm.vtiger.GenericUtils.WebdriverUtility;
import com.crm.vtiger.organizationpomclass.HomePage;
import com.crm.vtigerContactPomClass.ContactInformationPage;
import com.crm.vtigerContactPomClass.ContactsPage;
import com.crm.vtigerContactPomClass.CreateContactsPage;

public class CreateContactWithOrganizationAndSignout extends BaseClass1{
	@Test
	public void createContact() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String lastname=eUtil.getExcelData("contact", 1, 2)+"_"+JavaUtility.getRandomData();
		//Navigate to Contact
		homePage=new HomePage(driver);
		homePage.clickOnContactLink();
		Reporter.log("Contact found",true);
		
		//click on create contact
		ContactsPage cntPage=new ContactsPage(driver);
		cntPage.clickOnCreateContactIMG();
		Reporter.log("click on new contact image",true);
		
		//create contact
		CreateContactsPage createcntPage=new CreateContactsPage(driver);
		createcntPage.createContacts(lastname);
		Reporter.log("creating new contact",true);
		
		//verification
		ContactInformationPage cntInfoPage =new ContactInformationPage(driver);
		String actualCntName=cntInfoPage.getContactText();
		Assert.assertTrue(actualCntName.contains(lastname));
		Reporter.log("validation passsed",true);
	}
	@Test
	public void createContactWithOrg() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String orgname = eUtil.getExcelData("org", "TC_01", "organizationname")+"_"+JavaUtility.getRandomData();
		String lastname=eUtil.getExcelData("contact", 1, 2)+"_"+JavaUtility.getRandomData();
		//Navigate to Contact
		homePage=new HomePage(driver);
		homePage.clickOnContactLink();
		Reporter.log("Contact found",true);
		
		//click on create contact
		ContactsPage cntPage=new ContactsPage(driver);
		cntPage.clickOnCreateContactIMG();
		Reporter.log("click on new contact image",true);
		
		//create contact with organizationName
		CreateContactsPage createcntPage=new CreateContactsPage(driver);
		createcntPage.createContactWithOrganization(lastname, 
				orgname, "Accounts", "Contacts");
		Reporter.log("create contact with org",true);
		//verification
				ContactInformationPage contactInfoPage=new ContactInformationPage(driver);
				String actualContactText=contactInfoPage.getContactText();
				Assert.assertTrue(actualContactText.contains(lastname));
				String actualOrgNameInContact=contactInfoPage.getOrganizationText();
				Assert.assertEquals(actualOrgNameInContact, orgname);
	}
		
}
