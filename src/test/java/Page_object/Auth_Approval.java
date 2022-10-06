package Page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utlity.ExcelHandler;

public class Auth_Approval {
    public static Auth_Approval Auth_ApprovalInstance;

    private Auth_Approval() {

    }

    public static Auth_Approval getinstance() {

        if (Auth_ApprovalInstance == null) {
            Auth_ApprovalInstance = new Auth_Approval();
        }

        return Auth_ApprovalInstance;

    }

    @FindBy(xpath = "(//div[@class='jqx-checkbox-default jqx-checkbox-default-arctic jqx-fill-state-normal jqx-fill-state-normal-arctic jqx-rc-all jqx-rc-all-arctic'])[3]")
    public WebElement sel_req;


    @FindBy(xpath = "//div[@class='basic-icon img-icon master-icon master-review']")
    public WebElement sel_reg_receive;
    @FindBy(xpath = "//div[@class='basic-icon img-icon master-icon master-approve']")
    public WebElement sel_reg_approve;
    @FindBy(xpath = "//div[@class='basic-icon img-icon master-icon master-redo']")
    public WebElement sel_reg_redo;
    @FindBy(xpath = "//div[@class='basic-icon img-icon master-icon master-reject']")
    public WebElement sel_reg_reject;
    @FindBy(xpath = "(//div[@class='jqx-grid-cell-left-align'])[6]")
    public WebElement sel_reg_txt_app;
    @FindBy(xpath = "(//div[@class='jqx-grid-cell-left-align'])[6]")
    public WebElement sel_reg_txt_pend_app;
    @FindBy(xpath = "(//div[@class='jqx-grid-cell-left-align'])[6]")
    public WebElement sel_reg_txt_und_rev;

    ////////////////////////////////////////////////////////entity reg detail update///////////////////////////////////////////////////
    @FindBy(xpath = "document.querySelector(\"#row0jqxWidgetaa28fb10a163 > div:nth-child(7)\")")
    public WebElement reqno;
    @FindBy(xpath = "//*[@id=\"row0jqxWidget46d7c6575932\"]/div[9]")
    public WebElement comptype;
    @FindBy(xpath = "//*[@id=\"row0jqxWidget46d7c6575932\"]/div[1]")
    public WebElement comp;
    @FindBy(xpath = "//*[@id=\"row0jqxWidget46d7c6575932\"]/div[2]")
    public WebElement entity;
    @FindBy(xpath = "//*[@id=\"row0jqxWidget46d7c6575932\"]/div[3]")
    public WebElement domin;

    @FindBy(xpath = "//*[@id=\"row0jqxWidget46d7c6575932\"]/div[4]")
    public WebElement vheover;
    @FindBy(xpath = "//*[@id=\"row0jqxWidget46d7c6575932\"]/div[5]")
    public WebElement status;
    @FindBy(xpath = "//*[@id=\"row0jqxWidget46d7c6575932\"]/div[7]")
    public WebElement regon;
    @FindBy(xpath = "//*[@id=\"row0jqxWidget46d7c6575932\"]/div[9]")
    public WebElement Tlno;
    @FindBy(xpath = "//*[@id=\"row0jqxWidget46d7c6575932\"]/div[11]")
    public WebElement Appon;
    @FindBy(xpath = "//*[@id=\"row0jqxWidget46d7c6575932\"]/div[12]")
    public WebElement AppBy;
    @FindBy(xpath = "(//b[text()='Entity'])[1]")
    public WebElement select_reg;
    @FindBy(xpath="//div[@id='dropdownlistContentcmbHeaderMenu']//input[@placeholder='Quick Search']")
    public WebElement search;
    @FindBy(xpath = "//div[@id='btnYes']")
    public WebElement sel_reg_App_yes;
    public void Tosesrch() throws InterruptedException {

        search.click();
        Thread.sleep(1000);
        search.sendKeys("Entity");
    }
    public void Toselenn() {

        select_reg.click();
    }
    public void ToUpdatedata() {
        String s = reqno.getText();

        String s1 = comptype.getText();
        String s2 = comp.getText();
        String s3 = entity.getText();
        String s4 = domin.getText();
        String s5 = vheover.getText();
        String s6 = status.getText();
        String s7 = regon.getText();
        String s8 = Tlno.getText();
        String s9 = Appon.getText();
        String s10 = AppBy.getText();

        ExcelHandler.UpdatRequest_No("Entity_reg_approvel", s, "Data1");
        ExcelHandler.UpdatCompany_Type("Entity_reg_approvel", s1, "Data1");
        ExcelHandler.UpdatCompany("Entity_reg_approvel", s2, "Data1");
        ExcelHandler.UpdatEntity("Entity_reg_approvel", s3, "Data1");
        ExcelHandler.UpdatDomain("Entity_reg_approvel", s4, "Data1");
        ExcelHandler.UpdatVehicle_Override("Entity_reg_approvel", s5, "Data1");
        ExcelHandler.UpdatStatus("Entity_reg_approvel", s6, "Data1");
        ExcelHandler.UpdatRegistered_On("Entity_reg_approvel", s7, "Data1");
        ExcelHandler.UpdatTrade_License_Number("Entity_reg_approvel", s8, "Data1");
        ExcelHandler.UpdatApproved_On("Entity_reg_approvel", s9, "Data1");
        ExcelHandler.UpdatApproved_By("Entity_reg_approvel", s10, "Data1");


    }


    public void Toclick_Reg_user() {

        sel_req.click();

    }

    public void Toclick_sel_reg_receive() {

        sel_reg_receive.click();
    }

    public void Toclick_sel_reg_approve() {

        sel_reg_approve.click();
    }

    public void Toclick_sel_reg_redo() {

        sel_reg_redo.click();
    }

    public void Toclick_sel_reg_reject() {

        sel_reg_reject.click();
    }

    public void Toclick_sel_reg_txt_app() {

        sel_reg_txt_app.getText();
        System.out.println("STATUS:::::");

    }

    public String Toclick_sel_reg_txt_pend_app() {

        String s = sel_reg_txt_pend_app.getText();
        System.out.println("STATUS:::::" + s);
        ExcelHandler.UpdatStatus("Entity_reg_approvel", s, "Data1");
        return toString();
    }

    public String Toclick_sel_reg_txt_und_rev() {

        String s = sel_reg_txt_und_rev.getText();
        System.out.println("STATUS:::::" + s);

        return toString();
    }


    public void Toclick_sel_reg_App_yes() {

        sel_reg_App_yes.click();
    }


































}
