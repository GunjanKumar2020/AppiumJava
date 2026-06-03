package homePage;

import org.testng.annotations.Test;

import driver.DriverManager;
import io.appium.java_client.AppiumDriver;
import pages.FormPage;

public class FormPageTest extends DriverManager
{
	
	@Test
	public void validateFormPage()
	{
		FormPage formPage=new FormPage(driver);
		formPage.clickOnFormLink();
		formPage.setInputValue("Gunjan Kumar");
		formPage.toggleSwitchButton();
		formPage.clickOnDropDownField();
	}
	
	
	
}
