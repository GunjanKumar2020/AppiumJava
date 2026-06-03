package testNgHandsOn;

import org.testng.annotations.*;

public class BeforeAndAfterTest 
{
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test is executed!!!");
	}
	
	@Test(enabled=true)
	public void test1()
	{
		System.out.println("Test1 is executed1!!");
	}
	
	@Test(enabled=true)
	public void test2()
	{
		System.out.println("Test2 is executed!!!");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test is executed!!!");
	}

}
