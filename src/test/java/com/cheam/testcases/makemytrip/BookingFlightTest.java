package com.cheam.testcases.makemytrip;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cheam.base.TestBase;
import com.cheam.screens.BookingFlight;

public class BookingFlightTest extends TestBase{
	
	@BeforeTest
	public void init()
	{
		bookflight = new BookingFlight(driver);
	}
	
	@Test(priority = 1)
	public void validateService()
	{
		
		bookflight.getServices();
	}
	
	@Test(priority = 2)
	public void searchFlight()
	{		
		bookflight.fromCity();
		bookflight.FromCitySelection("dubai");		
	}
	

}
