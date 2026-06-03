package baseTest;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.appium.java_client.AppiumDriver;
import utils.CommonUtils;

public class TestBaseScreen 
{
	protected AppiumDriver driver;
	
	@BeforeMethod
	public void setUp() throws MalformedURLException
	{
		driver=CommonUtils.createAndroidDriver();
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
