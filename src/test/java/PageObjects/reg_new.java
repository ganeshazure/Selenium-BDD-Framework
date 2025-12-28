package PageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import java.util.List;
import java.util.Map;

public class reg_new {

    WebDriver driver;

    @FindBy(id = "input-firstname") WebElement firstName;
    @FindBy(id = "input-lastname") WebElement lastName;
    @FindBy(id = "input-email") WebElement email;
    @FindBy(id = "input-telephone") WebElement telephone;
    @FindBy(id = "input-password") WebElement password;
    @FindBy(id = "input-confirm") WebElement confirmPassword;
    @FindBy(xpath = "//input[@name='newsletter'][@value='1']") WebElement subscribeYes;
    @FindBy(xpath = "//input[@name='newsletter'][@value='0']") WebElement subscribeNo;
    @FindBy(name = "agree") WebElement agreeCheckbox;
    @FindBy(css = "input[type='submit']") WebElement continueBtn;

    public reg_new(WebDriver driver) {
    	System.out.println("testing started11");
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterDetailsList(List<String> data) {
        firstName.sendKeys(data.get(0));
        lastName.sendKeys(data.get(1));
        email.sendKeys(data.get(2));
        telephone.sendKeys(data.get(3));
        password.sendKeys(data.get(4));
        confirmPassword.sendKeys(data.get(5));
    }

    public void enterDetailsMap(Map<String, String> data) {
        firstName.sendKeys(data.get("FirstName"));
        lastName.sendKeys(data.get("LastName"));
        email.sendKeys(data.get("Email"));
        telephone.sendKeys(data.get("Telephone"));
        password.sendKeys(data.get("Password"));
        confirmPassword.sendKeys(data.get("Confirm"));
    }

    public void selectSubscribe(String option) {
        if (option.equalsIgnoreCase("Yes"))
            subscribeYes.click();
        else
            subscribeNo.click();
    }

    public void agreePolicy() {
        if (!agreeCheckbox.isSelected()) agreeCheckbox.click();
    }

    public void clickContinue() {
        continueBtn.click();
    }
}
