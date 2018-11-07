package pomPackageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	//Declaration
	private WebDriver driver;
     @FindBy(id="username")
     private WebElement unTB;
     @FindBy(name="pwd")
     private WebElement pwTB;
     @FindBy(xpath="//div[.='Login ']")
     private WebElement lBtn;
     public LoginPage1(WebDriver driver)
     {   
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
    	 
     }
		
		
		public void setUserName(String un)
		{
			unTB.sendKeys(un);
		}
		public void setPassword(String pw)
		{
			pwTB.sendKeys(pw);
		}
		public HomePage1 clickLButton() throws InterruptedException
		{
			lBtn.click();
			Thread.sleep(2000);
			return new HomePage1(driver);
			
		}
		
		

}
