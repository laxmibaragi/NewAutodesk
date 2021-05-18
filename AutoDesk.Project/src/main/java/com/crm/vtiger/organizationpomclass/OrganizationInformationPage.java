package com.crm.vtiger.organizationpomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {

public OrganizationInformationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement organizationInfo;

@FindBy(id="dtlview_Industry")
private WebElement industryinfo;

public WebElement getOrganizationInfo() {
	return organizationInfo;
}

public WebElement getIndustryinfo() {
	return industryinfo;
}
public String getOrganizationText() 
{
	return organizationInfo.getText();
}
public String getIndustryText()
{
	return industryinfo.getText();
}
}
