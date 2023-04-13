package logExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPCommApp extends BaseTest{
	
	
	@Test
	public void verifyLoginTest() throws Exception {
		
		
		log.info("clear the email inputbox");
		driver.findElement(By.cssSelector("input#Email")).clear();
		
		log.info("enter the value: " + conf.getUserName());
		driver.findElement(By.cssSelector("input#Email")).sendKeys(conf.getUserName());
		
		log.info("clear the password inputbox");
		driver.findElement(By.name("Password")).clear();
		log.info("enter the value: " + conf.getPassword());
		driver.findElement(By.name("Password")).sendKeys(conf.getPassword());
		
		
		log.info("click on remember me checkbox");
		driver.findElement(By.cssSelector("input#RememberMe")).click();
		
		log.info("click on login button");
		driver.findElement(By.tagName("button")).click();
		
		Thread.sleep(3000);
		log.info("validation of application title after login, actual application title: "+ driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("admin"));
		
		log.info("click on logout button");
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		log.info("validation of application title after logout, actual application title: "+ driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Login"));
	}
	
}
