package TestNg;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class suiteTest {
	WebDriver driver;
	long startTime;
	long endTime;

  @BeforeSuite
  public void launchBrowser() {
	  startTime=System.currentTimeMillis();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Integrass\\eclipse-workspace\\chrome\\src\\chrome");
	  driver = new ChromeDriver();
  }
  @Test
  public void openGoole() {
	  driver.get("https://www.google.co.in/");
  }
  @Test
  public void openBing() {
	  driver.get("https://ping.com/en-us/");
  }
  @Test
  public void openyoutube() {
	  driver.get("https://www.youtube.com");
  }
  
  
  @AfterSuite
  public void CloseBrowser() {
	  driver.quit();
	  endTime=System.currentTimeMillis();
	  long totalTime=endTime-startTime;
	  System.out.println("Total time Taken"+totalTime);
  }
  

}
