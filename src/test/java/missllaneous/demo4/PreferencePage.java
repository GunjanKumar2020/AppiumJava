package missllaneous.demo4;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PreferencePage extends BasePage
{
	public PreferencePage(AppiumDriver driver)
	{
	 super(driver);
	}
	
	
	@AndroidFindBy(accessibility="Preference")
	private WebElement preferenceLink;
	
	@AndroidFindBy(accessibility="3. Preference dependencies")
	private WebElement preferenceDependencyLink;
	
	@AndroidFindBy(id="android:id/checkbox")
	private WebElement wifiCheckBox;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"android:id/title\" and @text=\"WiFi settings\"]")
	private WebElement wifiSettings;
	
	@AndroidFindBy(id="android:id/edit")
	private WebElement wifiNameTextField;
	
	@AndroidFindBy(id="android:id/button1")
	private WebElement okBtn;
	
	
	public void clickOnPreference()
	{
		preferenceLink.click();
	}
	
	public void clickOnPreferenceDependency()
	{
		preferenceDependencyLink.click();
	}
	
	public void chechWifiSetting()
	{
		wifiCheckBox.click();
	}
	
	public void clickOnWifiSettings()
	{
		wifiSettings.click();
	}
	
	public void setWiFiName(String name)
	{
		wifiNameTextField.sendKeys(name);
		okBtn.click();
	}
	
	
	
}
