package missllaneous.demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class ConfigReader 
{
	protected static Properties prop;
	protected static FileInputStream fis;
	protected static URL url;
	protected static AppiumDriver driver;
	protected static String configFilePath=System.getProperty("user.dir")+"\\src\\test\\resources\\config1.properties";
	protected static String appPath=System.getProperty("user.dir")+File.separator+prop.getProperty("androidAppPath");
	
	public static AppiumDriver createAndroidDriver() throws IOException
	{
		prop=new Properties();
		fis=new FileInputStream(configFilePath);
		prop.load(fis);
		String platformName=prop.getProperty("androidPlatform");
		
		if(platformName.equalsIgnoreCase("Android"))
		{
			UiAutomator2Options option=new UiAutomator2Options();
			option.setPlatformName(prop.getProperty("androidPlatform"));
			option.setUdid(prop.getProperty("androidUdid"));
			option.setAutomationName(prop.getProperty("androidAutomationName"));
			option.setApp(appPath);
			//option.setAppPackage(prop.getProperty("androidAppPackage"));
		  //  option.setAppActivity(prop.getProperty("androidAppActivity"));
		    option.setNoReset(true);
		  	url=new URL(prop.getProperty("appiumUrl"));
			driver=new AndroidDriver(url,option);
			
			return driver;
		}
		else if(platformName.equalsIgnoreCase("IOS"))
		{
			System.out.println("Currently This framework is only supporting android platform !!!");
		}
		
		return driver;
		
	}
	
	public static AppiumDriver getAndroidDriver() throws IOException
	{
		if(driver==null)
		{
			driver=createAndroidDriver();
		}
		return driver;
	}

}
