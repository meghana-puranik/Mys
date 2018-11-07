package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
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
		//compare actual result with expected result
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
