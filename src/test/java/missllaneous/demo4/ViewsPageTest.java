package missllaneous.demo4;


import org.testng.annotations.Test;



public class ViewsPageTest extends BaseScreen 
{
	ViewsPage views;
	Gestures gesture;
	
	
	@Test
	public void validateViewsScreen()
	{
		gesture=new Gestures(driver);
		views=new ViewsPage(driver);
		views.clickOnViewsTab();
		gesture.scrollTillTextVisibility("Tabs");
		views.clickOnTabsTab();
		views.clickOnScrollableTab();
		String tabText=views.getTabName("TAB 28"); 
		gesture.scrollTillspecificView(tabText);   // Scroll till Tab 28 and then click on it.
		views.clickOnTab();
	}
		
		
		
	}


