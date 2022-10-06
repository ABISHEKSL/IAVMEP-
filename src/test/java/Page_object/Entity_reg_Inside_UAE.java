package Page_object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utlity.ExcelHandler;

import java.util.Map;

public class Entity_reg_Inside_UAE {

    public static  Entity_reg_Inside_UAE  Entity_reg_Inside_UAEInstance;
    private  Entity_reg_Inside_UAE() {

    }

    public static  Entity_reg_Inside_UAE getinstance() {

        if( Entity_reg_Inside_UAEInstance == null) {
            Entity_reg_Inside_UAEInstance=new  Entity_reg_Inside_UAE();
        }

        return  Entity_reg_Inside_UAEInstance;

    }
    @FindBy(xpath = "//input[@id='btnRegistration']")
    public WebElement Reg_btn;


    @FindBy(xpath="//td[@class='regheaderdiv reg-reginabudhabi']")
    public WebElement Reg_user_Acc_oUAE;


    @FindBy(xpath="//input[@id='txtTradeLicenseNumberI']")
    public WebElement Reg_TLN_no;
    @FindBy(xpath="//td[@ng-show='dtpc.enableTradeLicenseEdit']//input[@id='inputtxtTradeLicenseExpiryDate']")
    public WebElement Reg_TL_Exp_date;
// 18-08-2024

    @FindBy(xpath = "//a[contains(text(),'Read and Accept Platform Terms & Conditions and Privacy Policy')]")
    public WebElement Reg_user_accTeams_oUAE;

    @FindBy(xpath = "//input[@id='btnSearchLicense']")
    public WebElement Reg_user_search_TL_InUAE;

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

    public void Reg_user_Reg_btn() throws Exception {
        Reg_btn.click();
    }
    public void Reg_user_Reg_user_Acc_oUAE() throws Exception {
        Reg_user_Acc_oUAE.click();
    }
    public void Reg_user_Reg_TLN_no() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_inside_AHU", "Create 1");


        Reg_TLN_no.sendKeys(TestDataInMap.get("Trade License Number"));
    }
    public void Reg_user_Reg_TL_Exp_date() throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Entity_Reg_inside_AHU", "Create 1");
        Reg_TL_Exp_date.click();

        Reg_TL_Exp_date.sendKeys(Keys.chord(Keys.CONTROL, "a"));



        Reg_TL_Exp_date.sendKeys(TestDataInMap.get("Trade License Expiry Date"));
    }


}
