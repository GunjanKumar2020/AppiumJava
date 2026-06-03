package missllaneous.demo4;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;



public class DriverManagerScallable 
{

    // Thread-safe driver
    private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();
    private static final String BS_USERNAME =ConfigReader.getProperty("browserstackUserName");
    private static final String BS_ACCESS_KEY =ConfigReader.getProperty("browserstackAccessKey");
    private static final String ANDROID_APPIUM_URL = ConfigReader.getProperty("androidAppiumUrl");
    private static final String IOS_APPIUM_URL =ConfigReader.getProperty("iOSAppiumUrl");
    private static URL url;

// Dont assign AppiumDriver driver at global level because it's thread unsafe and will create a problem during 
     // parallel execution.
    
    // Get Driver
    public static AppiumDriver getDriver() 
    {

        return driver.get();
    }


    // Set Driver
    public static void setDriver( String environment, String platform) throws MalformedURLException 
    {

        AppiumDriver appiumDriver;

        switch(environment.toLowerCase()) 
        {

            case "local":

                appiumDriver = createLocalDriver(platform);

                break;

            case "browserstack":

                appiumDriver = createBrowserStackDriver(platform);

                break;

            default:

                throw new RuntimeException( "Invalid Environment : " + environment);
        }

        driver.set(appiumDriver);
    }


    // Local Driver Creation
    private static AppiumDriver createLocalDriver(String platform) throws MalformedURLException 
    {

        url = getLocalServerUrl(platform);

        switch(platform.toLowerCase()) 
        {

            case "android":

                UiAutomator2Options androidOptions = new UiAutomator2Options();

                androidOptions.setPlatformName("Android");

                androidOptions.setDeviceName( ConfigReader.getProperty("androidDeviceName"));

                androidOptions.setPlatformVersion( ConfigReader.getProperty("androidPlatformVersion"));

                androidOptions.setUdid(ConfigReader.getProperty("androidUdid"));

                androidOptions.setAutomationName( ConfigReader.getProperty("androidAutomationName"));

                androidOptions.setApp( System.getProperty("user.dir")
                        + File.separator
                        + ConfigReader.getProperty(
                                "androidAppPath"));

                return new AndroidDriver(url,androidOptions);


            case "ios":

                XCUITestOptions iosOptions = new XCUITestOptions();

                iosOptions.setPlatformName("iOS");

                iosOptions.setDeviceName(ConfigReader.getProperty("iOSDeviceName"));

                iosOptions.setPlatformVersion( ConfigReader.getProperty("iOSPlatformVersion"));

                iosOptions.setUdid(ConfigReader.getProperty("iOSUDID"));

                iosOptions.setAutomationName(ConfigReader.getProperty("iOSAutomationName"));

                iosOptions.setApp(System.getProperty("user.dir")
                        + File.separator
                        + ConfigReader.getProperty("iOSAppPath"));

                return new IOSDriver(url,iosOptions);


            default:

                throw new RuntimeException("Invalid Platform : " + platform);
        }
    }


    // BrowserStack Driver Creation
    private static AppiumDriver createBrowserStackDriver(String platform) throws MalformedURLException 
    {

//        String userName =ConfigReader.getProperty("browserstackUserName");
//
//        String accessKey =ConfigReader.getProperty("browserstackAccessKey");

        URL url = new URL("https://"
                        + BS_USERNAME
                        + ":"
                        + BS_ACCESS_KEY
                        + "@hub.browserstack.com/wd/hub");



        switch(platform.toLowerCase()) 
        {

            case "android":

                UiAutomator2Options androidOptions = new UiAutomator2Options();

                androidOptions.setPlatformName("Android");

                androidOptions.setDeviceName(ConfigReader.getProperty("bsAndroidDevice"));

                androidOptions.setPlatformVersion( ConfigReader.getProperty("bsAndroidVersion"));

                androidOptions.setCapability("app",ConfigReader.getProperty("bsAndroidAppId"));

                androidOptions.setCapability("project","Mobile Framework");

                androidOptions.setCapability("build", "Android Build");

                androidOptions.setCapability("name","Android Parallel Test");

                return new AndroidDriver(url, androidOptions);



            case "ios":

                XCUITestOptions iosOptions = new XCUITestOptions();

                iosOptions.setPlatformName("iOS");

                iosOptions.setDeviceName(ConfigReader.getProperty("bsIOSDevice"));

                iosOptions.setPlatformVersion(ConfigReader.getProperty("bsIOSVersion"));

                iosOptions.setCapability( "app",ConfigReader.getProperty( "bsIOSAppId"));

                iosOptions.setCapability("project","Mobile Framework");

                iosOptions.setCapability("build","iOS Build");

                iosOptions.setCapability("name","iOS Parallel Test");

                return new IOSDriver(url, iosOptions);


            default:

                throw new RuntimeException("Invalid Platform : "+ platform);
        }
    }



    // Dynamic Local Appium Server URL
    private static URL getLocalServerUrl(String platform) throws MalformedURLException 
    {

        switch(platform.toLowerCase())
        {

            case "android":

                return new URL(ConfigReader.getProperty(ANDROID_APPIUM_URL));

            case "ios":

                return new URL(ConfigReader.getProperty(IOS_APPIUM_URL));

            default:

                throw new RuntimeException( "Invalid Platform");
        }
    }



    // Quit Driver
    public static void quitDriver() 
    {

        if(getDriver() != null) 
        {

            getDriver().quit();

            driver.remove();
        }
    }
}


