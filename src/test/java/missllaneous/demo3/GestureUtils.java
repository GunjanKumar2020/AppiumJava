package missllaneous.demo3;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class GestureUtils extends BasePage
{
   public GestureUtils(AppiumDriver driver) 
   {
		super(driver);
		
	}

   public void scrollTillTextVisible(String text)
   
   {
	   driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
			        ".scrollIntoView(new UiSelector().text(\""+text+"\"))"));
   }
}
