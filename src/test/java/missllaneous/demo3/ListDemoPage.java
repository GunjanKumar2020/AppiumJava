package missllaneous.demo3;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ListDemoPage extends BasePage
{
	public ListDemoPage(AppiumDriver driver)
	{
		super(driver);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"listItemTitle\" and @text=\"List Demo\"]")
	private WebElement listDemoLink;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"listItemTitle\" and @text=\"SAP\"]")
	private WebElement sapLink;
	
	@AndroidFindBy(id="android:id/button3")
	private WebElement learnMoreBtn;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement okBtn;
	
	public void clickOnListDemo()
	{
		listDemoLink.click();
	}
	
	public void clickOnSapLink()
	{
		sapLink.click();
	}
	
	public void clickOnLearnMoreButton()
	{
		learnMoreBtn.click();
	}
	
	public void clickOnOkButton()
	{
		okBtn.click();
	}

}
