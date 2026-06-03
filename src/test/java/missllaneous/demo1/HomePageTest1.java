package missllaneous.demo1;

import org.testng.annotations.Test;

public class HomePageTest1 extends BaseScreenTest1
{
	HomePage homePage;
	
	@Test
	public void validateLoginPage()
	{
		homePage=new HomePage(driver);
		homePage.setFirstName("Gunjan");
		homePage.selectGender("Female");
		homePage.selectCountryName("India");
	}
}
