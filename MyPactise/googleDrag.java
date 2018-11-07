package MyPactise;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class googleDrag {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	   WebElement drag1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
	  WebElement drag2 = driver.findElement(By.xpath("//h1[.='Block 3']"));
	   Actions dragact = new Actions(driver);
	   Thread.sleep(5000);
	   dragact.dragAndDrop(drag1,drag2).perform();
	}

}
