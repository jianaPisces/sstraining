package controlExample;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HandleDropdownExample extends BaseTest {

	
	@Test
	public void verifyCountryDropDown() throws Exception {
		
		
		//handle dropdown
		WebElement ele_country = driver.findElement(By.xpath("//select[@name='FromLB']"));
		
		
		//Select 
		Select list = new Select(ele_country);
		
		
		
		System.out.println("is Country dropdown select multiple selection or not: " + list.isMultiple());
		
		//index  ----- start from 0 
		//visibleText
		//value
		
		list.selectByIndex(0);						//USA
		list.selectByIndex(1);						//Russia
		
		
		Thread.sleep(1000);
		
		list.selectByVisibleText("India");			//India
		
		Thread.sleep(1000);
		
		list.selectByValue("Germany");			//Germany
		
		
		Thread.sleep(4000);
		
		
		list.deselectByIndex(1);				//Russia
		list.deselectByVisibleText("USA");		//USA
		list.deselectByValue("Germany");		//Germany
		
		
		Thread.sleep(2000);
		list.selectByValue("Germany");	
		
		Thread.sleep(4000);
		
		list.deselectAll();
		
		Thread.sleep(4000);
		list.selectByVisibleText("India");
		
	}
	
	
	
	@Test
	public void verifyCarDropDown() throws Exception {
		
		
		//handle dropdown
		WebElement ele_Car = driver.findElement(By.xpath("//select"));				// 3 match
		
		
		//Select 
		Select list = new Select(ele_Car);
		
		
		System.out.println("is Car dropdown select multiple selection or not: " + list.isMultiple());
		//index  ----- start from 0 
		//visibleText
		//value
		
		
		list.selectByIndex(1);					//Saab
		
		Thread.sleep(2000);
		
		
		list.selectByValue("Singapore");		//Opel
		
		Thread.sleep(2000);
		
		list.selectByVisibleText("Toyota");		//Toyota
		
		
		
		
	}
	
	
}
