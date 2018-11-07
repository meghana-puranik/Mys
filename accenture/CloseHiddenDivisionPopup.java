package accenture;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloseHiddenDivisionPopup {
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
private WebElement w;

public CloseHiddenDivisionPopup(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void bttnClick()
{
  w.click();
}
}
