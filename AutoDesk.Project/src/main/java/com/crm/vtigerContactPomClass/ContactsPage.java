package com.crm.vtigerContactPomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage {

public ContactsPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//img[@title='Create Contact...']")
private WebElement createContactIMG;

public WebElement getCreateContactIMG() {
	return createContactIMG;
}

public void clickOnCreateContactIMG()
{
	createContactIMG.click();
}
}
