package missllaneous.demo4;

import java.net.MalformedURLException;

import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;

public class BaseScreen 
{
	AppiumDriver driver;

	@BeforeMethod
	public void setUp() throws MalformedURLException
	{
		driver=DriverManager.getDriver();
	}
	
	@AfterMethod
	public void rearDown()
	{
		if(driver!=null)
		{
			driver.quit();
			driver=null;
		}
	}
}
