package Assetion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.WrapsDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class AssertionSoft {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@Test
public void testDemoA()
{
	 WebDriver driver = new ChromeDriver();
	 driver.get("http:demo.actitime.com");
	 String aTitle=driver.getTitle();
	String eTitle ="actiTIME - Dinga";
	//String eTitle="actiTIME - Login";for pass
	Assert.assertEquals(aTitle, eTitle);
	//SoftAssert s = new SoftAssert();
	//s.assertEquals(aTitle, eTitle);
	driver.close();
	//s.assertAll();
}
}
