package missllaneous;

import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import utils.StartAppiumServiceProgramatically;

public class DemoTest 
{
		
	protected URL url;
	protected AppiumDriver driver;
	
	@Test
	public void runFirstTest() throws MalformedURLException
	{
		StartAppiumServiceProgramatically.startAppiumService();
		
		UiAutomator2Options option= new UiAutomator2Options();
		option.setPlatformName("android");
		//option.setDeviceName(prop.getProperty("androidDeviceName"));
		option.setUdid("RZCT912WRAT");
		option.setAutomationName("UiAutomator2");
		option.setApp("D:\\JavaProgramExcercise\\AppiumJavaFWHandsOn\\src\\test\\resources\\apps\\android.wdio.native.app.v2.2.0.apk");
		
		url=new URL("http://127.0.0.1:4723");
		driver=new AndroidDriver(url,option);
		
		StartAppiumServiceProgramatically.stopAppiumService();
		
	}

}
