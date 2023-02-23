package com.A.TicketingTool.Valid.Scenarios;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ticketing_tool.pageclass.Base_Class;
import com.ticketing_tool.pageclass.LoginPage;

public class TC_01_Login extends Base_Class {
	
	LoginPage lp;
 @BeforeClass
  public void Startbrowser() throws IOException 
  {
	  openBrowseruserlogin();
  }

@Test
public void Login() throws InterruptedException 
{
	lp= new LoginPage(driver);
	lp.sendkeysmail("swati.suryawanshi@tech-trail.com");
	lp.sendkeyspassword("Swati@123");
	lp.clickonlogin();
	Thread.sleep(5000);
	
//	String act = "Ticketing Tool";
//	String exp = driver.getTitle();
//	
//
//	Reporter.log("WelCome to Ticketing Tool");
	driver.quit();
}

}
