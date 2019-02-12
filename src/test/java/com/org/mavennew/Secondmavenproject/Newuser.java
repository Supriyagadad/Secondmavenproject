package com.org.mavennew.Secondmavenproject;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newuser {
	
	@FindBy(xpath="//a[@class='ab-item']")
	WebElement newplus;
	
	WebDriver driver;

	public Newuser(WebDriver driver2) {
		driver =driver2;
		PageFactory.initElements(driver, this);
	}

	public void newclick()
	{
		//WebElement newplus =driver.findElement(By.xpath("//a[@class='ab-item']"));
		newplus.click();
	}
}
