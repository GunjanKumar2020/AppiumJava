package screens;

import org.openqa.selenium.WebElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import baseScreen.BaseScreen;
import io.appium.java_client.AppiumDriver;


public class HomeScreen extends BaseScreen
{

	public HomeScreen(AppiumDriver driver) 
	{
		super(driver);
		
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Preference\"]")
	private WebElement preference;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")
	private WebElement preferenceDependency;
	
	@AndroidFindBy(id="android:id/checkbox")
	private WebElement wifi;
		
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")
	private WebElement wifiSettings;
	
	@AndroidFindBy(id="android:id/edit")
    private WebElement wifiTextField;
	
	
	public void selectPreference()
	{
		preference.click();
		preferenceDependency.click();
		
	}
	
	public void selectWifi()
	{
		wifi.click();
	}
	
	public void clickOnWifiSettings()
	{
		wifiSettings.click();
	}
	
	public void setWifiName(String name)
	{
		wifiTextField.sendKeys(name);
	}

}
