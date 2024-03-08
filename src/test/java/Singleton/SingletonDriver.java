package Singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SingletonDriver {


	public static WebDriver driver;

	public static void Initialize() {
		
		 
			 System.setProperty("webdriver.chrome.driver", "F\\chromedriver2.exe");
			 driver=new ChromeDriver();
	}

	
	
	public static void close() {
		driver.close();

	}
	public static void quite() {
		driver.quit();

	}
	public static Object manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
