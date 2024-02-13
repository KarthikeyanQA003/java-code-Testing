package AFP_Registration_Player;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

public class player {
	WebDriver driver;
	String Email=("admin@integrass.com");
	String Password=("Admin2@2!");
	String Search=("HS00002787");
	String SearchName=("A'Naisha Crawford");
	String Searchemail=("zyriapalmer17@gmail.com");
	String Searchgender=("Male");
	String FirstName=("Pasquale");
	String LastName=("Koelpin");
	String DOB =("24/03/2008");
	String JerseyNumber =("2");
	String MailingAddress=("137 Montana Via");
	String city=("West Westleyshire");
	String PostalCode=("71385-0");
	String StartDate=("09/12/2022");
	String ExpirationDate=("09/12/2024");
	String ParentFirstName=("Sylvester");
	String ParentLastName=("Pouros");
	String CountrycodewithMobile=("+1 3124724164");

	@BeforeClass
	public void openCrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(options);
	//	WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
// Launch Website
		driver.get("https://alliance-devportal.isportz.co/login");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Integrass\\eclipse-workspace\\driver\\src\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://alliance-devportal.isportz.co/login");
	}
	@Test(priority = 1)
	public void login() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		PageFactory.initElements(driver,PlayerTest.class);
		PlayerTest.Email.sendKeys(Email);
		PlayerTest.password.sendKeys(Password);
		PlayerTest.login.click();
		Thread.sleep(2000);
		PlayerTest.registration.click();
		Thread.sleep(2000);

		PlayerTest.player.click();

		Thread.sleep(3000);
		PlayerTest.Showentries.click();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(2000);
		PlayerTest.search.sendKeys(Search);
		Thread.sleep(3000);
		PlayerTest.search.clear();
		Thread.sleep(3000);
		PlayerTest.search.sendKeys(SearchName);
		PlayerTest.search.clear();
		Thread.sleep(3000);
		PlayerTest.search.sendKeys(Searchemail);
		Thread.sleep(5000);
		PlayerTest.maximize.click();

	}
	@Test(priority = 2)
	public void PlayerInformation_Edit() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		PlayerTest.Eye.click();
		Thread.sleep(4000);
		PlayerTest.PlayerInformation_Edit.click();
		Thread.sleep(4000);
		PlayerTest.FirstName.clear();
		PlayerTest.FirstName.sendKeys(FirstName);
		PlayerTest.lastname.clear();
		PlayerTest.lastname.sendKeys(LastName);
		Thread.sleep(7000);
		PlayerTest.dop.click();
		Thread.sleep(4000);
		PlayerTest.dop.clear();
		PlayerTest.dop.sendKeys(DOB+Keys.ENTER);
		PlayerTest.GraduationYear.click();
		Select drop=new Select(PlayerTest.GraduationYear);
		drop.selectByValue("2024");
		PlayerTest.jerseynumber.clear();
		PlayerTest.jerseynumber.sendKeys(JerseyNumber);
		Thread.sleep(4000);
		PlayerTest.PrimaryPosition.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		//Select drop1=new Select(PlayerTest.GraduationYear);
		//drop1.selectByIndex(3);
		Thread.sleep(3000);
		PlayerTest.Throws.click();
		Thread.sleep(3000);
		PlayerTest.Bats.click();
		//PlayerTest.update.click();
		PlayerTest.cancel.click();
	}
	@Test(priority =3)
	public void AddressInformation_edit() throws InterruptedException {
		Thread.sleep(4000);
		PlayerTest.AddressInformation_edit.click();
		PlayerTest.MailingAddress.clear();
		PlayerTest.MailingAddress.sendKeys(MailingAddress);
		PlayerTest.Country.click();
		Select drop=new Select(PlayerTest.Country);
		drop.selectByIndex(2);
		PlayerTest.City.sendKeys(city);;
		PlayerTest.state.click();
		Select drop1=new Select(PlayerTest.state);
		drop1.selectByIndex(2);
		PlayerTest.PostalCode.clear();
		PlayerTest.PostalCode.sendKeys(PostalCode);
		PlayerTest.cancel2.click();
		//PlayerTest.update2.click();
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,500)");
	}
	@Test(priority = 4)
	public void MembershipInformation_Edit() throws InterruptedException, AWTException {
		Thread.sleep(4000);
		PlayerTest.MembershipInformation_Edit.click();
		PlayerTest.MembershipStatus.click();
		// Select drop=new Select(PlayerTest.MembershipStatus);
		//drop.selectByIndex(1);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		PlayerTest.StartDate.click();
		Thread.sleep(3000);
		PlayerTest.month.click();
		Select drop=new Select(PlayerTest.month);
		drop.selectByIndex(2);
		PlayerTest.year.click();
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_UP);
        robot.keyPress(KeyEvent.VK_ENTER);
		PlayerTest.selectdate.click();

		//PlayerTest.StartDate.sendKeys(StartDate+Keys.ENTER);
		/*
		 * WebDriverWait ExpirationDate = new WebDriverWait(driver,
		 * Duration.ofSeconds(10));
		 * ExpirationDate.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "/html/body/div[2]/div[1]/div/div/div/form/div[2]/div[2]/div/div/button")));
		 * Thread.sleep(3000); driver.findElement(By.xpath(
		 * "/html/body/div[2]/div[1]/div/div/div/form/div[2]/div[2]/div/div/button")).
		 * click();
		 */
		Thread.sleep(3000);
		PlayerTest.ExpirationDate.click(); 
		/*
		 * Robot robot2 = new Robot(); robot2.keyPress(KeyEvent.VK_TAB);
		 * robot2.keyPress(KeyEvent.VK_ENTER); robot2.keyPress(KeyEvent.VK_ENTER);
		 */
		//PlayerTest.close.click();
		Thread.sleep(3000);
		PlayerTest.Exmonth.click();
		Robot robot2= new Robot();
		robot2.keyPress(KeyEvent.VK_DOWN);
		robot2.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
		PlayerTest.Exyear.click();
		Select drop2=new Select(PlayerTest.Exyear);
		drop2.selectByIndex(0);
		PlayerTest.Exyear.click();
		PlayerTest.selectexDate.click();

		//PlayerTest.ExpirationDate.sendKeys("09/12/2024");
		PlayerTest.cancel3.click();
		//PlayerTest.update3.click();
		
		
	}
	@Test(priority = 5)
	//Contact Information-edit
	public void ContactInformation_edit() throws InterruptedException {
		PlayerTest.ContactInformation_edit.click();
		PlayerTest.ParentFirstName.sendKeys(ParentFirstName);
		PlayerTest.ParentLastName.sendKeys(ParentLastName);
		Thread.sleep(3000);
		PlayerTest.CountrycodewithMobile.clear();
		PlayerTest.CountrycodewithMobile.sendKeys(CountrycodewithMobile);

		PlayerTest.cancel4.click();
		//PlayerTest.update4.click();
		driver.navigate().back();
		PlayerTest.search.clear();
		driver.navigate().refresh();
		Thread.sleep(5000);
		PlayerTest.minimize2.click();
		Thread.sleep(3000);
		PlayerTest.deleteicone.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		//alert.accept();
		
	}
	@AfterClass
	public void closedrive() {
		driver.close();
		
	}







	}



