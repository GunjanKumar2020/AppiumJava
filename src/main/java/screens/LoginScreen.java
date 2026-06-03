package screens;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AndroidFindBy;

import baseScreen.BaseScreen;
import io.appium.java_client.AppiumDriver;


public class LoginScreen extends BaseScreen
{
	public LoginScreen(AppiumDriver driver) 
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
