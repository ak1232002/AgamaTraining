package automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();		 
		WebDriver d1 = new ChromeDriver();
		d1.manage().window().maximize();	
			
		d1.get("https://filebin.net/");	
		d1.findElement(By.xpath("//*[@id=\'fileField\']")).sendKeys("C:\\Users\\sudha\\Desktop\\MyTesting.txt");
			
	}

}
