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

public class Alert_PromptExampleWithJavaScript {
	
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
		
		driver.get("http://www.uitestpractice.com/Students/Switchto");
		
		//driver.manage().window().maximize();
		
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
		
		
		WebElement promptButton = driver.findElement(By.cssSelector("[id=\"prompt\"]"));
		
		
		//TakesScreenshot ts = ((TakesScreenshot) driver);
		
		
		JavascriptExecutor JS = (JavascriptExecutor) driver;
		
		//JS.executeScript("alert('Hello everyone, welcome you all in javascript !!')");
		
		
		
		
		
		JS.executeScript("arguments[0].click();", promptButton);
		
		
		
		Thread.sleep(7000);
		
		//click on Prompt button
		//driver.findElement(By.cssSelector("[id=\"prompt\"]")).click();
		
		
		
		String name = "Abhishek";
		//handle Alert
		
		Alert promptAlert = driver.switchTo().alert();
		
		String actualAlertText = promptAlert.getText();
		System.out.println("Alert Text : " + actualAlertText);
		
		
		
		Assert.assertEquals(actualAlertText, "Enter your name");
		Assert.assertEquals(actualAlertText, "Enter your name", "validation of Alert text get failed");
		

		
		
		
		promptAlert.sendKeys(name);
		
		
		promptAlert.accept(); ///click on Ok  button
		
		
		
		
//		String one = "Hello Abhishek! How are you today?";
//		String two = "Abhishek";
//		
//		one.contains("Abhishek");
		
		String actualMessage = driver.findElement(By.cssSelector("[id=\"demo\"]")).getText();
		System.out.println(actualMessage);
		
		Assert.assertTrue(actualMessage.contains(name));
		
		
	}
	
}
