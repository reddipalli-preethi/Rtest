package testng_code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("First test case");
  }
  @Test
  public void f1() {
	  System.out.println("Second test case");
  }
  @Test
  public void f2() {
	  System.out.println("Third test case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test case before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Test case After method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("test case before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("test case After test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("test case before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("test case After suite");
  }

}
