package com.A.TicketingTool.Valid.Scenarios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ticketing_tool.pageclass.Base_Class;
import com.ticketing_tool.pageclass.LoginPage;



public class TC_02_Add_New_User extends Base_Class
{
	AddcompanyPage ap;
	LoginPage lp;
	
	
	 @BeforeClass
	  public void Startbrowser() throws IOException 
	  {
		  openBrowseruserlogin();
	  }
	
	
  @Test ()
  public void AddBuyercompany_buyer() throws IOException, InterruptedException 
  {
	  Properties prop = new Properties();
	  FileInputStream ip = new FileInputStream("/home/tech-trail/workspace/xd/src/main/resources/Xuriti_dev.properties");
	  prop.load(ip);
	  
	  ap = new AddcompanyPage(driver);
	  lp = new LoginPage(driver);
	  lp.userLogin("varsha.patil@tech-trail.com", "Xuriti#10");
	  ap.clickonaddcomapny();
	  Thread.sleep(2000);
	  ap.sendkeysgstno(prop.getProperty("bgstNo"));
	  System.out.println(prop.getProperty("bgstNo"));
	  Thread.sleep(5000);
	  ap.clickondetails();
	  Thread.sleep(5000);
	  ap.clickoncreate();	
	  
	  driver.quit();
  }
  
  

}
