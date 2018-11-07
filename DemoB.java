package qsp;


import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoB {
	static {
		String key ="webdriver.gecko.driver";
		String value="./driver/geckodriver.exe";
		System.setProperty(key, value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.close();
	}

}
