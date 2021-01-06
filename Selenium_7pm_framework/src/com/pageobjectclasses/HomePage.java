package com.pageobjectclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basicOperations.MovetoElement;

public class HomePage
{
	 @FindBy(xpath="//input[@name='q']")
	  private WebElement searchBox;
	  
	  @FindBy(xpath="//button[@class='L0Z3Pu']")
	  private WebElement searchIcon;
	  
	  @FindBy(xpath="//a[@class='_3SkBxJ']")
	  private WebElement cart;
	  
	  @FindBy(xpath="//span[text()='Electronics']")
	  private WebElement elec;
	  
	  @FindBy(xpath="//a[text()='Mi']")
	  private WebElement mi;
	  
	  public HomePage(WebDriver driver)
	  {
		  PageFactory.initElements(driver, this);
	  }
	  
	  public void seabox(String value)
	  {
		  searchBox.sendKeys(value);
	  }
	  public void seaicon()
	  {
		  searchIcon.click();
	  }
	  public void addToCart()
	  {
		  cart.click();
	  }
	  public void electronice()
	  {
		  MovetoElement.move(elec);
	  }
	  public void miMobile()
	  {
		  mi.click();
	  }
}
