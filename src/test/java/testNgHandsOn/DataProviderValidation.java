package testNgHandsOn;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderValidation 
{
	
	@Test(dataProvider="getData")
	public void loginTest(String Name,String Role,int age,double sal)
	{
		//System.out.println("Logged in with mutiple set of data");
		System.out.println(Name+" : "+Role+" : "+age+" : "+sal);
		
	}
	

	@DataProvider
	public static Object[][] getData()
	{
		Object[][] data=new Object[3][4];
		
		data[0][0]="Gunjan";
		data[0][1]="QA";
		data[0][2]=35;
		data[0][3]=28.2;
		
		data[1][0]="Manoj";
		data[1][1]="DevOps";
		data[1][2]=24;
		data[1][3]=12.2;
		
		data[2][0]="Nandita";
		data[2][1]="Dev";
		data[2][2]=25;
		data[2][3]=21;
		
		return data;
		
		
	}
	

}

