package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoF {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//open chrome browser
		WebDriver driver = new ChromeDriver();
		//Go to Naukri.com
		driver.get("http://www.naukri.com");
		//get window handle of current browser and print
		String v= driver.getWindowHandle();
		System.out.println(v);
		//get window handle of current browser and print
		Set<String> s = driver.getWindowHandles();
		System.out.println(s);
		driver.quit();
		
	}

}
