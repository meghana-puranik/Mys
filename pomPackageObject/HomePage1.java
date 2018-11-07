package pomPackageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	private WebDriver driver;
	@FindBy(xpath="//div[.='USERS']")
	private WebElement user;
	
	public HomePage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public UsersPage1 clickUsers()
	{
		user.click();
		// creating the object
		return new UsersPage1(driver);
	}
	

}
