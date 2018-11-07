package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imgLogo {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("http://localhost/login.do");
	    String css ="td#logoContainer>div>div>img";
	    WebElement imgLogo  = driver.findElement(By.cssSelector(css));
	    String tag = imgLogo.getTagName();
	    if(tag.equals("img")) {
	    	System.out.println("Pass: It is an image");
	    }
	    else
	    	System.out.println("Fail");
	    
	}

}
