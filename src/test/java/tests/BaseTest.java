package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import configExample.ReadDataConfigExample;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class BaseTest {
	
	
	WebDriver driver;
	ReadDataConfigExample conf;
	LoginPage lp;
	
	@BeforeTest
	public void launchApp() throws Exception {
		
		System.out.println("launch app on chrome browser");
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		conf = new ReadDataConfigExample();
		
		driver.get(conf.getAppURL_QA());
		
		
		
		lp = new LoginPage(driver);
		
		
	}
	
	
	@AfterTest
	public void closeApp() throws Exception {
		
		System.out.println("close the application");
		Thread.sleep(5000);
		driver.close();
		
		
	}

}
