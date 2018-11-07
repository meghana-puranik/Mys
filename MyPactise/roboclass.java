package MyPactise;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class roboclass {
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	public static void main(String[] args) throws Exception {
		Robot robo = new Robot();
	for(int i=0;i<1000;i+=10) {
			robo.mouseMove(100+i, 200);
			Thread.sleep(500);
			
		}
		Runtime.getRuntime().exec("calc");
		Runtime.getRuntime().exec("notepad");
		robo.keyPress(KeyEvent.VK_H);
		robo.keyPress(KeyEvent.VK_I);
	}

}
