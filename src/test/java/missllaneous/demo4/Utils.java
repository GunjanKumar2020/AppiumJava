package missllaneous.demo4;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Utils extends BasePage 
{
		
    public Utils(AppiumDriver driver)
    {
    	super(driver);
    }
    
    public void hideMobileKeyword() 
    {
    	((AndroidDriver)driver).hideKeyboard();
    	
    }
    
    
}
