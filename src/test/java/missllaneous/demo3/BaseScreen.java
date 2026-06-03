package missllaneous.demo3;

import java.net.MalformedURLException;

import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;

public class BaseScreen 
{
	AppiumDriver driver;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException
	{
		driver=DriverManager.getAndroidDriver();
	}
	
	@AfterMethod
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}

}
