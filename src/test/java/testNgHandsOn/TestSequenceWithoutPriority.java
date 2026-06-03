package testNgHandsOn;


import org.testng.annotations.Test;

public class TestSequenceWithoutPriority 
{

	@Test(priority=1)
	public void appiumTest()
	{
		System.out.println("AppiumTest is executed!!!");
	}

	@Test(priority=2)
	public void androidTest()
	{
		System.out.println("AndroidTest  is executed!!!");
	}

	@Test(priority=4)
	public void baseTest()
	{
		System.out.println("BaseTest  is executed!!!");
	}
	
	@Test(priority=-2)
	public void checkIn()
	{
		System.out.println("Check In  is executed!!!");
	}
	@Test(priority=-1)
	public void checkOut()
	{
		System.out.println("CheckOut   is executed!!!");
	}
	
}
