package missllaneous.demo4;

import org.testng.annotations.Test;

public class iOSCloudUIElementsTest extends BaseScreen
{
 
	iOSUIElementCloudPage cloudPage;
	@Test
	public void validateiOSHomePage()
	{
		cloudPage=new iOSUIElementCloudPage(driver);
		cloudPage.clickOnTextField();
		cloudPage.clickOnalertText();
	}
}
