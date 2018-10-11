package com.cheam.util;
import java.io.IOException;


public class AppiumServer {
	
	
	//Appium Launch on Windows
	private static Process process;

	//Calling the node.exe and appium.js
	private static String STARTSERVER = "C:\\Program Files\\nodejs\\node.exe C:\\Users\\nnjppp\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";

	
	
	
	//Starting the Appium Server
	
	public static void start() throws IOException, InterruptedException {

	Runtime runtime = Runtime.getRuntime();

	process = runtime.exec(STARTSERVER);

	Thread.sleep(7000);

	if (process != null) {

	System.out.println("Appium server started");

	}

	}

	
	//Stopping the Appium Server
	
	public static void stop() throws IOException {

	if (process != null) {

	process.destroy();

	}

	System.out.println("Appium server stopped");

	}


}
