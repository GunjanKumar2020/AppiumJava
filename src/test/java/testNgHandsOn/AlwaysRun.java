package testNgHandsOn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRun 
{
	
	@Test
	public void test1()
	{
		System.out.println("Test 1 is executed1!!");
	}
	
	@Test(dependsOnMethods="test1")
	public void test2()
	{
		System.out.println("Test 2 is executed1!!");
		Assert.fail("Test 2 is failed");
	}
	
	@Test(dependsOnMethods="test2")
	public void test3()
	{
		System.out.println("Test 3 is executed1!!");
		
	}
	
	@Test(dependsOnMethods="test3",alwaysRun=true,enabled=false)
	public void test4()
	{
		System.out.println("Test 4 is executed1!!");
		Assert.fail("Test 4 is failed");
	}

}
