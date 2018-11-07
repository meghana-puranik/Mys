package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethods {
	static {
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub 
			//open chrome browser
			WebDriver driver = new ChromeDriver();
		//enter the url and wait till the page is loaded  
			driver.get("http://localhost/login.do");
			//maximise the browser
			driver.manage().window().maximize();
			//get the title of the page and print it
			String title = driver.getTitle();
			System.out.println(title);
			//get the url of the page and print it
			String url = driver.getCurrentUrl();
			System.out.println(url);
			//get html code of the page and print it
			String html= driver.getPageSource();
			System.out.println(html);
			driver.close();
		//	WebDriver driver2 = new FirefoxDriv
			
			
			
		

	}

}
