package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Plusnet {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url="https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php";
		//Specify the expected result
		driver.get(url);
		
		//WebElement chkBox = driver.findElement(By.name("others"));
		//chkBox.click();
		 WebElement textBox = driver.findElement(By.name("other_text"));
		 if(textBox.isEnabled())
		 {
		 textBox.sendKeys("abcd");
			
		 System.out.println("pass : TB is enabled and abcd is entered");
		 }
		 
		 else
		 {
			 System.out.println("Fail Text Box is disabled");
		 }
		 
}
}
