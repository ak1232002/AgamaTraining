package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hrorange {

	public static void main(String[] args) {		
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.xpath("//input[@id = \'txtUsername\']")).sendKeys("Admin");;
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			//driver.findElement(By.xpath("//input[@name=\'Submit\' and @id=\'btnLogin\']")).click();
			driver.findElement(By.id("btnLogin")).click();


	}

}


