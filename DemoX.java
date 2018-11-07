package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoX {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//open the browser
		WebDriver driver =new ChromeDriver();
		//Enter the URL
		driver.get("http://localhost/login.do");
		// goto element Where cursor is blinking (focused)
		WebElement e = driver.switchTo().activeElement();
		//enter the input
		e.sendKeys("meghana");
		//remove the input
		Thread.sleep(2000);
		e.clear();
		driver.close();
		
		

	}

}
