package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.testng.Assert;
import utils.DriverFactory;

public class LoginSteps {

    @Given("User launches the SauceDemo application")
    public void launchApplication() {

        DriverFactory.getDriver()
                .get("https://www.saucedemo.com/");
    }

    @When("User enters username {string}")
    public void enterUsername(String username) {

        DriverFactory.getDriver()
                .findElement(org.openqa.selenium.By.id("user-name"))
                .sendKeys(username);
    }

    @When("User enters password {string}")
    public void enterPassword(String password) {

        DriverFactory.getDriver()
                .findElement(org.openqa.selenium.By.id("password"))
                .sendKeys(password);
    }

    @When("User clicks on Login button")
    public void clickLogin() {

        DriverFactory.getDriver()
                .findElement(org.openqa.selenium.By.id("login-button"))
                .click();
    }

    @Then("User should see the Products page")
    public void verifyProductsPage() {

        String title = DriverFactory.getDriver()
                .findElement(org.openqa.selenium.By.className("title"))
                .getText();

        Assert.assertEquals(title, "Products");
    }
    @When("User adds {string} to the cart")
    public void addProductToCart(String productName) {

        if (productName.equals("Sauce Labs Backpack")) {

            DriverFactory.getDriver()
                    .findElement(By.id("add-to-cart-sauce-labs-backpack"))
                    .click();
        }
    }

    @Then("Cart should display {string} item")
    public void verifyCartItem(String expectedCount) {

        String actualCount = DriverFactory.getDriver()
                .findElement(By.className("shopping_cart_badge"))
                .getText();

        Assert.assertEquals(actualCount, expectedCount);
    }
}