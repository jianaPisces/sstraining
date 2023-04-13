package controlExample;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CheckboxRadioButtonExample extends BaseTest {

	
	
	
	@Test
	public void verifyCheckbox() {
		
		
		driver.findElement(By.xpath("//input[@value='Boat']")).click();
		driver.findElement(By.cssSelector("input[value='Car']")).click();
		
	}
	
	@Test
	public void verifyRadiobutton() {
		
		
		driver.findElement(By.cssSelector("input[value='female']")).click();
	}
	
}
