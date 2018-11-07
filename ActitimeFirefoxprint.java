package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeFirefoxprint {
	static
	{
	 System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");	
	}
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http:demo.actitime.com");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	


}
}
