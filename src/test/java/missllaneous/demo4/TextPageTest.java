package missllaneous.demo4;


import org.testng.annotations.Test;

public class TextPageTest extends BaseScreen
{
	TextPage page;
	Gestures gesture;
	
	@Test
	public void verifyTextEvent() throws InterruptedException
	{
		page=new TextPage(driver);
		gesture=new Gestures(driver);
		page.clickOntextTap();
		//page.clickOnEventText();
		
		//page.clickOnClearButton();
//		String text=page.getEventTextResponse();
//		System.out.println(text);
				
		page.clickOnLogTextTap();
		page.clickOnAddButton();
		page.clickOnDoNothingButton();
		gesture.pressAndroidBackButton();
		Thread.sleep(2000);
		gesture.navigateBackToPreviousScreen();
		
	}

}
