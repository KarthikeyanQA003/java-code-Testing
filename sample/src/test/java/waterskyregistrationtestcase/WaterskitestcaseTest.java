package waterskyregistrationtestcase;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import waterskiregistrationpageobject.PageobjectWaterskixpath;


public class WaterskitestcaseTest {
	WebDriver driver;
	String[] names = { "John", "Jane", "Jim", "Jessica", "Jake", "Joan" };
	String[] secondname = { "Liam", "Olivia", "Noah", "Emma", "Jessica", "Elijah", "Amelia" };
	// Choose a random name from the list
	Random random = new Random();
	int index = random.nextInt(names.length);
	String FirstName = names[index];

	
  @Test(priority = 0)
  public void login() throws InterruptedException {
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver(options);


		driver.manage().window().maximize();
		driver.get("https://devportal.integrasssports.com/memberregistration");
		Thread.sleep(3000);
  }
        
  
  @Test(priority = 1)
	private void personal_information() throws InterruptedException {
		Thread.sleep(3000);
		PageFactory.initElements(driver, PageobjectWaterskixpath.class);

		PageobjectWaterskixpath.individualactive.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1000)");
		Thread.sleep(3000);
		PageobjectWaterskixpath.next.click();
		Thread.sleep(3000);
		PageobjectWaterskixpath.firstname.sendKeys(FirstName);
		PageobjectWaterskixpath.lastname.sendKeys("Feil");
		Thread.sleep(3000);
		WebElement dropdown = driver.findElement(By.xpath("//span[@role='combobox']"));
		Thread.sleep(3000);
		dropdown.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0, 200)");
		PageobjectWaterskixpath.Dob.click();
		PageobjectWaterskixpath.Dob.sendKeys("02/01/1974" + Keys.ENTER);
		
		
		PageobjectWaterskixpath.gender.click();
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0, 200)");
		PageobjectWaterskixpath.next1.click();
		Thread.sleep(2000);
  }
  @Test(priority = 2)
	private void contact_information() throws InterruptedException {

	  PageobjectWaterskixpath.email.sendKeys("your.emailfakedata89608@gmail.com");
	  PageobjectWaterskixpath.retypemail.sendKeys("your.emailfakedata89608@gmail.com");
	  PageobjectWaterskixpath.mallingaddress.sendKeys("5285 Roberts Mews");
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0, 200)");
		PageobjectWaterskixpath.country.click();
		PageobjectWaterskixpath.country.sendKeys(Keys.ENTER);
		PageobjectWaterskixpath.city.sendKeys("Lake Ocie");
		 Thread.sleep(3000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		PageobjectWaterskixpath.state.sendKeys("New Jersey");
		PageobjectWaterskixpath.postalcode.sendKeys("07877");
		PageobjectWaterskixpath.countrycode.sendKeys("+1 351 951 8984");
		PageobjectWaterskixpath.countrycodemobilenumber.sendKeys("+1 281 207 3442");
		PageobjectWaterskixpath.next2.click();
		Thread.sleep(2000);

	}
	@Test(priority = 3)
	public void genral_information() throws InterruptedException {

		PageobjectWaterskixpath.SafeSportTrained.click();
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0, 600)");
		Thread.sleep(2000);
		PageobjectWaterskixpath.chooice1.click();
		Thread.sleep(2000);
		PageobjectWaterskixpath.chooice1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		PageobjectWaterskixpath.chooice2.click();
		Thread.sleep(2000);
		PageobjectWaterskixpath.chooice2.sendKeys(Keys.ENTER);
		PageobjectWaterskixpath.next4.click();
		
	}
  
}
