package accenture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)
{;
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.google.com");
	DemoPage d = new DemoPage(driver);
	System.out.println(d.getLinkCount());
	driver.close();
}

}
