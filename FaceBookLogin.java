package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String url="https://www.facebook.com/";
		driver.get(url);
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//j.executeScript("e=document.getElementById('email').value='meghana.puranik'");
		//j.executeScript("e=document.getElementById('pass').value='atharvhj@22'");
		driver.findElement(By.id("email")).sendKeys("meghana.puranik");
		driver.findElement(By.id("pass")).sendKeys("atharvhj@22");
		driver.findElement(By.cssSelector("#loginbutton")).click();
		// driver.findElement(By.xpath("//a[@title='Profile']/../../../div[1]")).click();

	}

}
