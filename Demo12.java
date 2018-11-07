package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception
	{   // open the browser
		WebDriver driver = new ChromeDriver();
		//Enter the URL
		driver.get("file:///C:/Users/Meghana/Desktop/m.html");
		//find the elements by tag name 'a' & store its address  and click on element using its address
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		driver.findElement(By.id("a1")).click();
		driver.navigate().back();
		driver.findElement(By.name("n1"));
		driver.navigate().back();
		driver.findElement(By.className("c1")).click();
		driver.navigate().back();
		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("goo")).click();
		driver.close();
	}


}


