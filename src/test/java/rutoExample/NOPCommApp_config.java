package rutoExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import configExample.ReadDataConfigExample;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPCommApp_config {
	
	WebDriver driver;
	ReadDataConfigExample conf;
	
	@BeforeClass
	public void setup() throws Exception {
		
		System.out.println("launching app");
		
		
		
		
		
		
		conf = new ReadDataConfigExample();
		
		
		String browser = conf.getBrowser();
		
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = WebDriverManager.chromedriver().create();  
			
		}
		
		
		else if(browser.equalsIgnoreCase("edge")) {
			
			driver = WebDriverManager.edgedriver().create(); 
		}
		
		
		else {
			
			driver = WebDriverManager.chromedriver().create();  
			
		}
		
		 
		
		
		System.err.println("Application url: " + conf.getAppURL_QA());
		
		
		driver.get(conf.getAppURL_QA());
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterClass
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(7000);
		driver.close();
	}

	@Test
	public void verifyLoginTest() throws Exception {
		
		driver.findElement(By.cssSelector("input#Email")).clear();
		
		System.out.println(conf.getUserName());
		
		
		driver.findElement(By.cssSelector("input#Email")).sendKeys(conf.getUserName());
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys(conf.getPassword());
		
		
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("admin"));
		
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("Login"));
	}
	
}
