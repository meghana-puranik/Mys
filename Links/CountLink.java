package Links;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLink {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{	//open the browser
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Meghana/Desktop/html/Link.html");
		List<WebElement> allinks ;
		allinks= driver.findElements(By.tagName("a"));
		int count=allinks.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		 WebElement link = allinks.get(i);
		 String text = link.getText();
		  System.out.println(text);
		}
		driver.close();
		

	}
}