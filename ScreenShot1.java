package qsp;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {
static {
	System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws IOException {
		Date d1=new  Date();
		String s = d1.toString();
		System.out.println(s);
		String v = s.replaceAll(":", "_");
		System.out.println(v);
     //open the web browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		driver.get("http://localhost/login.do");
		TakesScreenshot t =(TakesScreenshot)driver;
		// take the Screenshot
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./photo/login_"+v+".png");
		//copy paste the screen shot to new file
		FileUtils.copyFile(srcFile, destFile);
		//close the browser
		driver.close();
		
		
		

	}

}
