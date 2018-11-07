package pompopupPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	private WebDriver driver;
	@FindBy(xpath="//div[@class='buttonText']")
	private WebElement addbttn;
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement fName;
	@FindBy(id="userDataLightBox_cancelBtn")
	private WebElement cnlBtn;
	public UsersPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void clickAdduser()
	{
		addbttn.click();
	}
	public void first_name(String fn)
	{
		fName.sendKeys(fn);
	}
	public void clickCancel()
	{
		cnlBtn.click();
	}
	//handling java script popup...
	public void alertpopup()
	{
		Alert alert =driver.switchTo().alert();
		alert.accept();
				
	}
	
	}


