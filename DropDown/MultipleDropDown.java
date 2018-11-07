package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDropDown {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Meghana/Desktop/html/select.html");
		//driver.findElement(By.xpath("//option")).sendKeys(Keys.CONTROL.values();
		List<WebElement> selectall = driver.findElements(By.xpath("//option"));
		/*for(WebElement w:selectall)
		{
			w.sendKeys(Keys.ARROW_DOWN);
		}*/
		for(int i=0;i<selectall.size();i++)
		{
			selectall.get(i).click();;
			Thread.sleep(2000);
		}
	}

}
