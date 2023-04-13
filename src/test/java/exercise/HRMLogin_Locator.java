package exercise;

import java.util.List;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLogin_Locator {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();  //launch chrome browser -----create a session
		
		//launch app
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@AfterTest
	public void closeApp() {
		
		driver.close();
	}
	
	@Test
	public void verifyLogin() throws Exception {
		
		
		//System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		//create a chrome browser session
		
		
		
		
		//locator
//		id
//		name
//		class
//		tagname
//
//
//		linkText
//		partialLinkText
//
//
//		XPATH
//		CSS
		
		//name ---- userName
		
		Thread.sleep(1000);
//		WebElement txt_UserName = driver.findElement(By.name("username"));
//		txt_UserName.sendKeys("Admin12312312312");
//		
//		Thread.sleep(4000);
//		
//		txt_UserName.clear();

		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		//welement is present
		//click
		//clear
		//sendKeys
		
		Thread.sleep(1000);
		//name ---- password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(1000);
		//tagName
		driver.findElement(By.tagName("button")).click();
		
		
		
		
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		
		//tagName ---- dashboard
		
		//validate 
		//driver.findElement(By.tagName("h6")).getText();
		
		List<WebElement> tag_h6_ele = driver.findElements(By.tagName("h6"));
		
		System.out.println("element count on page, having H6 tag: " + tag_h6_ele.size());
		
		System.out.println("Element Text: "+ tag_h6_ele.get(0).getText());
		
		
		
		
		
		
	}
	
	
	@Test
	public void verifyLogout() throws Exception {
		
		Thread.sleep(2000);
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		
		
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("SopraLogout")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.tagName("h6")).click();
		
	}

}
