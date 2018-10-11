package com.cheam.base;

import java.io.IOException;

import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.cheam.screens.SelendroidHomeScreen;
import com.cheam.screens.WebViewInteractionScreen;
import com.cheam.util.AppiumServer;
import com.cheam.util.CommonUtils;



public class TestBase {
	

	public static AndroidDriver driver;
	public SelendroidHomeScreen homeScreen;
	public WebViewInteractionScreen webview;
	
	@BeforeSuite
	public void setUp() throws IOException, InterruptedException{
		
		if(driver==null){
	
		AppiumServer.stop();
		AppiumServer.start();
		CommonUtils.loadConfigProp("selendroidtestapp.properties");
		CommonUtils.setCapabilities();
		driver = CommonUtils.getDriver();
		}
		
	}
	
	@AfterSuite
	public void tearDown() throws IOException{
		
		driver.quit();
		AppiumServer.stop();
		
	}

}
