package retryExample;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer{

	
	
	int Counter = 0;
	int retryCount = 2;
	
	
	public boolean retry(ITestResult result) {
		
		
		if(Counter < retryCount ) {
			
			Counter++;
			return true;
			
			
		}
		
		
		
		
		
		
		return false;
	}

}
