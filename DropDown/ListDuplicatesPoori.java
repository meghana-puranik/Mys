package DropDown;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class ListDuplicatesPoori {static
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
	List<WebElement> alloptions = select.getOptions();
	LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();
	Integer v = null;
	for(WebElement option:alloptions)
	{
		String text=option.getText();//text[1]=idly,text[2]=vada,text[3]=dosa
		if(map.containsKey(text))//condion 1 fails,cond2 fails,c3 fails
		{
		 v=map.get(text);
		v++;
		map.put(text, v);
		}else
		{
		map.put(text, 1);//idly=1,
				
		}
	}
		//map.put(text, 1);
	//q8. print options present in the list box with their arguments
	System.out.println(map);
	//q4. Check the give option is present in the list box ornot
	String given="Idly";
	if(map.containsKey(given))
	{
		System.out.println("Yes, Given option :"+given+"is present");
	}
	else
	{
		System.out.println("No, Given option :"+given+"is not present");	
	}
	//Q5. check if given option is duplicate in list box
	String given2="Poori";
	//System.out.println(given2);
	if(map.containsKey(given2))
	{
		System.out.println("Yes, Given option :"+given2+"is present");
		if(map.get(given2)> 1)
		{
			System.out.println("yes, Given option :"+given2+"is duplicate");
		}
		else
		{
			System.out.println("no, Given option :"+given2+"is not duplicate");
		}
	}
	else
	{
		System.out.println("sorry, Given option :"+given2+" is not present");	
	}
	
	//q6. print only duplicate options in list box
	java.util.Set<String>  allkeys=map.keySet();
	
	for(String key:allkeys)
	{
	 Integer count=map.get(key);
	 if(count==1)
	 {
		 System.out.println(key);
	 }
	}
	//Q7. Print only duplicate options present in the list box
	for(String key:allkeys) {
		 Integer count=map.get(key);
		 if(count>1)
		 {
			 System.out.println(key);
		 }
	}
	driver.close();
}



}
