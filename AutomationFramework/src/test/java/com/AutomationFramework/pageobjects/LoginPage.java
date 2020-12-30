package com.AutomationFramework.pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="userNa")
	WebElement txtUserName;
	
	@FindBy(id="passWord")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@class='login_button']")
	WebElement LoginButton;
	
	@Step("Set the user Name in Elxsimatix Page")
	public void setUserName(String uname)
	{
	
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
	
		txtPassword.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		LoginButton.click();
	}
	
	
	
	
	
}
