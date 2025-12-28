package Utilities;

import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {
 private static Helper Helper;    
    private static WebDriver driver ;
    public final static int TIMEOUT = 2;
     
    public Helper() {
       // WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
     }
    public static void openPage(String url) {
        driver.get(url);
    }
    public static String getTitle() {
        return driver.getTitle();
    }
    public static void NavBack() {
     driver.navigate().back();
    }
    public static WebDriver getDriver() {
        return driver;
    }
    @Before
    public static void setUpDriver() {
        if (Helper==null) {
            Helper = new Helper();
        }
    }
    
    
     public static void tearDown() {
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
         Helper = null;
     }
     
   @After
 	public void tearDown(Scenario scenario) {
 		System.out.println("after scenario working");
 		String scenarioName = scenario.getName().replaceAll(" ","_");
 		if(scenario.isFailed()) {
 			
 			byte[] srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
 			scenario.attach(srcScreenshot,"image/png", scenarioName);
 		}		
 		//driver.quit();		
 	}
}