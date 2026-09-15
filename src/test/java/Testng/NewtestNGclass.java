package Testng;

import org.testng.annotations.Test;

public class NewtestNGclass {
	
  @Test(priority=1)
	  public void reg() {
		  System.out.println("registration");
	  }
	
  @Test(priority=2)
  public void login() {
	  System.out.println("login method");
  }
  @Test(groups="reg")
  public void logout() {
	  System.out.println("logout method");
  }
}
