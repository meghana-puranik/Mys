package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url="https://demo.vtiger.com/index.php";
		//Specify the expected result
		driver.get(url);
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("e=document.getElementById('username').value='admin'");
		j.executeScript("e=document.getElementById('password').value='admin'");
		driver.findElement(By.xpath("//button[.='Sign in']")).submit();
		//driver.findElement(By.xpath("//button[.='Sign in']")).sendKeys(Keys.ENTER);
		
		// TODO Auto-generated method stub

	}

}
