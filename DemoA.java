package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class DemoA {
	static {
	String key="webdriver.chrome.driver";
	String value="./driver/chromedriver.exe";
    System.setProperty(key,value);
    
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.close();

	}

}
