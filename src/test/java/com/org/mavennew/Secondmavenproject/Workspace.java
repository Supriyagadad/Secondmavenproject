package com.org.mavennew.Secondmavenproject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;

public class Workspace {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  Loginworkspce ref1= new Loginworkspce(driver);
			 ref1.login();
			 
	  Newuser ref2= new Newuser(driver);
			 ref2.newclick();
			  
  }
  @Parameters("brow")
  @BeforeTest
  public void beforeTest(String abcd) 
  {
	  String browser=abcd;
	  
	  if(browser.equalsIgnoreCase("Firefox")) 
	  {
	 
	  System.setProperty("webdriver.gecko.driver","Resource/geckodriver.exe");
	  driver =new FirefoxDriver();
	  }
	  else if(browser.equalsIgnoreCase("IE"))
	  {
		  System.setProperty("webdriver.ie.driver","Resource/IEDriverServer.exe");
		  driver =new InternetExplorerDriver();
		  }
	  else
	  {
		  System.out.println("wrong browser");
	  }
	  driver.manage().window().maximize();
	  driver.get("http://demosite.center/wordpress/wp-login.php");
	  
  }
     
	  


  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}
