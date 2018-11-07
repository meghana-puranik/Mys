package Grids;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridDemoOptional {
	@Parameters({"ip","browser"})
	@Test
	public void testGrid
	(@Optional("localhost")String ip,@Optional("chrome")String browser) throws Exception
	{
		URL url= new URL("http://"+ip+":4444/wd/hub");
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:demo.actitime.com");
		for(int i=1;i<=10;i++)
		{
			WebElement unTB= driver.findElement(By.id("username"));
			unTB.clear();
			unTB.sendKeys("admin");
		}
		driver.close();
	}

}
