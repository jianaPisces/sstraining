package exercise;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NOPCommApp {
	
	
	
	@Test
	public void verifyLogin() throws Exception {
		
		
		//ctrl+shift+O -----autoimport
		
		
		//driver
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Act\\Downloads\\chromedriver_win32_102\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		
		
		
		//launch chrome browser
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		
		
		//locator
		//id ---- email
		WebElement txt_email = wd.findElement(By.id("Email"));   //admin@yourstore.com
		
		txt_email.clear();
		Thread.sleep(3000);
		
		txt_email.sendKeys("admin@yourstore.com");
		
		
		
		//name ---password
		wd.findElement(By.name("Password")).clear();
		wd.findElement(By.name("Password")).sendKeys("admin");
		
		
		
		//xpath ---- checkbox remember me 
		wd.findElement(By.xpath("//*[@type='checkbox']")).click();
		
		
		
		//tagname - login button
		wd.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(3000);
		
		System.out.println("ApplicationTitle after login: " + wd.getTitle());				//Dashboard / nopCommerce administration
		System.out.println("ApplicationURL after login: " + wd.getCurrentUrl());			//https://admin-demo.nopcommerce.com/admin/
		
		
		
		//findElements
		int eleCount = wd.findElements(By.tagName("h1")).size();
		System.out.println("how many element with tagname H1: "+ eleCount);
		
		
		//wd.findElements(By.tagName("img")).size();    //all tagname : a / img
		
		for (int i = 0; i < eleCount; i++) {
			
			//wd.findElements(By.tagName("h1")).get(i).getAttribute("href");
			String textofH1Tag = wd.findElements(By.tagName("h1")).get(i).getText();
			System.out.println("TagName: " + i + " : " + textofH1Tag);
			
		}
		
		
		
		
		
		//linktext  ---- Logout
		wd.findElement(By.linkText("Logout")).click();
		
		
		
		Thread.sleep(3000);
		
		System.out.println("ApplicationTitle after logout: " + wd.getTitle());				//Your store. Login
		System.out.println("ApplicationURL after logout: " + wd.getCurrentUrl());			//https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		
		
		Thread.sleep(3000);
		//login again
		//tagname - login button
		wd.findElement(By.tagName("button")).click();
		
		
		Thread.sleep(3000);
		//partiallinktext  ---- Logout
		wd.findElement(By.partialLinkText("ogou")).click();
		
		
		
		
		Thread.sleep(4000);
		
		wd.close();
		
	}
	
	
	

}
