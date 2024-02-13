package AFP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Registration_teamS {
	WebDriver driver;
	String Email=("admin@integrass.com");
	String Password=("Admin2@2!");
	String Searchid=("AA00000764");
	String SearchName=("Marcus");
	String Searchteamname=("Clutch Up Softball Academy 14u");
	String Searchdivision=("14U");
	String TeamName=("Dortha Gerhold");
	String email=("gsghhrh47067@gmail.com");
	String RetypeEmail=("gsghhrh47067@gmail.com");
	String CountrycodewithMobile=("+1 669 407 5549");
	String MailingAddress=("931 Anahi Orchard");
	String City=("South Joelton");
	String PostalCode=("06756");
	
	

	@BeforeClass
	public void openCrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
	//	WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://alliance-devportal.isportz.co/login");
	}
	@Test(priority = 1)
	public void team() throws InterruptedException, AWTException {
		PageFactory.initElements(driver,TeamX.class);
		TeamX.Email.sendKeys(Email);
		TeamX.password.sendKeys(Password);
		TeamX.login.click();
		Thread.sleep(3000);
		TeamX.registration.click();
		Thread.sleep(3000);
		TeamX.teammenu.click();
		TeamX.Showentries.click();
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

		TeamX.search.sendKeys(Searchid);
		Thread.sleep(3000);
		TeamX.search.clear();
		Thread.sleep(3000);
		TeamX.search.sendKeys(SearchName);
		TeamX.search.clear();
		Thread.sleep(3000);
		TeamX.search.sendKeys(Searchteamname);
		Thread.sleep(3000);
		TeamX.search.sendKeys(Searchdivision);
		TeamX.search.clear();
		driver.navigate().refresh();
		Thread.sleep(7000);
		TeamX.maximize.click();
		Thread.sleep(6000);
		TeamX.Eye.click();
	}
	@Test(priority = 2)
	public void TeamInformation_edit() throws InterruptedException {
		Thread.sleep(5000);
		TeamX.edit.click();
		TeamX.TeamName.clear();
		TeamX.TeamName.sendKeys(TeamName);
		TeamX.AgeDivision.click();
		Select drop1=new Select(TeamX.AgeDivision);
		drop1.selectByIndex(3);
		Thread.sleep(5000);
		TeamX.cancel.click();
		//TeamX.update.click();
	}
@Test(priority = 3)
	public void Contact_Information() throws InterruptedException {
	Thread.sleep(3000);
		TeamX.Edit2.click();
		TeamX.email.clear();
		TeamX.email.sendKeys(email);
		TeamX.RetypeEmail.clear();
		TeamX.RetypeEmail.sendKeys(RetypeEmail);
		TeamX.CountrycodewithMobile.clear();
		TeamX.CountrycodewithMobile.sendKeys(CountrycodewithMobile);
		TeamX.MailingAddress.clear();
        TeamX.MailingAddress.sendKeys(MailingAddress);
        TeamX.City.sendKeys(City);
        TeamX.Country.click();
        Select drop1=new Select(TeamX.Country);
		drop1.selectByIndex(1);
		TeamX.State.click();
		Select drop2=new Select(TeamX.State);
		drop2.selectByIndex(5);
		TeamX.PostalCode.clear();
		TeamX.PostalCode.sendKeys(PostalCode);
		Thread.sleep(6000);
		TeamX.cancel2.click();
		Thread.sleep(3000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        //Membership History
		TeamX.Waiverdownloaded.click();
		Thread.sleep(3000);
		//TeamX.Receiptdownloaded.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(6000);
		TeamX.delete.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
	
	
}
}

