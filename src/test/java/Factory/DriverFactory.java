package Factory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//import utils.CommonUtils;

public class DriverFactory {
	
	static WebDriver driver = null;
	
	public static WebDriver initializeBrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			//System.setProperty("webdriver.geco.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Tester\\Drivers\\geckodriver.exe");
		        driver = new ChromeDriver();
			
		}else if(browserName.equals("firefox")) {	
			//System.setProperty("webdriver.geco.driver","C:\\Users\\LENOVO\\eclipse-workspace\\Tester\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}else if(browserName.equals("edge")) {
			
			driver = new EdgeDriver();
			
		}else if(browserName.equals("safari")) {
			driver = new SafariDriver();
			
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(0, null)
		//driver.manage().timeouts().pageLoadTimeout(CommonUtils.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	public static WebDriver getDriver() {		
		return driver;
		
	}

}
