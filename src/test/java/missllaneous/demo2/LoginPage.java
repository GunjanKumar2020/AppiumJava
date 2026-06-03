package missllaneous.demo2;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage
{
	
	public LoginPage(AppiumDriver driver)
	{
		super(driver);
	}
	
	 @AndroidFindBy(accessibility="NFC")
	  private WebElement nfcbtn;
	 
	 @AndroidFindBy(accessibility="TechFilter")
	 private WebElement techFilterBtn;
	 
	 @AndroidFindBy(id="io.appium.android.apis:id/text")
	 private WebElement scanTagText;
	
	
	
	public void clickOnNFCButton()
	{
		nfcbtn.click();
	}
	
	public void clickOnTechFilterButton()
	{
		techFilterBtn.click();
	}
	
	public String verifyScanTagText()
	{
		return scanTagText.getText();
		
	}
}
