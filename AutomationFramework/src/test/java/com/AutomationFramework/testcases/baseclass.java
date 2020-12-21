package com.AutomationFramework.testcases;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.AutomationFramework.utilities.ReadConfig;

public class baseclass 
{
	ReadConfig readconfig=new ReadConfig();
	public String BaseURL=readconfig.getApplicationURL();
	public static WebDriver driver;
	public static Logger logger;
	
	//@Parameters("browser")
	@BeforeClass
	public static void setup()
	{
		
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	    driver=new ChromeDriver();
	    logger=Logger.getLogger("AutomationFramework");
	    PropertyConfigurator.configure("Log4j.properties");
	    
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	
	}

}
