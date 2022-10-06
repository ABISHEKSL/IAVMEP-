package webdriver_manager;

import constants.constants;
import constants.constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
	
	
	private static Logger LOGGER= LogManager.getLogger(DriverManager.class);
	
	public static WebDriver driver=null;
	
	public static WebDriver getDriver() {
		return driver;
	}
	public static void launchbrowser() {
		try {
			switch (constants.BROWSER) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				LOGGER.info("launching"+constants.BROWSER);
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;

			}

		} catch (Exception e) {
			driver.quit();
			driver.close();
			e.printStackTrace();

		}
	}
	public static void Quitbrowser() {


					driver = new ChromeDriver();
					driver.quit();



		}
	}

