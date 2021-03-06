package automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://redbus.in/");
		driver.findElement(By.xpath("//*[@id=\'src\']")).sendKeys("che");
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		action.sendKeys(Keys.DOWN).perform();
		
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("//*[@id=\'rb-calendar_onward_cal\']/table/tbody/tr[1]/td[3]/button")).click();
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[2]")).click();
		
		TakesScreenshot ts =(TakesScreenshot)driver;
	    File source = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(source,new File(("src/test/resources/ScreenShot/redbusin.png")));


	}

}
