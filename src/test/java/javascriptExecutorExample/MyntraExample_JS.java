package javascriptExecutorExample;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraExample_JS {
	
	WebDriver driver;
	
	// pre-condition --- BeforeSuite ------BeforeTest ------BeforeClass -----BeforeMethod
	// post-condition ---AfterSuite ------AfterTest ------AfterClass -----AfterMethod
	//Test ---- test case
	
	//ctrl+shift+O ----autoimport
	
	
	@BeforeTest
	public void setup() {
		
		System.out.println("launching app");
		
		driver = WebDriverManager.chromedriver().create();   //create ----- v5.0 
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
	}
	
	
	@AfterTest
	public void teardown() throws Exception {
		
		System.out.println("closing app");
		Thread.sleep(7000);
		driver.close();
	}

	@Test
	public void testCase1() throws Exception {
		
		
		Thread.sleep(7000);
		
		
		WebElement returnPolicy = driver.findElement(By.xpath("//strong[contains(text(),'Return with')]"));
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		JS.executeScript("arguments[0].scrollIntoView()", returnPolicy);
		
		
		
		
		
		
	}
	
}
