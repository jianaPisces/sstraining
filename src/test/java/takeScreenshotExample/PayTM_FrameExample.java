package takeScreenshotExample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PayTM_FrameExample {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		System.out.println("launching app");

		driver = WebDriverManager.chromedriver().create(); // create ----- v5.0

		driver.get("https://paytm.com/");

		driver.manage().window().maximize();

	}

	@AfterClass
	public void teardown() throws Exception {

		System.out.println("closing app");
		Thread.sleep(7000);
		driver.close();
	}

	@Test
	public void verifyAmazonSearchTest() throws Exception {

		// click on SignIn
		driver.findElement(By.xpath("//span[contains(text(),'Sign')]")).click();

		// Alert/Frame/Window -------
		// concept

		// Frame
		// index --- start from 0
		// name / Id
		// WebElement

		WebElement payTmFrame = driver.findElement(By.cssSelector("[src$='web']"));

		// app1
		// driver.switchTo().frame(0);

		// app2
		// driver.switchTo().frame("name/id");

		// app3
		driver.switchTo().frame(payTmFrame);

		Thread.sleep(1000);
		// Frame

		String headingFrame = driver.findElement(By.cssSelector("p.heading")).getText();
		System.out.println("Frame Heading : " + headingFrame);

		Assert.assertTrue(headingFrame.contains("Login into your Paytm"));

		Thread.sleep(1000);
		driver.findElement(By.cssSelector("span[ng-click^='toggleIntroVideo']")).click();

		Thread.sleep(3000);

		// capture screenshot in base64 ----PNG
		
		getScreenshot("Pytm_screenshot_method");

	}

	public void getScreenshot(String fileName) throws Exception {

		
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
		
		
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
		
		//File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		File targetLocation = new File(".\\screenshot\\"+fileName+".png");

		FileUtils.copyFile(screenshotFile, targetLocation);

		Thread.sleep(3000);
	}

}
