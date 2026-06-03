package missllaneous.demo1;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverManager1 extends ConfigReader1
{
    protected static AppiumDriver driver;
	protected static String platformName=prop.getProperty("androidPlatform");
	protected static URL url;
	

	private static AppiumDriver createAndroidDriver() throws MalformedURLException
	{
		if(platformName.equalsIgnoreCase("Android"))
		{
			UiAutomator2Options option=new UiAutomator2Options();
			option.setPlatformName(prop.getProperty("androidPlatform"));
			option.setUdid(prop.getProperty("androidUdid"));
			option.setAutomationName(prop.getProperty("androidAutomationName"));
			option.setAppPackage(prop.getProperty("androidAppPackage"));
		    option.setAppActivity(prop.getProperty("androidAppActivity"));
		  	url=new URL(prop.getProperty("appiumUrl"));
			driver=new AndroidDriver(url,option);
		}
		return driver;
	}
	
	private static AppiumDriver createIOSDriver() throws MalformedURLException
	{
		if(platformName.equalsIgnoreCase("IOS"))
		{
			System.out.println("This framework is only supporting Android Framework !!!");
		}
		return driver;
	}
	
	public static AppiumDriver getAndroidDriver() throws MalformedURLException
	{
		if(driver==null)
		{
			driver =createAndroidDriver();
		}
		return driver;
	
	}
	
	public static AppiumDriver getIOSDriver() throws MalformedURLException
	{
		if(driver==null)
		{
			driver =createIOSDriver();
		}
		return driver;
	
	}
	
}
