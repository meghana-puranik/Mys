package DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleListBox {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Meghana/Desktop/html/select.html");
		WebElement ListBox = driver.findElement(By.id("mtr"));
		Select select = new Select(ListBox);
		//to find type of list box
		System.out.println(select.isMultiple());//true
		//select by index
		select.selectByIndex(0);
		Thread.sleep(2000);
		//select by value
		select.selectByValue("v");
		Thread.sleep(1000);
		//select by Visibility of text
		select.selectByVisibleText("Dosa");
		Thread.sleep(2000);
		System.out.println(select.getOptions().size());//8
		System.out.println(select.getAllSelectedOptions().size());//3
		System.out.println(select.getFirstSelectedOption().getText());//Idly
		select.deselectByIndex(0);
		Thread.sleep(2000);
		select.deselectByValue("v");
		Thread.sleep(2000);
		select.deselectByVisibleText("Dosa");
		
		
	}

}
