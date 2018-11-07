package qsp;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actiTimecontext {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		//enter the url
	    driver.get("http://localhost/login.do");
	    //find element using actiTime Inc
	    WebElement target = driver.findElement(By.linkText("actiTIME Inc."));
	    //Action class 
	    Actions context = new Actions(driver); 
	    Thread.sleep(500);
	    //Click on actiTime Inc link using contextClick()method
	    context.contextClick(target).perform();
	   Thread.sleep(500);
	   //Robot class is used to use key and mouse functions
	    Robot robo = new Robot();
	    //vk_w is used to ctrl+w option used to close the current app or document
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
	  Thread.sleep(1000);
	  driver.close();
	   
	    
	    
	}

}
