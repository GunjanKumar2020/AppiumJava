package baseScreen;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BaseScreen 
{
	
	protected AppiumDriver driver;
	
	public BaseScreen(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(10)), this);
	}
	
	public void hideKeyboard()
	{
		((AndroidDriver)driver).hideKeyboard();
	}
	
	public void pressEnterkey()
	{
		((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.ENTER));
	}

}
