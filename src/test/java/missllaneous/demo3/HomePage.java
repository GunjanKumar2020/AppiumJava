package missllaneous.demo3;

import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage
{

	public HomePage(AppiumDriver driver)
	{
		super(driver);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"listItemTitle\" and @text=\"Login Screen\"]")
	private WebElement loginLink;
	
	@AndroidFindBy(accessibility="username")
	private WebElement userNameTextField;
	
	@AndroidFindBy(accessibility="password")
	private WebElement passwordTextField;
	
	@AndroidFindBy(xpath="(//android.widget.TextView[@text=\"Login\"])[2]")
	private WebElement loginBtn;
	
	
	
	
	public void clickOnLoginLink()
	{
		loginLink.click();
	}
	
	public void enterLoginDetails(String userName,String Password)
	{
		userNameTextField.sendKeys(userName);
		passwordTextField.sendKeys(Password);
	}
	
	public void clickOnLoginBtn()
	{
		loginBtn.click();
			
	}
	
	

}
