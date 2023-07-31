package PageObjectModel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Singleton.SingletonDriver;

public class Main {

	public static Logger log=LogManager.getLogger();
	@BeforeTest()
	public void h() {
		SingletonDriver.Initialize();

//
//
	}
	@Test
	public void url() throws InterruptedException {
		SingletonDriver.driver.navigate().to("https://beta.cloudeccountant.com/login.html");
		log.info("Open App cloudeEccountant");
		




	}
}
