package handleWindowExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	
WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		
		System.out.println("launching app");
		
		//driver = WebDriverManager.chromedriver().create();   //create ----- v5.0 
		
		
		WebDriverManager.chromedriver().setup(); 
		
		driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterTest
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(7000);
		
		
		//driver.close();
	
		driver.quit();
	
	}

}
