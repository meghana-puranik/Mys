package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait2 {
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
		while(true) 
		{
			String title = driver.getTitle();
			if(title.contains("Enter")) {
			System.out.println("Home-page :"+title);
				  break;
			}
			else {
			
				System.out.println("waiting for home page");
			
		}
		
		System.out.println("END");
		driver.close();
		
		
	}

	}

}
