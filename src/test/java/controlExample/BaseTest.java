package controlExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
	
	
	WebDriver driver;
	//workflow --- execution
	
	@AfterTest
	public void closeApp() throws Exception {
		
		
		Thread.sleep(5000);
		System.out.println("closing the application");
		driver.close();
	}
	
	
	
	@BeforeTest
	public void launchApp() {
		
		System.out.println("launch the application");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://only-testing-blog.blogspot.com/2013/11/new-test.html");
		
		
		driver.manage().window().maximize();
		
		
	}
	

}
