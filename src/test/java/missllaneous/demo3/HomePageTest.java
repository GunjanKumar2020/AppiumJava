package missllaneous.demo3;

import org.testng.annotations.Test;

public class HomePageTest extends BaseScreen
{
	HomePage homePage;
	
	@Test
	public void validateHomePage()
	{
		homePage=new HomePage(driver);
		homePage.clickOnLoginLink();
		homePage.enterLoginDetails("Gunjan", "Test@123");
		homePage.clickOnLoginBtn();
	}

}
