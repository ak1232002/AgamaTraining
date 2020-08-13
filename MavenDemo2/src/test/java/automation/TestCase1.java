package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\sudha\\Downloads\\selenium\\IEDriverServer.exe");
		 WebDriverManager.chromedriver().setup();
		 
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();	
		
		d1.get("https://www.facebook.com/");			
		d1.findElement(By.id("email")).sendKeys("abc@gmail.com");
		d1.findElement(By.id("pass")).sendKeys("1234");			
		d1.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		

	}

}
