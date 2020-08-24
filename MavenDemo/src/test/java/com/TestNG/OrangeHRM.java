package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchApp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test
	public void login() {
		
		driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys("Admin");;
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@AfterMethod
	public void quitApp() {
		//driver.quit();		
	}
	
}


