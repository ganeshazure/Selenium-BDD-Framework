//package StepDefinitions;
//
//import java.util.HashMap;
//import java.util.Map;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import PageObjects.RegisterPage;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import utils.DriverFactory;
//import utils.ExcelUtils;
//
//public class RegisterSteps {
//    private WebDriver driver;
//    private RegisterPage registerPage;
//
//    @Given("I am on the registration page")
//    public void openRegistrationPage() {
//        driver = DriverFactory.getDriver();
//        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
//        registerPage = new RegisterPage(driver);
//    }
//
//    @Given("I open the registration page")
//    public void legacyOpenRegistrationPage() {
//        openRegistrationPage();
//    }
//
//    @When("I enter valid personal details")
//    public void enterValidDetails() {
//        registerPage.fillPersonalDetails(
//                "John",
//                "Doe",
//                "john" + System.currentTimeMillis() + "@test.com",
//                "1234567890",
//                "Test@123");
//    }
//
//    @When("I read registration data from Excel and fill the form")
//    public void readDataFromExcelAndFillForm() {
//        Map<String, String> registrationData = ExcelUtils.getFirstRegistrationData();
//
//        if (registrationData == null || registrationData.isEmpty()) {
//            registrationData = new HashMap<>();
//            registrationData.put("FirstName", "John");
//            registrationData.put("LastName", "Doe");
//            registrationData.put("Email", "john" + System.currentTimeMillis() + "@test.com");
//            registrationData.put("Telephone", "1234567890");
//            registrationData.put("Password", "Test@123");
//            registrationData.put("Confirm", "Test@123");
//        }
//
//        String email = registrationData.getOrDefault("Email", "");
//        if (!email.isEmpty() && email.contains("@")) {
//            String uniqueEmail = email.replace("@", System.currentTimeMillis() + "@");
//            registrationData.put("Email", uniqueEmail);
//        }
//
//        registerPage.enterRegistrationData(registrationData);
//    }
//
//    @When("I agree to the Privacy Policy for legacy registration")
//    public void agreePrivacy() {
//        registerPage.agreePrivacyPolicy();
//    }
//
//    @When("I click the Continue button for legacy registration")
//    public void clickContinue() {
//        registerPage.clickContinue();
//    }
//
//    @Then("I should see a success message or reach the account page")
//    public void verifySuccess() {
//        String title = driver.getTitle();
//        String currentUrl = driver.getCurrentUrl();
//        Assert.assertTrue(
//                title.contains("Your Account") || title.contains("Success") || currentUrl.contains("success") || currentUrl.contains("account"),
//                "Registration was not successful. Current URL: " + currentUrl + ", Title: " + title);
//    }
//}
