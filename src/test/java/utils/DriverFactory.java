package utils;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverFactory {

    private static WebDriver driver;
    private static Properties prop;

    public static void initDriver() {

        if (driver == null) {

            prop = ConfigReader.intializeProperties();
            String browser = prop.getProperty("browser");

            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    driver = new FirefoxDriver();
                    break;

                case "edge":
                    driver = new EdgeDriver();
                    break;

                default:
                    throw new RuntimeException("Invalid browser: " + browser);
            }

            driver.manage().window().maximize();
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
}
