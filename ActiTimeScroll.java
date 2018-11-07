package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeScroll {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String url="http://localhost/license.jsp;jsessionid=4bbonrl86ierp";
		//Specify the expected result
		driver.get(url);
		JavascriptExecutor j= (JavascriptExecutor)driver;
		for(int i=0;i<=10;i++)
		{
			j.executeScript("window.scrollBy(0,100)");
			Thread.sleep(500);
		}
		for(int i=0;i<=10;i++)
		{
			j.executeScript("window.scrollBy(0,-100)");
			Thread.sleep(500);
		}

}
}

