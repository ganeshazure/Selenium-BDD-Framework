package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BaseClass {
	public static WebDriver driver = null;
	public static String getScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
		
		File destination=new File(path);
		
		try 
		{
			FileUtils.copyFile(src, destination);
		} catch (IOException e) 
		{
			System.out.println("Capture Failed "+e.getMessage());
		}
		return path;
	}
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
			return driver;
		
		//return path has updated;
	}
		public void test()
		{
			System.out.println("testing");
		}

}