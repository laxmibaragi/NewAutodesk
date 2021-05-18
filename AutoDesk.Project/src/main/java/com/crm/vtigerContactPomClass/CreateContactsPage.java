package com.crm.vtigerContactPomClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebdriverUtility;
import com.crm.vtiger.organizationpomclass.OrganizationPage;

public class CreateContactsPage extends WebdriverUtility{
WebDriver driver;
public CreateContactsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@name='lastname']")
private WebElement lastnameTF;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveBtn;

@FindBy(xpath="(//img[@src='themes/softed/images/select.gif']")
private WebElement orgNameIMG;

public WebElement getOrgNameIMG() {
	return orgNameIMG;
}

public WebElement getLastnameTF() {
	return lastnameTF;
}

public WebElement getSaveBtn() {
	return saveBtn;
}
/**
 * create contact with manditory fields
 * @param lastname
 */
public void createContacts(String lastname)
{
	lastnameTF.sendKeys(lastname);
	saveBtn.click();
}
public void createContactWithOrganization(String lastname,String childWindowText,String organizationName,String parentWindowText)
{
	lastnameTF.sendKeys(lastname);
	orgNameIMG.click();
	switchToWindow(driver,childWindowText);
	OrganizationPage orgPage = new OrganizationPage(driver);
	orgPage.getSearchTF().sendKeys(organizationName);
	orgPage.getSearchBtn().click();
	driver.findElement(By.linkText(organizationName)).click();
	switchToWindow(driver, parentWindowText);
	saveBtn.click();
}
}
