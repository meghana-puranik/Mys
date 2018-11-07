package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class backgroundText {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost/login.do");
	    WebElement backText = driver.findElement(By.id("username"));
	    
	    
	    String v = backText.getAttribute("placeholder");
	    System.out.println(v);
	    
	    
	    WebElement backTextPass = driver.findElement(By.name("pwd"));
	    String p = backTextPass.getAttribute("placeholder");
	    System.out.println(p);
	}

}
