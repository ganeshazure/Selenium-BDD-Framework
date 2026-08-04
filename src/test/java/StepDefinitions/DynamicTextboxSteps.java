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

        WebDriver driver = DriverFactory.getDriver();
        System.out.println("URL from properties: " +
                DriverFactory.getProperties().getProperty("url"));
        driver.get(DriverFactory.getProperties().getProperty("url"));

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

