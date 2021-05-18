package com.crm.vtigerContactPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {
public ContactInformationPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//span[@class='dvHeaderText']")
private WebElement contactInfo;

@FindBy(id="mouseArea_Organization Name")
private WebElement organizationInfo;

public WebElement getContactInfo() {
	return contactInfo;
}
public WebElement organizationInfo() {
	return organizationInfo;
}
public String getContactText()
{
	return contactInfo.getText();

}
public String getOrganizationText() {
	return organizationInfo.getText();
}

}
