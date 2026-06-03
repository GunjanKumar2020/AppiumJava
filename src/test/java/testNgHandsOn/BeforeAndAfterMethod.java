package testNgHandsOn;

import org.testng.annotations.*;

public class BeforeAndAfterMethod 
{

	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method is executed!!!");
	}

	@Test
	public void test1()
	{
		System.out.println("Test1 is executed!!!");
	}

	@Test
	public void test2()
	{
		System.out.println("Test2  is executed!!!");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after Method is executed!!!");
	}
}
