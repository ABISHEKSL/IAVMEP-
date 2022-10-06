package Stepclass;

import Page_object.*;
import utlity.ExcelHandler;
import utlity.PropertiesFilereader;
import utlity.TestDataHandler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public class Function_initialization {

    public static Function_initialization Function_initializationInstance;

    private Function_initialization() {

    }

    public static Function_initialization getinstance() {

        if (Function_initializationInstance == null) {
            Function_initializationInstance = new Function_initialization();
        }

        return Function_initializationInstance;
    }

    Date d = new Date();


    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a dd/MM/yyyy");


    public void ENTITY_REG_OUAE() throws Exception {
        PropertiesFilereader obj = new PropertiesFilereader();
        TestDataHandler testdata = new TestDataHandler();

        Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Entity Reg Outside AUH creat");
        String style = "Yes";
        String style2 = TestDataInMap.get("Module Run");
        String style3 = "Browser Launched";
        System.out.println(TestDataInMap.get("Function"));

        if (style.equals(style2)) {


            try {

                Entity_reg_out_UAE.getinstance().Toclick_Reg_btn();
                Thread.sleep(4000);
                Entity_reg_out_UAE.getinstance().Toclick_Reg_user_Acc_oUAE();
                Thread.sleep(4000);
                Entity_reg_out_UAE.getinstance().Toclick_Reg_user_accTeams_oUAE();
                Thread.sleep(4000);
                Entity_reg_out_UAE.getinstance().Toclick_Reg_user_Acceptbtn_oUAE();

                Entity_reg_out_UAE.getinstance().ToReg_user_Nextbtn_oUAE();
                Entity_reg_out_UAE.getinstance().ToReg_user_TLic_oUAE();
                ;
                Entity_reg_out_UAE.getinstance().Reg_user_ComName_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_Cperson_name_Next_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_mobile_no_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_FAX_no_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_address_no_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_Trade_Lic_file_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_Trade_Lic_exp_date_file_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_Co_name_ar_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_person_ar_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_name_ar_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_UserName_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_Emailid_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_Address_oUAE();
                Entity_reg_out_UAE.getinstance().Reg_user_C_Next_oUAE();

                Entity_reg_out_UAE.getinstance().Reg_user_select_one_or_more();
                Thread.sleep(1000);
                Entity_reg_out_UAE.getinstance().Reg_user_send_Otp();
                Thread.sleep(10000);
                MailReading.getinstance().OutlookMailReader("INBOX", "Email Verification", "Verification Code", 10000);
                Thread.sleep(10000);
                Entity_reg_out_UAE.getinstance().Reg_user_send_otp_read();
                Entity_reg_out_UAE.getinstance().Reg_user_C_Next_oUAE();

                Entity_reg_out_UAE.getinstance().Reg_Usr_reg();
                Thread.sleep(10000);
                Email_link.getinstance().OutlookMailReader("INBOX", "Asateel: New Activity Registration", "Click Here", 20000);


                ExcelHandler.UpdateTestResultsToExcel("Summary", "Executed", "Entity Reg Outside AUH creat");
                ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Reg Outside AUH creat");

                ExcelHandler.Updatereson("Summary", "PASS", "Entity Reg Outside AUH creat");
            } catch (Exception e) {
                ExcelHandler.Updatereson("Summary", "FAIL", "Entity Reg Outside AUH creat");

                System.out.println("Not ex");

            }
        } else {
            System.out.println("vehicle not given yes");
            ExcelHandler.UpdateTestResultsToExcel("Summary", "Not Executed", "Entity Reg Outside AUH creat");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Reg Outside AUH creat");
            ExcelHandler.Updatereson("Summary", "Not Executed", "Entity Reg Outside AUH creat");

        }
    }




    public void ENTITY_REG_OUAE_Approvsel() throws Exception {
        PropertiesFilereader obj = new PropertiesFilereader();
        TestDataHandler testdata = new TestDataHandler();

        Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Authority approvel for Entity Reg Outside AUH creat");
        String style = "Yes";
        String style2 = TestDataInMap.get("Module Run");

        if (style.equals(style2)) {
            String style3 = "Browser Launched";
            System.out.println(TestDataInMap.get("Function"));
            String y = Auth_Approval.getinstance().Toclick_sel_reg_txt_pend_app();
            System.out.println("STAUS **** :::::  " + y);
            //Auth_Approval.getinstance(). ToUpdatedata();
            Auth_Approval.getinstance().Toclick_sel_reg_txt_pend_app();

            try {
//                Auth_Approval.getinstance().Tosesrch();
//                Thread.sleep(1000);
//                Auth_Approval.getinstance().Toselenn();
                TestDataInMap = ExcelHandler.getTestDataInMap("Entity_reg_approvel", "Data1");
                // Auth_Approval.getinstance().Toclick_Reg_user();
                String st1 = (TestDataInMap.get("Status"));
                String s1 = "Pending for Approval";
                String s2 = st1;
                String s3 = "Under Review";
                String s4 = st1;
                String s5 = "Approved";
                System.out.println("STAUS ===:::::" + st1);
                System.out.println("STAUS ===:::::" + st1);

                if (s1.equals(s2)) {

                    Auth_Approval.getinstance().Toclick_Reg_user();
                    Thread.sleep(1000);
                    Auth_Approval.getinstance().Toclick_sel_reg_receive();
                    Thread.sleep(10000);
                    Auth_Approval.getinstance().Toclick_Reg_user();
                    Thread.sleep(1000);
                    Auth_Approval.getinstance().Toclick_Reg_user();
                    Auth_Approval.getinstance().Toclick_sel_reg_approve();
                    Thread.sleep(1000);
                    Auth_Approval.getinstance().Toclick_sel_reg_App_yes();
                    System.out.println("STAUS ::::: ===" + s2);
                    Logout.getinstance().ToReg_Logout();

                } else {
                    if (s3.equals(s4)) {

                        Auth_Approval.getinstance().Toclick_Reg_user();
                        Thread.sleep(1000);
                        Auth_Approval.getinstance().Toclick_sel_reg_approve();
                        Auth_Approval.getinstance().Toclick_sel_reg_App_yes();
                        System.out.println("STAUS :::::===  " + s4);
                        Thread.sleep(1000);
                        Logout.getinstance().ToReg_Logout();
                    } else {
                        if (s5.equals(s4)) {
                            Logout.getinstance().ToReg_Logout();

                        } else {
                            Logout.getinstance().ToReg_Logout();
                            System.out.println("STAUS :::::===  " + s4);
                            ExcelHandler.Updatereson("Summary", "FAIL", "Authority approvel for Entity Reg Outside AUH creat");
                        }


                    }


                }

                ExcelHandler.UpdateTestResultsToExcel("Summary", "Executed", "Authority approvel for Entity Reg Outside AUH creat");
                ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Authority approvel for Entity Reg Outside AUH creat");

                ExcelHandler.Updatereson("Summary", "PASS", "Authority approvel for Entity Reg Outside AUH creat");
            } catch (Exception e1) {
                Logout.getinstance().ToReg_Logout();
                System.out.println("Not Executed");
                ExcelHandler.Updatereson("Summary", "FAIL", "Authority approvel for Entity Reg Outside AUH creat");
            }
        } else {
            System.out.println("vehicle not given yes");
            ExcelHandler.UpdateTestResultsToExcel("Summary", "Not Executed", "Authority approvel for Entity Reg Outside AUH creat");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Authority approvel for Entity Reg Outside AUH creat");
            ExcelHandler.Updatereson("Summary", "Not Executed", "Authority approvel for Entity Reg Outside AUH creat");

        }
    }

        public void ENTITY_REG_In_AUH () throws Exception {
            PropertiesFilereader obj = new PropertiesFilereader();
            TestDataHandler testdata = new TestDataHandler();

            Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Entity Reg Inside AUH create");
            String style = "Yes";
            String style2 = TestDataInMap.get("Module Run");


            if (style.equals(style2)) {


                Auth_Approval.getinstance().Toclick_sel_reg_txt_pend_app();
                try {
                    System.out.println("Not Executed");



                } catch (Exception e1) {
                    ExcelHandler.Updatereson("Summary", "FAIL", "Entity Reg Inside AUH creat");
                    System.out.println("Not Executed");

                }

                ExcelHandler.UpdateTestResultsToExcel("Summary", "Executed", "Entity Reg Inside AUH creat");
                ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Reg Inside AUH creat");
                ExcelHandler.Updatereson("Summary", "PASS", "Entity Reg Inside AUH creat");

            } else {
                System.out.println("vehicle not given yes");
                ExcelHandler.UpdateTestResultsToExcel("Summary", "Not Executed", "Entity Reg Inside AUH creat");
                ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Reg Inside AUH creat");
                ExcelHandler.Updatereson("Summary", "Not Executed", "Entity Reg Inside AUH creat");

            }
        }

    public void ENTITY_REG_Private_owners () throws Exception {
        PropertiesFilereader obj = new PropertiesFilereader();
        TestDataHandler testdata = new TestDataHandler();

        Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Entity Reg Private owners who need permits for their vehicles creat");
        String style = "Yes";
        String style2 = TestDataInMap.get("Module Run");


        if (style.equals(style2)) {


            try {
                System.out.println("Entity Reg Private owners who need permits for their vehicles creat");




////////////////////////////////////write functions/////////////////////////////////////////////////////////////////















            } catch (Exception e1) {
                ExcelHandler.Updatereson("Summary", "FAIL", "Entity Reg Private owners who need permits for their vehicles creat");
                System.out.println("Not Executed");

            }

            ExcelHandler.UpdateTestResultsToExcel("Summary", "Executed", "Entity Reg Private owners who need permits for their vehicles creat");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Reg Private owners who need permits for their vehicles creat");
            ExcelHandler.Updatereson("Summary", "PASS", "Entity Reg Private owners who need permits for their vehicles creat");

        } else {
            System.out.println("vehicle not given yes");
            ExcelHandler.UpdateTestResultsToExcel("Summary", "Not Executed", "Entity Reg Private owners who need permits for their vehicles creat");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Reg Private owners who need permits for their vehicles creat");
            ExcelHandler.Updatereson("Summary", "Not Executed", "Entity Reg Private owners who need permits for their vehicles creat");

        }
    }
    public void ENTITY_REG_Government_entities () throws Exception {
        PropertiesFilereader obj = new PropertiesFilereader();
        TestDataHandler testdata = new TestDataHandler();

        Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Entity Government entities without trade license that need permits for their vehicles");
        String style = "Yes";
        String style2 = TestDataInMap.get("Module Run");


        if (style.equals(style2)) {


            try {
                System.out.println("Entity Government entities without trade license that need permits for their vehicles");




////////////////////////////////////write functions/////////////////////////////////////////////////////////////////















            } catch (Exception e1) {
                ExcelHandler.Updatereson("Summary", "FAIL", "Entity Government entities without trade license that need permits for their vehicles");
                System.out.println("Not Executed");

            }

            ExcelHandler.UpdateTestResultsToExcel("Summary", "Executed", "Entity Government entities without trade license that need permits for their vehicles");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Government entities without trade license that need permits for their vehicles");
            ExcelHandler.Updatereson("Summary", "PASS", "Entity Government entities without trade license that need permits for their vehicles");

        } else {
            System.out.println("vehicle not given yes");
            ExcelHandler.UpdateTestResultsToExcel("Summary", "Not Executed", "Entity Government entities without trade license that need permits for their vehicles");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Government entities without trade license that need permits for their vehicles");
            ExcelHandler.Updatereson("Summary", "Not Executed", "Entity Government entities without trade license that need permits for their vehicles");

        }
    }

    public void ENTITY_REG_Entity_Schools() throws Exception {
        PropertiesFilereader obj = new PropertiesFilereader();
        TestDataHandler testdata = new TestDataHandler();

        Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Entity Schools that do not own school buses, but employ school bus supervisors");
        String style = "Yes";
        String style2 = TestDataInMap.get("Module Run");


        if (style.equals(style2)) {


            try {
                System.out.println("Entity Schools that do not own school buses, but employ school bus supervisors");




////////////////////////////////////write functions/////////////////////////////////////////////////////////////////















            } catch (Exception e1) {
                ExcelHandler.Updatereson("Summary", "FAIL", "Entity Schools that do not own school buses, but employ school bus supervisors");
                System.out.println("Not Executed");

            }

            ExcelHandler.UpdateTestResultsToExcel("Summary", "Executed", "Entity Schools that do not own school buses, but employ school bus supervisors");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Schools that do not own school buses, but employ school bus supervisors");
            ExcelHandler.Updatereson("Summary", "PASS", "Entity Schools that do not own school buses, but employ school bus supervisors");

        } else {
            System.out.println("vehicle not given yes");
            ExcelHandler.UpdateTestResultsToExcel("Summary", "Not Executed", "Entity Schools that do not own school buses, but employ school bus supervisors");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Schools that do not own school buses, but employ school bus supervisors");
            ExcelHandler.Updatereson("Summary", "Not Executed", "Entity Schools that do not own school buses, but employ school bus supervisors");

        }
    }


    public void ENTITY_REG_Suppliers_wishing () throws Exception {
        PropertiesFilereader obj = new PropertiesFilereader();
        TestDataHandler testdata = new TestDataHandler();

        Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Entity Suppliers wishing to obtain certification for their vehicle tracking devices");
        String style = "Yes";
        String style2 = TestDataInMap.get("Module Run");



        if (style.equals(style2)) {


            try {
                System.out.println("Entity Suppliers wishing to obtain certification for their vehicle tracking devices");




////////////////////////////////////write functions/////////////////////////////////////////////////////////////////















            } catch (Exception e1) {
                ExcelHandler.Updatereson("Summary", "FAIL", "Entity Suppliers wishing to obtain certification for their vehicle tracking devices");
                System.out.println("Not Executed");

            }

            ExcelHandler.UpdateTestResultsToExcel("Summary", "Executed", "Entity Suppliers wishing to obtain certification for their vehicle tracking devices");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Suppliers wishing to obtain certification for their vehicle tracking devices");
            ExcelHandler.Updatereson("Summary", "PASS", "Entity Suppliers wishing to obtain certification for their vehicle tracking devices");

        } else {
            System.out.println("vehicle not given yes");
            ExcelHandler.UpdateTestResultsToExcel("Summary", "Not Executed", "Entity Suppliers wishing to obtain certification for their vehicle tracking devices");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Suppliers wishing to obtain certification for their vehicle tracking devices");
            ExcelHandler.Updatereson("Summary", "Not Executed", "Entity Suppliers wishing to obtain certification for their vehicle tracking devices");

        }
    }


    public void ENTITY_REG_Workshops_for_installation() throws Exception {
        PropertiesFilereader obj = new PropertiesFilereader();
        TestDataHandler testdata = new TestDataHandler();

        Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Entity Workshops for installation of tracking devices wishing to obtain certification");
        String style = "Yes";
        String style2 = TestDataInMap.get("Module Run");



        if (style.equals(style2)) {

            try {


        ////////////////////////////////////write functions/////////////////////////////////////////////////////////////////

            } catch (Exception e1) {
                ExcelHandler.Updatereson("Summary", "FAIL", "Entity Workshops for installation of tracking devices wishing to obtain certification");
                System.out.println("Not Executed");

            }

            ExcelHandler.UpdateTestResultsToExcel("Summary", "Executed", "Entity Workshops for installation of tracking devices wishing to obtain certification");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Workshops for installation of tracking devices wishing to obtain certification");
            ExcelHandler.Updatereson("Summary", "PASS", "Entity Workshops for installation of tracking devices wishing to obtain certification");

        } else {
            System.out.println("vehicle not given yes");
            ExcelHandler.UpdateTestResultsToExcel("Summary", "Not Executed", "Entity Workshops for installation of tracking devices wishing to obtain certification");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Entity Workshops for installation of tracking devices wishing to obtain certification");
            ExcelHandler.Updatereson("Summary", "Not Executed", "Entity Workshops for installation of tracking devices wishing to obtain certification");

        }
    }



    public void Permit_Officer_Rights() throws Exception {
        PropertiesFilereader obj = new PropertiesFilereader();
        TestDataHandler testdata = new TestDataHandler();

        Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Permit Officer Rights");
        String style = "Yes";
        String style2 = TestDataInMap.get("Module Run");



        if (style.equals(style2)) {


            try {
                System.out.println("Permit Officer Rights");

                Map<String, String> TestDataInMap1 =  ExcelHandler.getTestDataInMap("Permit_Head", "Data 1");
                String s1 = "Waiting for Review";
                String s2 = TestDataInMap1.get("Status");
                String s3 = "Under Review";
                String s4 = "Approval Recommended";
                System.out.println("STATUS 🔹🔹🔹➖ "+s2);

                if (s1.equals(s2)) {
                    System.out.println("Waiting for Review ✅");
                    Map<String, String> TestDataInMap11 = ExcelHandler.getTestDataInMap("permit_Officer", "Data 1");
                    String s11 = "Waiting for Review";
                    String s22 = TestDataInMap11.get("Status");
                    String s33 = "Under Review";
                    String s44 = "Approval Recommended";
                    String s5 = "Auto Closed";
                    String s6 = "Cancellation Recommended";
                    String s7 = "Need More Info";
                    String s8 = "Rejected";
                    String s9 = "Updated By Entity";
                    System.out.println("STATUS 🔹🔹🔹➖ " + s2);

                    if (s11.equals(s22)) {
                        System.out.println("Waiting for Review ✅");


                        /////////////////////////////////////write functions///////////////////////////////////////////////////////


                    } else {
                        System.out.println("Waiting for Review 🛑");
                        if (s33.equals(s22)) {

                            System.out.println("Under Review ✅");


                            ////////////////////////////////////write functions////////////////////////////////////////////////////////


                        } else {
                            System.out.println("Under Review 🛑");
                            if (s44.equals(s22)) {

                                System.out.println("Approval Recommended ✅");


                                /////////////////////////write functions////////////////////////////////////////////////////////////////////


                            } else {
                                System.out.println("Approval Recommended 🛑");


                                /////////////////////////////write functions/////////////////////////////////////////////////////////////////


                                if (s5.equals(s22)) {
                                    System.out.println("Auto Closed ✅");


                                    /////////////////////////////////////write functions///////////////////////////////////////////////////////


                                } else {
                                    System.out.println("Auto Closed 🛑");
                                    if (s6.equals(s22)) {

                                        System.out.println("Cancellation Recommended ✅");


                                        ////////////////////////////////////write functions////////////////////////////////////////////////////////


                                    } else {
                                        System.out.println("Cancellation Recommended 🛑");
                                        if (s7.equals(s22)) {

                                            System.out.println("Approval Recommended ✅");


                                            /////////////////////////write functions/////////////////////////////////////////////////////////////////


                                        } else {
                                            System.out.println("Approval Recommended 🛑");


                                            /////////////////////////////write functions/////////////////////////////////////////////////////////////////
                                            System.out.println("Cancellation Recommended 🛑");
                                            if (s8.equals(s22)) {

                                                System.out.println("Rejected ✅");


                                                /////////////////////////write functions/////////////////////////////////////////////////////////////////


                                            } else {
                                                System.out.println("Rejected 🛑");


                                                /////////////////////////////write functions/////////////////////////////////////////////////////////////////
                                                if (s9.equals(s22)) {

                                                    System.out.println("Updated By Entity ✅");


                                                    /////////////////////////write functions/////////////////////////////////////////////////////////////////


                                                } else {
                                                    System.out.println("Updated By Entity 🛑");

                                                    System.out.println("Waiting for Review 🛑");
                                                    if (s3.equals(s2)) {

                                                        System.out.println("Under Review ✅");




////////////////////////////////////write functions/////////////////////////////////////////////////////////////////






                                                    } else {
                                                        System.out.println("Under Review 🛑");
                                                        if (s4.equals(s2)) {

                                                            System.out.println("Approval Recommended ✅");




////////////////////////////////////write functions/////////////////////////////////////////////////////////////////






                                                        } else {
                                                            System.out.println("Approval Recommended 🛑");




////////////////////////////////////write functions/////////////////////////////////////////////////////////////////





                                                        }

                                                    }

                                                    /////////////////////////////write functions/////////////////////////////////////////////////////////////////


                                                }

                                            }

                                        }

                                    }
                                }

                            }

                        }

                    }

////////////////////////////////////write functions/////////////////////////////////////////////////////////////////






                }



        ////////////////////////////////////write functions/////////////////////////////////////////////////////////////////















            } catch (Exception e1) {

                ExcelHandler.Updatereson("Summary", "FAIL", "Permit Officer Rights");
                System.out.println("Not Executed");

            }

            ExcelHandler.UpdateTestResultsToExcel("Summary", "Executed", "Permit Officer Rights");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Permit Officer Rights");
            ExcelHandler.Updatereson("Summary", "PASS", "Permit Officer Rights");

        } else {
            System.out.println("vehicle not given yes");
            ExcelHandler.UpdateTestResultsToExcel("Summary", "Not Executed", "Permit Officer Rights");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Permit Officer Rights");
            ExcelHandler.Updatereson("Summary", "Not Executed", "Permit Officer Rights");

        }
    }


    public void Permit_Head_Rights() throws Exception {
        PropertiesFilereader obj = new PropertiesFilereader();
        TestDataHandler testdata = new TestDataHandler();

        Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Permit Head Rights");
        String style = "Yes";
        String style2 = TestDataInMap.get("Module Run");



        if (style.equals(style2)) {


            try {
                System.out.println("Permit Head Rights");



                Map<String, String> TestDataInMap11 = ExcelHandler.getTestDataInMap("Permit_Head", "Data 1");
                String s11 = "Approval Recommended";
                String s22 = TestDataInMap11.get("Status");
                String s33 = "Under Review";
                String s44 = "Need More Info";
                String s5 = "Auto Closed";
                String s6 = "Cancellation Requested";
                String s7 = "Under Re-evaluation";
                String s8 = "Rejected";
                String s9 = "Updated By Entity";
                System.out.println("STATUS 🔹🔹🔹➖ " + s22+" ➖🔹🔹🔹");

                if (s11.equals(s22)) {
                    System.out.println("Approval Recommended ✅");


                    /////////////////////////////////////write functions///////////////////////////////////////////////////////


                } else {
                    System.out.println("Approval Recommended 🛑");
                    ////////////////////////////////////write functions/////////////////////////////////////////////////////////////////
                    if (s33.equals(s22)) {
                        System.out.println("Under Review ✅");


                        /////////////////////////////////////write functions///////////////////////////////////////////////////////


                    } else {
                        System.out.println("Under Review 🛑");
                        ////////////////////////////////////write functions/////////////////////////////////////////////////////////////////
                        if (s44.equals(s22)) {
                            System.out.println("Need More Info ✅");


                            /////////////////////////////////////write functions///////////////////////////////////////////////////////


                        } else {
                            System.out.println("Need More Info 🛑");
                            ////////////////////////////////////write functions/////////////////////////////////////////////////////////////////

                            if (s5.equals(s22)) {
                                System.out.println("Auto Closed ✅");


                                /////////////////////////////////////write functions///////////////////////////////////////////////////////


                            } else {
                                System.out.println("Auto Closed 🛑");
                                ////////////////////////////////////write functions/////////////////////////////////////////////////////////////////

                                if (s6.equals(s22)) {
                                    System.out.println("Cancellation Requested ✅");


                                    /////////////////////////////////////write functions///////////////////////////////////////////////////////


                                } else {
                                    System.out.println("Cancellation Requested 🛑");
                                    ////////////////////////////////////write functions/////////////////////////////////////////////////////////////////

                                    if (s7.equals(s22)) {
                                        System.out.println("Under Re-evaluation ✅");


                                        /////////////////////////////////////write functions///////////////////////////////////////////////////////


                                    } else {
                                        System.out.println("Under Re-evaluation 🛑");
                                        ////////////////////////////////////write functions/////////////////////////////////////////////////////////////////
                                        if (s8.equals(s22)) {
                                            System.out.println("Rejected ✅");


                                            /////////////////////////////////////write functions///////////////////////////////////////////////////////


                                        } else {
                                            System.out.println("Rejected 🛑");
                                            ////////////////////////////////////write functions/////////////////////////////////////////////////////////////////
                                            if (s9.equals(s22)) {
                                                System.out.println("Updated By Entity ✅");


                                                /////////////////////////////////////write functions///////////////////////////////////////////////////////


                                            } else {
                                                System.out.println("Updated By Entity 🛑");
                                                ////////////////////////////////////write functions/////////////////////////////////////////////////////////////////


                                            }

                                        }

                                    }
                                }
                            }
                        }

                    }

                }






            } catch (Exception e1) {
                ExcelHandler.Updatereson("Summary", "FAIL", "Permit Head Rights");
                System.out.println("Not Executed");

            }

            ExcelHandler.UpdateTestResultsToExcel("Summary", "Executed", "Permit Head Rights");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Permit Head Rights");
            ExcelHandler.Updatereson("Summary", "PASS", "Permit Head Rights");

        } else {
            System.out.println("vehicle not given yes");
            ExcelHandler.UpdateTestResultsToExcel("Summary", "Not Executed", "Permit Head Rights");
            ExcelHandler.UpdateDateTime("Summary", sdf.format(d), "Permit Head Rights");
            ExcelHandler.Updatereson("Summary", "Not Executed", "Permit Head Rights");

        }
    }

































































































}
