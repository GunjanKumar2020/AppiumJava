package missllaneous.demo4;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class iOSUIElementCloudPage extends BasePage
{

	public iOSUIElementCloudPage(AppiumDriver driver) 
	{
		super(driver);
		
	}
	
	@iOSXCUITFindBy(accessibility="Text Button")
	private WebElement textBtn;
	
	@iOSXCUITFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Alert\"]")
	private WebElement alertText;
	
	
	public void clickOnTextField()
	{
		textBtn.click();	
	}
	
	public void clickOnalertText()
	{
		alertText.click();
	}
	
  
}
