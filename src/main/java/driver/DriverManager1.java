package driver;

import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class DriverManager1 
{
	private static AndroidDriver driver;
	protected URL url;

    public static void initDriver() 
    {

        try 
        {
        	UiAutomator2Options option=new UiAutomator2Options();
        	option.setPlatformName("Android");
			option.setDeviceName("Samsung Galaxy M33");
			option.setUdid("RZCT912WRAT");
			option.setAutomationName("UiAutomator2");
			option.setApp("src/test/resources/apps/android.wdio.native.app.v2.2.0.apk");

            driver = new AndroidDriver( new URL("http://127.0.0.1:4723"), option );

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }

    public static AndroidDriver getDriver() 
    {
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }

}
}
