package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.WaitUtils;

public class DynamicPage_NoAjax {

    WebDriver driver;

    @FindBy(id = "btn1")
    WebElement addTextbox1Btn;

    @FindBy(id = "txt")   // ❌ Element NOT present initially
    WebElement textbox1;

    public DynamicPage_NoAjax(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // ❌ normal PageFactory
    }

    public void clickAddTextbox() {
        addTextbox1Btn.click();
    }

    public void enterText() {
        WaitUtils.waitForVisibility(driver, textbox1);
        textbox1.sendKeys("Ganesh");
    }
}

