package screens;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.TestBaseScreen;

public class LoginScreenTest extends TestBaseScreen
{

	LoginScreen loginScreen;
	
	@Test
	public void verifyNFCFunctionality()
	{
		loginScreen=new LoginScreen(driver);
		loginScreen.clickOnNFCButton();
		loginScreen.clickOnTechFilterButton();
		String scanTag=loginScreen.verifyScanTagText();
		Assert.assertEquals(scanTag, "Scan a tag");
	}
}
