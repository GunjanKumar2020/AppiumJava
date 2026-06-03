package missllaneous.demo4;

import java.util.Arrays;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class Gestures extends BasePage
{

	public Gestures(AppiumDriver driver) 
	{
		super(driver);
		
	}
	
	public void scrollTillTextVisibility(String text)
	{
		((AndroidDriver)driver).findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
		            ".scrollIntoView(new UiSelector().text(\"" + text + "\"))" ));
	}
	
	public void scrollRightToLeft() 
	{

	    driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
	            ".setAsHorizontalList().scrollForward()"));

	}
	
	public void scrollTillspecificView(String text)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
			        ".setAsHorizontalList()" +
			        ".scrollIntoView(new UiSelector().text(\""+text+"\"))"));
	}
	
	public void scrollLeftToRight()
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
			        ".setAsHorizontalList().scrollBackward()"));
	}
	
	public void pressAndroidBackButton() throws InterruptedException 
	{
		((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.BACK));
		Thread.sleep(2000);
	}
	
	public void navigateBackToPreviousScreen()
	{
		driver.navigate().back();
	}
	
	
	
	
}
