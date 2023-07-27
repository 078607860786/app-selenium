package PageObjectModel;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Singleton.SingletonDriver;

@Test
public class LoginPage{ 
	public static Logger log=LogManager.getLogger();
	String username="arbazarshed.eccountant2@gmail.com";
	String password="@Dmin123";
	
	@BeforeTest
	public void h() {
		SingletonDriver.Initialize();
	}

	
//	Enter Username && Password for login
	@Test(priority=1)
	public void credentialsLoginPage() {
//		//Enter Username
		
		 //WebDriver c= openBrowser(driver);
		SingletonDriver.driver.findElement(By.cssSelector("input[name='login']")).sendKeys(username);
		log.info("Enter Username");
		//Enter Password
		SingletonDriver.driver.findElement(By.id("password")).sendKeys(password);
		log.info("Enter Password");
//		//ClickloginBtn
		SingletonDriver.driver.findElement(By.id("login-btn")).click(); 
		log.info("Click LoginButton");
	}
	
}

