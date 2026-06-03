package missllaneous.demo3;

import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.*;

public class BasePage 
{
	AppiumDriver driver;
	
	public BasePage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
