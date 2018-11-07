package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeHandleExp //handling the Synchronization of find elements using explicit wait
{
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
	WebDriverWait wd=new WebDriverWait(driver,10);
	wd.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	driver.findElement(By.id("logoutLink")).click();
	String title2=driver.getTitle();
	System.out.println(title2);
	driver.close();
	
	
}

}
