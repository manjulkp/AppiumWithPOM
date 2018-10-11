package com.cheam.rough;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cheam.util.AppiumServer;
import com.cheam.util.CommonUtils;

import io.appium.java_client.AppiumDriver;

public class MakeMyTrip {
	
	public static AppiumDriver driver;
	
	public static void main(String[] arg) throws IOException, InterruptedException
	{
		AppiumServer.stop();
		AppiumServer.start();
		CommonUtils.loadConfigProp("makemytrip.properties");
		CommonUtils.setCapabilities();
		driver = CommonUtils.getDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.makemytrip:id/home_side_menu"))).click();
		
		
		WebElement services = driver.findElement(By.id("com.makemytrip:id/slide_view_root_layout"));
		List<WebElement> ser = services.findElements(By.id("com.makemytrip:id/menu_txv"));
		
		for(WebElement ele:ser)
		{
			System.out.println(ele.getText());
			
		}
		ser.get(0).click();
		driver.findElement(By.id("com.makemytrip:id/from_code")).click();
		driver.hideKeyboard();
		
		WebElement city = services.findElement(By.id("com.makemytrip:id/toFroListCity"));
		List<WebElement> ele = city.findElements(By.id("com.makemytrip:id/cityName"));
		for(int i =0;i<ele.size();i++)
		{
			if(ele.get(i).getText().startsWith("dubai"))
			{
				ele.get(i).click();
				break;
			}
		}
		
		driver.findElement(By.id("com.makemytrip:id/to_code")).click();
		driver.hideKeyboard();
		
		
		 city = services.findElement(By.id("com.makemytrip:id/toFroListCity"));
		 ele = city.findElements(By.id("com.makemytrip:id/cityName"));
		for(int i =0;i<ele.size();i++)
		{
			if(ele.get(i).getText().startsWith("dubai"))
			{
				ele.get(i).click();
				break;
			}
		}
		
		//Selection of date
		
		driver.findElement(By.id("com.makemytrip:id/from_day")).click();
		
		int i =0;
		while(! driver.findElement(By.id("com.makemytrip:id/title")).getText().contains("August"))
		{
			driver.findElement(By.id("com.makemytrip:id/CalviewNextmonth")).click();
			if(driver.findElement(By.id("com.makemytrip:id/title")).getText().contains("August"))
			{
				System.out.println("Month reached");
				break;
			}
			i++;
		}
		
		//Select a from  date 
		
		List <WebElement> date = driver.findElements(By.id("com.makemytrip:id/date"));
		for(int y =0;y<date.size();y++)
		{
		if(date.get(y).getText().equals("1"))
		{
			date.get(y).click();
			break;
		}
	}
		
		//Select a to  date 
		
				date = driver.findElements(By.id("com.makemytrip:id/date"));
				for(int y =0;y<date.size();y++)
				{
				if(date.get(y).getText().equals("1"))
				{
					date.get(y).click();
					break;
				}
			}
				
			int adult = Integer.parseInt(driver.findElement(By.id("com.makemytrip:id/adult_counter.value")).getText());
			
			for(int a=2;a<adult+3;a++)
			{
				driver.findElement(By.id("com.makemytrip:id/adults_plus_count"));
			}
			
			for(int a=1;a<adult+2;a++)
			{
				driver.findElement(By.id("com.makemytrip:id/child_plus_count"));
			}
			
			for(int a=0;a<adult+1;a++)
			{
				driver.findElement(By.id("com.makemytrip:id/infant_plus_count"));
			}
			
			driver.findElement(By.id("android:id/text1")).click();
			WebElement dialog = driver.findElement(By.id ("android:id/select_dialog_box"));
			dialog.findElements(By.id("android:id/text1")).get(1).click();
			driver.findElement(By.id("com.makemytrip:id/search_flights")).click();
	}	

}
