package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoD {
	static {
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//open chrome browser
			WebDriver driver = new ChromeDriver();
		//enter google.com
			driver.get("http://www.google.com");
			//wait for 2 seconds
			Thread.sleep(2000);
			//enter gmail.com
			driver.navigate().to("http://www.gmail.com");
			Thread.sleep(2000);
			//click back
			driver.navigate().back();
			Thread.sleep(2000);
			//click forward
			driver.navigate().forward();
			Thread.sleep(2000);
			//click refresh
			driver.navigate().refresh();
			driver.close();
			
			
			


}
}
