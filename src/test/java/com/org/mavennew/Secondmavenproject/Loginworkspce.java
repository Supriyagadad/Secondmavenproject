package com.org.mavennew.Secondmavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginworkspce {
	
	@FindBy(id="user_login")
	WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(id="wp-submit")
	WebElement loginclick;
	
	WebDriver driver;

	

	public Loginworkspce(WebDriver driver2)
	{
		driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public void login()
	{
		//WebElement username =driver.findElement(By.id("user_login"));
		  username.sendKeys("admin");
		  
		 // WebElement password =driver.findElement(By.xpath("//input[@type='password']"));
		  password .sendKeys("demo123");
		  
		  //WebElement loginclick =driver.findElement(By.id("wp-submit"));
		  loginclick.click();
	}
	
}
