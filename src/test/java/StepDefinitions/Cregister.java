package StepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import PageObjects.RegisterPage;
import utils.DriverFactory;

import java.util.UUID;

public class Cregister {

    private RegisterPage registerPage;

    private String uniqueEmail;


    @Given("I am on the TutorialsNinja registration page")
    public void i_am_on_the_tutorials_ninja_registration_page() {

        registerPage =
                new RegisterPage(DriverFactory.getDriver());

        registerPage.openRegisterPage();
    }


    @When("I enter valid first name")
    public void i_enter_valid_first_name() {

        registerPage.enterFirstName("John");
    }


    @When("I enter valid last name")
    public void i_enter_valid_last_name() {

        registerPage.enterLastName("Smith");
    }


    @When("I enter unique email")
    public void i_enter_unique_email() {

        uniqueEmail =
                "john" + UUID.randomUUID() + "@gmail.com";

        registerPage.enterEmail(uniqueEmail);
    }


    @When("I enter valid telephone number")
    public void i_enter_valid_telephone_number() {

        registerPage.enterTelephone("9876543210");
    }


    @When("I enter valid password")
    public void i_enter_valid_password() {

        registerPage.enterPassword("Test@12345");
    }


    @When("I enter matching confirm password")
    public void i_enter_matching_confirm_password() {

        registerPage.enterConfirmPassword("Test@12345");
    }


    @When("I enter different confirm password")
    public void i_enter_different_confirm_password() {

        registerPage.enterConfirmPassword("Test@54321");
    }


    @When("I select newsletter No")
    public void i_select_newsletter_no() {

        registerPage.selectNewsletterNo();
    }


    @When("I select newsletter Yes")
    public void i_select_newsletter_yes() {

        registerPage.selectNewsletterYes();
    }


    @When("I agree to the Privacy Policy")
    public void i_agree_to_the_privacy_policy() {

        registerPage.selectPrivacyPolicy();
    }


    @When("I click on Continue button")
    public void i_click_on_continue_button() {

        registerPage.clickContinue();
    }



    }

