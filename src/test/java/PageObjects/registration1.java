package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class registration1 {

    // Web elements for the form fields
    @FindBy(id = "input-firstname")
    WebElement firstName;

    @FindBy(id = "input-lastname")
    WebElement lastName;

    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(id = "input-telephone")
    WebElement telephone;

    @FindBy(id = "input-password")
    WebElement password;

    @FindBy(id = "input-confirm")
    WebElement confirmPassword;

    @FindBy(name = "newsletter")
    WebElement newsletterYes;

    @FindBy(name = "newsletter")
    WebElement newsletterNo;

    @FindBy(name = "agree")
    WebElement agreeCheckbox;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    // Constructor to initialize the PageFactory
    public registration1(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Actions/Methods for the form fields
    public void enterFirstName(String fName) {
        firstName.sendKeys(fName);
    }

    public void enterLastName(String lName) {
        lastName.sendKeys(lName);
    }

    public void enterEmail(String emailId) {
        email.sendKeys(emailId);
    }

    public void enterTelephone(String phone) {
        telephone.sendKeys(phone);
    }

    public void enterPassword(String pwd) {
        password.sendKeys(pwd);
    }

    public void confirmPassword(String pwd) {
        confirmPassword.sendKeys(pwd);
    }

    public void selectNewsletterYes() {
        newsletterYes.click();
    }

    public void selectNewsletterNo() {
        newsletterNo.click();
    }

    public void agreeToPrivacyPolicy() {
        agreeCheckbox.click();
    }

    public void clickContinue() {
        continueButton.click();
    }
}

