package pomPackageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import btr.LoginPage;
import pompopupPackage.HomePage;
import pompopupPackage.UsersPage;

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
	LoginPage1 l = new LoginPage1(driver);
	l.setUserName("admin");//calling method of Login Page
	l.setPassword("manager");//calling method of login page
	//// calling method of LoginPage
	Thread.sleep(3000);
	HomePage1 h= l.clickLButton();
	UsersPage1 u = h.clickUsers();
	u.clickAdduser();
	Thread.sleep(2000);
	u.first_name("meghana");
	Thread.sleep(2000);
	u.clickCancel();
	u.alertpopup();
	driver.close();
	}
	


}
