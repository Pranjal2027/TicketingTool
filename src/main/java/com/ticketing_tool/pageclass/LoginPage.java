package com.ticketing_tool.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage extends Base_Class
{
	
	@FindBy(id="mat-input-0")private WebElement emailid;
	@FindBy(id="mat-input-1")private WebElement password;
	@FindBy(xpath="//span [text()=' LOGIN ']")private WebElement login;

	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
	}
	
	
	public void sendkeysmail(String email)
	{
		emailid.sendKeys(email);
	}
	public void sendkeyspassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickonlogin()
	{
		login.click();
	}
	
	public void userLogin(String ID, String PWD)
	{
		emailid.sendKeys(ID);
		password.sendKeys(PWD);
		login.click();
	}
	
	

}
