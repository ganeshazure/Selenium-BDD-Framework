package StepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import PageObjects.Tloginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.ConfigReader;
import utils.DriverFactory;

public class Tloginstepdefinition {
	
	Properties prop;
	WebDriver driver = DriverFactory.getDriver();
	Tloginpage tl;
	
	@Given("i am on tutorialsninja login page")
	public void i_am_on_tutorialsninja_login_page() {
		prop =ConfigReader.initializeProperties();
		driver.get(prop.getProperty("loginUrl"));
		
	}

	@When("i enter valid username")
	public void i_enter_valid_username() {
		tl =new Tloginpage(driver);
		tl.enteremail();
		
	}

	@When("i enter valid password")
	public void i_enter_valid_password() {
		tl.enterpassword();
	}

	@When("i click on tlogin button")
	public void i_click_on_tlogin_button() {
		tl.clickonloginbutton();
	}

}
