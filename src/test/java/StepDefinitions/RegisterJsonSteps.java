package StepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import PageObjects.Reg_with_json;
import PageObjects.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.DriverFactory;
import utils.JsonUtils;

public class RegisterJsonSteps {

    WebDriver driver;
    Reg_with_json registerPage;

    @Given("JSON user opens the application browser")
    public void jsonUserOpensApplicationBrowser() {

        driver = DriverFactory.getDriver();

        driver.manage().window().maximize();

        registerPage = new Reg_with_json(driver);
    }

    @Given("JSON user opens the registration page")
    public void jsonUserOpensRegistrationPage() {

        driver.get(
            "https://tutorialsninja.com/demo/index.php?route=account/register"
        );
    }

    @When("JSON user loads {string} and enters registration details")
    public void jsonUserLoadsAndEntersRegistrationDetails(String fileName) {

        String filePath = System.getProperty("user.dir")
                + "/src/test/resources/testdata/" + fileName;

        Map<String, String> data =
                JsonUtils.getJsonData(filePath);

        registerPage.enterRegistrationData(data);
    }

    @When("JSON user selects the Privacy Policy agreement")
    public void jsonUserSelectsPrivacyPolicyAgreement() {

        registerPage.agreePrivacyPolicy();
    }

    @When("JSON user submits the registration form")
    public void jsonUserSubmitsRegistrationForm() {

        registerPage.clickContinue();
    }
}
