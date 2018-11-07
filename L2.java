package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class L2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		//Specify the expected result
		String Expected_title = "Facebook – log in or sign up";
		//get the actual result(in this case title) from application
		String actual_title=driver.getTitle();
		boolean c1=actual_title.contains(Expected_title);
		
		//compare actual result with expected result
		WebElement un = driver.findElement(By.id("email"));
		WebElement pw = driver.findElement(By.id("pass"));
		WebElement lb = driver.findElement(By.xpath("//input[@value=\"Log In\"]"));
		
		boolean c2=un.isDisplayed();
		boolean c3=pw.isDisplayed();
		boolean c4=lb.isDisplayed();
		if(c1&&c2&&c3&&c4)
		{
			System.out.println("pass ------ Login page is displayed");
		}
		else
		{
			System.out.println("fail ------ Login page is not displayed");
		}
					driver.close();

	}

}
