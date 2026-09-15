package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.Reg_with_excel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import utils.DriverFactory;
import utils.ExcelUtils;

public class Reg_excel {

    WebDriver driver;

    Reg_with_excel registerPage;

    Map<String, String> data;


    @Given("User launches browser")
    public void launch_browser() {

        driver = DriverFactory.getDriver();

        driver.manage().window().maximize();

        registerPage = new Reg_with_excel(driver);
    }


    @Given("User navigates to register page")
    public void navigate_to_register_page() {

        driver.get(
            "https://tutorialsninja.com/demo/index.php?route=account/register"
        );
    }


    @When("I read registration data from Excel and fill the form")
    public void fillFormFromExcel() {

        data = ExcelUtils.getRegistrationData();

        System.out.println(
                "First Name: " + data.get("FirstName"));

        System.out.println(
                "Last Name: " + data.get("LastName"));

        System.out.println(
                "Email: " + data.get("Email"));

        System.out.println(
                "Telephone: " + data.get("Telephone"));

        System.out.println(
                "Password: " + data.get("Password"));

        System.out.println(
                "Confirm Password: "
                + data.get("PasswordConfirm"));

        System.out.println(
                "Newsletter: " + data.get("Newsletter"));


        registerPage.enterRegistrationData(data);
    }


    @When("User agrees to the Privacy Policy")
    public void agree_privacy_policy() {

        registerPage.agreePrivacyPolicy();
    }


    @When("User clicks on Continue button")
    public void user_clicks_continue() {

        registerPage.clickContinue();
    }


    @Then("I should see the account page")
    public void verify_account_page() {

    	
//        String currentUrl = driver.getCurrentUrl();

String actual = "Ganes";
String expected = "Ganesh";

Assert.assertEquals(actual, expected);
//        System.out.println(
//                "Current URL: " + currentUrl);
//
//        System.out.println(
//                "Registration completed");
    }
}