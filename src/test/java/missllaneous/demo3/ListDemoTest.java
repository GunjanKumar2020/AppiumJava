package missllaneous.demo3;

import org.testng.annotations.Test;

public class ListDemoTest extends BaseScreen
{
	ListDemoPage listDemo;
	GestureUtils util;
	
	@Test
	public void validateListDemo() throws InterruptedException
	{
		listDemo=new ListDemoPage(driver);
		listDemo.clickOnListDemo();
		util=new GestureUtils(driver);
		util.scrollTillTextVisible("SAP");
		Thread.sleep(3000);
		listDemo.clickOnSapLink();
		listDemo.clickOnLearnMoreButton();
		listDemo.clickOnOkButton();
		
	}

}
