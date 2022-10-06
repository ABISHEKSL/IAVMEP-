package Page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import utlity.ExcelHandler;

import java.util.Map;

import static webdriver_manager.DriverManager.driver;

public class Entity_reg_out_UAE {
    public static  Entity_reg_out_UAE Entity_reg_out_UAEInstance;
    private Entity_reg_out_UAE() {

    }

    public static Entity_reg_out_UAE getinstance() {

        if(Entity_reg_out_UAEInstance == null) {
            Entity_reg_out_UAEInstance=new Entity_reg_out_UAE();
        }

        return Entity_reg_out_UAEInstance;

    }
    @FindBy(xpath = "//input[@id='btnRegistration']")
    public WebElement Reg_btn;

    @FindBy(xpath="//*/text()[normalize-space(.)='My company is registered outside Abu Dhabi']/parent::*")
    public WebElement Reg_user_Acc_oUAE;

    @FindBy(xpath = "//a[contains(text(),'Read and Accept Platform Terms & Conditions and Privacy Policy')]")
    public WebElement Reg_user_accTeams_oUAE;

    @FindBy(xpath = "//div[@id='btnAccept']")
    public WebElement Reg_user_Acceptbtn_oUAE;

    @FindBy(xpath = "//input[@id='btnSearchEmirateId']")
    public WebElement Reg_user_Nextbtn_oUAE;

    @FindBy(xpath = "//input[@id='txtTradeLicenseNumber']")
    public WebElement Reg_user_TLic_oUAE;


    @FindBy(xpath = "//input[@id='txtCompanyName']")
    public WebElement Reg_user_ComName_oUAE;


    @FindBy(xpath="//input[@id='txtContactMobileNumber']")
    public WebElement Reg_user_C_mobile_no_oUAE;


    @FindBy(xpath="//input[@id='txtFaxNo']")
    public WebElement Reg_user_C_FAX_no_oUAE;


    @FindBy(xpath="//input[@id='txtAddressInEnglish']")
    public WebElement Reg_user_C_address_no_oUAE;

    @FindBy(xpath="//input[@type='file']")
    public WebElement Reg_user_C_Trade_Lic_file_oUAE;


    @FindBy(xpath="//input[@id='txtCompanyNameAR']")
    public WebElement Reg_user_Co_name_ar_oUAE;

    @FindBy(xpath="//input[@id='txtContactPersonNameAR']")
    public WebElement Reg_user_C_name_ar_oUAE;


    @FindBy(xpath="//input[@id='txtTradeLicenseIssuingAuthority']")
    public WebElement Reg_user_C_person_ar_oUAE;


    @FindBy(xpath="//input[@id='txtUserName1']")
    public WebElement Reg_user_C_UserName_oUAE;

    @FindBy(xpath="//input[@id='txtEmailId']")
    public WebElement Reg_user_C_Emailid_oUAE;

    @FindBy(xpath="//input[@id='txtAddressInArabic']")
    public WebElement Reg_user_C_Address_oUAE;

    @FindBy(xpath="//input[@id='btnNext']")
    public WebElement Reg_user_C_Next_oUAE;
    @FindBy(xpath="//input[@id='txtContactPersonName']")
    public WebElement Reg_user_Cperson_name_Next_oUAE;
    @FindBy(xpath="/html/body/div[14]/div[2]/div[2]/div[4]/div[1]/div/div[1]/table/tbody/tr[1]/td[5]/div[2]/div/div[1]")
    public WebElement cal_click;
    @FindBy(xpath="/html/body/div[5]/div[1]/div/div[1]/table/tbody/tr/td[3]/div")
    public WebElement cal_click1;
    @FindBy(xpath="/html/body/div[5]/div[1]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[5]")
    public WebElement cal_click2;
    @FindBy(xpath="//input[@id='btnCompanyRegister']")
    public WebElement Usr_reg;

    public void Reg_user_Cperson_name_Next_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");


        Reg_user_Cperson_name_Next_oUAE.sendKeys(TestDataInMap.get("Contact Person in English"));
    }

    public void Toclick_Reg_btn() {

        Reg_btn.click();
    }

    public void Toclick_Reg_user_Acc_oUAE() {

        Reg_user_Acc_oUAE.click();
    }

    public void Toclick_Reg_user_accTeams_oUAE() {

        Reg_user_accTeams_oUAE.click();
    }
    public void Toclick_Reg_user_Acceptbtn_oUAE() {

        Reg_user_Acceptbtn_oUAE.click();
    }
    public void ToReg_user_Nextbtn_oUAE() {

        Reg_user_Nextbtn_oUAE.click();
    }


    public void ToReg_user_TLic_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");

        Reg_user_TLic_oUAE.sendKeys(TestDataInMap.get("Trade License Number"));
    }

    public void  Reg_user_ComName_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_ComName_oUAE
                .sendKeys(TestDataInMap.get("Company Name in English"));
    }
    public void   Reg_user_C_mobile_no_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_C_mobile_no_oUAE.sendKeys(TestDataInMap.get("Contact Mobile Number"));
    }
    public void  Reg_user_C_FAX_no_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_C_FAX_no_oUAE.sendKeys(TestDataInMap.get("Fax Number"));
    }
    public void  Reg_user_C_address_no_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_C_address_no_oUAE.sendKeys(TestDataInMap.get("Address in English"));
    }
    public void  Reg_user_C_Trade_Lic_file_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_C_Trade_Lic_file_oUAE.sendKeys(TestDataInMap.get("Trade License Copy"));

    }
    public void  Reg_user_C_Trade_Lic_exp_date_file_oUAE() throws Exception {
        Thread.sleep(1000);
        cal_click.click();
        Thread.sleep(1000);
        cal_click1.click();
        Thread.sleep(1000);
        cal_click1.click();
        Thread.sleep(1000);
        cal_click1.click();
        Thread.sleep(1000);
        cal_click2.click();

    }
    public void  Reg_user_Co_name_ar_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_Co_name_ar_oUAE.sendKeys(TestDataInMap.get("Company Name in Arabic"));

    }
    public void  Reg_user_C_name_ar_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_C_name_ar_oUAE.sendKeys(TestDataInMap.get("Contact Person in Arabic"));

    }
    public void  Reg_user_C_UserName_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_C_UserName_oUAE.sendKeys(TestDataInMap.get("Username"));
    }
    public void  Reg_user_C_Emailid_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_C_Emailid_oUAE.sendKeys(TestDataInMap.get("Email ID"));
    }
    public void  Reg_user_C_Address_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_C_Address_oUAE.sendKeys(TestDataInMap.get("Address in Arabic"));
    }
    public void   Reg_user_C_Next_oUAE() throws Exception {

        Reg_user_C_Next_oUAE.click();
    }

    public void   Reg_user_C_person_ar_oUAE() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");

        Reg_user_C_person_ar_oUAE.sendKeys(TestDataInMap.get("Place of Issue"));
    }
    @FindBy(xpath="/html/body/div[14]/div[2]/div[2]/div[4]/div[1]/div/div[2]/table/tbody/tr[2]/td[1]/div/div/div/div[5]/div[2]/div/div[5]/div[1]/div/div[1]/div")
    public WebElement Reg_user_select_one_or_more;
    @FindBy(xpath="/html/body/div[14]/div[2]/div[2]/div[4]/div[1]/div/div[2]/table/tbody/tr[2]/td[1]/div/div/div/div[5]/div[2]/div/div[3]/div[1]/div/div[1]/div")
    public WebElement Reg_user_select_one_or_more1;

    public void   Reg_user_select_one_or_more() throws Exception {
        Actions actions = new Actions(driver);
        actions.moveToElement(Reg_user_select_one_or_more);
        Thread.sleep(1000);
        Reg_user_select_one_or_more.click();


        actions.moveToElement(Reg_user_select_one_or_more1);
        Reg_user_select_one_or_more1.click();
        Reg_user_C_Next_oUAE.click();
        Reg_user_C_Next_oUAE.click();
    }
    @FindBy(xpath="//input[@id='btnSendOTP']")
    public WebElement Reg_user_send_otp;

    public void   Reg_user_send_Otp() throws Exception {
        Actions actions = new Actions(driver);
        actions.moveToElement( Reg_user_send_otp);
        Reg_user_send_otp.click();


    }

    @FindBy(xpath="//input[@id='txtEmailVerificationCode']")
    public WebElement Reg_user_send_otp_read;
    public void   Reg_user_send_otp_read() throws Exception {
        Reg_user_send_otp_read.click();
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_out_UAE", "Create");
        Reg_user_send_otp_read.sendKeys(TestDataInMap.get("OTP EMAIL"));
        Reg_user_send_otp_read.click();

    }
    public void   Reg_Usr_reg() throws Exception {
        Usr_reg.click();

    }
}
