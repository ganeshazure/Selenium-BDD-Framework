package PageObjects;


 
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.support.CacheLookup;
 import org.openqa.selenium.support.FindBy;
 import org.openqa.selenium.support.PageFactory;

 import StepDefinitions.BaseClass;

 public class login extends BaseClass {
	 WebDriver driver;
  public login (WebDriver driver)
  {
	  this.driver = driver;
		PageFactory.initElements(driver,this);
  }
  
  @FindBy(xpath="//input[@id='input-em']")
  @CacheLookup
  WebElement inputUsername;
  
  //driver.findelemet(By.id("shhbj")).click();
  
  @FindBy(xpath ="//input[@id='input-password']")
  @CacheLookup
  WebElement inputPassword;
  
  
  
  @FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")
  @CacheLookup
  WebElement btnLogin; 
  

  
    
  public void SetUserName(String uName) {
	  //driver.findelemet(By.id("shhbj")).click();
	  
   inputUsername.sendKeys(uName);
  }
  
   
  public void SetPassword(String pwd) {
   //inputPassword.clear();
   inputPassword.sendKeys(pwd);
  }  
  
  public void ClickBtnLogin() {
   btnLogin.click();
  }
  
    
  
  
  
}