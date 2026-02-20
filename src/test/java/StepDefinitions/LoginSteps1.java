package StepDefinitions;


import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Factory.DriverFactory;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class LoginSteps1 {

    WebDriver driver;
    LoginPage loginPage;

    @Given("the user navigates to the login page")
    public void the_user_navigates_to_the_login_page() {
       //driver = new ChromeDriver();
    	//driver = DriverFactory.initializeBrowser("firefox");
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        loginPage = new LoginPage(driver);
    }

    @When("the user enters a valid email and password")
    public void the_user_enters_a_valid_email_and_password() {
        loginPage.login("valid@example.com", "validPassword");
    }

    @Then("the user should be logged in and redirected to the homepage")
    public void the_user_should_be_logged_in_and_redirected_to_the_homepage() {
        // Assuming the homepage URL after a successful login
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://tutorialsninja.com/demo/index.php?route=common/home", currentUrl);
        driver.quit();
    }

    @When("the user enters an invalid email and password")
    public void the_user_enters_an_invalid_email_and_password() {
        loginPage.login("invalid@example.com", "invalidPassword");
    }

    @Then("the user should see an error message")
    public void the_user_should_see_an_error_message() {
        String error = loginPage.getErrorMessage();
        assertTrue(error.contains("Warning: No match for E-Mail Address and/or Password."));
        driver.quit();
    }
    @When("the user enters an unregistered email {string} and a valid password")
    public void the_user_enters_an_unregistered_email_and_a_valid_password(String email) {
        loginPage.login(email, "validPassword");
    }

    @Then("the user should see an error message indicating the account is not found")
    public void the_user_should_see_an_error_message_indicating_the_account_is_not_found() {
        String error = loginPage.getErrorMessage();
        assertTrue(error.contains("Warning: No match for E-Mail Address and/or Password."));
        driver.quit();
    }

    @When("the user enters a valid email {string} and an incorrect password {string}")
    public void the_user_enters_a_valid_email_and_an_incorrect_password(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("the user should see an error message indicating the password is incorrect")
    public void the_user_should_see_an_error_message_indicating_the_password_is_incorrect() {
        String error = loginPage.getErrorMessage();
        assertTrue(error.contains("Warning: No match for E-Mail Address and/or Password."));
        driver.quit();
    }

    @When("the user leaves the email field empty and enters a password")
    public void the_user_leaves_the_email_field_empty_and_enters_a_password() {
        loginPage.login("", "validPassword");
    }

    @Then("the user should see an error message indicating that the email is required")
    public void the_user_should_see_an_error_message_indicating_that_the_email_is_required() {
        String error = loginPage.getErrorMessage();
        assertTrue(error.contains("Warning: E-Mail Address does not appear to be valid!"));
        driver.quit();
    }

    @When("the user enters an email but leaves the password field empty")
    public void the_user_enters_an_email_but_leaves_the_password_field_empty() {
        loginPage.login("valid@example.com", "");
    }

    @Then("the user should see an error message indicating that the password is required")
    public void the_user_should_see_an_error_message_indicating_that_the_password_is_required() {
        String error = loginPage.getErrorMessage();
        assertTrue(error.contains("Warning: Password is required!"));
        driver.quit();
    }

    @When("the user leaves both the email and password fields empty")
    public void the_user_leaves_both_the_email_and_password_fields_empty() {
        loginPage.login("", "");
    }

    @Then("the user should see an error message indicating that both fields are required")
    public void the_user_should_see_an_error_message_indicating_that_both_fields_are_required() {
        String error = loginPage.getErrorMessage();
        assertTrue(error.contains("Warning: E-Mail Address does not appear to be valid!"));
        driver.quit();
    }

    @When("the user enters an invalid email format {string} and a valid password")
    public void the_user_enters_an_invalid_email_format_and_a_valid_password(String email) {
        loginPage.login(email, "validPassword");
    }

    @Then("the user should see an error message indicating an invalid email format")
    public void the_user_should_see_an_error_message_indicating_an_invalid_email_format() {
        String error = loginPage.getErrorMessage();
        assertTrue(error.contains("Warning: E-Mail Address does not appear to be valid!"));
        driver.quit();
    }

    @When("the user enters a valid email {string} and the correct password")
    public void the_user_enters_a_valid_email_and_the_correct_password(String email) {
        loginPage.login(email, "validPassword");
    }

}

