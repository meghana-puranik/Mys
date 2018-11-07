package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception
	{   // open the browser
		WebDriver driver = new ChromeDriver();
		//Enter the URL
		driver.get("file:///C:/Users/Meghana/Desktop/m.html");
		driver.findElement(By.cssSelector("a[id = 'a1']")).click();//using the css selector we can achive all o
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name = 'n1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class = 'c1']")).click();
		driver.navigate().back();
		//we can use doublequote in cssSelector
		driver.findElement(By.cssSelector("a[href=\"http://www.google.com\"]")).click();
		driver.navigate().back();
		//# means id
		driver.findElement(By.cssSelector("#a1")).click();//same as line17//# means id
		driver.navigate().back();
		driver.findElement(By.id("a1")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector(".c1"));//same as line21//.means class
		driver.navigate().back();
		driver.findElement(By.className("c1"));
		driver.navigate().back();
		driver.findElement(By.cssSelector("a"));//same as line19
		driver.navigate().back();
		driver.findElement(By.tagName("a"));
		
		
		
		
		
	}

}
