package missllaneous.demo2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends DriverManager
{
	LoginPage loginPage;
	
	@Test
	public void loginValidate()
	{
		loginPage=new LoginPage(driver);
		loginPage.clickOnNFCButton();
		loginPage.clickOnTechFilterButton();
		String scanTag=loginPage.verifyScanTagText();
		Assert.assertEquals(scanTag, "Scan a tag");
	}

}
