package btr;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLogin {

	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.get("http:demo.actitime.com");
	LoginPage lp = new LoginPage(driver);
	lp.setUserName("admin");
	lp.setPassword("manager");
	lp.clickLoginButton();
	}

}
