package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
			//Declaration
		private WebElement unTB;
		private WebElement pwTB;
		private WebElement lBtn;
		
		//Initialization
		public LoginPage(WebDriver driver)
		{
			unTB = driver.findElement(By.id("email"));
			pwTB=driver.findElement(By.id("pass"));
			lBtn = driver.findElement(By.cssSelector("#loginbutton"));
		}
		//Utilization
		public void setUserName(String un)
		{
			unTB.sendKeys(un);
		}
		public void setPassword(String pw)
		{
			pwTB.sendKeys(pw);
		}
		public void clickLoginButton()
		{
			lBtn.click();
		}
		
	}


