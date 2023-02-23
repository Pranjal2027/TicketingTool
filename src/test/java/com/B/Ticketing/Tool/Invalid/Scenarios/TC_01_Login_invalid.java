package com.B.Ticketing.Tool.Invalid.Scenarios;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ticketing_tool.pageclass.Base_Class;
import com.ticketing_tool.pageclass.LoginPage;

public class TC_01_Login_invalid extends Base_Class
{
	LoginPage lp;
	
	@BeforeClass
	public void startbrowser() throws IOException
	{
		openBrowseruserlogin();
	}
	
	@Test(dataProvider = "TestData")
	public void login_userPanel(String mail, String pwd ,String result) throws InterruptedException
	{
		lp= new LoginPage(driver);
		lp.sendkeysmail(mail);
		Thread.sleep(2000);
		lp.sendkeyspassword(pwd);
		Thread.sleep(2000);
		lp.clickonlogin();
		Thread.sleep(2000);
		
		String expTitle = "Ticketing Tool";
		String actTitle =driver.getTitle();
		
		if(result.equals("Valid"))
		{
			if(expTitle.contentEquals(actTitle))
			{
				driver.findElement(By.xpath("//span [text()='LOGOUT']")).click();
				AssertJUnit.assertTrue(true);
			}
			else
			{
				AssertJUnit.assertTrue(false);
			}
			
		}
		else if(result.contentEquals("invalid"))
		{
			if(expTitle.contentEquals(actTitle))
			{
				driver.findElement(By.xpath("//span [text()='LOGOUT']")).click();
				AssertJUnit.assertTrue(false);	
			}
			else
			{
				AssertJUnit.assertTrue(true);
			}
			
		}
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
	
	@DataProvider(name = "TestData")
	public String[][] dataforLogin()
	{
		String [][] data = {{"swati@tech-trail.com","Swati@123","Invalid"},
							{"Swati.suryawanshi@tech-trail.com","SAwati@123","Invalid"},
							{"Swati.suryawanshi.com","@123","Invalid"},
							};
		return data;
	}
	


}
