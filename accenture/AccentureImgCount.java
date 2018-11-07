package accenture;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccentureImgCount {
	@FindBy(xpath="//img")
	private List<WebElement> alllinks;
	
	public AccentureImgCount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public int getLinkCount()
	{
		int count =alllinks.size();
				return count;
	}


}
