package missllaneous.demo1;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.*;

public class BasePage1 
{
	AppiumDriver driver;

	public BasePage1(AppiumDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(10)), this);
	}
}
