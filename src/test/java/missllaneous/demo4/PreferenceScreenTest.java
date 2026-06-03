package missllaneous.demo4;

import org.testng.annotations.Test;

public class PreferenceScreenTest extends BaseScreen 
{
	PreferencePage prefPage;
	Utils util;
	
	@Test
	public void validatePreferenceScreen()
	{
		util=new Utils(driver);
		prefPage=new PreferencePage(driver);
		prefPage.clickOnPreference();
		prefPage.clickOnPreferenceDependency();
		prefPage.chechWifiSetting();
		prefPage.clickOnWifiSettings();
		util.hideMobileKeyword();
		prefPage.setWiFiName(ConfigReader.getProperty("wifiName"));
		
		
	}
}
