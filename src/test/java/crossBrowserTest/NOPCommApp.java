package crossBrowserTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPCommApp {
	
	WebDriver driver;
	
	
	
	@Parameters({"soprasteriaBrowser", "version"})
	@BeforeTest
	public void setup(String br, String versionInfo) {
		
		System.out.println("launching app");
		
		System.out.println("execution on browser: " + br);
		System.out.println("execution on versionInfo: " + versionInfo);
		
		String browser = br;
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = WebDriverManager.chromedriver().create();  
			
		}
		
		
		else if(browser.equalsIgnoreCase("edge")) {
			
			driver = WebDriverManager.edgedriver().create(); 
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			driver = WebDriverManager.firefoxdriver().create(); 
		}
		
		else {
			
			
			System.out.println("default browser execute test on chrome");
			System.out.println("Stop the execution, choose specific browser");
			driver = WebDriverManager.chromedriver().create();  
			
		}
		
		 
		
		
		
		
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterTest
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(7000);
		driver.close();
	}

	@Test
	public void verifyLoginTest() throws Exception {
		
		driver.findElement(By.cssSelector("input#Email")).clear();
		driver.findElement(By.cssSelector("input#Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
		
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("admin"));
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("Login"));
	}
	
}
