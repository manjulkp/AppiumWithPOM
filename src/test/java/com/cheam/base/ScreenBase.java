package com.cheam.base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ScreenBase {
	
	
	public AndroidDriver driver;
	public WebDriverWait wait;
	public ScreenBase(AndroidDriver driver){
		
		this.driver = driver;
		loadElements();
	}


	public void loadElements(){
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void waitForElement(long duration, String Locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,duration);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.makemytrip:id/home_side_menu"))).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Locator))).click();
	}
}
