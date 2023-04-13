package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage_old {

	WebDriver driver;

	public LoginPage_old(WebDriver rdriver) {

		// this.driver = driver;

		driver = rdriver;

	}

	// Identification
	By txtEmail = By.cssSelector("input#Email");
	By txtPass = By.name("Password");
	By chkRem = By.cssSelector("input#RememberMe");
	By btnLogin = By.tagName("button");
	By lnkLogout = By.linkText("Logout");
	// Methods

	public void enterEmail(String email) {

		driver.findElement(txtEmail).clear();
		driver.findElement(txtEmail).sendKeys(email);

	}

	public void enterPass(String pass) {

		driver.findElement(txtPass).clear();
		driver.findElement(txtPass).sendKeys(pass);

	}

	public void clickRemmberMeCheckbox() {

		driver.findElement(chkRem).click();
	}

	public void clickLoginButton() {

		driver.findElement(btnLogin).click();
	}
	
	public void clickLogoutButton() {

		driver.findElement(lnkLogout).click();
	}
	
	
	public void verifyApplicationURL(String expetedValue) throws Exception {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expetedValue);
	}
	
	

}
