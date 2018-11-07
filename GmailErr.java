package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class GmailErr {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com");
		String lxp="//span[.=\"Next\"]";
		WebElement wlogin = driver.findElement(By.xpath(lxp));
		wlogin.click();
		Thread.sleep(2000);
		String xpath="(//div[@class=\"dEOOab RxsGPe\"])[1]";
		WebElement err = driver.findElement(By.xpath(xpath));
		String color = err.getCssValue("color");
		String size= err.getCssValue("font-size");
		System.out.println(size);
		System.out.println(color);
		String font_style=err.getCssValue("font-family");
		System.out.println(font_style);
		String font_type=err.getCssValue("font-style");
		System.out.println(font_type);
		String hexColor=Color.fromString(color).asHex();
		System.out.println(hexColor);
		if((hexColor.equals("#d50000"))&&(size.equals("12px")))
		{
			System.out.println("pass.....");
		}
		else
		{
			System.out.println("fail.....");
		}

	}

}
