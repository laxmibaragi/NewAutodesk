package com.crm.vtiger.organizationpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebdriverUtility;

public class HomePage extends WebdriverUtility{
WebDriver driver;
public HomePage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(linkText="Organizations")
private WebElement organizationLink;

@FindBy(linkText="Contacts")
private WebElement contactLink;

@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement administratorIMG;

@FindBy(xpath="//a[text()='Sign Out']")
private WebElement signOutLink;

public WebElement getAdministratorIMG() {
	return administratorIMG;
}

public WebElement getSignOutLink() {
	return signOutLink;
}

public WebElement getOrganizationLink() {
	return organizationLink;
}

public WebElement getContactLink() {
	return contactLink;
}
/**
 * click on organization link
 */
public void clickOnOrganizationLink()
{
	organizationLink.click();
}
/**
 * click on contactlink
 */
public void clickOnContactLink()
{
	contactLink.click();
}
/**
 * signout from app
 */
public void signOut()
{
	mouseOver(driver,administratorIMG);
	signOutLink.click();
}


}