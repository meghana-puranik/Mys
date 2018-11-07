package MyPactise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class googleDriveLog {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.);
		
	    driver.get("https://drive.google.com/drive/my-drive");
	    WebElement un = driver.findElement(By.id("identifierId"));
	    un.click();
	    un.sendKeys("meghana.puranik");
	    driver.findElement(By.xpath("//span[.='Next']")).click();
	    //Thread.sleep(1000);
	    driver.findElement(By.name("password")).sendKeys("atharvhj@22");
	   // Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[.='Next']")).click();
	    //Thread.sleep(1000);
	   WebElement folder = driver.findElement(By.xpath("//span[.='span']"));
	    Actions action = new Actions(driver);
	    action.doubleClick(folder).perform();
	   
	    
	}

}
