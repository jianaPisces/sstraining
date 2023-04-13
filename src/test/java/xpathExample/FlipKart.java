package xpathExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKart {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		
		System.out.println("launching app");
		
		driver = WebDriverManager.chromedriver().create();   //create ----- v5.0 
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterTest
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(7000);
		driver.close();
	}

	@Test
	public void verifyAmazonSearchTest() {
		
		
		driver.findElement(By.cssSelector("._3704LK")).sendKeys("iphone 14" + Keys.ENTER);
		//driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
		
	}
	
}
