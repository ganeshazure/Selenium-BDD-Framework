package StepDefinitions;

import PageObjects.registration1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class Registration1Steps {

    WebDriver driver = new ChromeDriver();
    registration1 registrationPage = new registration1(driver);

    @Given("I am on the registration page")
    public void iAmOnTheRegistrationPage() {
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
    }

    @When("I enter first name as {string}")
    public void iEnterFirstNameAs(String firstName) {
        registrationPage.enterFirstName(firstName);
    }

    @When("I enter last name as {string}")
    public void iEnterLastNameAs(String lastName) {
        registrationPage.enterLastName(lastName);
    }

    @When("I enter email as {string}")
    public void iEnterEmailAs(String email) {
        registrationPage.enterEmail(email);
    }

    @When("I enter telephone as {string}")
    public void iEnterTelephoneAs(String telephone) {
        registrationPage.enterTelephone(telephone);
    }

    @When("I enter password as {string}")
    public void iEnterPasswordAs(String password) {
        registrationPage.enterPassword(password);
    }

    @When("I confirm password as {string}")
    public void iConfirmPasswordAs(String confirmPassword) {
        registrationPage.confirmPassword(confirmPassword);
    }

    @When("I agree to the privacy policy")
    public void iAgreeToThePrivacyPolicy() {
        registrationPage.agreeToPrivacyPolicy();
    }

    @When("I click on continue")
    public void iClickOnContinue() {
        registrationPage.clickContinue();
    }

    @Then("I should be redirected to the next page")
    public void iShouldBeRedirectedToTheNextPage() {
        // Add assertion to check that the page redirected correctly.
        assertTrue(driver.getCurrentUrl().contains("success")); // Modify based on actual behavior
    }
    
}

