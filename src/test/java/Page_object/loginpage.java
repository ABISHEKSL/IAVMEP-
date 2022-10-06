package Page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utlity.ExcelHandler;

import java.util.Map;

public class loginpage {

    public static loginpage loginpageInstance;


    private loginpage() {

    }

    public static loginpage getinstance() {

        if (loginpageInstance == null) {
            loginpageInstance = new loginpage();
        }

        return loginpageInstance;

    }
    @FindBy(xpath="//input[@id='txtUserName']")
    public WebElement username;
    @FindBy(xpath="//input[@id='txtPassword']")
    public WebElement Password;
    @FindBy(xpath="//div[@id='btnRefreshCaptcha']")
    public WebElement captharefresh;
    @FindBy(xpath="//input[@id='cpatchaTextBox']")
    public WebElement capthadata;
    @FindBy(xpath="//input[@id='btnlogin']")
    public WebElement login;
    @FindBy(xpath="//div[@id='dropdownlistContentcmbHeaderMenu']//input[@placeholder='Quick Search']")
    public WebElement search;

    public void username() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Email_Username_Password", "Auth_Email");
        username.clear();
        username.sendKeys(TestDataInMap.get("Email_Id"));
    }

    public void  Password() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Email_Username_Password", "Auth_Email");

        Password.clear();
        Password     .sendKeys(TestDataInMap.get("Password"));
    }
    public void  capthabox() throws Exception {
        capthadata.clear();
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Email_Username_Password", "Captha_login");
        capthadata.sendKeys(TestDataInMap.get("Captha"));
    }

    public void  capthre() throws Exception {
      captharefresh.click();
        System.out.println("INVALID CAPTCHA");

    }
    public void loginbtn() throws Exception {
        login.click();
    }
    public void search() throws Exception {
        search.click();
        search.click();
        search.sendKeys("a");
    }


}
