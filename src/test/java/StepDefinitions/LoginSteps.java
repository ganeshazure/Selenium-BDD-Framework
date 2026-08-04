//package StepDefinitions;
//
//import org.junit.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import PageObjects.login;
//import Utilities.Helper;
////import org.junit.Test;
//import static org.junit.Assert.*;
//
//public class LoginSteps extends BaseClass {
// login log;
// WebDriver driver;
// @Given("User is on the login page")
// 
// 
// 
// 
// 
// @Given("user is on the login page")
// public void user_is_on_the_login_page() {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }
//
// @When("user enter username {string} into username field")
// public void user_enter_username_into_username_field(String string) {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }
//
// @When("user enter password {string} into password field")
// public void user_enter_password_into_password_field(String string) {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }
//
// @Then("user should see homepage")
// public void user_should_see_homepage() {
//     // Write code here that turns the phrase above into concrete actions
//     throw new io.cucumber.java.PendingException();
// }
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// 
// public void user_is_on_the_login_page() throws InterruptedException {
//	 //driver = Helper.getDriver();
//     //driver = initializeBrowser("chrome");
//     //driver.manage().window().maximize();
//      log = new login(driver);  
//	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
//	  Thread.sleep(5000);
// }
//
// @When("user enter email {string} into Email filed")
// public void user_enter_email_into_email_filed(String string) throws InterruptedException {
//    log.SetUserName(string);
//    Thread.sleep(5000);
// }
//
// @When("user enter password {string} into Password field")
// public void user_enter_password_into_password_field(String string) throws InterruptedException {
//    log.SetPassword(string);
//    Thread.sleep(5000);
// }
//
// @When("user clicks on login button")
// public void user_clicks_on_login_button() throws InterruptedException {
//	 log.ClickBtnLogin();
//	 Thread.sleep(5000);
//     
// }
// @Then("User should see the Home page on successful login")
// public void user_should_see_the_home_page_on_successful_login() {
//	 String actualUrl= "homepage";
//	 String expectedUrl= "homepag";
//	 Assert.assertEquals(actualUrl, expectedUrl);
//	 getScreenshot(driver);
// }
//
// 
//}