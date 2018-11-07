package Links;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import okio.Options;

public class yatra {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{	//open the browser
ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("booking_engine_hotels")).click();
		driver.findElement(By.name("BE_hotel_destination_city")).sendKeys("Bang");
		String xp="//strong[text()='Bang']/..";
		List<WebElement> allAs = driver.findElements(By.xpath(xp));
		int count = allAs.size();//number 
		System.out.println(count);
		for(WebElement e:allAs)
		{
			System.out.println(e.getText());
		}
		allAs.get(0).click();
		//String str = allAs.get(0).getText();
		Thread.sleep(10000);
		//driver.findElement(By.id("BE_hotel_checkin_date")).click();
		Thread.sleep(1000);
		//click on check in date
		driver.findElement(By.id("05/09/2018")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("BE_hotel_checkout_date")).click();
		Thread.sleep(10000);
		driver.findElement(By.id("14/09/2018")).click();
		Thread.sleep(10000);
		//click search
		driver.findElement(By.id("BE_hotel_htsearch_btn")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[contains(@ng-click,'hidePromoBanner()')]")).click();
		//ChromeOptions options1 = new ChromeOptions();
	//options.addArguments("--disable-notifications");
		
		String xp_price = "//*[@id=\"result0\"]/div[1]/div[2]/ul/li[2]/p/span[2]/span[2]";
		
		WebElement price = driver.findElement(By.xpath(xp_price));
		System.out.println("______________________________________________________________");
		System.out.println(price.getText());
	
	}

}
