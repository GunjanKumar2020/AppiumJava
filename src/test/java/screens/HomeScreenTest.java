package screens;

import org.testng.annotations.Test;
import baseTest.TestBaseScreen;

public class HomeScreenTest extends TestBaseScreen
{
	
	HomeScreen homeScreen;
		
	@Test
	public void validateHomeScreen()
	{
		homeScreen=new HomeScreen(driver);
		homeScreen.selectPreference();
		homeScreen.selectWifi();
		homeScreen.clickOnWifiSettings();
		homeScreen.hideKeyboard();
		homeScreen.setWifiName("Gunjan");
		
	}
}
