package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlignY{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url="http://localhost/login.do";
		driver.get(url);
		WebElement un = driver.findElement(By.id("username"));
		int x1=un.getLocation().getX();
		int y1= un.getLocation().getY();
		System.out.println(x1);
		System.out.println(y1);
		WebElement pw = driver.findElement(By.name("pwd"));
		int y2= un.getLocation().getY();
		int x2=un.getLocation().getX();
		System.out.println(x2);
		System.out.println(y2);
		if((x1==x2) && (y1==y2))
		{
			System.out.println("pass.....");
		}
		else
		{
			System.out.println("fail.....");
		}
		}
		
	}
		

