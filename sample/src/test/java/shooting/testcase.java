package shooting;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;	



import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testcase {
	WebDriver driver;
	String Select="Lifetime"; //1. Junior2. Adult 3.5 year4.Life time       
	String Title="Customer Optimization Liaison";
	String FirstName="Katherine";
	String LastName="Bernhard";
	String DateofBirth ="02/12/2000";//1.02/08/2008,1.23/3/2000
	String Email ="jhon7379@gmail.com";
	String RetypeEmail="jhon7379@gmail.com";
	String AddressLine1="51432 Donnelly Oval";
	String City ="Aracelychester";
	String State="Kentucky";
	String PostalCode ="03911";
	String CompanyName="Wiley Camp";
	String MobileNumber="+18143008966";
	String CardNumber ="4111 1111 1111 1111";
	String ExpiryMonth="02 / 25";
	String CVC="345";
	String NameonCard="Terrell";
	String Terms="kk";
	@BeforeTest
	public void oprncrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
	//	WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://alliance-devportal.isportz.co/memberregistration");
		//Assert.assertEquals("joinnow","joinnow" );
		//System.out.println("join passed");
	}
	@Test(priority = 1)
	public void select() throws InterruptedException {
		Thread.sleep(6000);
		switch (Select) {

		case "Junior":
		{
			WebElement Select=driver.findElement(By.xpath("//*[@id=\"mType-0\"]/div/p/div/ul/li[1]/label"));
			Select.click();
			break;
		}
		case "Adult":
		{    

			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,400)");
			WebElement Select= driver.findElement(By.xpath("//*[@id=\"mTyp e-0\"]/div/p/div/ul/li[2]/label"));
			Select.click();
			break;
		}
		case "5 year":
		{
			WebElement Select=driver.findElement(By.xpath("//*[@id=\"mType-0\"]/div/p/div/ul/li[3]/label"));
			Select.click();
			break;
		}
		case "Lifetime":
		{
			WebElement Select= driver.findElement(By.xpath("//*[@id=\"mType-0\"]/div/p/div/ul/li[4]/label"));
			Select.click();
			break;
		}
		}
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1400)");
		WebElement next=driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[1]/form/div[2]/div/button"));
		next.click();


	}

	/*@Test
	public void registration() throws InterruptedException {
		Thread.sleep(3000);
		PageFactory.initElements(driver,shootingxpath.class);
		Thread.sleep(3000);
		//shootingxpath.joinnow.click();
		//Assert.assertEquals("Membership Registration","Membership Registration" );
		///System.out.println("Membership  passed");
		//Thread.sleep(6000);
		//shootingxpath.individual.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1400)");
		Thread.sleep(2000);
		shootingxpath.next.click();
		Assert.assertEquals("Personal and Club Information","Personal and Club Information" );
		System.out.println("Assert passed");
	}*/
	@Test(priority = 2)
	public void PersonalandClubInformation() throws InterruptedException, AWTException {
		PageFactory.initElements(driver,shootingxpath.class);
		shootingxpath.Title.sendKeys(Title);
		shootingxpath.FirstName.sendKeys(FirstName);
		shootingxpath.LastName.sendKeys(LastName);
		shootingxpath.DoB.sendKeys(DateofBirth+Keys.ESCAPE);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		shootingxpath.Gender.click();
		shootingxpath.Veteran.click();
		shootingxpath.ClubTeamName.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);	
		Thread.sleep(4000);
		shootingxpath.next2.click();
		Assert.assertEquals("Address and Contact Information", "Address and Contact Information");
		System.out.println("passed");
	}
	@Test(priority = 3)
	public void AddressandContactInformation() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		shootingxpath.Email.sendKeys(Email);
		shootingxpath.RetypeEmail.sendKeys(RetypeEmail);
		Thread.sleep(2000);
		shootingxpath.AddressType.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		shootingxpath.AddressLine1.sendKeys(AddressLine1);
		WebElement Country =driver.findElement(By.id("country"));
		Select Type=new Select(Country );
		Type.selectByIndex(5);
		shootingxpath.City.sendKeys(City);
		shootingxpath.State.sendKeys(State);
		shootingxpath.PostalCode.sendKeys(PostalCode);
		Thread.sleep(3000);
		//shootingxpath.CompanyName.sendKeys("CompanyName");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);
		shootingxpath.MobileNumber.sendKeys(MobileNumber);
		Thread.sleep(5000);
		shootingxpath.next3.click();
		shootingxpath.DisciplinesofInterest.click();
		Robot robot2 = new Robot();
		robot2.keyPress(KeyEvent.VK_DOWN);
		robot2.keyPress(KeyEvent.VK_ENTER);
		shootingxpath.next4.click();
		Assert.assertEquals("Additional Information","Additional Information");
	}
	@Test(priority = 4)
	public void AdditionalInformation() throws InterruptedException {
		shootingxpath.Ethnicity.click();
		WebElement PrimaryRoleofInterest =driver.findElement(By.name("form.area_of_interest"));
		Select drop=new Select(PrimaryRoleofInterest );
		drop.selectByIndex(5);
		WebElement Category =driver.findElement(By.name("form.category"));
		Select drop1=new Select(Category);
		drop1.selectByIndex(4);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(4000);
		WebElement aboutUSAShooting =driver.findElement(By.xpath("//*[@id=\"hear_about\"]"));
		Select drop2=new Select(aboutUSAShooting);
		drop2.selectByIndex(4);
		shootingxpath.next5.click();
		shootingxpath.Donation.click();
		shootingxpath.next6.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1000)");
		shootingxpath.next6.click();
		Thread.sleep(4000);
		JavascriptExecutor js2 =(JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		shootingxpath.verify.click();
		shootingxpath.next7.click();
		Thread.sleep(4000);
		JavascriptExecutor js3 =(JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//safecheck
		shootingxpath.safecheck.click();
		shootingxpath.next9.click();
		Assert.assertEquals("Card Information", "Card Information");
		System.out.println("passed");

	}
	@Test(priority = 5)
	public void CardInformation() throws InterruptedException{
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		shootingxpath.CardNumber.sendKeys(CardNumber);
		shootingxpath.ExpiryMonth.sendKeys(ExpiryMonth);
		shootingxpath.cvc.sendKeys(CVC);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		shootingxpath.NameonCard.sendKeys(NameonCard);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		shootingxpath.confirmtextbox.click();
		Thread.sleep(3000);
		shootingxpath.confirmtext.sendKeys(Terms);
		//shootingxpath.next8.click();
	}




	@AfterTest
	public void close() {

		driver.close();

	}

}

