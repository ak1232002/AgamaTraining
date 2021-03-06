package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardHandling {

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
	
				


	}

}
