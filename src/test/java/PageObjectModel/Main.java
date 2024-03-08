package PageObjectModel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Singleton.SingletonDriver;

public class Main {
	
	@BeforeTest()
	public void h() {

		 System.setProperty("webdriver.chrome.driver", "F:\\chromedriver2.exe");
		 WebDriver driver=new ChromeDriver();
		

	}
	@Test
	public void url() throws InterruptedException {
		SingletonDriver.driver.navigate().to("https://app.cloudeccountant.com/");





	}
}
