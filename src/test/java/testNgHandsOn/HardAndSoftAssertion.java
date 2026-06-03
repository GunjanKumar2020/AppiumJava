package testNgHandsOn;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertion 
{
	@Test
	public void hardAssertion()
	{
		System.out.println("This is first line in hardAssertion");
		Assert.assertTrue(true);
		
		System.out.println("This is second line in hardAssertion");
		
		Assert.assertTrue(false);
		
		System.out.println("This is second line in hardAssertion");
		
		Assert.assertTrue(true);
			
	}
	
	@Test(enabled=true)
	public void softAssertion()
	{
		SoftAssert softAssert=new SoftAssert();
		System.out.println("This is first line in softAssertion");
		softAssert.assertTrue(true);
		
		System.out.println("This is second line in softAssertion");
		
		softAssert.assertTrue(false);
		
		System.out.println("This is third line in softAssertion");
		
		softAssert.assertTrue(true);
		
		softAssert.assertAll("Some cases are failed.But dariveratlit passed it");
		
	}
	
	

}
