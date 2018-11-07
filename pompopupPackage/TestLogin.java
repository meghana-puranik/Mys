package pompopupPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import btr.LoginPage;

public class TestLogin {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.get("http:demo.actitime.com");
	//creating login page constructor
	LoginPage lp = new LoginPage(driver);
	lp.setUserName("admin");//calling method of Login Page
	lp.setPassword("manager");//calling method of login page
	lp.clickLoginButton();//// calling method of LoginPage
	Thread.sleep(3000);
	HomePage hp = new HomePage(driver);
	hp.clickUsers();
	Thread.sleep(3000);
	
	Thread.sleep(3000);
	UsersPage up = new UsersPage(driver);
	up.clickAdduser();
	Thread.sleep(3000);
	up.first_name("meghana");
	up.clickCancel();
	up.alertpopup();
	
		driver.close();
	}


}
