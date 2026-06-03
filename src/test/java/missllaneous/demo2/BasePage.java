package missllaneous.demo2;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage 
{
	AppiumDriver driver;
	
	public BasePage(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(10)), this);
	}

}
