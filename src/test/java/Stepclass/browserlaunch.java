package Stepclass;

import webdriver_manager.DriverManager;
import utlity.commonutlity;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class browserlaunch {

	private static final org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(browserlaunch.class);

	@io.cucumber.java.Before
	public void beforesenario() {
		logger.info("Execution started");

		try {
			logger.info("Instantion the common utils");


			logger.info("Loading the properties file");

			commonutlity.getinstance().loadproperties();
			logger.info("Checking driver null or not  ");

			if (DriverManager.getDriver() == null)
				logger.info("Checking driver null instansiate");
			DriverManager.launchbrowser();

			commonutlity.getinstance().initwebelements();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@AfterStep
	public void attachscreenshot(Scenario scenario) {
		//if(scenario.isFailed()) {
		byte[] screenshotTaken = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);

		scenario.attach(screenshotTaken, "image/png", "screen1");

		//}
	}

	@io.cucumber.java.After
	public void aftersenario() {
		DriverManager.Quitbrowser();

	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	private void launchbrowser() {
//		try {
//			switch (constants.BROWSER) {
//			case "chrome":
//				
//			WebDriverManager.chromedriver().setup();
//			logger.info("Launching"+ constants.BROWSER);
//			driver= new ChromeDriver();
//				
//				break;

//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();

	//	}

//	}

	
}
