package Stepclass;

import Page_object.OrcCaptcha;
import Page_object.loginpage;
import utlity.ExcelHandler;
import utlity.PropertiesFilereader;
import utlity.TestDataHandler;

import java.util.Map;

public class Login_captcha {

    public static Login_captcha Login_captchaInstance;

    private Login_captcha() {

    }

    public static Login_captcha getinstance() {

        if (Login_captchaInstance == null) {
            Login_captchaInstance = new Login_captcha();
        }

        return Login_captchaInstance;
    }
    public void ENTITY_REG_OUAE_Approv() throws Exception {
        PropertiesFilereader obj = new PropertiesFilereader();
        TestDataHandler testdata = new TestDataHandler();

        Map<String, String> TestDataInMap = ExcelHandler.getTestDataInMap("Summary", "Authority approvel for Entity Reg Outside AUH creat");

        String style = "Yes";
        String style2 = TestDataInMap.get("Module Run");
        String style3 = "Browser Launched";
        System.out.println(TestDataInMap.get("Function"));

        if (style.equals(style2)) {


            try {

                try {
                    loginpage.getinstance().username();
                    loginpage.getinstance().Password();
                    OrcCaptcha.getinstance().To_checkcaptha();
                    loginpage.getinstance().capthabox();
                    loginpage.getinstance().loginbtn();
                    loginpage.getinstance().search();
                    loginpage.getinstance().search();
                } catch (Exception e) {
                    try {
                        Thread.sleep(2000);
                        loginpage.getinstance().capthre();
                        OrcCaptcha.getinstance().To_checkcaptha();
                        loginpage.getinstance().username();
                        loginpage.getinstance().Password();
                        loginpage.getinstance().capthabox();
                        loginpage.getinstance().loginbtn();
                        loginpage.getinstance().search();
                    } catch (Exception e1) {
                        try {
                            Thread.sleep(2000);
                            loginpage.getinstance().capthre();
                            OrcCaptcha.getinstance().To_checkcaptha();
                            loginpage.getinstance().username();
                            loginpage.getinstance().Password();
                            loginpage.getinstance().capthabox();
                            loginpage.getinstance().loginbtn();
                            loginpage.getinstance().search();
                        } catch (Exception e2) {
                            try {
                                Thread.sleep(2000);
                                loginpage.getinstance().capthre();
                                OrcCaptcha.getinstance().To_checkcaptha();
                                loginpage.getinstance().username();
                                loginpage.getinstance().Password();
                                loginpage.getinstance().capthabox();
                                loginpage.getinstance().loginbtn();
                                loginpage.getinstance().search();
                            } catch (Exception e3) {
                                try {
                                    Thread.sleep(2000);
                                    loginpage.getinstance().capthre();
                                    OrcCaptcha.getinstance().To_checkcaptha();
                                    loginpage.getinstance().username();
                                    loginpage.getinstance().Password();
                                    loginpage.getinstance().capthabox();
                                    loginpage.getinstance().loginbtn();
                                    loginpage.getinstance().search();
                                } catch (Exception e4) {
                                    try {
                                        Thread.sleep(2000);
                                        loginpage.getinstance().capthre();
                                        OrcCaptcha.getinstance().To_checkcaptha();
                                        loginpage.getinstance().username();
                                        loginpage.getinstance().Password();
                                        loginpage.getinstance().capthabox();
                                        loginpage.getinstance().loginbtn();
                                        loginpage.getinstance().search();
                                    } catch (Exception e5) {
                                        try {
                                            Thread.sleep(2000);
                                            loginpage.getinstance().capthre();
                                            OrcCaptcha.getinstance().To_checkcaptha();
                                            loginpage.getinstance().username();
                                            loginpage.getinstance().Password();
                                            loginpage.getinstance().capthabox();
                                            loginpage.getinstance().loginbtn();
                                            loginpage.getinstance().search();
                                        } catch (Exception e6) {
                                            try {
                                                Thread.sleep(2000);
                                                loginpage.getinstance().capthre();
                                                OrcCaptcha.getinstance().To_checkcaptha();
                                                loginpage.getinstance().username();
                                                loginpage.getinstance().Password();
                                                loginpage.getinstance().capthabox();
                                                loginpage.getinstance().loginbtn();
                                                loginpage.getinstance().search();
                                            } catch (Exception e7) {
                                                try {
                                                    Thread.sleep(2000);
                                                    loginpage.getinstance().capthre();
                                                    OrcCaptcha.getinstance().To_checkcaptha();
                                                    loginpage.getinstance().username();
                                                    loginpage.getinstance().Password();
                                                    loginpage.getinstance().capthabox();
                                                    loginpage.getinstance().loginbtn();
                                                    loginpage.getinstance().search();
                                                } catch (Exception e8) {
                                                    try {
                                                        Thread.sleep(2000);
                                                        loginpage.getinstance().capthre();
                                                        OrcCaptcha.getinstance().To_checkcaptha();
                                                        loginpage.getinstance().username();
                                                        loginpage.getinstance().Password();
                                                        loginpage.getinstance().capthabox();
                                                        loginpage.getinstance().loginbtn();
                                                        loginpage.getinstance().search();
                                                    } catch (Exception e9) {
                                                        try {
                                                            Thread.sleep(2000);
                                                            loginpage.getinstance().capthre();
                                                            OrcCaptcha.getinstance().To_checkcaptha();
                                                            loginpage.getinstance().username();
                                                            loginpage.getinstance().Password();
                                                            loginpage.getinstance().capthabox();
                                                            loginpage.getinstance().loginbtn();
                                                            loginpage.getinstance().search();
                                                        } catch (Exception e10) {
                                                            try {
                                                                Thread.sleep(2000);
                                                                loginpage.getinstance().capthre();
                                                                OrcCaptcha.getinstance().To_checkcaptha();
                                                                loginpage.getinstance().username();
                                                                loginpage.getinstance().Password();
                                                                loginpage.getinstance().capthabox();
                                                                loginpage.getinstance().loginbtn();
                                                                loginpage.getinstance().search();
                                                            } catch (Exception e11) {
                                                                try {
                                                                    Thread.sleep(2000);
                                                                    loginpage.getinstance().capthre();
                                                                    OrcCaptcha.getinstance().To_checkcaptha();
                                                                    loginpage.getinstance().username();
                                                                    loginpage.getinstance().Password();
                                                                    loginpage.getinstance().capthabox();
                                                                    loginpage.getinstance().loginbtn();
                                                                    loginpage.getinstance().search();
                                                                } catch (Exception e12) {
                                                                    try {
                                                                        Thread.sleep(2000);
                                                                        loginpage.getinstance().capthre();
                                                                        OrcCaptcha.getinstance().To_checkcaptha();
                                                                        loginpage.getinstance().username();
                                                                        loginpage.getinstance().Password();
                                                                        loginpage.getinstance().capthabox();
                                                                        loginpage.getinstance().loginbtn();
                                                                        loginpage.getinstance().search();
                                                                    } catch (Exception e13) {
                                                                        try {
                                                                            Thread.sleep(2000);
                                                                            loginpage.getinstance().capthre();
                                                                            OrcCaptcha.getinstance().To_checkcaptha();
                                                                            loginpage.getinstance().username();
                                                                            loginpage.getinstance().Password();
                                                                            loginpage.getinstance().capthabox();
                                                                            loginpage.getinstance().loginbtn();
                                                                            loginpage.getinstance().search();
                                                                        } catch (Exception e14) {
                                                                            try {
                                                                                Thread.sleep(2000);
                                                                                loginpage.getinstance().capthre();
                                                                                OrcCaptcha.getinstance().To_checkcaptha();
                                                                                loginpage.getinstance().username();
                                                                                loginpage.getinstance().Password();
                                                                                loginpage.getinstance().capthabox();
                                                                                loginpage.getinstance().loginbtn();
                                                                                loginpage.getinstance().search();
                                                                            } catch (Exception e15) {
                                                                                try {
                                                                                    Thread.sleep(2000);
                                                                                    loginpage.getinstance().capthre();
                                                                                    OrcCaptcha.getinstance().To_checkcaptha();
                                                                                    loginpage.getinstance().username();
                                                                                    loginpage.getinstance().Password();
                                                                                    loginpage.getinstance().capthabox();
                                                                                    loginpage.getinstance().loginbtn();
                                                                                    loginpage.getinstance().search();
                                                                                } catch (Exception e16) {
                                                                                    try {
                                                                                        Thread.sleep(2000);
                                                                                        loginpage.getinstance().capthre();
                                                                                        OrcCaptcha.getinstance().To_checkcaptha();
                                                                                        loginpage.getinstance().username();
                                                                                        loginpage.getinstance().Password();
                                                                                        loginpage.getinstance().capthabox();
                                                                                        loginpage.getinstance().loginbtn();
                                                                                        loginpage.getinstance().search();
                                                                                    } catch (Exception e17) {
                                                                                        try {
                                                                                            Thread.sleep(2000);
                                                                                            loginpage.getinstance().capthre();
                                                                                            OrcCaptcha.getinstance().To_checkcaptha();
                                                                                            loginpage.getinstance().username();
                                                                                            loginpage.getinstance().Password();
                                                                                            loginpage.getinstance().capthabox();
                                                                                            loginpage.getinstance().loginbtn();
                                                                                            loginpage.getinstance().search();
                                                                                        } catch (Exception e18) {
                                                                                            try {
                                                                                                Thread.sleep(2000);
                                                                                                loginpage.getinstance().capthre();
                                                                                                OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                loginpage.getinstance().username();
                                                                                                loginpage.getinstance().Password();
                                                                                                loginpage.getinstance().capthabox();
                                                                                                loginpage.getinstance().loginbtn();
                                                                                                loginpage.getinstance().search();
                                                                                            } catch (Exception e19) {
                                                                                                try {
                                                                                                    Thread.sleep(2000);
                                                                                                    loginpage.getinstance().capthre();
                                                                                                    OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                    loginpage.getinstance().username();
                                                                                                    loginpage.getinstance().Password();
                                                                                                    loginpage.getinstance().capthabox();
                                                                                                    loginpage.getinstance().loginbtn();
                                                                                                    loginpage.getinstance().search();
                                                                                                } catch (
                                                                                                        Exception e20) {
                                                                                                    try {
                                                                                                        Thread.sleep(2000);
                                                                                                        loginpage.getinstance().capthre();
                                                                                                        OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                        loginpage.getinstance().username();
                                                                                                        loginpage.getinstance().Password();
                                                                                                        loginpage.getinstance().capthabox();
                                                                                                        loginpage.getinstance().loginbtn();
                                                                                                        loginpage.getinstance().search();
                                                                                                    } catch (Exception e193) {
                                                                                                        try {
                                                                                                            Thread.sleep(2000);
                                                                                                            loginpage.getinstance().capthre();
                                                                                                            OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                            loginpage.getinstance().username();
                                                                                                            loginpage.getinstance().Password();
                                                                                                            loginpage.getinstance().capthabox();
                                                                                                            loginpage.getinstance().loginbtn();
                                                                                                            loginpage.getinstance().search();
                                                                                                        } catch (
                                                                                                                Exception e203) {
                                                                                                            try {
                                                                                                                Thread.sleep(2000);
                                                                                                                loginpage.getinstance().capthre();
                                                                                                                OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                                loginpage.getinstance().username();
                                                                                                                loginpage.getinstance().Password();
                                                                                                                loginpage.getinstance().capthabox();
                                                                                                                loginpage.getinstance().loginbtn();
                                                                                                                loginpage.getinstance().search();
                                                                                                            } catch (Exception e1933) {
                                                                                                                try {
                                                                                                                    Thread.sleep(2000);
                                                                                                                    loginpage.getinstance().capthre();
                                                                                                                    OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                                    loginpage.getinstance().username();
                                                                                                                    loginpage.getinstance().Password();
                                                                                                                    loginpage.getinstance().capthabox();
                                                                                                                    loginpage.getinstance().loginbtn();
                                                                                                                    loginpage.getinstance().search();
                                                                                                                } catch (
                                                                                                                        Exception e240) {
                                                                                                                    try {
                                                                                                                        Thread.sleep(2000);
                                                                                                                        loginpage.getinstance().capthre();
                                                                                                                        OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                                        loginpage.getinstance().username();
                                                                                                                        loginpage.getinstance().Password();
                                                                                                                        loginpage.getinstance().capthabox();
                                                                                                                        loginpage.getinstance().loginbtn();
                                                                                                                        loginpage.getinstance().search();
                                                                                                                    } catch (
                                                                                                                            Exception e1449) {
                                                                                                                        try {
                                                                                                                            Thread.sleep(2000);
                                                                                                                            loginpage.getinstance().capthre();
                                                                                                                            OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                                            loginpage.getinstance().username();
                                                                                                                            loginpage.getinstance().Password();
                                                                                                                            loginpage.getinstance().capthabox();
                                                                                                                            loginpage.getinstance().loginbtn();
                                                                                                                            loginpage.getinstance().search();
                                                                                                                        } catch (
                                                                                                                                Exception e2110) {
                                                                                                                            try {
                                                                                                                                Thread.sleep(2000);
                                                                                                                                loginpage.getinstance().capthre();
                                                                                                                                OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                                                loginpage.getinstance().username();
                                                                                                                                loginpage.getinstance().Password();
                                                                                                                                loginpage.getinstance().capthabox();
                                                                                                                                loginpage.getinstance().loginbtn();
                                                                                                                                loginpage.getinstance().search();
                                                                                                                            } catch (
                                                                                                                                    Exception e195) {
                                                                                                                                try {
                                                                                                                                    Thread.sleep(2000);
                                                                                                                                    loginpage.getinstance().capthre();
                                                                                                                                    OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                                                    loginpage.getinstance().username();
                                                                                                                                    loginpage.getinstance().Password();
                                                                                                                                    loginpage.getinstance().capthabox();
                                                                                                                                    loginpage.getinstance().loginbtn();
                                                                                                                                    loginpage.getinstance().search();
                                                                                                                                } catch (
                                                                                                                                        Exception e20g) {
                                                                                                                                    try {
                                                                                                                                        Thread.sleep(2000);
                                                                                                                                        loginpage.getinstance().capthre();
                                                                                                                                        OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                                                        loginpage.getinstance().username();
                                                                                                                                        loginpage.getinstance().Password();
                                                                                                                                        loginpage.getinstance().capthabox();
                                                                                                                                        loginpage.getinstance().loginbtn();
                                                                                                                                        loginpage.getinstance().search();
                                                                                                                                    } catch (
                                                                                                                                            Exception e149) {
                                                                                                                                        try {
                                                                                                                                            Thread.sleep(2000);
                                                                                                                                            loginpage.getinstance().capthre();
                                                                                                                                            OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                                                            loginpage.getinstance().username();
                                                                                                                                            loginpage.getinstance().Password();
                                                                                                                                            loginpage.getinstance().capthabox();
                                                                                                                                            loginpage.getinstance().loginbtn();
                                                                                                                                            loginpage.getinstance().search();
                                                                                                                                        } catch (
                                                                                                                                                Exception e250) {
                                                                                                                                            try {
                                                                                                                                                Thread.sleep(2000);
                                                                                                                                                loginpage.getinstance().capthre();
                                                                                                                                                OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                                                                loginpage.getinstance().username();
                                                                                                                                                loginpage.getinstance().Password();
                                                                                                                                                loginpage.getinstance().capthabox();
                                                                                                                                                loginpage.getinstance().loginbtn();
                                                                                                                                                loginpage.getinstance().search();
                                                                                                                                            } catch (
                                                                                                                                                    Exception e195566) {
                                                                                                                                                try {
                                                                                                                                                    Thread.sleep(2000);
                                                                                                                                                    loginpage.getinstance().capthre();
                                                                                                                                                    OrcCaptcha.getinstance().To_checkcaptha();
                                                                                                                                                    loginpage.getinstance().username();
                                                                                                                                                    loginpage.getinstance().Password();
                                                                                                                                                    loginpage.getinstance().capthabox();
                                                                                                                                                    loginpage.getinstance().loginbtn();
                                                                                                                                                    loginpage.getinstance().search();
                                                                                                                                                } catch (
                                                                                                                                                        Exception e200) {
                                                                                                                                                    System.out.println("exe");
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }    }
                                                                                                        }   }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } finally {
//                Thread.sleep(50000);
            }

        }
        else {
            System.out.println("vehicle not given yes");

        }
    }
}
