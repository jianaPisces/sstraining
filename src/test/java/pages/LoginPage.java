package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver rdriver) {

		// this.driver = driver;

		driver = rdriver;
		
		PageFactory.initElements(rdriver, this);

	}

	// Identification
//	By txtEmail = By.cssSelector("input#Email");
//	By txtPass = By.name("Password");
//	By chkRem = By.cssSelector("input#RememberMe");
//	By btnLogin = By.tagName("button");
//	By lnkLogout = By.linkText("Logout");
	
	@FindBy(css = "input#Email")
	WebElement txtEmail;
	
	@FindBy(name = "Password")
	WebElement txtPass;
	
	@FindBy(how = How.NAME, using = "Password")
	WebElement txtPass1;
	
	@FindBy(css = "input#RememberMe")
	WebElement chkRem;
	
	
	@FindBy(tagName  = "button")
	WebElement btnLogin;
	
	@FindBy(partialLinkText  = "Logout")
	WebElement btnLogout;
	
//	@FindBy(how = How.NAME, using="Password")
//	private WebElement password;
//	
//	
//	
//	public void enterOnPassword(String str){
//		
//	}
	
	
	
	
	
	
	
	// Methods

	
	
	
	public void enterEmail(String email) {

		
		System.out.println("================Page Object Model as per PageFactory Concept======================");
		
		
		txtEmail.clear();
		txtEmail.sendKeys(email);

	}

	public void enterPass(String pass) {

		txtPass.clear();
		txtPass.sendKeys(pass);

	}

	public void clickRemmberMeCheckbox() {

		chkRem.click();
	}

	public void clickLoginButton() {

		btnLogin.click();
	}
	
	public void clickLogoutButton() {

		btnLogout.click();
	}
	
	
	public void verifyApplicationURL(String expetedValue) throws Exception {

		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), expetedValue);
	}
	
	

}
