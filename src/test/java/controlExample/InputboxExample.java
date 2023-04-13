package controlExample;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InputboxExample extends BaseTest {

	
	
	
	@Test
	public void verifyInputbox() {
		
		
		driver.findElement(By.cssSelector("input[name='fname']")).sendKeys("enter firstName");
	}
	
	
	
}
