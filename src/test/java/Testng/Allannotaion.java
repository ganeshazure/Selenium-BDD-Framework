package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Allannotaion {
  @Test
  public void f() {
	  System.out.println("this is testmethod");
  }
  @Test
  public void f1() {
	  System.out.println("this is testmethod1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is @BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is @afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is @Beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is @Afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is @Beforertest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is @Aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is @Beforesuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is @Afetrsuite");
  }

}
