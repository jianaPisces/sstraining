package testNGAnnotationExample;

import org.testng.annotations.Test;

public class AmazonTest_Priority {
	
	
	//Order of execution 
	
	
	//By default priority - 0
	//if priority is same ---- execution as per naming conv
	//highest negative number having highest priority
	
	
	
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
	}
	
	
	@Test
	public void payment() {
		
		System.out.println("payment test case");
	}
}
