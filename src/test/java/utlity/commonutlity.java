package utlity;

import Menu.Main_Menu;
import Page_object.*;
import Stepclass.Function_initialization;
import Stepclass.Login_captcha;
import constants.constants;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import webdriver_manager.DriverManager;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import static webdriver_manager.DriverManager.driver;

public class commonutlity {
	//config-File

	private static commonutlity commonutlityinstance =null;
	
	private commonutlity() {
		
	}
	public static commonutlity getinstance() {
		
		if(commonutlityinstance==null) {
			commonutlityinstance =new commonutlity();
		}
		return commonutlityinstance;
		}
	
	public  void loadproperties() {
	
		
		Properties properties = new Properties();
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (Exception e) {
		e.printStackTrace();
		}

		constants.APP_URL = properties.getProperty("APP_URL");
		constants.BROWSER = properties.getProperty("BROWSER");
		constants.UserName = properties.getProperty("UserName");
		constants.Password = properties.getProperty("Password");
		constants.CHROME_DRIVER_LOCATION = properties.getProperty("CHROME_DRIVER_LOCATION");


	}

public void initwebelements() throws IOException {
	PageFactory.initElements(DriverManager.getDriver(), Function_initialization.getinstance());
	PageFactory.initElements(DriverManager.getDriver(), Entity_reg_out_UAE.getinstance());
	PageFactory.initElements(DriverManager.getDriver(), MailReading.getinstance());
	PageFactory.initElements(DriverManager.getDriver(), Email_link.getinstance());

	PageFactory.initElements(DriverManager.getDriver(), OrcCaptcha.getinstance());
	PageFactory.initElements(DriverManager.getDriver(), loginpage.getinstance());
	PageFactory.initElements(DriverManager.getDriver(), Auth_Approval.getinstance());
	PageFactory.initElements(DriverManager.getDriver(), Main_Menu.getinstance());
	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
	PageFactory.initElements(DriverManager.getDriver(),  Entity_reg_Inside_UAE.getinstance());
	PageFactory.initElements(DriverManager.getDriver(), Login_captcha.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
// 	PageFactory.initElements(DriverManager.getDriver(), loadposting.getinstance());
//	PageFactory.initElements(DriverManager.getDriver(), Logout.getinstance());
//
	
	
}

@AfterStep
public void attachscreenshot(Scenario scenario) {
	if(scenario.isFailed()) {
byte [] screenshotTaken =( (TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
	
	scenario.attach(screenshotTaken, "image/png", "screen");
	

}

}
public void highlight_B(WebElement element){
	JavascriptExecutor executor= (JavascriptExecutor) DriverManager.getDriver();
	executor.executeScript("arguments[0].setAttribute('style', 'border:3px dotted blue');",element);

	}
//	public void highlightB(WebElement element){
//		JavascriptExecutor executor= (JavascriptExecutor) DriverManager.getDriver();
//		executor.executeScript("arguments[0].setAttribute('style', 'border:4px solid Blue');",element);
//
//	}
	public void highlight_R(WebElement element){
		JavascriptExecutor executor= (JavascriptExecutor) DriverManager.getDriver();
		executor.executeScript("arguments[0].setAttribute('style', 'border:4px solid Red');",element);

	}
	public void scroll(){
		Actions actions = new Actions(driver);
		WebElement titleA=driver.findElement(By.xpath("//span[text()='Administration']"));
		actions.moveToElement(titleA);
		WebElement user=driver.findElement(By.xpath("(//span[text()='User'])[2]"));
		JavascriptExecutor executor= (JavascriptExecutor) DriverManager.getDriver();
		executor.executeScript("arguments[0].scrollIntoView();", user);

	}
	public void scrollup(){
		Actions actions = new Actions(driver);
		WebElement titleA=driver.findElement(By.xpath("//span[text()='Administration']"));
		actions.moveToElement(titleA);

		JavascriptExecutor executor= (JavascriptExecutor) DriverManager.getDriver();
		executor.executeScript("arguments[0].scrollIntoView();", titleA);

	}
	public void scrollin(){

		WebElement titleA=driver.findElement(By.xpath("//span[text()='Save']"));


		JavascriptExecutor executor= (JavascriptExecutor) DriverManager.getDriver();
		executor.executeScript("arguments[0].scrollIntoView();", titleA);

	}

	public void date() {
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");

		sdf.format(d);
	}
}



//## Method Name :To check load post flow
//##Method Description: Reports
//##Author :Abishek selvakumar







