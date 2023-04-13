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

public class AmazonSeeMore {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		
		System.out.println("launching app");
		
		driver = WebDriverManager.chromedriver().create();   //create ----- v5.0 
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterTest
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(7000);
		//driver.close();
	}

	@Test
	public void verifyAmazonSearchTest() throws Exception {
		
		
		//driver.findElement(By.xpath("//h2[contains(text(),'Up to 60% off | Professional tools')]//parent::div//following-sibling::div[contains(@class, 'foo')]//child::a[text()='See more']")).click();  ///click on first element
		
		driver.findElement(By.xpath("//h2[contains(text(),'Automotive essentials')]//parent::div//following-sibling::div[contains(@class, 'foo')]//child::a[text()='See more']")).click();  ///click on first element
		
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
	}
	
}
