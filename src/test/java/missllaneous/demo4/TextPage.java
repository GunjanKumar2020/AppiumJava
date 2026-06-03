package missllaneous.demo4;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TextPage extends BasePage 
{
  public TextPage(AppiumDriver driver)
  {
	  super(driver);
  }
  
  @AndroidFindBy(accessibility="Text")
  private WebElement textTap;
  
  @AndroidFindBy(accessibility="KeyEventText")
  private WebElement eventText;
  
  @AndroidFindBy(id="io.appium.android.apis:id/text")
  private WebElement eventTextResponse;
  
  @AndroidFindBy(accessibility="LogTextBox")
  private WebElement logTextBtn;
  
  @AndroidFindBy(accessibility="Clear")
  private WebElement clearbtn;
  
  @AndroidFindBy(accessibility="Add")
  private WebElement addBtn;
  
  @AndroidFindBy(accessibility="Do nothing")
  private WebElement doNothingBtn;
  
  
  
  
  public void clickOntextTap()
  {
	  textTap.click();
  }
  
  public void clickOnEventText()
  {
	  eventText.click();
  }
  
  public void clickOnClearButton()
  {
	  clearbtn.click();
  }
  
  public String getEventTextResponse()
  {
	  return eventTextResponse.getText();
  }
  
  public void clickOnLogTextTap()
  {
	  logTextBtn.click();
  }
  
  
  
  public void clickOnAddButton()
  {
	  for(int i=0;i<=5;i++)
	  {
		  addBtn.click();
		  i++;
	  }
	  
   }
  
  public void clickOnDoNothingButton()
  {
	  doNothingBtn.click();
  }
  
  
}
