package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Plus2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url="https://www.plus2net.com/javascript_tutorial/enable-disable-demo.php";
		//Specify the expected result
		driver.get(url);
		WebElement chkBox = driver.findElement(By.name("others"));
		chkBox.click();
		boolean c1=chkBox.isSelected();
		 WebElement textBox = driver.findElement(By.name("other_text"));
		 boolean c2 = textBox.isEnabled();
		 if(c1&&c2)
		 {
			 System.out.println("pass....");
		 }
		 else
		 {
			 System.out.println("fali.........");
		 }
		 
					//driver.close();

	}

}
