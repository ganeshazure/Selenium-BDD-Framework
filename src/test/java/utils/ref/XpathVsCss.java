package utils.ref;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathVsCss {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Sample page (you can replace with your own HTML file or test site)
        driver.get("file:///C:/Users/YourPath/sample.html");

        // ================================
        // 1. Simple Input (ID)
        // HTML: <input id="username" name="user">
        // ================================
        WebElement user1 = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement user2 = driver.findElement(By.cssSelector("input#username"));

        // ================================
        // 2. Button with text
        // HTML: <button class="login-btn">Login</button>
        // ================================
        WebElement btn1 = driver.findElement(By.xpath("//button[text()='Login']"));
        WebElement btn2 = driver.findElement(By.cssSelector("button.login-btn"));

        // ================================
        // 3. Nested element
        // HTML: <div id="form"><input name="email"></div>
        // ================================
        WebElement email1 = driver.findElement(By.xpath("//div[@id='form']//input[@name='email']"));
        WebElement email2 = driver.findElement(By.cssSelector("#form input[name='email']"));

        // ================================
        // 4. Multiple classes
        // HTML: <input class="input-field active">
        // ================================
        WebElement multi1 = driver.findElement(By.xpath("//input[contains(@class,'input-field')]"));
        WebElement multi2 = driver.findElement(By.cssSelector("input.input-field.active"));

        // ================================
        // 5. Parent relationship
        // HTML: <div><input id="email"></div>
        // ================================
        WebElement parent1 = driver.findElement(By.xpath("//input[@id='email']/parent::div"));
        WebElement parent2 = driver.findElement(By.cssSelector("#email")); // CSS can't go to parent

        // ================================
        // 6. Sibling
        // HTML: <label>Email</label><input name="email">
        // ================================
        WebElement sib1 = driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input"));
        WebElement sib2 = driver.findElement(By.cssSelector("label + input"));

        // ================================
        // 7. Dynamic ID
        // HTML: <input id="user_12345">
        // ================================
        WebElement dyn1 = driver.findElement(By.xpath("//input[contains(@id,'user_')]"));
        WebElement dyn2 = driver.findElement(By.cssSelector("input[id^='user_']"));

        // ================================
        // 8. Multiple same elements (INDEX - NOT STABLE)
        // HTML: 3 inputs with same name="user"
        // ================================
        WebElement indexXpath = driver.findElement(By.xpath("(//input[@name='user'])[2]"));
        WebElement indexCss = driver.findElement(By.cssSelector("input[name='user']:nth-of-type(2)"));

        // ================================
        // 9. Better alternative (ATTRIBUTE BASED - STABLE)
        // HTML: <input name="user" placeholder="Last Name">
        // ================================
        WebElement betterXpath = driver.findElement(
                By.xpath("//input[@name='user' and @placeholder='Last Name']")
        );

        WebElement betterCss = driver.findElement(
                By.cssSelector("input[name='user'][placeholder='Last Name']")
        );

        // ================================
        // 10. Hidden vs Visible
        // HTML: <input style="display:none"> + visible input
        // ================================
        WebElement visibleXpath = driver.findElement(
                By.xpath("//input[@name='email' and not(contains(@style,'display:none'))]")
        );

        WebElement visibleCss = driver.findElement(
                By.cssSelector("input[name='email']:not([style*='display:none'])")
        );

        // ================================
        // 11. Deep nested (avoid absolute XPath)
        // ================================
        WebElement goodXpath = driver.findElement(
                By.xpath("//div[@id='app']//input[@name='email']")
        );

        WebElement goodCss = driver.findElement(
                By.cssSelector("#app input[name='email']")
        );

        // ================================
        // 12. Partial text (XPath only)
        // ================================
        WebElement partialText = driver.findElement(
                By.xpath("//button[contains(text(),'Login')]")
        );

        // ================================
        // 13. Checkbox with label
        // ================================
        WebElement checkboxXpath = driver.findElement(
                By.xpath("//label[contains(text(),'Remember Me')]/input")
        );

        WebElement checkboxCss = driver.findElement(
                By.cssSelector("label input[type='checkbox']")
        );

        // ================================
        // FINAL NOTE:
        // Avoid index-based locators unless absolutely necessary
        // Prefer unique attributes, relationships, and stable locators
        // ================================

        driver.quit();
    }
}
