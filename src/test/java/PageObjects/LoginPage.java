package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    // Locators for the elements on the login page
    private By emailField = By.id("input-email");
    private By passwordField = By.id("input-password");
    private By loginButton = By.cssSelector("input[type='submit']");
    private By errorMessage = By.cssSelector(".alert.alert-danger");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions

    // Set email in the email input field
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    // Set password in the password input field
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    // Click on the login button
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    // Get the error message
    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }

    // Method to perform login
    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }
}

