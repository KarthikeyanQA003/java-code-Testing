package TestNg;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	
  @Test
  public void test() {
	  System.out.println("I Am Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I Am  before Mtheod");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I Am after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("I Am  before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("I Am after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("I Am before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("I Am  after Test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("I  Am before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("I Am After suite ");
  }

}
