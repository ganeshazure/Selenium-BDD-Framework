//package StepDefinitions;
//
//import io.cucumber.java.en.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import Utilities.Helper;
//import Factory.DriverFactory;
////import factory.DriverFactory;
//import PageObjects.AmazonSearchPage;
////import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class SearchSamsungPhonesSteps  {
//
//    WebDriver driver;
//    AmazonSearchPage amazonSearchPage;
//
//    @Given("I open Amazon website")
//    public void i_open_amazon_website() {
//        //WebDriverManager.chromedriver().setup();
//    	//driver = Helper.getDriver();
//    	driver = DriverFactory.getDriver();
//        //driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://www.amazon.in/");
//        amazonSearchPage = new AmazonSearchPage(driver);
//    }
//
////    @When("I search for {string}")
////    public void i_search_for(String query) {
////        amazonSearchPage.enterSearchQuery;
////        amazonSearchPage.clickSearchButton();
////    }
//
//    @When("I apply filters for camera resolution {int} MP and above")
//    public void i_apply_filters_for_camera_resolution(int t) throws InterruptedException {
//    	Thread.sleep(20000);
//    	amazonSearchPage.filterByCameraResolution();
//    }
//
//    @When("I apply filters for model year {int}")
//    public void i_apply_filters_for_model_year(int year) {
//        amazonSearchPage.filterByModelYear(year);
//    }
//
//    @When("I apply filters for price range {int} to {int}")
//    public void i_apply_filters_for_price_range(int minPrice, int maxPrice) {
//        amazonSearchPage.filterByPriceRange(minPrice, maxPrice);
//    }
//
//    @Then("I should see the list of Samsung phones with these specifications")
//    public void i_should_see_the_list_of_samsung_phones_with_these_specifications() {
//        amazonSearchPage.verifyPhoneResults();
//        driver.quit();
//    }
//}