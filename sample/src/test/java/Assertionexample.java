import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Assertionexample {
	/*String name="karthik";
	boolean value=false;
  @Test
  public void f() {
	  Assert.assertEquals(name, "karthik");
	
	  Assert.assertFalse(value,"this is true");*/

	     
		WebDriver driver;
		@BeforeTest
		public void SetDriver(){
		 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Integrass\\eclipse-workspace\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		}
		 
		@Test
		public void verifyTitle()
		{
		driver.get("https://www.google.co.in/");
		String ActualTitle=null;
		String ExpectedTitle ="Google";
			
		Assert.assertNull(ActualTitle, ExpectedTitle);
		System.out.println("Assert passed");
		 
		}
		 
		@AfterTest
		public void closedriver(){
		driver.close();
		 
		}
}
 


