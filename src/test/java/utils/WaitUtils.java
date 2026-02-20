package utils;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {
	

    private static final int DEFAULT_WAIT = 10;

    // 🔹 Core WebDriverWait
    private static WebDriverWait getWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT));
    }

    // 🔹 Visibility
    public static WebElement waitForVisibility(WebDriver driver, WebElement element) {
        return getWait(driver).until(ExpectedConditions.visibilityOf(element));
    }

    // 🔹 Clickable
    public static WebElement waitForClickable(WebDriver driver, WebElement element) {
        return getWait(driver).until(ExpectedConditions.elementToBeClickable(element));
    }

    // 🔹 Presence (DOM only)
    public static WebElement waitForPresence(WebDriver driver, org.openqa.selenium.By locator) {
        return getWait(driver).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // 🔹 Invisibility
    public static boolean waitForInvisibility(WebDriver driver, WebElement element) {
        return getWait(driver).until(ExpectedConditions.invisibilityOf(element));
    }

    // 🔹 Alert present
    public static Alert waitForAlert(WebDriver driver) {
        return getWait(driver).until(ExpectedConditions.alertIsPresent());
    }

    // 🔹 Title contains
    public static boolean waitForTitleContains(WebDriver driver, String title) {
        return getWait(driver).until(ExpectedConditions.titleContains(title));
    }

    // 🔹 URL contains
    public static boolean waitForUrlContains(WebDriver driver, String fraction) {
        return getWait(driver).until(ExpectedConditions.urlContains(fraction));
    }

    // 🔹 Frame available
    public static void waitForFrameAndSwitch(WebDriver driver, WebElement frameElement) {
        getWait(driver).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
    }

    // 🔹 Multiple elements
    public static List<WebElement> waitForAllElementsVisible(WebDriver driver, List<WebElement> elements) {
        return getWait(driver).until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    // 🔹 Custom timeout (flexible)
    public static WebElement waitForVisibility(WebDriver driver, WebElement element, int timeout) {
        return new WebDriverWait(driver, Duration.ofSeconds(timeout))
                .until(ExpectedConditions.visibilityOf(element));
    }
}

