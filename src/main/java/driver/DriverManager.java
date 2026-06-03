package driver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import utils.ConfigReader;

public class DriverManager extends ConfigReader
{
	protected static String platformName=prop.getProperty("androidPlatform");
	protected String executionEnv=prop.getProperty("localenv");
	protected static AppiumDriver driver;
	protected static URL url;
	protected static String androidAppPath=System.getProperty("user.dir") + File.separator + prop.getProperty("androidAppPath");
	protected static String iOSAppPath=System.getProperty("user.dir") + File.separator + prop.getProperty("iOSAppPath");
	
	public static AppiumDriver  initializeDriver() throws MalformedURLException
	{
		if(platformName.equalsIgnoreCase("Android"))
		{
			UiAutomator2Options option= new UiAutomator2Options();
			option.setPlatformName(prop.getProperty("androidPlatform"));
			option.setDeviceName(prop.getProperty("androidDeviceName"));
			option.setUdid(prop.getProperty("androidUdid"));
			option.setAutomationName(prop.getProperty("androidAutomationName"));
			option.setApp(androidAppPath);
			
			url=new URL(prop.getProperty("appiumUrl"));
			driver=new AndroidDriver(url,option);
			
		}
		else if(platformName.equalsIgnoreCase("iOS"))
		{
			XCUITestOptions option=new XCUITestOptions();
			option.setPlatformName(prop.getProperty("iOSPlatformName"));
			option.setDeviceName(prop.getProperty("iOSDeviceName"));
			option.setUdid(prop.getProperty("iOSUDID"));
			option.setApp(iOSAppPath);
			
			url=new URL(prop.getProperty("appiumUrl"));
			driver=new IOSDriver(url,option);
		}
		else
		{
			System.out.println("This platform is not supported");
		}
		
		return driver;
	}
	
	public static void quitDriver()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

}
