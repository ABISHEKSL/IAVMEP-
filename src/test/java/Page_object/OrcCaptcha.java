package Page_object;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import utlity.ExcelHandler;

import java.io.File;
import java.io.IOException;

public class OrcCaptcha {
    public static OrcCaptcha OrcCaptchaInstance;


    private OrcCaptcha() {

    }

    public static OrcCaptcha getinstance() {

        if (OrcCaptchaInstance == null) {
            OrcCaptchaInstance = new OrcCaptcha();
        }

        return OrcCaptchaInstance;

    }
    @FindBy(xpath="//canvas[@id='captcha']")
    public WebElement capthaFile;
    public void To_checkcaptha() throws InterruptedException, IOException, TesseractException {

        File scr = capthaFile.getScreenshotAs(OutputType.FILE);
        String Path = "C:\\IAVMEP\\src\\test\\resources\\Captha\\captha.png";
        FileHandler.copy(scr, new File(Path));

        Tesseract tesseract = new Tesseract();
        String text = null;
        try {

            tesseract.setDatapath("C:\\IAVMEP\\src\\test\\resources\\tessdata\\Tess4J\\tessdata");

            text = tesseract.doOCR(new File("C:\\IAVMEP\\src\\test\\resources\\Captha\\captha.png"));

            System.out.print("Captha ::::: " + text);

            String s1=text;
            String s4=s1.replaceAll("'", "").replaceAll(";", "").replaceAll(" ","");
            ExcelHandler.Updatcap("Email_Username_Password",s4, "Captha_login");
            System.out.print("Captha ======= " + s4);



            } catch (TesseractException e) {
            e.printStackTrace();
        }


    }
}
