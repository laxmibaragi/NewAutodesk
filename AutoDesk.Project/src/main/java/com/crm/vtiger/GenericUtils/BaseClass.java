package com.crm.vtiger.GenericUtils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	JavaUtility ju=new JavaUtility();
	FileUtility futil=new FileUtility();
	WebdriverUtility wbu=new WebdriverUtility();
	WebDriver driver;
	@BeforeSuite
	public void getConnection() {
		System.out.println("Database Connected");
	}
	@BeforeTest
	public void configBTest()
	{
		System.out.println("launch browser in parallel mode");
	}
	@BeforeClass
	public void lauchBrowser() throws IOException
	{
	String browserName = futil.getPropertyKeyValue("browser");
	//Launch browser
	if(browserName.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("IE"))
	{
		driver=new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	@BeforeMethod
	public void login() throws IOException
	{
		String url = futil.getPropertyKeyValue("url");
		String username = futil.getPropertyKeyValue("username");
		String password = futil.getPropertyKeyValue("password");	
	}
	@Test
	public void test()
	{
		System.out.println("syso");
	}
	@AfterMethod
	public void logout()
	{
		WebElement signout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		wbu.mouseOver(driver, signout);
		driver.findElement(By.linkText("Sign Out")).click();
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}	
	@AfterTest
	public void configATest()
	{
		System.out.println("Close the browser in parallel mode");
	}
	@AfterSuite
	public void closeDatabase()
	{
		System.out.println("Database Closed");
	}

}
