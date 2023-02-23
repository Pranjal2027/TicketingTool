package com.ticketing_tool.pageclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class{ protected static WebDriver driver;


public void openBrowseruserlogin() throws IOException 
{
	Properties prop = new Properties();
	FileInputStream ip = new FileInputStream("/home/pranjal/Documents/eclips_project/Ticketing_tool_Test_cases/Ticketing Tool.properties");
      
	 prop.load(ip);
	
	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://dev.xuriti.app/#/");
	driver.get("http://69.160.44.73/");
 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
public void openBrowseruseradmin() throws IOException 
{

	System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://69.160.44.73/");
 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
}
public org.openqa.selenium.support.ui.WebDriverWait waits()
{
	org.openqa.selenium.support.ui.WebDriverWait  Wait = new org.openqa.selenium.support.ui.WebDriverWait
			(driver, Duration.ofMillis(5000));
	return Wait;
}


}
