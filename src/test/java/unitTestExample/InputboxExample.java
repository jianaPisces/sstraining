package unitTestExample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputboxExample {

	WebDriver driver;
	//workflow --- execution
	
	@After
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		System.out.println("closing the application");
		driver.close();
	}
	
	
	
	@Before
	public void launchApp() {
		
		System.out.println("launch the application");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		driver.manage().window().maximize();
		
		
	}
	
	
	
	
	@Test
	public void verifyInputbox() {
		
		System.out.println("verifyInputbox......");
		driver.findElement(By.xpath("//*[@type='checkbox']")).click();
	}
	
	
	
}
