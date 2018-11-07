package popup;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukriAbsoutepathtoRelative {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com");
		driver.findElement(By.xpath("//span[.='Later']")).click();
		File f = new File("./CV/Meghana_Lecturer.docx");
		String path=f.getAbsolutePath();
		driver.findElement(By.id("input_resumeParser")).sendKeys(path);

	}

}
