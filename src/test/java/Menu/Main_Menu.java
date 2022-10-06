package Menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Main_Menu {
    public static Main_Menu Main_MenuInstance;

    private Main_Menu() {

    }

    public static Main_Menu getinstance() {

        if (Main_MenuInstance == null) {
            Main_MenuInstance = new Main_Menu();
        }

        return Main_MenuInstance;

    }

    @FindBy(xpath = "//a[@class='btn-toggle-topmenu mrgn10']//*[name()='svg']")
    public WebElement Application_menu;
    @FindBy(xpath = "//li[@title='Service Catalogue']//a[@href='#']")
    public WebElement Service_Catalogue;
    @FindBy(xpath = "//li[@title='Administration']//a[@href='#']")
    public WebElement Administration;
    @FindBy(xpath = "//li[@title='Operation']//a[@href='#']")
    public WebElement Operation;
    @FindBy(xpath = "//li[@title='Finance']//a[@href='#']")
    public WebElement Finance;
    @FindBy(xpath = "//li[@title='Maintenance']//a[@href='#']")
    public WebElement Maintenance;
    @FindBy(xpath = "//li[@title='Reports']//a[@href='#']")
    public WebElement Reports;
    @FindBy(xpath = "//li[@title='Help main menu items']//a[@href='#']")
    public WebElement Help_main_menu;

    public void Application_menu() {

        Application_menu.click();
    }
    public void Service_Catalogue() {

        Service_Catalogue.click();
    }

    public void Administration() {

        Administration.click();
    }

    public void Operation() {

        Operation.click();
    }

    public void Finance() {

        Finance.click();
    }

    public void Maintenance() {

        Maintenance.click();
    }

    public void Reports() {

        Reports.click();
    }

    public void Help_main_menu() {

        Help_main_menu.click();
    }









}
