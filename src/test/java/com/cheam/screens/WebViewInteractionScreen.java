package com.cheam.screens;


import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.cheam.base.ScreenBase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;



public class WebViewInteractionScreen extends ScreenBase {

	public WebViewInteractionScreen(AndroidDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@AndroidFindBys({
		
		@AndroidFindBy(id="io.selendroid.testapp:id/tableHeader"),
		@AndroidFindBy(className="android.widget.TextView")
		
	})
	public WebElement webviewText;
	
	public WebViewInteractionScreen validateWebViewText(){
		
		System.out.println(webviewText.getText());
		Assert.assertEquals("Web View Interaction", webviewText.getText());
		System.out.println(driver.getPageSource());
		Set<String> contextNames = driver.getContextHandles();
	    for (String contextName : contextNames) {
	      System.out.println(contextName);
	      if (contextName.contains("WEBVIEW")){
	        driver.context(contextName);
	      }
	    }
		
		return this;
		
	}
	
	

}
