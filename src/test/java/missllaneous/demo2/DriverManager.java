package missllaneous.demo2;

import java.io.IOException;

import org.testng.annotations.*;
import io.appium.java_client.AppiumDriver;

public class DriverManager extends ConfigReader
{
	protected static AppiumDriver driver;
	
	@BeforeMethod
	public static void setUp() throws IOException
	{
		driver=ConfigReader.getAndroidDriver();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
			driver=null;
		}
	}

}
