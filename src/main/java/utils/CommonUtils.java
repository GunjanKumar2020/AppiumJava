package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

public class CommonUtils 
{
  
	protected static Properties prop;
	protected static FileInputStream fis;
	protected static URL url;
	protected static AppiumDriver driver;
	
	protected static String configFilePath=System.getProperty("user.dir") +"\\src\\test\\resources\\properties\\AndroidConfig.properties";
	static
	{
		
		try 
		{
			
			prop=new Properties();
			fis = new FileInputStream(configFilePath);
			prop.load(fis);
			
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
	}
	
	public static AppiumDriver createAndroidDriver() throws MalformedURLException
	{
		UiAutomator2Options option=new UiAutomator2Options();
		option.setPlatformName(prop.getProperty("platformName"));
	//	option.setDeviceName(prop.getProperty("deviceName"));
		option.setUdid(prop.getProperty("deviceUdid"));
		option.setAutomationName(prop.getProperty("automationName"));
		option.setAppPackage(prop.getProperty("app_package"));
	    option.setAppActivity(prop.getProperty("app_activity"));
	  //  option.setCapability("autoLaunch", false);
		url=new URL(prop.getProperty("appiumUrl"));
		driver=new AndroidDriver(url,option);
		
		return driver;
		
		
	}
	
	public void createIOSDriver()
	{
		System.out.println("Currently we are handling an Android Platform only. We will upgrade with IOS sortly");
	}
	
	
}
