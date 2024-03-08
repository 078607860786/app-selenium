package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Singleton.SingletonDriver;

public class Project {
	
	String projectName="Project 33";
	double projectBudget=2500.25;
	double projectValue=45.56;
	String projectLocation="Pakistan";
	int projectAdvance=10;
	int projectretention=15;
	@BeforeTest
	public void h() {
		SingletonDriver.Initialize();

	}
	@Test
	public void newProject() throws InterruptedException {
		//Click on Project
		SingletonDriver.driver.findElement(By.id("dropdown_project")).click();
		//linkText
//		SingletonDriver.driver.findElement(By.cssSelectors("Projects")).click();
		Thread.sleep(3000);
		SingletonDriver.driver.findElement(By.cssSelector("#capture > div.page-container > div.page-sidebar-wrapper > div > ul > li.open > ul > li:nth-child(1) > a")).click();
		//Click to add new Project
		SingletonDriver.driver.findElement(By.cssSelector("div>button[data-target=\"#add-project\"]")).click();
        //Enter Project Name
		Thread.sleep(3000);
		SingletonDriver.driver.findElement(By.id("project-title")).sendKeys(projectName);
		//Project budget
		SingletonDriver.driver.findElement(By.id("budget")).sendKeys(String.valueOf(projectBudget));;
	    //Enter Project Budget
		SingletonDriver.driver.findElement(By.id("project_value")).sendKeys(String.valueOf(projectValue));;
		//Enter Complete Date 
		WebElement el=SingletonDriver.driver.findElement(By.id("exp_date"));
		el.click();
		el.sendKeys("25");
		el.sendKeys(Keys.ENTER);
		//Project Location
		SingletonDriver.driver.findElement(By.id("location")).sendKeys(projectLocation);
		//Project Advance
		SingletonDriver.driver.findElement(By.id("percent1")).sendKeys(String.valueOf(projectAdvance));
		//Project Retantion Money 
		SingletonDriver.driver.findElement(By.id("retention_percent")).sendKeys(String.valueOf(projectretention));
		//Click Save Button on Customer
		SingletonDriver.driver.findElement(By.id("btn")).click();
//		SingletonDriver.driver.quit();
		Thread.sleep(1000);

		WebElement link=SingletonDriver.driver.findElement(By.cssSelector("#data_table > tbody > tr:nth-child(1) > td:nth-child(2) > a"));
		link.getText().toString();
		System.out.println("---This is a Link---"+link);
		link.click();
		
		Thread.sleep(10000);

		SingletonDriver.driver.quit();
	
		
		

		

		
		
	}

}
