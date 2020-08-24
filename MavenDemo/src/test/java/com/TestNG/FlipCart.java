package com.TestNG;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.TestNG.WrapperMethod;

public class FlipCart {
	WrapperMethod wm;
	
	@BeforeTest
	public void launchapp() {
		wm= new WrapperMethod();
		wm.insertapp("https://www.flipkart.com/");
	}
	
	@Test
	public void search() {
		wm.enterbyname("q", "mobile");
		wm.enterkeyusingxpath("//button[@class=\'vh79eN\']");
		//wm.clickbyxpath("//button[@class=\'vh79eN\']");
		//wm.enterbyxapth(val2, name2);
			
	}
	@Test(dependsOnMethods = "search")
	public void selectproduct() {
		
		//wm.clickbyxpath("//*[@id=\'container\']/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img");
		wm.clickbyxpath("//button[@class='_2AkmmA _29YdH8']");
		wm.clickbyxpath("//body/div[@id='container']/div/div[contains(@class,'t-0M7P _2doH3V')]/div[contains(@class,'_3e7xtJ')]/div[contains(@class,'_1HmYoV hCUpcT')]/div[contains(@class,'_1HmYoV _35HD7C')]/div[2]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]/div[1]");
	}
	
	@Test(dependsOnMethods = "selectproduct")
	public void addproduct() {
		wm.windowhandling("//button[@class =\'_2AkmmA _2Npkh4 _2MWPVK\']");
		
	}
	
	

}