package utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    private static WebDriver driver;
    private static Properties prop;

    public static void initDriver() {

        if (driver == null) {

            prop = ConfigReader.initializeProperties();

            String browser = prop.getProperty("browser");

            switch (browser.toLowerCase()) {

            case "chrome":

                ChromeOptions options = new ChromeOptions();

                options.addArguments("--headless=new");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--disable-gpu");

                driver = new ChromeDriver(options);
//comment
                break;

            case "firefox":

                driver = new FirefoxDriver();

                break;

            case "edge":

                driver = new EdgeDriver();

                break;

            default:

                throw new RuntimeException(
                    "Invalid browser: " + browser
                );
            }

            //driver.manage().window().maximize();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quitDriver() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public static Properties getProperties() {
        return prop;
    }
}