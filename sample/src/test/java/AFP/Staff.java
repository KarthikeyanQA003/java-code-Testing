package AFP;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

public class Staff {
	WebDriver driver;
	String Email=("admin@integrass.com");
	String Password=("Admin2@2!");
	String Searchid=("ZZ00002730");
	String SearchName=("Juan Pettiford");
	String Searchtemail=("09stlchaos@gmail.com");
	String Searchgender=("Male");
	
	
	
	
	
	@BeforeClass
	public void openCrome() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Integrass\\eclipse-workspace\\driver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://alliance-devportal.isportz.co/login");
	}
	@Test(priority = 1)
	public void staffmenu() throws InterruptedException, AWTException {
		PageFactory.initElements(driver,staffx.class);
		staffx.Email.sendKeys(Email);
		staffx.password.sendKeys(Password);
		staffx.login.click();
		Thread.sleep(3000);
		staffx.registration.click();
		Thread.sleep(4000);
		staffx.staff.click();
        staffx.Showentries.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(15000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(3000);

		staffx.search.sendKeys(Searchid);
		Thread.sleep(3000);
		staffx.search.clear();
		Thread.sleep(3000);
		staffx.search.sendKeys(SearchName);
		staffx.search.clear();
		Thread.sleep(3000);
		staffx.search.sendKeys(Searchtemail);
		Thread.sleep(3000);
		staffx.search.sendKeys(Searchgender);
		staffx.search.clear();
		driver.navigate().refresh();
		Thread.sleep(7000);
		staffx.maximize.click();

	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}


}