package Links;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTripList {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		//WebDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.findElement(By.xpath("//input[@id='FromTag']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//a[contains(text(),'Kempegowda')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ToTag")).sendKeys("Delhi");
		driver.findElement(By.xpath("//a[contains(text(),'Indira')]")).click();
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		// by using css selector we can select active date
		driver.findElement(By.cssSelector("a.ui-state-active")).click();
		
		//driver.findElement(By.xpath("//td[@data-month='8']/a[.='5']")).click();
		
		 driver.findElement(By.xpath("//select[@id='Adults']/option[@value='9']")).click();
		 driver.findElement(By.xpath("//select[@id='Childrens']/option[@value='1']")).click();
		 driver.findElement(By.xpath("//select[@id='Infants']/option[@value='0']")).click();
		// using robot class
		//Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_2);
		
		
		driver.findElement(By.id("SearchBtn")).click();
	}

}
