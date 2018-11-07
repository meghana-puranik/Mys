package accenture;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoPage {
	@FindBy(xpath="//a")
	private List<WebElement> alllinks;
	
	public DemoPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public int getLinkCount()
	{
		int count =alllinks.size();
				return count;
	}

}
