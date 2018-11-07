package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoE {

	static {
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			//open chrome browser
			WebDriver driver = new ChromeDriver();
		//enter naukri.com
			driver.get("http://naukri.com");
			//close all the browsers
			driver.quit();
			Thread.sleep(2000);
			// again open the browser
			driver = new ChromeDriver();
			//Enter naukri.com
			driver.get("http://naukri.com");
			//close only current browser
			driver.close();
			}

}
