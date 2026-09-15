package PageObjects;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Reg_with_json {

    WebDriver driver;

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
            By.xpath("//input[@name='newsletter' and @value='1']");

    private By newsletterNo =
            By.xpath("//input[@name='newsletter' and @value='0']");

    private By privacyPolicy =
            By.name("agree");

    private By continueBtn =
            By.cssSelector("input.btn.btn-primary");


    // Constructor
    public Reg_with_json(WebDriver driver) {
        this.driver = driver;
    }


    // Enter registration data from JSON
    public void enterRegistrationData(Map<String, String> data) {

        driver.findElement(firstName)
              .sendKeys(data.get("FirstName"));

        driver.findElement(lastName)
              .sendKeys(data.get("LastName"));

        driver.findElement(email)
              .sendKeys(data.get("Email"));

        driver.findElement(telephone)
              .sendKeys(data.get("Telephone"));

        driver.findElement(password)
              .sendKeys(data.get("Password"));

        driver.findElement(confirmPassword)
              .sendKeys(data.get("PasswordConfirm"));


        // Newsletter selection
        String newsletter = data.get("Newsletter");

        if ("Yes".equalsIgnoreCase(newsletter)) {

            driver.findElement(newsletterYes).click();

        } else {

            driver.findElement(newsletterNo).click();
        }
    }


    // Agree to Privacy Policy
    public void agreePrivacyPolicy() {

        if (!driver.findElement(privacyPolicy).isSelected()) {

            driver.findElement(privacyPolicy).click();
        }
    }


    // Click Continue
    public void clickContinue() {

        driver.findElement(continueBtn).click();
    }
}
