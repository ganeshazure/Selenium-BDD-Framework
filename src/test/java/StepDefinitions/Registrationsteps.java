package StepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObjects.Registration;
import PageObjects.login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registrationsteps extends BaseClass {
	Registration reg;
	WebDriver driver;
	@Given("I am on the form page")
	public void i_am_on_the_form_page() throws InterruptedException {
		driver = initializeBrowser("chrome");
	     driver.manage().window().maximize();
		  reg = new Registration(driver);  
		  driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		  Thread.sleep(5000);
	}

	@When("I enter {string} as the first name")
	public void i_enter_as_the_first_name(String string) {
	    reg.enterFirstName(string);
	}

	@When("I enter {string} as the last name")
	public void i_enter_as_the_last_name(String string) {
		reg.enterLastName(string);
	}

	@When("I enter {string} as the email")
	public void i_enter_as_the_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter {string} as the telephone")
	public void i_enter_as_the_telephone(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter {string} as the password")
	public void i_enter_as_the_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter {string} as the password confirm")
	public void i_enter_as_the_password_confirm(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I select {string} as the newsletter option")
	public void i_select_as_the_newsletter_option(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I submit the form")
	public void i_submit_the_form() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should see a confirmation message")
	public void i_should_see_a_confirmation_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
