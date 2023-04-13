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

public class DragDropExample {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
		
		System.out.println("launching app");
		driver = WebDriverManager.chromedriver().create();  
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterClass
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(7000);
		driver.close();
	}

	
	
	@Test
	public void verifyDoubleClickTest() throws Exception {
		
		
		Thread.sleep(3000);
		//frame concept
		//index
		//name/id
		//webelement
		
		WebElement myFrame = driver.findElement(By.cssSelector("iframe[data-src*='photo-manager']"));
		driver.switchTo().frame(myFrame);
		
		
		
		
		Thread.sleep(3000);

		WebElement img3 = driver.findElement(By.cssSelector("img[src*='tatras3']"));
		WebElement img4 = driver.findElement(By.cssSelector("img[src*='tatras4']"));
		WebElement trash = driver.findElement(By.cssSelector("div#trash"));
		
		Actions act = new Actions(driver);
		
		//app1
		act.dragAndDrop(img4, trash).perform();
		
		
		//A convenience method that performs click-and-hold at the location of the source element, 
		//moves to the location of the target element, then releases the mouse.
		
		//app2
		
		act.clickAndHold(img3).moveToElement(trash).release().perform();
		
	}
	
	
}
