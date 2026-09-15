package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    private WebDriver driver;

    private final String REGISTER_URL =
            "https://tutorialsninja.com/demo/index.php?route=account/register";

    // Locators
    private By firstName =
            By.id("input-firstname");

    private By lastName =
            By.id("input-lastname");

    private By email =
            By.id("input-email");

    private By telephone =
            By.id("input-telephone");

    private By password =
            By.id("input-password");

    private By confirmPassword =
            By.id("input-confirm");

    private By newsletterYes =
            By.cssSelector("input[name='newsletter'][value='1']");

    private By newsletterNo =
            By.cssSelector("input[name='newsletter'][value='0']");

    private By privacyPolicy =
            By.cssSelector("input[name='agree']");

    private By continueButton =
            By.cssSelector("input[value='Continue']");

    // Validation messages
    private By firstNameError =
            By.cssSelector("#input-firstname + .text-danger");

    private By lastNameError =
            By.cssSelector("#input-lastname + .text-danger");

    private By emailError =
            By.cssSelector("#input-email + .text-danger");

    private By telephoneError =
            By.cssSelector("#input-telephone + .text-danger");

    private By passwordError =
            By.cssSelector("#input-password + .text-danger");

    private By confirmPasswordError =
            By.cssSelector("#input-confirm + .text-danger");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }


    public void openRegisterPage() {

        driver.get(REGISTER_URL);
    }


    public void enterFirstName(String value) {

        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(value);
    }


    public void enterLastName(String value) {

        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(value);
    }


    public void enterEmail(String value) {

        driver.findElement(email).clear();
        driver.findElement(email).sendKeys(value);
    }


    public void enterTelephone(String value) {

        driver.findElement(telephone).clear();
        driver.findElement(telephone).sendKeys(value);
    }


    public void enterPassword(String value) {

        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(value);
    }


    public void enterConfirmPassword(String value) {

        driver.findElement(confirmPassword).clear();
        driver.findElement(confirmPassword).sendKeys(value);
    }


    public void selectNewsletterYes() {

        driver.findElement(newsletterYes).click();
    }


    public void selectNewsletterNo() {

        driver.findElement(newsletterNo).click();
    }


    public void selectPrivacyPolicy() {

        if (!driver.findElement(privacyPolicy).isSelected()) {
            driver.findElement(privacyPolicy).click();
        }
    }


    public void clickContinue() {

        driver.findElement(continueButton).click();
    }


    public String getFirstNameError() {

        return driver.findElement(firstNameError).getText();
    }


    public String getLastNameError() {

        return driver.findElement(lastNameError).getText();
    }


    public String getEmailError() {

        return driver.findElement(emailError).getText();
    }


    public String getTelephoneError() {

        return driver.findElement(telephoneError).getText();
    }


    public String getPasswordError() {

        return driver.findElement(passwordError).getText();
    }


    public String getConfirmPasswordError() {

        return driver.findElement(confirmPasswordError).getText();
    }


    public boolean isPrivacyPolicySelected() {

        return driver.findElement(privacyPolicy).isSelected();
    }
}
