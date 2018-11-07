package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void test(WebDriver driver) {
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		test(driver);
		WebDriver driver2 = new FirefoxDriver();
		test(driver2);
		
		// TODO Auto-generated method stub

	}

}
