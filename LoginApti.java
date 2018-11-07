package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApti {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		//Specify the expected result
		String Expected_title = "actiTIME - Login";
		//get the actual result(in this case tiltle) from application
		String actual_title=driver.getTitle();
		//compare actual result with expecte result
		if(actual_title.equals(Expected_title))
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
