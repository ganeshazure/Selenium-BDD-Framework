package StepDefinitions;


import PageObjects.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class LoginSteps1 {

    WebDriver driver;
    LoginPage loginPage;

    @Given("the user navigates to the login page")
    public void the_user_navigates_to_the_login_page() {
    	driver = new ChromeDriver();
    	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
  Thread.sleep(5000);
    }

    @When("the user enters a valid email")
    public void the_user_enters_a_valid_email_and_password() {
    	loginPage = new LoginPage(driver);
    	loginPage.enterEmail(null);
    	
    }
    @And("the user enters a valid password")
    public void the_user_enters_a_valid_email_and_password() {
    	loginPage.enterPassword(null);
       
    }
    @And("the user clicks on login button")
    public void the_user_enters_a_valid_email_and_password() {
       loginPage.login();
    }

    @Then("the user should be logged in and redirected to the homepage")
    public void the_user_should_be_logged_in_and_redirected_to_the_homepage() {
   
    	
    }

   
}

