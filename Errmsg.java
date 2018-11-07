package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Errmsg {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement wlogin = driver.findElement(By.id("loginButton"));
		wlogin.click();
		Thread.sleep(2000);
		String xpath="//span[contains(.,'Username')]";
		WebElement err = driver.findElement(By.xpath(xpath));
		String color = err.getCssValue("color");
		System.out.println(color);
		String hexColor=Color.fromString(color).asHex();
		System.out.println(hexColor);
		if(hexColor.equals("#ce0100"))
		{
			System.out.println("pass.....");
		}
		else
		{
			System.out.println("fail.....");
		}

	}

}
