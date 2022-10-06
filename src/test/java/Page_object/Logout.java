package Page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout {
    public static Logout LogoutInstance;


    private Logout() {

    }

    public static Logout getinstance() {

        if (LogoutInstance == null) {
            LogoutInstance = new Logout();
        }

        return LogoutInstance;

    }
    @FindBy(xpath="//img[@class='img-circle']")
    public WebElement admin_icon;

    @FindBy(xpath="//div[@id='lblLogOut']")
    public WebElement logout_btn;



    @FindBy(xpath="//div[@id='btnYes']")
    public WebElement logout_btn_yes;


    public void ToReg_Logout() throws InterruptedException {

        admin_icon.click();
        Thread.sleep(1000);
        logout_btn.click();
        Thread.sleep(1000);
        logout_btn_yes.click();
    }

    public void ToReg_Yes() throws InterruptedException {


        logout_btn_yes.click();
    }


}
