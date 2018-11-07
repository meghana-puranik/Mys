package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http:demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		WebDriverWait wd=new WebDriverWait(driver, 10);
		wd.until(ExpectedConditions.titleContains("Time-Track"));
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("logoutLink")).click();
		wd.until(ExpectedConditions.titleContains("Login"));
		String title2=driver.getTitle();
		System.out.println(title2);
		driver.close();
		
		
	}

}
