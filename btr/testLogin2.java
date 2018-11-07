package btr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class testLogin2 {
	

		static
		{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http:demo.actitime.com");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("abc");
		lp.setPassword("xyz");
		lp.clickLoginButton();
		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(1,TimeUnit.SECONDS);
		wait.withTimeout(10,TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("errormsg")));
		lp.setUserName("admin");
		lp.setPassword("manager");
		lp.clickLoginButton();
		}
	


}
