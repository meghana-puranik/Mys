package accenture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHiddenDivisionPopup {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	CloseHiddenDivisionPopup cp = new CloseHiddenDivisionPopup(driver);
	cp.bttnClick();
}

}
