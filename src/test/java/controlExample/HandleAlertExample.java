package controlExample;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HandleAlertExample extends BaseTest {

	
	
	
	//@Test
	public void verifySimpleAlert() throws Exception {
		
		
		//generate alert
		driver.findElement(By.cssSelector("[value='Show Me Alert']")).click();
		
		Thread.sleep(4000);
		//handle alert
		//Alert/frame/window   ------ driver.switchTo
		
		Alert simpleAlert = driver.switchTo().alert();
		
		System.out.println("Alert Text: " + simpleAlert.getText());
		//simpleAlert.accept();
		
		//accept ------ click on OK button
		//dismiss ----- click on cancel button
		//getText  ------ get the test from alert
		//sendKeys ----- enter value on alert
		
		
		simpleAlert.dismiss();				//------dismiss ---- cancel button ---- esc
		
		
		
	}
	
	
	@Test
	public void verifyConfirmAlert() throws Exception {
		
		
		//generate confirm alert
		driver.findElement(By.cssSelector("button[onclick='myFunction()']")).click();
		
		Thread.sleep(4000);
		//handle alert
		//Alert/frame/window   ------ driver.switchTo
		
		Alert confirmAlert = driver.switchTo().alert();
		
		System.out.println("Alert Text: " + confirmAlert.getText());
		//simpleAlert.accept();
		
		
		
		
		//accept ------ click on OK button
		//dismiss ----- click on cancel button
		//getText  ------ get the test from alert
		//sendKeys ----- enter value on alert
		
		confirmAlert.accept();	
		//confirmAlert.dismiss();				//------dismiss ---- cancel button ---- esc
		
		String ConfirmMessage = driver.findElement(By.cssSelector("[id='demo']")).getText();
		System.out.println(ConfirmMessage);
		
		
		//Assert.assertEquals(ConfirmMessage, "You pressed OK!!");
	}
	
	
	
}
