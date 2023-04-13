package configExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadDataConfigExample {

	Properties prop;

	public ReadDataConfigExample() throws Exception {

		FileInputStream fis = new FileInputStream(".\\data\\config.properties");

		prop = new Properties();

		prop.load(fis);

	}

	public String getAppURL_QA() {

		String appurl = prop.getProperty("appURL_QA");

		return appurl;
	}

	
	public String getAppURL_DEV() {

		String appurl = prop.getProperty("appURL_DEV");

		return appurl;
	}
	
	public String getUserName() {

		return prop.getProperty("userName");

	}
	
	public String getBrowser() {

		return prop.getProperty("browser");

	}

	public String getPassword() {

		return prop.getProperty("password");

	}

}
