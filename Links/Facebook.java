package Links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//select[@id='day']/option[@value='31']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//select[@id='month']/option[@value='12']")).click();
		driver.findElement(By.xpath("//select[@id='year']/option[@value='1905']")).click();
	}
}
