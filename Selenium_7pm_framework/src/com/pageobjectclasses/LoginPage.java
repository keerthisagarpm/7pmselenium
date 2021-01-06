package com.pageobjectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Decleration of Elements
		@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
		private WebElement un;
		
		@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
		private WebElement pwd;
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		private WebElement login;
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
		private WebElement close;
		
		@FindBy(xpath="//a[@class='_2QKxJ- _2_DUc_']")
		private WebElement forgot;
		
		@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3NgS1a']")
		private WebElement otp;
		
		//Intialization of WebElements
		
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//utilization of WebElements
		public void userName(String user)
		{
			un.sendKeys(user);
		}
		public void passWord(String password)
		{
			pwd.sendKeys(password);
		}
		public void loginButton()
		{
			login.click();
		}
		public void closePopUp()
		{
			close.click();
		}
		public void forgotPwd()
		{
			forgot.click();
		}
		public void requestOtp()
		{
			otp.click();
		}
}
