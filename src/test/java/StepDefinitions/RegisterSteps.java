package StepDefinitions;

import io.cucumber.java.en.*;
import utils.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.RegisterPage;
//import utilities.DriverFactory;

public class RegisterSteps {
   // WebDriver driver = DriverFactory.getDriver();
    RegisterPage registerPage;
    WebDriver driver = DriverFactory.getDriver();
    @Given("I open the registration page")
    public void openRegistrationPage() {
    	//System.out.println("testing started");
    	//driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        registerPage = new RegisterPage(driver);
    }

    @When("I enter valid personal details")
    public void enterValidDetails() {
        registerPage.fillPersonalDetails("John", "Doe", "john" + System.currentTimeMillis() + "@test.com", "1234567890", "Test@123");
    }

    @When("I agree to the Privacy Policy")
    public void agreePrivacy() {
        registerPage.agreePrivacyPolicy();
    }

    @When("I click the Continue button")
    public void clickContinue() {
        registerPage.clickContinue();
    }

    @Then("I should see a success message or reach the account page")
    public void verifySuccess() {
        String title = driver.getTitle();
        assert title.contains("Your Account") || title.contains("Success");
    }
}
