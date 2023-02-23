package com.ticketing_tool.pageclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_User extends Base_Class

{
	
	@FindBy(xpath="//input[@formcontrolname=\"emp_id\"]")private WebElement emplyid;
	@FindBy(xpath="//input[@formcontrolname=\"first_name\"]")private WebElement firstname;
	@FindBy(xpath="//input[@formcontrolname=\"last_name\"]")private WebElement lastname;
	@FindBy(xpath="//input[@formcontrolname=\"mobile_number\"]")private WebElement mno;
	@FindBy(xpath="//input[@formcontrolname=\"email\"]")private WebElement email;
	@FindBy(xpath="//input[@formcontrolname=\"password\"]")private WebElement password;
	@FindBy(xpath="//input[@formcontrolname=\"first_name\"]")private WebElement selectrole;
	
	
	public void AddNewUser(WebDriver driver)
	{
	PageFactory.initElements(driver,this);	
	}

	public void sendkeysempid() throws InterruptedException
	{
		emplyid.sendKeys("1234");
    }
	public void sendkeysFname() throws InterruptedException
	{
		firstname.sendKeys("Vishwajeet");
    }

}
