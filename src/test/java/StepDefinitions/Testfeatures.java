package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.login;
import Utilities.Helper;
//import org.junit.Test;
import static org.junit.Assert.*;

public class Testfeatures extends BaseClass {
 login log;
 WebDriver driver;
 @Given("user navigates to Products page")
 public void user_navigates_to_products_page() {
	 driver = new ChromeDriver();
     driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
 }

 @When("I serch for apple product")
 public void i_serch_for_apple_product() {
     // Write code here that turns the phrase above into concrete actions
     throw new io.cucumber.java.PendingException();
 }

 @Then("I validate the product")
 public void i_validate_the_product() {
     // Write code here that turns the phrase above into concrete actions
     throw new io.cucumber.java.PendingException();
 }
 
 
}