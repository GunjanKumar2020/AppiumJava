package missllaneous.demo4;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;

public class DriverManager 
{
	
	protected static String platformName=ConfigReader.getProperty("androidPlatform");
	protected static URL url;
	protected static AppiumDriver driver;
	protected static String appPath=System.getProperty("user.dir")+File.separator+ConfigReader.getProperty("androidAppPath");
			
	
	private static AppiumDriver createDriver() throws MalformedURLException
	{
		if(platformName.equalsIgnoreCase("Android"))
		
		{
									
			UiAutomator2Options option=new UiAutomator2Options();
			option.setPlatformName(ConfigReader.getProperty("androidPlatform"));
			option.setPlatformVersion(ConfigReader.getProperty("androidPlatformVersion"));
			option.setUdid(ConfigReader.getProperty("androidUdid"));
			option.setAutomationName(ConfigReader.getProperty("androidAutomationName"));
			option.setApp(appPath);
			url=new URL(ConfigReader.getProperty("appiumUrl"));
			driver=new AndroidDriver(url,option);
			
		}
		else if(platformName.equalsIgnoreCase("IOS"))
		{
			XCUITestOptions option=new XCUITestOptions();
			option.setPlatformName(ConfigReader.getProperty("iOSPlatformName"));
			option.setPlatformVersion(ConfigReader.getProperty("iOSPlatformVersion"));
			option.setUdid(ConfigReader.getProperty("iOSUDID"));
			option.setAutomationName(ConfigReader.getProperty("iOSAutomationName"));
			option.setApp(ConfigReader.getProperty("iOSAppPath"));
									
			url=new URL(ConfigReader.getProperty("appiumUrl"));
			
			driver=new AndroidDriver(url,option);
		}
		
	
		
		return driver;
		
	}
	
	public static AppiumDriver getDriver() throws MalformedURLException
	{
		if(driver==null)
		{
			driver=DriverManager.createDriver();
		}
		return driver;
	}

}
