package actionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonExample {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		System.out.println("launching app");
		driver = WebDriverManager.chromedriver().create();  
		
		driver.get("https://www.amazon.in/");
		
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
		
		
		//go to Sign----- goto CreateWishList ----click() ----validate
		
		WebElement SignIn = driver.findElement(By.xpath("//span[contains(text(),'sign in')]"));
		WebElement CreateWishList = driver.findElement(By.xpath("//span[contains(text(),'Create a Wish' )]"));
		
		
		Actions act = new Actions(driver);
		
		
//		//app1
//		act.moveToElement(SignIn).perform();
//		act.moveToElement(CreateWishList).perform();
//		act.click().perform();
//		
//		
//		//app2
//		act.moveToElement(SignIn).moveToElement(CreateWishList).click().perform();
//		
		//app3
		act.moveToElement(SignIn).click(CreateWishList).perform();
		
		
		
		
		
		
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("Wish List"));
		
	}
	
}
