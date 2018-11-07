package qsp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url="file:///C:/Users/Meghana/Desktop/html/jsdemo.html";
		//Specify the expected result
		driver.get(url);
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("e=document.getElementById('t1').value='megh';");

	}

}
