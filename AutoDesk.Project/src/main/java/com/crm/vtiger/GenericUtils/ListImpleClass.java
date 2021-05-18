package com.crm.vtiger.GenericUtils;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListImpleClass implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result)
	{
		String currentDate=new Date().toString().replace(":", "_").replace(" ", "_");
		String failedtestname=result.getMethod().getMethodName();
		EventFiringWebDriver ed=new EventFiringWebDriver(BaseClass1.sdriver);
		File srcImg=ed.getScreenshotAs(OutputType.FILE);
		File dstImg =new File("./screenshot/"+failedtestname+"_"+currentDate+".png");
		try {
			FileUtils.copyFile(srcImg, dstImg);
		} catch (IOException e) {
			
		}
	}

}
