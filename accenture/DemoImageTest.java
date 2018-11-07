package accenture;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoImageTest {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)
{
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	AccentureImgCount d = new AccentureImgCount(driver);
	System.out.println(d.getLinkCount());
	//driver.close();
}

}
