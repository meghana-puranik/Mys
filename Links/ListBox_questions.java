package Links;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_questions {
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
		Select select =new Select(ListBox);
		List<WebElement> alloptions = select.getOptions();
		
		//Q11 Count the options
		int count=alloptions.size();
		System.out.println(count);
		//Q1 print content of the listbox
		for(WebElement option:alloptions)
		{
			System.out.println(option.getText());
		}
		// Q2 select and deselect all the options in reverse order
		for(int i = count-1;i>=0;i--)
		{
			select.deselectByIndex(i);
		}
		// Q3 print the content of list box in sorted order
		ArrayList<String> allText = new ArrayList<String>();
		for(WebElement option:alloptions)
		{
			allText.add(option.getText());
		}
		Collections.sort(allText);
		for(String text:allText)
		{
			allText.add(text);
		}
		//Q10 check if the listbox is single or multi select
		if(select.isMultiple())
		{
			System.out.println("Its a Multiple Listbox");
		}
		else
		{
			System.out.println("Its A SINGLE SELECT lISTbOX");
		}
	
		}
}

