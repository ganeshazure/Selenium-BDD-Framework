package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tloginpage {
	
	WebDriver driver;
	public Tloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By emailfield = By.id("input-email");
	private By passwordfield = By.id("input-password");
	private By loginbutton = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
	
	public void enteremail()
	{
		driver.findElement(emailfield).sendKeys("ganesh@gmail.com");
	}
	public void enterpassword()
	{
		driver.findElement(passwordfield).sendKeys("ganesh@gmail");
	}
	public void clickonloginbutton()
	{
		driver.findElement(loginbutton).click();
	}

}
