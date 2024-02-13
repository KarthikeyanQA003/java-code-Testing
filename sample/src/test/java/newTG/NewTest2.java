package newTG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.google.co.in/");
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Integrass\\eclipse-workspace\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
