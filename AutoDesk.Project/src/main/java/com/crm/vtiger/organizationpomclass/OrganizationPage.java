package com.crm.vtiger.organizationpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.vtiger.GenericUtils.WebdriverUtility;

public class OrganizationPage extends WebdriverUtility{
WebElement driver;
public OrganizationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//img[@title='Create Organization...']")
private WebElement createOrganizationIMG;

@FindBy(id="search_txt")
WebElement searchTF;

@FindBy(name="search")
private WebElement searchBtn;

@FindBy(id="viewname")
private WebElement filterDropdown;

@FindBy(xpath="//input[@class='txtBox']")
private WebElement searchForTF;

@FindBy(id="bas_searchfield")
private WebElement inTF;

@FindBy(xpath="(//input[@class='crmbutton small create'])[2]")
private WebElement searchNowAdvanceBtn;

@FindBy(linkText="Go to Advanced Search")
private WebElement advanceSearchLink;

@FindBy(xpath="//select[@class='detailedViewTextBox']")
private WebElement organizationNameDropDown;

@FindBy(xpath="//select[@class='repBox']")
private WebElement optionDropDown;

@FindBy(xpath="//input[@value=' Search Now ']")
private WebElement searchNowBtn;

@FindBy(xpath="//option[text()='Prospect Accounts']")
private WebElement prospectAccount;
public WebElement getprospectAccount()
{
	return prospectAccount;
}
public WebElement getsearchNowBtn()
{
	return searchNowBtn;
}
public WebElement getoptionDropDown()
{
	return optionDropDown;
}

public WebElement getorganizationNameDropDown()
{
	return organizationNameDropDown;
}
public WebElement getadvanceSearchLink()
{
	return advanceSearchLink;
}
public WebElement getsearchNowAdvanceBtn()
{
	return searchNowAdvanceBtn;
}
public WebElement getinTF()
{
	return inTF;
}
public WebElement getSearchForTF() {
	return searchForTF;
}
public WebElement getFilterDropdown() {
	return filterDropdown;
}
public WebElement getSearchTF() {
	return searchTF;
}
public void setSearchTF(WebElement searchTF) {
	this.searchTF = searchTF;
}
public WebElement getSearchBtn() {
	return searchBtn;
}
public void setSearchBtn(WebElement searchBtn) {
	this.searchBtn = searchBtn;
}
public WebElement getCreateOrganizationIMG() {
	return createOrganizationIMG;
}
/**
 * click on create organization image
 */
public void clickOnCreateOrganizationIMG()
{
	createOrganizationIMG.click();
}
public void filterOrganization(String option)
{
    selectOption(filterDropdown,option);
}
public String getfilterDropDownText()
{
	String text= filterDropdown.getText();
	return text;
}
public void searchOrgByOrgName(String orgname,String organizationname)
{
	searchForTF.sendKeys(orgname);
	selectOption(inTF,organizationname);
	searchNowBtn.click();
}
public void clickOnAdvanceSearchLink()
{
	advanceSearchLink.click();
}
public void searchTheOrgByRating(String option)
{
	selectOption(organizationNameDropDown,option);
}
public void searchTheOrgByOption(String option)
{
	selectOption(optionDropDown,option);
	searchNowAdvanceBtn.click();
}
public String getSearchForTFText()
{
	return searchForTF.getText();
}
public String getprospectAccountText()
{
	return prospectAccount.getText();
}

}
