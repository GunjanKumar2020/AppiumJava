package missllaneous.demo3;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverManager 
{
	protected static String platformName=ConfigReader.getProperty("androidPlatform");
	protected static String appPath=System.getProperty("user.dir")+File.separator+ConfigReader.getProperty("androidAppPath");
	protected static URL url;
	protected static AppiumDriver driver;
	
	public static AppiumDriver createAndroidDriver() throws MalformedURLException
	{
		if(platformName.equalsIgnoreCase("Android"))
		{
			UiAutomator2Options option=new UiAutomator2Options();
			option.setPlatformName(ConfigReader.getProperty("androidPlatform"));
			option.setUdid(ConfigReader.getProperty("androidUdid"));
			option.setAutomationName(ConfigReader.getProperty("androidAutomationName"));
			option.setApp(appPath);
			//option.setApp("D:\\JavaProgramExcercise\\AppiumJavaFWHandsOn\\src\\test\\resources\\apps\\TheApp.apk");
			//option.setAppPackage(ConfigReader.getProperty("androidAppPackage"));
			//option.setAppActivity(ConfigReader.getProperty("androidAppActivity"));
			url=new URL(ConfigReader.getProperty("appiumUrl"));
			driver=new AndroidDriver(url,option);
									
		}
		return driver;
	}
	
	public static AppiumDriver getAndroidDriver() throws MalformedURLException
	{
		if(driver==null)
		{
			driver=createAndroidDriver();
		}
		return driver;
	}
	

}
