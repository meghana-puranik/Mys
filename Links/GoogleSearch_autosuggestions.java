package Links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_autosuggestions {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{	//open the browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		//print all auto suggestions in google search
		List<WebElement> allAs = driver.findElements(By.xpath("//div[contains(text(),'java')]"));
		int count = allAs.size();//number 
		System.out.println(count);
		for(WebElement e:allAs)
		{
			System.out.println(e.getText());
		}
		allAs.get(0).click();
		
	}

}
