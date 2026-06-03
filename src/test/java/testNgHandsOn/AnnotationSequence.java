package testNgHandsOn;

import org.testng.annotations.*;

public class AnnotationSequence 
{

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite is Executed!!");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test is Executed!!");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class is Executed!!");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method is Executed!!");
	}
	@Test
	public void test()
	{
		System.out.println("Test  is Executed!!");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method is Executed!!");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class is Executed!!");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("After Test is Executed!!");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite is Executed!!");
	}
}
