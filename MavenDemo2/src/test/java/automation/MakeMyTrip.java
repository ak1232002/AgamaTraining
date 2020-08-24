package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/");
	//driver.findElement(By.id("fromCity")).click();
    //driver.findElement(By.xpath("//input[@id='fromCity']")).click();
	//Thread.sleep(2000);
	WebElement selectMyElement = driver.findElement(By.xpath("//*[@id=\"fromCity\"]"));
	selectMyElement.sendKeys("P");
	Actions action = new Actions(driver);
	Thread.sleep(3000);
	action.sendKeys(Keys.ARROW_DOWN).perform();
	action.sendKeys(Keys.ENTER).perform();
	WebElement toCity = driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
	toCity.sendKeys("Mumbai");
	action.sendKeys(Keys.ARROW_DOWN).perform();
	action.sendKeys(Keys.ENTER).perform();
    driver.findElement(By.xpath("//div[@class='dateInnerCell']//following::p[text()='31']")).click();
		//Click on return
	    driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10' and text()='RETURN']")).click();
		//click on right arrow 
	    driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[1]/span[2]")).click();
		//Click on Oct30
	    driver.findElement(By.xpath("//*[@id=\'root\']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[5]/div[6]/div/p")).click();
		//click on search
	    driver.findElement(By.xpath("//a[text()='Search']")).click();
	    

				

		


	}

}
