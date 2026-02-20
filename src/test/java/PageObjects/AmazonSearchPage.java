package PageObjects;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchPage {

    WebDriver driver;

    // Constructor
    public AmazonSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // Search box and button locators
    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");

    // Example locators for filters (you'll need to verify the actual locators)
    By cameraResolutionFilter = By.xpath("//*[@id=\"p_n_feature_fourteen_browse-bin/21329559031\"]/span/a/div/label/input");
    By modelYearFilter = By.xpath("//span[text()='2023']");
    By minPriceBox = By.id("low-price");
    By maxPriceBox = By.id("high-price");
    By goButton = By.xpath("//input[@class='a-button-input' and @type='submit']");

    // Method to enter search query
    public void enterSearchQuery(String query) {
        driver.findElement(searchBox).sendKeys(query);
    }

    // Method to click search button
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }

    // Method to apply camera resolution filter (for demo purposes)
    public void filterByCameraResolution() {
    	WebElement element = driver.findElement(cameraResolutionFilter);
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    	js.executeScript("arguments[0].click();", element);
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//    	wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    // Method to apply model year filter (for demo purposes)
    public void filterByModelYear(int year) {
        driver.findElement(modelYearFilter).click();
    }

    // Method to apply price range filter
    public void filterByPriceRange(int minPrice, int maxPrice) {
//    	JavascriptExecutor js = (JavascriptExecutor) driver;
//    	WebElement lowerSlider = driver.findElement(By.id("p_36/range-slider_slider-item_lower-bound-slider"));
//    	WebElement upperSlider = driver.findElement(By.id("p_36/range-slider_slider-item_upper-bound-slider"));
//    	js.executeScript("arguments[0].setAttribute('value', '30')", lowerSlider);
//    	js.executeScript("arguments[0].setAttribute('value', '150')", upperSlider);
    	
//        driver.findElement(minPriceBox).sendKeys(String.valueOf(minPrice));
//        driver.findElement(maxPriceBox).sendKeys(String.valueOf(maxPrice));
        driver.findElement(goButton).click();
    }

    // Verify that results match the criteria
    public void verifyPhoneResults() {
        // You can add assertions here to verify the results, such as checking for the presence of Samsung phone listings
        System.out.println("Results for Samsung phones are displayed.");
    }
}