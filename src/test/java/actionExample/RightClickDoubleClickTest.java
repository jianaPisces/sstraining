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

public class RightClickDoubleClickTest {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		System.out.println("launching app");
		driver = WebDriverManager.chromedriver().create();  
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterClass
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(7000);
		driver.close();
	}

	@Test
	public void verifyContextClickTest() throws Exception {
		
		
		//go to Sign----- goto CreateWishList ----click() ----validate
		
		WebElement rightClickButton = driver.findElement(By.xpath("//span[contains(text(),'right')]"));
		WebElement DeleteButton = driver.findElement(By.xpath("//span[contains(text(),'Del')]"));
		
		
		Actions act = new Actions(driver);
		
//		//app1
//		act.moveToElement(rightClickButton).contextClick().perform();
//		
		
//		//app2
//		act.contextClick(rightClickButton).perform();
//		act.click(DeleteButton).perform();
//		
//		
//		//app3
//		act.contextClick(rightClickButton).click(DeleteButton).perform();
		
		
		//app4
		act.contextClick(rightClickButton).perform();
		DeleteButton.click();
		
		
		Thread.sleep(3000);
			
		Assert.assertTrue(driver.switchTo().alert().getText().contains("delete"));
		
		driver.switchTo().alert().dismiss();
		
	}
	
	
	
	@Test
	public void verifyDoubleClickTest() throws Exception {
		
		
		//go to Sign----- goto CreateWishList ----click() ----validate
		
		WebElement doubleClickButton = driver.findElement(By.xpath("//button[contains(text(),'Dou')]"));
		
		
		Actions act = new Actions(driver);
		

		
		act.doubleClick(doubleClickButton).perform();
		
		
		
		Thread.sleep(3000);
			
		Assert.assertTrue(driver.switchTo().alert().getText().contains("You double clicked me"));
		
		driver.switchTo().alert().dismiss();
		
	}
	
	
}
