package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filpkart_Specifiedlink {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{	//open the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		 String xp = "//div[contains(.,'From') or contains(.,'Now')]";
		List<WebElement> allprice = driver.findElements(By.xpath(xp));
		int count= allprice.size();
		System.out.println(count);
		System.out.println("--------------------------------------------------");
		for(int i=0;i<count;i++)
		{
			WebElement price = allprice.get(i);
			String text = price.getText();
			if(text.length()>0)
			{
				System.out.println(text);
				
			}
			}
			System.out.println("___________________________________________");
			driver.close();
		}
		
		
	}
