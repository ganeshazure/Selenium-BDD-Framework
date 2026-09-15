package Testng;

import org.testng.annotations.Test;

public class Newtestngclass2 {
  @Test(groups="smoke")
  public void f() {
	  System.out.println("this is f method from secong class");
  }
  @Test(groups="smoke")
  public void f1() {
	  System.out.println("this is f1 method from secong class");
  }
  @Test(groups="reg")
  public void f2() {
	  System.out.println("this is f2 method from secong class");
  }
  
}
