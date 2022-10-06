package Stepclass;


import constants.constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import webdriver_manager.DriverManager;

public class Function {
	@Given("To Launch Browser")
	public void to_Launch_Browser() {
		System.out.println("LAUNCH CHROME DRIVER");

	}

	@When("To Launch IAVMEP URL")
	public void to_Launch_IAVMEP_URL() {
		// launch browser
		DriverManager.getDriver().get(constants.APP_URL);
		System.out.println("BROWSER LAUNCHED");

	}

	@Then("To Complete Launch Browser")
	public void to_Complete_Launch_Browser() {
		System.out.println("URL LAUNCHED");
	}


	@Given("To create Entity Reg")
	public void to_create_Entity_Reg() throws Exception {
		System.out.println("TO Creat Entity Reg Outside AUH");

	}

	@When("To create Entity Reg Outside AUH")
	public void to_creat_Entity_Reg_Outside_AUH() throws Exception {
		Function_initialization.getinstance().ENTITY_REG_OUAE();

	}


	@Then("To Complete Entity Reg Outside AUH")
	public void to_Complete_Entity_Reg_Outside_AUH() {
		System.out.println("Entity Reg Outside AUH Created");
	}


	@Given("To creat Entity Reg out")
	public void to_creat_Entity_Reg_out() throws Exception {
		System.out.println("AS Authority Approve For Entity Reg User Completed");



	}


	@When("To creat Entity Reg INside AUH")
	public void to_creat_Entity_Reg_INside_AUH() throws Exception {
		Function_initialization.getinstance().ENTITY_REG_In_AUH();

	}


	@Then("To Complete Entity Reg Inside AUH")
	public void to_Complete_Entity_Reg_Inside_AUH() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@Given("To creat Entity Reg Private")
	public void to_creat_Entity_Reg_Private() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");
	}


	@When("To creat Entity Reg Private owners")
	public void to_creat_Entity_Reg_Private_owners() throws Exception {
		Function_initialization.getinstance().ENTITY_REG_Private_owners();

	}


	@Then("To Complete Entity Reg Private owners who need permits for their vehicles")
	public void to_Complete_Entity_Reg_Private_owners_who_need_permits_for_their_vehicles() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@Given("To creat Entity Reg Government")
	public void to_creat_Entity_Reg_Government() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@When("To creat Entity Reg  Government entities")
	public void to_creat_Entity_Reg_Government_entities() throws Exception {
		Function_initialization.getinstance().ENTITY_REG_Government_entities();

	}


	@Then("To Complete Entity Reg Government entities without trade license that need permits for their vehicles")
	public void to_Complete_Entity_Reg_Government_entities_without_trade_license_that_need_permits_for_their_vehicles() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@Given("To creat Entity Reg Bus")
	public void to_creat_Entity_Reg_Bus() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@When("To creat Entity Reg  Schools Bus")
	public void to_creat_Entity_Reg_Schools_Bus() throws Exception {
		Function_initialization.getinstance().ENTITY_REG_Entity_Schools();

	}


	@Then("To Complete Entity Reg Schools that do not own school buses, but employ school bus supervisors")
	public void to_Complete_Entity_Reg_Schools_that_do_not_own_school_buses_but_employ_school_bus_supervisors() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@Given("To creat Entity Reg Suppliers")
	public void to_creat_Entity_Reg_Suppliers() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@When("To creat Entity Suppliers")
	public void to_creat_Entity_Suppliers() throws Exception {
		Function_initialization.getinstance().ENTITY_REG_Suppliers_wishing();

	}


	@Then("To Complete Entity Reg Suppliers wishing to obtain certification for their vehicle tracking devices")
	public void to_Complete_Entity_Reg_Suppliers_wishing_to_obtain_certification_for_their_vehicle_tracking_devices() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@Given("To creat Entity Reg Workshops")
	public void to_creat_Entity_Reg_Workshops() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@When("To creat Entity  Workshops for installation")
	public void to_creat_Entity_Workshops_for_installation() throws Exception {
		Function_initialization.getinstance().ENTITY_REG_Workshops_for_installation();

	}


	@Then("To Complete Entity Reg Workshops for installation of tracking devices wishing to obtain certification")
	public void to_Complete_Entity_Reg_Workshops_for_installation_of_tracking_devices_wishing_to_obtain_certification() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@Given("To verify Approvel By Authority")
	public void to_verify_Approvel_By_Authority() {
		System.out.println("AS Authority Approve For Entity Reg User");

	}


	@When("To Approve Entity Reg Outside AUH  by Authority")
	public void to_Approve_Entity_Reg_Outside_AUH_by_Authority() throws Exception {
		try {
			Login_captcha.getinstance().ENTITY_REG_OUAE_Approv();


		}catch (Exception e) {
			System.out.println("To click admin");
		}
		Function_initialization.getinstance().ENTITY_REG_OUAE_Approvsel();

	}


	@Then("To Complete Entity Registration Outside UAE Approvel")
	public void to_Complete_Entity_Registration_Outside_UAE_Approvel() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}

	@Given("To verify Approvel By  Permit Officer")
	public void to_verify_Approvel_By_Permit_Officer() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");
	}

	@When("To Approve Entity Reg By   Permit Officer")
	public void to_Approve_Entity_Reg_By_Permit_Officer() throws Exception {
		Function_initialization.getinstance().Permit_Officer_Rights();

	}






	@Then("To Complete Entity By  Permit Officer")
	public void to_Complete_Entity_By_Permit_Officer() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");
	}


	@Given("To verify Approvel By Permit Head")
	public void to_verify_Approvel_By_Permit_Head() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


	@When("To Approve Entity Reg By  Permit Head")
	public void to_Approve_Entity_Reg_By_Permit_Head() throws Exception {
		Function_initialization.getinstance().Permit_Head_Rights();
	}


	@Then("To Complete Entity By Permit Head")
	public void to_Complete_Entity_By_Permit_Head() {
		System.out.println("AS Authority Approve For Entity Reg User Completed");

	}


}





































