package com.cheam.testcases;


import org.testng.annotations.Test;

import com.cheam.base.TestBase;
import com.cheam.screens.SelendroidHomeScreen;
import com.cheam.screens.WebViewInteractionScreen;


public class SelendroidHomeScreenValidationTest extends TestBase{

	
	
	
	@Test
	public void validateHomeScreenTest(){
		
		homeScreen = new SelendroidHomeScreen(driver);
		homeScreen.typeData("Hi Appium");
		homeScreen.validateTextView();
		WebViewInteractionScreen webview = homeScreen.startWebView();
		webview.validateWebViewText();
	
		
	}



}
