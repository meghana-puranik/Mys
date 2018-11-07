package qsp;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.AllArguments;

public class DemoG {
	

	static {
		//System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open chrome browser
		WebDriver driver = new ChromeDriver();
		//Go to Naukri.com
		driver.get("http://www.naukri.com");
				//get window handle of current browser and print
		Set<String> allWHS = driver.getWindowHandles();
	
		
		for(String wh:allWHS )
		{
			
		System.out.println(wh);
		driver.switchTo().window(wh);
		String t = driver.getTitle();
		System.out.println(t);
		if(t.equals("Intellect"))
		{
			driver.close();
		}
	}
	}
}