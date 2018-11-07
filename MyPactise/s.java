package MyPactise;



import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class s {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost/login.do");
	    WebElement target = driver.findElement(By.linkText("actiTIME Inc."));
	    Actions context = new Actions(driver); 
	    Thread.sleep(500);
	    context.contextClick(target).perform();
	    Thread.sleep(500);
	    Robot robo = new Robot();
	    robo.keyPress(KeyEvent.VK_W);
	    Thread.sleep(500);
	   Set<String> win = driver.getWindowHandles();
	   for(String str :win) {
		driver.switchTo().window(str);
	   }
	   Thread.sleep(10000);
	   String title = driver.getTitle();
	   String url = driver.getCurrentUrl();
	   System.out.println(title);
	   System.out.println(url);
	  // Thread.sleep(100000);
	    driver.close();   
	    
	    
	}

}

