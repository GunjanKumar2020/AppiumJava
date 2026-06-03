package pages;

import org.openqa.selenium.WebElement;

import baseScreen.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class FormPage extends BasePage
{
   public FormPage(AppiumDriver driver)
   {
	   super(driver);
   }
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Forms']")
	private WebElement formLink;
	
	@AndroidFindBy(accessibility="text-input")
	private WebElement inputTextField;
	
	@AndroidFindBy(accessibility="switch")
	private WebElement switchToggle;
	
	@AndroidFindBy(id="text_input")
	private WebElement selectDropDown;
	
	
	
	public void clickOnFormLink()
	{
		formLink.click();
	}
	
	public void setInputValue(String text)
	{
		inputTextField.sendKeys(text);
	}
	
	public void toggleSwitchButton()
	{
		switchToggle.click();
	}
	
	public void clickOnDropDownField()
	{
		selectDropDown.click();
	}

}
