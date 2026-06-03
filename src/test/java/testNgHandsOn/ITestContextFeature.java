package testNgHandsOn;

import org.testng.ITestContext;
import org.testng.annotations.Test;


//Note: ITestContext is an interface.
// It shares the data within the same Java Class or class file.
// We have to create a reference to use the pre-defined methods like setAttribute,getAttribute.
// in each test methods we must have to create a reference like : ITestContext context

public class ITestContextFeature 
{
	@Test(priority=0)
	public void setUp(ITestContext context)
	{
		System.out.println("Setting up a new environment!!!");
		context.setAttribute("Window 10", "HP Blaze");
	}
	
	@Test(priority=1,dependsOnMethods="setUp")
	public void configureInternet(ITestContext context)
	{
		System.out.println("Setting up a new internet environment!!!");
		context.setAttribute("ConnectionName", "Kumar Tower_5G");
		context.getAttribute("Window 10");
	}
	
	@Test(priority=2,dependsOnMethods={"setUp","configureInternet"})
	public void configureTools(ITestContext context)
	{
		System.out.println("Setting up a new automation tools environment!!!");
		context.setAttribute("ToolName", "Selenium");
		String osName=(String)context.getAttribute("Window 10");
		String connName=(String)context.getAttribute("ConnectionName");
		System.out.println(connName);
		System.out.println(osName);
	}
	

	

}
