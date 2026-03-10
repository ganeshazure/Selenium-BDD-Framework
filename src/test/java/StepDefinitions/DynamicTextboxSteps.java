package StepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import PageObjects.DynamicPage_NoAjax;
import utils.DriverFactory;

public class DynamicTextboxSteps {

	WebDriver driver = DriverFactory.getDriver();
    DynamicPage_NoAjax page;

    @Given("user opens dynamic textbox page")
    public void open_page() {
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html"); // update path
        page = new DynamicPage_NoAjax(driver);
    }

    @When("user clicks on Add Textbox1 button")
    public void click_button() {
        page.clickAddTextbox();
    }

    @Then("user enters text into textbox1")
    public void enter_text() throws InterruptedException {
    	Thread.sleep(9000);
        page.enterText(); // ❌ FAILS here
    }
}

