package testNgHandsOn;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;



public class ParallelTesting 
{
	
	@Test
	@Parameter("browser")
	public void TC1(String browser)
	{
		System.out.println("Test Case 1 executed!!!");
		System.out.println("Browser is executed" +browser);
	}
	
	@Test
	@Parameter("userName")
	public void TC2(String userName)
	{
		System.out.println("Test Case 2 executed!!!"+userName);
	}
	
	@Test
	@Parameter("age")
	public void TC3(int age)
	{
		System.out.println("Test Case 3 executed!!!"+age);
	}
	
	@Test
	public void TC4()
	{
		System.out.println("Test Case 4 executed!!!");
	}
	
	@Test
	public void TC5()
	{
		System.out.println("Test Case 5 executed!!!");
	}
	
	

}
