package missllaneous.demo4;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ViewsPage extends BasePage 
{

	public ViewsPage(AppiumDriver driver) 
	{
		super(driver);
	}
	
	@AndroidFindBy(accessibility="Views")
	private WebElement viewsLink;
	
	@AndroidFindBy(accessibility="Tabs")
	private WebElement tabsLink;
	
	@AndroidFindBy(accessibility="5. Scrollable")
	private WebElement scrollableLink;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"TAB 28\"]")
	private WebElement tab28;
	
	@AndroidFindBy(id="android:id/tabs")
	private List<WebElement> tabs;
	
	
	
	public void clickOnViewsTab()
	{
		viewsLink.click();
	}
	
	public void clickOnTabsTab()
	{
		tabsLink.click();
	}
	
	public void clickOnScrollableTab()
	{
		scrollableLink.click();
	}
	
	public String getTabName(String name)
	{
	
	for(WebElement tab:tabs)
	{
		return  tab.getText();
	}
	return name;
	
  }	
	
	public void clickOnTab()
	{
		tab28.click();
	}
	

}
