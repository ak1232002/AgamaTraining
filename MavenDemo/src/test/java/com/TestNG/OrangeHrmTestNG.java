package com.TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrmTestNG {
	// WebDriver driver;
	WrapperMethod obj = new WrapperMethod();

	@BeforeTest
	public void InvokeApp() {
		obj.insertapp("https://opensource-demo.orangehrmlive.com/");
	}

	@Test
	public void Login() {
		obj.enterbyxapth("//input[contains(@name,'Username')]", "Admin");
		obj.enterbyxapth("//input[contains(@id,'Password')]", "admin123");
		obj.clickbyxpath("//input[@name='Submit' and @id='btnLogin']");

	}

	@Test(dependsOnMethods = "Login")
	public void Configuration() {
		// System.out.println("hi");
		obj.clickbyxpath("//b[text()='Admin']");
		obj.moveToElementUsingXpath("//a[text()='Configuration']");
		obj.moveToElementUsingXpath("//a[text()='Email Configuration']");
		obj.clickbyxpath("//input[@id='editBtn'] ");
		obj.enterbyxapth("//input[@id='emailConfigurationForm_txtMailAddress'] ", "abcde@gmail.com");

	}
	

	@AfterTest
	public void CloseApp() throws InterruptedException {
		obj.waittime(3);
		obj.closeapp();
	}

}
