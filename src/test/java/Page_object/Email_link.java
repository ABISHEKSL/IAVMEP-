package Page_object;

import io.cucumber.core.gherkin.vintage.internal.gherkin.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;
import utlity.ExcelHandler;

import javax.mail.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Email_link {
    public static Email_link Email_linkInstance;


    private Email_link() {

    }

    public static Email_link getinstance() {

        if (Email_linkInstance == null) {
            Email_linkInstance = new Email_link();
        }

        return Email_linkInstance;

    }

    public static String OutlookMailReader(String mailFolderName, String emailSubjectContent, String emailContent, int lengthOfOTP) throws Exception {
        Map<String,String> TestDataInMap= ExcelHandler.getTestDataInMap (  "Email_Username_Password", "Email");


        String hostName = "outlook.office365.com";//Email

        String username = TestDataInMap.get("Email_Id");//username

        String password = TestDataInMap.get("Password");//Password

        int messageCount;

        int unreadMsgCount;

        String emailSubject;

        Message emailMessage;

        String searchText = "";

        Properties sysProps = System.getProperties();

        sysProps.setProperty("mail.store.protocol", "imaps");

        try {

            Session session = Session.getInstance(sysProps, null);

            Store store = session.getStore();

            store.connect(hostName, username, password);

            Folder emailBox = store.getFolder(mailFolderName);

            emailBox.open(Folder.READ_WRITE);

            messageCount = emailBox.getMessageCount();

            System.out.println("Total Message Count: " + messageCount);

            unreadMsgCount = emailBox.getNewMessageCount();

            System.out.println("Unread Emails count:" + unreadMsgCount);


            for (int i = messageCount; i > (messageCount - unreadMsgCount); i--) {

                emailMessage = emailBox.getMessage(i);

                emailSubject = emailMessage.getSubject();
                System.out.println(emailMessage.getReceivedDate());
                System.out.println(emailMessage.getMessageNumber());
                System.out.println(emailMessage.getSubject());
                System.out.println(emailMessage.getContentType());
                System.out.println(emailMessage.getDescription());


                System.out.println(emailSubjectContent.contains("Asateel: Send Email Verification Code"));

                if (emailSubject.contains(emailSubjectContent)) {


                    System.out.println("Verification Code found");

                    String line;

                    StringBuffer buffer = new StringBuffer();

                    BufferedReader reader = new BufferedReader(new InputStreamReader(emailMessage.getInputStream()));

                    while ((line = reader.readLine()) != null) {

                        buffer.append(line);

                    }

                    String messageContent = emailContent;

                    String result = buffer.toString().substring(buffer.toString().indexOf(messageContent));

                    searchText = result.substring(messageContent.length(), messageContent.length() + lengthOfOTP);


                    String htmlString = searchText;
                    String outputText = Jsoup.clean(htmlString, new Whitelist());

                    System.out.println("Text found : " + searchText);
                    System.out.println("convert"+outputText);
                    String myStr = outputText;
                    System.out.println("INDEX::::"+myStr.indexOf("https:", 1));

                    String str = outputText;

                    char ch1 = str.charAt(561);


                    char ch2 = str.charAt(562);


                    char ch3 = str.charAt(563);


                    char ch4 = str.charAt(564);
                    char ch5 = str.charAt(565);
                    char ch6 = str.charAt(567);




                    System.out.println("OTP :::  "+ch1+ch2+ch3+ch4+ch5+ch6);
                    int s =ch1+ch2+ch3+ch4+ch5+ch6;

                    System.out.print("OTP :::  "+s);

                    String[] strArray = {String.valueOf(ch1), String.valueOf(ch2), String.valueOf(ch3), String.valueOf(ch4), String.valueOf(ch5), String.valueOf(ch6)};


                    List<String> mylist = Arrays.asList(strArray);


                    System.out.print("OTP :::  "+mylist);

                    System.out.println(StringUtils.join("", mylist));

                    String s3=StringUtils.join("", mylist);
                    System.out.print("OTP :::  "+s3);
                    String s4=s3.replaceAll("\\[", "").replaceAll("\\]","");
                    System.out.print("OTP :::  "+s4);
                  //  ExcelHandler.OTP("Entity_Reg_out_UAE", Collections.singletonList(s4),"Create");

                   // TestDataInMap = ExcelHandler.getTestDataInMap("Entity_Reg_out_UAE", "Create");
//                    String s5=TestDataInMap.get("OTP");
//                    System.out.println("EX:otp"+TestDataInMap.get("OTP"));
//                    String s6=s5.replaceAll("\\[", "").replaceAll("\\]","");
//                    System.out.println("EX:otp    "+s6);

                    Thread.sleep(1000);
                    //ExcelHandler.OTPcv("Entity_Reg_out_UAE", Collections.singletonList(s5.replaceAll("\\[", "").replaceAll("\\]","")),"Create");


                    emailMessage.setFlag(Flags.Flag.SEEN, true);

                    break;

                }

                emailMessage.setFlag(Flags.Flag.SEEN, true);


            }

            emailBox.close(true);

            store.close();


        } catch (Exception mex) {

            mex.printStackTrace();

            System.out.println("Verification Code  Not found ");

        }

        return searchText;
    }

}
