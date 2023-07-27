package Sales_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjectModel.Main;
import Singleton.SingletonDriver;

public class SaleInvoice extends Main{

	@BeforeTest
	public void h() {
		SingletonDriver.Initialize();



	}
	@Test
	public void saleInovice() {
		//Click Sales
		SingletonDriver.driver.findElement(By.partialLinkText("Sales1")).click();
		SingletonDriver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click Sale Invoice
		SingletonDriver.driver.findElement(By.partialLinkText("Sale Invoice4")).click();
		//Click New Button
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/section/div[1]/div[2]/div/button")).click();
		//Click new Sale Invoice
		SingletonDriver.driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/section/div[1]/div[2]/div/ul/li[1]/a")).click();


	}
}
