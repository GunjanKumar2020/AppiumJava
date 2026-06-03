package missllaneous.demo1;

import java.net.MalformedURLException;

import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;

public class BaseScreenTest1 extends DriverManager1 
{
	AppiumDriver driver;
	
	@BeforeTest
	public void setUp() throws MalformedURLException
	{
		driver=DriverManager1.getAndroidDriver();
	}
	
	@AfterTest
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
			//driver=null;
		}
	}

}
