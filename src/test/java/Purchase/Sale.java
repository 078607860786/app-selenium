package Purchase;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Singleton.SingletonDriver;

public class Sale {
	
	@BeforeTest
	public void h() {
		SingletonDriver.Initialize();



	}
	@Test
	public void sale() throws InterruptedException {
		
		SingletonDriver.driver.findElement(By.xpath("//*[@id=\"dropdown_purchase_order\"]/a")).click();
		Thread.sleep(2000);
		//Click Purchase Invoice
		SingletonDriver.driver.findElement(By.linkText("Purchase Invoice")).click();
	   boolean isdis=SingletonDriver.driver.findElement(By.xpath("//*[@id=\"capture\"]/div[4]/div[2]/div[1]/section/div[1]/div[2]/button")).isEnabled();
//		if(isdis==true) {
//			
//			SingletonDriver.driver.findElement(By.xpath("//*[@id=\"capture\"]/div[4]/div[2]/div[1]/section/div[1]/div[2]/button")).click();
//		}
//		else {
//			System.out.print("Please Try angain with true Attributes");
//		}
	}

}
