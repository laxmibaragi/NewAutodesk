package com.crm.vtiger.organizationpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebdriverUtility;

/**
 * 
 * @author BasavaRAJ
 *
 */
public class CreateOrganizationPage extends WebdriverUtility{
	
public CreateOrganizationPage(WebDriver driver)	
{
	PageFactory.initElements(driver, this);
}
@FindBy(name="accountname")
private WebElement organizationNameTF;

@FindBy(name="industry")
private WebElement industryDropDown;

@FindBy(xpath="//input[@title='Save [Alt+S]']")
private WebElement saveBtn;

public WebElement getSaveBtn() {
	return saveBtn;
}

public WebElement getOrganizationNameTF() {
	return organizationNameTF;
}

public WebElement getIndustryDropDown() {
	return industryDropDown;
}
/**
 * Use this method to create organization by entering manditory field
 * @param organizationName
 */

public void createOrganization(String organizationName)
{
	organizationNameTF.sendKeys(organizationName);
	saveBtn.click();
}
/**
 * Create organization with industry dropdown
 * @param organizationName
 * @param industryType
 */
public void createOrganization(String organizationName,String industryType)
{
	organizationNameTF.sendKeys(organizationName);
	selectOption(industryDropDown,industryType);
	saveBtn.click();
}
}
