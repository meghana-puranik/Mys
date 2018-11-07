package MyPactise;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreeShot {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}
public static void main(String[] args) throws IOException
{
	Date d1 = new Date();
	String s =d1.toString();
	String v = s.replaceAll(":", "_");
	System.out.println(v);
	
	WebDriver driver = new ChromeDriver();
	driver.get("http:\\www.gmail.com");
	TakesScreenshot t = (TakesScreenshot)driver ;
	File srcFile = t.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./photo/login1_"+v+".png");
	FileUtils.copyFile(srcFile, destFile);

	
		
		
		}
	
	
}

