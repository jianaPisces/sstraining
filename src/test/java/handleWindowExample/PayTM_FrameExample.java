package handleWindowExample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PayTM_FrameExample extends BaseTest{
	
	

	@Test
	public void verifyAmazonSearchTest() throws Exception {
		
		String parentWindow = driver.getWindowHandle();
		System.out.println("ParentWindow: " + parentWindow);
		
		
		//click on Hotel link
		driver.findElement(By.partialLinkText("HOTELS")).click();
		
		Thread.sleep(2000);
		//driver.getWindowHandle();
		
		
		Set<String> allwindow = driver.getWindowHandles();  ///2 window
		
		
		System.out.println("how many windows opened: " + allwindow.size());
		
		
		
		String mainWindow = (String)allwindow.toArray()[0];
		String hotelWindow = (String)allwindow.toArray()[1];
		
		
		System.out.println("MainWindow: " + mainWindow);
		System.out.println("hotelWindow: " + hotelWindow);
		
		
		
		
		
		Thread.sleep(5000);
		
		driver.switchTo().window(hotelWindow);
		
		
		//click on Login link
		driver.findElement(By.partialLinkText("Login")).click();
		
		Thread.sleep(5000);
		
		
		
		//switch to main window
		
		driver.switchTo().window(mainWindow);
		
		//click on CONTACT US
		driver.findElement(By.partialLinkText("CONTACT US")).click();
		
		
		Thread.sleep(5000);
		
		
		//Switch back to hotelWindow
		
		driver.switchTo().window(hotelWindow);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
	}
	
}
