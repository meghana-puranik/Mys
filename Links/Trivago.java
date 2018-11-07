package Links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivago {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{	//open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.trivago.in/");
		driver.findElement(By.id("horus-querytext")).sendKeys("Banga");
		Thread.sleep(10000);
		String xp="//span[.='Airport - Bengaluru, India']";
		driver.findElement(By.xpath(xp)).click();
		driver.findElement(By.xpath("//span[.='Search']")).click();
		driver.findElement(By.xpath("//span[.='Check-in']")).click();
		driver.findElement(By.xpath("//Time[@datetime='2018-09-14']")).click();
		driver.findElement(By.xpath("//time[@datetime='2018-09-20']")).click();
		driver.findElement(By.xpath("//span[.='Double room']")).click();
		
		//String xp1 = "(//h3[@title])[1]";
		//String name = driver.findElement(By.xpath(xp1)).getText();
		//to print all the hotel names
	List<WebElement> allNames = driver.findElements(By.xpath("//h3[@title]"));
	Thread.sleep(50000);
	List<WebElement> allPrice = driver.findElements(By.cssSelector(".item__best-price"));
	Thread.sleep(50000);
	for(int i=0;i<allNames.size();i++)
	{
		String name2 = allNames.get(i).getText();
		String price = allPrice.get(i).getText();
		//System.out.println("______________________________________________________________");
		System.out.println(i+"."+name2+"----->"+price);
	}
	
	/*for(WebElement name : allNames)
	{
		
		System.out.println(name.getText());

}
	List<WebElement> allPrice = driver.findElements(By.cssSelector(".item__best-price"));
	/*for(WebElement price : allPrice)
	{
		
		System.out.println(price.getText());

}*/
	
}
}