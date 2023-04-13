package retryExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest_Priority {
	
	
		
	@Test(priority = -100)
	public void login() {
		
		System.out.println("login test case");
	}

	
	@Test(priority = 1)
	public void logout() {
		
		System.out.println("logout test case");
	}
	
	
	@Test
	public void addItems() {
		
		System.out.println("addItems test case");
	}
	
	
	@Test
	public void cancelOrder() {
		
		System.out.println("cancelOrder test case");
		Assert.assertTrue(false);
	}
	
	
	//@Test(retryAnalyzer = RetryLogic.class)
	@Test()
	public void payment() {
		
		System.out.println("payment test case");
		Assert.assertTrue(false);
	}
}
