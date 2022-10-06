package Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Administration_menu {
    public static Administration_menu Administration_menuInstance;

    private Administration_menu() {

    }

    public static Administration_menu getinstance() {

        if (Administration_menuInstance == null) {
            Administration_menuInstance = new Administration_menu();
        }

        return Administration_menuInstance;
    }

    @FindBy(xpath = "//a[@title='Company']//span[contains(text(),'Company')]")
    public WebElement Company;

    @FindBy(xpath = "//a[@data-rightsname='Entity Registration']")
    public WebElement Entity_Registration;




    public void Company() {

        Company.click();
        Company.click();
    }
    public void Entity_Registration() {

        Entity_Registration.click();
    }





}
