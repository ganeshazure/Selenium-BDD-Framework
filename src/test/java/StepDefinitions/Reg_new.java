 package StepDefinitions;

 import io.cucumber.java.en.*;
 import utils.DriverFactory;
 import io.cucumber.datatable.DataTable;
 import PageObjects.reg_new;
 import PageObjects.reg_new;

 import org.openqa.selenium.By;
 import utils.DriverFactory;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

 import static org.testng.Assert.assertTrue;

 import java.util.*;

 public class Reg_new extends BaseClass{
	

 	   WebDriver driver;
 	   reg_new registerPage;
//     WebDriver driver = DriverFactory.getDriver();
//     RegisterPage registerPage = new RegisterPage(driver);

     @Given("User launches the browser")
     public void launch_browser() {
     	driver =DriverFactory.getDriver();
         driver.manage().window().maximize();
     }

     @Given("User navigates to the register page")
     public void navigate_to_register_page() {
         driver.get("https:tutorialsninja.com/demo/index.php?route=account/register");
     }

     @When("User enters the following details")
     public void user_enters_following_details(DataTable dataTable) {
     	System.out.println("testing started");
     	driver = new ChromeDriver();
     	registerPage= new reg_new(driver);
         driver.get("https:tutorialsninja.com/demo/index.php?route=account/register");
         driver.manage().window().maximize();
         List<String> data = dataTable.row(0);
         //System.out.println(data.get(0));

         registerPage.enterDetailsList(data);
     }

     @When("User enters details as map")
     public void user_enters_details_as_map(DataTable dataTable) {
     	driver = new ChromeDriver();
     	registerPage= new reg_new(driver);
         driver.get("https:tutorialsninja.com/demo/index.php?route=account/register");
         driver.manage().window().maximize();
        
         Map<String, String> map = dataTable.asMap(String.class, String.class);
         registerPage.enterDetailsMap(map);
     }

     @When("User registers with multiple accounts")
     public void user_registers_with_multiple_accounts(DataTable dataTable) {
     	driver = new ChromeDriver();
     	registerPage= new reg_new(driver);
         driver.get("https:tutorialsninja.com/demo/index.php?route=account/register");
         driver.manage().window().maximize();
        
         List<Map<String, String>> maps = dataTable.asMaps();
         
         maps.get(0).get("Firstname");
         for (Map<String, String> user : maps) {
             registerPage.enterDetailsMap(user);
             registerPage.selectSubscribe("No");
             registerPage.agreePolicy();
             registerPage.clickContinue();
             driver.navigate().back();
         }
     }

     @When("User enters {string}, {string}, {string}, {string}, {string}, {string}")
     public void user_enters_details(String fn, String ln, String email, String phone, String pass, String confirm) {
     	driver = new ChromeDriver();
     	registerPage= new reg_new(driver);
         driver.get("https:tutorialsninja.com/demo/index.php?route=account/register");
         driver.manage().window().maximize();
        
         List<String> list = Arrays.asList(fn, ln, email, phone, pass, confirm);
         registerPage.enterDetailsList(list);
     }

     @When("User selects Subscribe as {string}")
     public void user_selects_subscribe_as(String subscribe) {
         registerPage.selectSubscribe(subscribe);
     }

     @When("User accepts the Privacy Policy")
     public void user_accepts_privacy_policy() {
         registerPage.agreePolicy();
     }

     @When("User clicks on Continue")
     public void user_clicks_continue() {
         registerPage.clickContinue();
     }

     @Then("Registration should be successful")
     public void registration_should_be_successful() {
         System.out.println("✅ Registration flow executed successfully.");
     }

     @Then("All users should be registered successfully")
     public void all_users_should_be_registered_successfully() {
     	 boolean dashboardDisplayed =
     	            driver.findElement(By.xpath("h1[normalize-space()='Dashboard']"))
     	                  .isDisplayed();

     	    assertTrue(dashboardDisplayed,
     	            "Dashboard is not displayed after login");

     }
 }
