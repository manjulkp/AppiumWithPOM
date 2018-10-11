package com.cheam.testcases;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cheam.base.TestBase;
import com.cheam.screens.WebViewInteractionScreen;


public class WebViewScreenValidationTest extends TestBase {
	
	
	@Test
	public void validateWebViewScreen(){		
		WebViewInteractionScreen webview = new WebViewInteractionScreen(driver);
		webview.validateWebViewText();		
	}

}
