package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Naukri {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		String parent = driver.getWindowHandle();
		 Set<String> all = driver.getWindowHandles();
		all.remove(parent);
		for(String wh:all) {
			driver.switchTo().window(wh).close();
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//span[.='Later']")).click();
		//using absolute path
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:/Users/Meghana/Desktop/html/seli.doc");
		
	}

}
