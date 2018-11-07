package Links;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDealMaxprice {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{	//open the browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.id("inputValEnter")).sendKeys("iphone x");
		Thread.sleep(10000);
		String xp = "//a[@data-labelname='iphone x']";
		driver.findElement(By.xpath(xp)).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		Thread.sleep(10000);
		List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		ArrayList<Integer> allPriceNum = new ArrayList<Integer>();
		for(WebElement price:allPrice) {
		
			//String text = price.getAttribute("data-price");
			String text = price.getText();
			String s1 = text.replaceAll("Rs. ", "");
			//System.out.println(s1);
			String s2 = s1.replaceAll(",","");
			//System.out.println(s2);
			
			int v = Integer.parseInt(s2);
			allPriceNum.add(v);
			
			
		}
		/*Collections.sort(allPriceNum);
		int count = allPriceNum.size();
		int max= allPriceNum.get(count-1);
		int min=allPriceNum.get(0);
		System.out.println("MAXIMUM PRICE :"+max);
		System.out.println("MINIMUM PRICE :"+min);*/
		//Example for method over loading.. here sort() method is overloded
		Collections.sort(allPriceNum,Collections.reverseOrder());
		/*int count = allPriceNum.size();
		int min= allPriceNum.get(count-1);
		int max=allPriceNum.get(0);
		System.out.println("MAXIMUM PRICE :"+max);
		System.out.println("MINIMUM PRICE :"+min);*/

		/*for(WebElement price:allPrice) {
			String text=price.getText();
			System.out.println(text);
		5
			
		}*/

}
}
