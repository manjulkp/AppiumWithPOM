package com.cheam.screens;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import com.cheam.base.Constants;
import com.cheam.base.ScreenBase;

public class BookingFlight extends ScreenBase {

	public BookingFlight(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@AndroidFindBy(id=Constants.Home_Side_Menu)
	public WebElement home_side_menu;
	
	@AndroidFindBys(
	{
		@AndroidFindBy(id=Constants.Layout),
		@AndroidFindBy(id = Constants.Menu)
	})
	public List<WebElement> MenuItems;

	
	public  void getServices()
	{
		waitForElement(10L,Constants.Home_Side_Menu);
		home_side_menu.click();
//		WebElement services = driver.findElement(By.id(Constants.Layout));
//		List<WebElement> ser = services.findElements(By.id(Constants.Menu));
		
		for(WebElement ele:MenuItems)
		{
			System.out.println(ele.getText());			
		}
	}
	

}
