package configExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigReadData {

	public static void main(String[] args) throws Exception {
		
		
		//Read data from properties
		
		FileInputStream fis = new FileInputStream(".\\data\\config.properties");
		
		
		Properties prop = new Properties(); 
		
		prop.load(fis);
		
		
		
		System.out.println(prop.getProperty("appURL_QA"));
		System.out.println(prop.getProperty("appURL_DEV"));
		System.out.println(prop.getProperty("userName"));

	}

}
