package xpathExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleApp_Ancestor_DescendantExample {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		
		System.out.println("launching app");
		
		//driver = WebDriverManager.chromedriver().create();   //create ----- v5.0 
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
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
		
		
		driver.findElement(By.xpath("")).click();  ///click on first element
		
		
		
		
	}
	
}
