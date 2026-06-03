package testNgHandsOn;

import org.testng.annotations.Test;

public class LinkedMultipleTCsWithDataProvider 
{
	@Test(dataProviderClass=DataProviderValidation.class,dataProvider="getData")
	public void test1(String Name,String Role,int age,double sal)
	{
		
	}
	
	@Test(dataProviderClass=DataProviderValidation.class,dataProvider="getData")
	public void test2(String Name,String Role,int age,double sal)
	{
		
	}
	
	@Test(dataProviderClass=DataProviderValidation.class,dataProvider="getData")
	public void test3(String Name,String Role,int age,double sal)
	{
		
	}

}
