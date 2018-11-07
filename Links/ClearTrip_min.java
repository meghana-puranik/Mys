package Links;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTrip_min {
	
		static
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException
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
			driver.findElement(By.xpath("//td[@data-month='11']/a[.='8']")).click();
			driver.findElement(By.id("SearchBtn")).click();
			String xp ="//th[@class='price']";
			List<WebElement> allprices = driver.findElements(By.xpath(xp));
			List<WebElement> allnames = driver.findElements(By.xpath("//th[@class='vendor  count1']/small"));
			ArrayList<Integer> allPriceNum = new ArrayList<Integer>();
			
			/*for(WebElement price:allnames)
			{
				String text=allprices.getText().substring(1).replaceAll(",","");
				allPriceNum.add(Integer.parseInt(text));
				
				
			}*/
			int len=allprices.size();
			System.out.println(len);
			for(int i=0;i<=allprices.size();i++)
			{
				String text=allprices.get(i).getText().substring(1).replaceAll(",","");
				System.out.println(text);
				
						//.replaceAll(",","");
				allPriceNum.add(Integer.parseInt(text));
				Thread.sleep(3000);
			}
			Collections.sort(allPriceNum);
				System.out.println(allPriceNum.get(0));
			driver.close();
			
			
			
			}
	}
