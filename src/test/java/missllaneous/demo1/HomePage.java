package missllaneous.demo1;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage1
{

	public HomePage(AppiumDriver driver) 
	{
		super(driver);
		
	}
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameTextField;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement maleRadioBtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement femaleRadioBtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement selectCountry;
	
	
	public void setFirstName(String name)
	{
		nameTextField.sendKeys(name);
	}
	
	public void selectGender(String gender)
	{
		if(gender.contains("male"))
		{
			maleRadioBtn.click();
		}
		else
		{
			femaleRadioBtn.click();
		}
	}
	
	public void selectCountryName(String countryName)
	{
		selectCountry.click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))"
				+".scrollIntoView(new UiSelector().text(\""+countryName+"))")).click();
			
	}

}
