package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registration {
    WebDriver driver;

    // Constructor
    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    // Locators for form elements
    private By firstName = By.id("input-firstname");
    private By lastName = By.id("input-lastname");
    private By email = By.id("input-email");
    private By telephone = By.id("input-telephone");
    private By password = By.id("input-password");
    private By confirmPassword = By.id("input-confirm");
    private By newsletterYes = By.xpath("//input[@name='newsletter' and @value='1']");
    private By newsletterNo = By.xpath("//input[@name='newsletter' and @value='0']");
    private By submitButton = By.id("submit-button-id"); // Replace with the actual ID of your submit button

    // Methods to interact with form elements
    public void enterFirstName(String firstNameValue) {
        driver.findElement(firstName).sendKeys(firstNameValue);
    }

    public void enterLastName(String lastNameValue) {
        driver.findElement(lastName).sendKeys(lastNameValue);
    }

    public void enterEmail(String emailValue) {
        driver.findElement(email).sendKeys(emailValue);
    }

    public void enterTelephone(String telephoneValue) {
        driver.findElement(telephone).sendKeys(telephoneValue);
    }

    public void enterPassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
    }

    public void enterConfirmPassword(String confirmPasswordValue) {
        driver.findElement(confirmPassword).sendKeys(confirmPasswordValue);
    }

    public void selectNewsletterOption(String option) {
        if (option.equalsIgnoreCase("Yes")) {
            driver.findElement(newsletterYes).click();
        } else {
            driver.findElement(newsletterNo).click();
        }
    }

    public void submitForm() {
        driver.findElement(submitButton).click();
    }
}
