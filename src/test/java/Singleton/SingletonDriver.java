package Singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingletonDriver {


	public static WebDriver driver=null;

	public static void Initialize() {
		
		if(driver==null) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize() ;
		}
	}
	public static void close() {
		driver.close();

	}
	public static void quite() {
		driver.quit();

	}

}
