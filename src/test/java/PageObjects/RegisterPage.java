package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "input-firstname") WebElement firstName;
    @FindBy(id = "input-lastname") WebElement lastName;
    @FindBy(id = "input-email") WebElement email;
    @FindBy(id = "input-telephone") WebElement telephone;
    @FindBy(id = "input-password") WebElement password;
    @FindBy(id = "input-confirm") WebElement confirmPassword;
    @FindBy(xpath = "//input[@name='newsletter' and @value='1']") WebElement subscribeYes;
    @FindBy(name = "agree") WebElement privacyPolicy;
    @FindBy(css = "input.btn.btn-primary") WebElement continueBtn;

    // Actions
    public void fillPersonalDetails(String fname, String lname, String emailText, String phone, String pass) {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        email.sendKeys(emailText);
        telephone.sendKeys(phone);
        password.sendKeys(pass);
        confirmPassword.sendKeys(pass);
        subscribeYes.click();
    }

    public void agreePrivacyPolicy() {
        privacyPolicy.click();
    }

    public void clickContinue() {
        continueBtn.click();
    }
}

