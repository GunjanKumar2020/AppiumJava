package utils;

import java.io.File;


import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class StartAppiumServiceProgramatically 
{
	protected static AppiumDriverLocalService service;
	public static void startAppiumService()
	{
		service= AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				  .usingDriverExecutable(new File("C:\\Program Files\\nodejs\\node.exe"))
				  .withAppiumJS(new File("C:\\Users\\acer\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")));
		service.start();
	}
	
	public static void stopAppiumService()
	{
		service.stop();
	}
	
	
	

}
