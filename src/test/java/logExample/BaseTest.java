package logExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import configExample.ReadDataConfigExample;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	Logger log;
	ReadDataConfigExample conf;

	@BeforeClass
	public void setup() throws Exception {

		// log config

		log = Logger.getLogger("Automation_NOP_log");
		PropertyConfigurator.configure("./data/log4j.properties");

		conf = new ReadDataConfigExample();

		log.info("************launching app**********");
		
		log.warn("************warn: launching app**********");
		
		log.error("************error: launching app**********");

		String browser = conf.getBrowser();
		log.info("Execution on Browser: " + browser);

		if (browser.equalsIgnoreCase("chrome")) {

			driver = WebDriverManager.chromedriver().create();

		}

		else if (browser.equalsIgnoreCase("edge")) {

			driver = WebDriverManager.edgedriver().create();
		}

		else {

			log.info("Execution on default Browser as value from config file are: " + browser);
			driver = WebDriverManager.chromedriver().create();

		}

		driver.get(conf.getAppURL_QA());
		log.info("Application URL: " + conf.getAppURL_QA());
		driver.manage().window().maximize();

	}

	@AfterClass
	public void teardown() throws Exception {

		log.info("closing app");
		Thread.sleep(7000);
		driver.close();
	}

}
