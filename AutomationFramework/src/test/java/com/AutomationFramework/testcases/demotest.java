package com.AutomationFramework.testcases;

import org.testng.annotations.Test;

import com.AutomationFramework.pageobjects.LoginPage;

public class demotest extends baseclass 
{
	
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(BaseURL);
		logger.info("Url is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("20761");
		logger.info("Entered usename");
		lp.setPassword("Sep@2020");
		logger.info("Entered password");
		Thread.sleep(5000);
		
	}

}
