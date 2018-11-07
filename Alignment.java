package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alignment {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url="https://www.facebook.com";
		driver.get(url);
		WebElement un = driver.findElement(By.id("email"));
		int x1= un.getLocation().getX();
		System.out.println(x1);
		WebElement pw = driver.findElement(By.id("pass"));
		int x2= un.getLocation().getX();
		System.out.println(x2);
		if(x1==x2)
		{
			System.out.println("pass.....");
		}
		else
		{
			System.out.println("fail.....");
		}
		}
		
	}
		

