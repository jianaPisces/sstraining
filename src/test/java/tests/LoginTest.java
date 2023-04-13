package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	
	@Test
	public void verifyLogin() throws Exception {
		
		
		lp.verifyApplicationURL("Your store. Login");
		
		lp.enterEmail(conf.getUserName());
		
		lp.enterPass(conf.getPassword());
		
		
		lp.clickRemmberMeCheckbox();
		
		lp.clickLoginButton();
		
		
		lp.verifyApplicationURL("Dashboard / nopCommerce administration");
		lp.clickLogoutButton();
		
		
	}

}
