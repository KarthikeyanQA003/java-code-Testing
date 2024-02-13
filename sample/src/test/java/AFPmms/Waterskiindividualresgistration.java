package AFPmms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Waterskiindividualresgistration {

	WebDriver driver;
	String First_name="dsgsf";
	String Last_name="Ricee";
	String email_id="fakedata2@test.com";
	String Address="Fak street 2";
	String City="Hollywood";
	String State="Florida";
	String Postal="33027";
	String Phone="+003 223 4474";
	String Exp_month="06";
	String Exp_year="2028";
	String signas="AR";



	/*
	 * public void join_renew() throws InterruptedException{ WebElement
	 * join=driver.findElement(By.xpath("//a[@href='/memberregistration']"));
	 * join.click(); System.out.println("Join/Renew button is clicked");
	 * Thread.sleep(1000);
	 * 
	 * }
	 */
	@BeforeClass
	public void openCrome() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(options);
	//	WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
// Launch Website
		driver.get("https://staging-members.usawaterski.org/memberregistration");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Integrass\\eclipse-workspace\\driver\\src\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://alliance-devportal.isportz.co/login");
	}
//	@Test(priority = 0)
//	public void openchrome() throws InterruptedException {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--incognito");
//		options.addArguments("--remote-allow-origins=*");
//        WebDriver driver = new ChromeDriver(options);
//	//	WebDriver driver= new FirefoxDriver();
//		driver.manage().window().maximize();
//// Launch Website
//		driver.get("https://staging-members.usawaterski.org/memberregistration");
//		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Integrass\\eclipse-workspace\\driver\\src\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://alliance-devportal.isportz.co/login");
//		driver.manage().window().maximize();*/
//		PageFactory.initElements(driver,coachTest.class);
//		Thread.sleep(5000);
	//}
	@Test(priority=1)
	public void membership_type() throws InterruptedException{
		Thread.sleep(5000);
		WebElement member_type=driver.findElement(By.cssSelector("body.sidebar-mini.layout-fixed.layout-footer-fixed.-page:nth-child(2) div.wrapper:nth-child(2) main.main div.bg-light.h-100 div.container-fluid.h-100 div.row div.col.offset-2.offset-sm-2.offset-lg-2.pl-0.pr-0.p-0.rightside_section div.mb-3.hvertical.border-radius-0.border-0 div.card-header.bg-white.border-0.p-0 div.card-body.bg-light.form-flds.rm-shadow.hvertical.mbv-height-pad div.row div.col-md-12:nth-child(1) div.card-body.pb-3.p-0.min-h-350 div.row div.col-md-6.right-navigation-inner:nth-child(2) div.accordion.membership-type:nth-child(1) div.card.mb-1:nth-child(2) div.collapse.show div.card-body p.card-text div:nth-child(2) ul.mship-type-fld li.member-type-width.pl-3.pt-2.mr-0:nth-child(1) > label:nth-child(2)"));
		member_type.click();
		Thread.sleep(1000);

		//	  Actions a=new Actions(driver);
		//	  a.sendKeys(Keys.PAGE_DOWN).build().perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//	  js.executeScript("windows.scrollBy(0,1500","");
		WebElement next=driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[1]/form/div[2]/div/button"));
		next.click();	 
		System.out.println("Successfully user can select Membership type");
	}


	@Test(priority=2)
	public void Personal_info() throws InterruptedException {
		WebElement firstname= driver.findElement(By.id("firstName"));
		firstname.sendKeys(First_name);

		WebElement lastname=driver.findElement(By.id("lastname"));
		lastname.sendKeys(Last_name);
        Thread.sleep(2000);
		WebElement selectclub=driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/form[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]"));
		selectclub.click();
		selectclub.sendKeys("Test of waterski club - Oroville, CA");

		//	  selectclub.click();
		selectclub.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		//	  selectclub.findElement(By.id("select2--result-ujjg-191966")).click();
		//	  selectclub.findElement(By.xpath("//input[@aria-activedescendant=\"select2--result-yrs3-151226\"]"));
		//	  selectclub.click();
		//	  Select s=new Select(selectclub);//driver.findElement(By.xpath("//input[@placeholder='Click to select one or multiple']")));
		//	  s.selectByValue("Option 5");
		//	  s.selectByVisibleText("Ability First Sports - Oroville, CA");
		//	  s.selectByIndex(3);
		selectclub.sendKeys(Keys.TAB);
		selectclub.sendKeys(Keys.TAB);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0, 600)");

		WebElement calender=driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[2]/form/div[1]/div[2]/div/div[6]/div/div/div/div/input"));
		calender.click();
		calender.sendKeys("06071994");
		calender.sendKeys(Keys.ENTER);
		calender.sendKeys(Keys.ESCAPE);
		//		driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);

		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//		WebElement gender=driver.findElement(By.xpath("//Input[@value='Male']"));gender.click();


		//((WebElement) driver.findElement(By.xpath("//label[@for='prefernotsay']"))).click();

		WebElement gender=driver.findElement(By.xpath("/html/body/div/div/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[2]/form/div[1]/div[2]/div/div[7]/div/div/label[1]"));gender.click();


		//		WebElement next=driver.findElement(By.cssSelector(".col-md-12:nth-child(3) > .text-right > .next-step-btn"));
		//		next.click();

		WebElement next=driver.findElement(By.xpath("/html/body/div/div/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[2]/form/div[3]/div/button[2]/span/i"));
		next.click();
		//		{
		//			WebElement element = driver.findElement(By.cssSelector(".col-md-12:nth-child(3) > .text-right > .next-step-btn"));
		//			Actions builder = new Actions(driver);
		//			builder.moveToElement(element).perform();
		//		}

		//		driver.findElement(By.cssSelector(".col-md-12:nth-child(3) > .text-right > .next-step-btn")).click();
		System.out.println("Successfully user can fill the Personal Information");
		Thread.sleep(2000);

	}

	@Test(priority=3)
	public void contact_info()  {

		//Email Field-mandatory
		WebElement email=driver.findElement(By.id("email"));
		email.click();
		email.sendKeys(email_id);

		//Retype Email
		WebElement retype_email=driver.findElement(By.id("retype_email"));
		retype_email.click();
		retype_email.sendKeys(email_id);

		//Mailing Address
		WebElement address=driver.findElement(By.id("address1"));
		address.click();
		address.sendKeys(Address);

		//Scrolling down to get the elements
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//Select Country
		WebElement country=driver.findElement(By.id("country"));
		country.click();
		Select s=new Select(country);
		s.selectByValue("USA");

		//Select city
		WebElement city=driver.findElement(By.id("city"));
		city.click();
		city.sendKeys(City);

		//Select State
		WebElement state=driver.findElement(By.id("state_code"));
		state.click();
		state.sendKeys(State);

		//Postal Code
		WebElement postal=driver.findElement(By.id("zip"));
		postal.click();
		postal.sendKeys(Postal);

		//Country code with home phone
		WebElement homephone=driver.findElement(By.name("telephone"));
		homephone.click();
		homephone.sendKeys(Phone)

		;

		//Next Button
		driver.findElement(By.xpath("/html/body/div/div/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[3]/form/div/div[4]/div/button[2]")).click();
		System.out.println("Successfully user can fill the contact information");


	}

	@Test(priority=4)
	public void General_info() throws InterruptedException {
		System.out.println("Opening General Information Page");

		//Safe sport Trained radio button
		WebElement safesport=driver.findElement(By.xpath("//label[@for='safe-0']"));
		safesport.click();

		//Scroll Down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//Sport Discipline 
		//1st choice
		WebElement choice1=driver.findElement(By.id("first-choice"));
		choice1.click();
		Select choice=new Select(choice1);
		choice.selectByValue("11");
		Thread.sleep(2000);

		//Federation selection
		//		WebElement federation=driver.findElement(By.id("home_federation"));
		//		federation.click();
		//		Select fed=new Select(federation);
		//		fed.selectByValue("USA");


		//next button
		driver.findElement(By.xpath("/html/body/div/div/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[4]/form/div/div[4]/div/button[2]")).click();
		System.out.println("Succesfully user can fill the General Information");
	}

	@Test(priority=5)
	public void demographic_info() {
		System.out.println("Opening Demographic Information Page");
		//Race
		WebElement race=driver.findElement(By.xpath("//label[@for='diversity_id9']"));
		race.click();

		//Scroll Down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//Ethnicity*
		WebElement ethnicity=driver.findElement(By.xpath("//label[@for='ethnicity-Prefer-not-to-say']"));
		ethnicity.click();

		//Disability Status
		WebElement disability=driver.findElement(By.xpath("//label[@for='disability-Prefer-not-to-say']"));
		disability.click();

		//Veteran Status
		WebElement veteran=driver.findElement(By.xpath("//label[@for='vet-prefer-not-to-say']"));
		veteran.click();

		//next
		driver.findElement(By.xpath("/html/body/div/div/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[5]/form/div/div[4]/div/button[2]")).click();
		System.out.println("Successfully user can select their demographic status");


	}

	@Test(priority=6)
	public void with_donation() {
		System.out.println("Opening Donation Page");
		//Select donation discipline
		WebElement no=driver.findElement(By.xpath("/html/body/div/div/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[7]/form/div/div[2]/div[1]/div/div/div[2]/label"));
		no.click();
		WebElement nxt=driver.findElement(By.xpath("/html/body/div/div/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[7]/form/div/div[2]/div[2]/div/button[2]"));
		nxt.click();
		WebElement donation=driver.findElement(By.id("/html/body/div/div/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[7]/form/div/div[2]/div[1]/div/div/div[2]"));
		donation.click();
		Select discipline=new Select(donation);
		discipline.selectByValue("1");

		//Donation amount
		WebElement amount=driver.findElement(By.id("donation-amount"));
		amount.click();
		amount.sendKeys("10");

		//next
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[7]/form/div/div[2]/div[2]/div/button[2]")).click();
		System.out.println("Selection of Donation-Successfull");
	}

	@Test(enabled=false)
	public void without_donation() {

		//No Selection of donation discipline
		//next
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[7]/form/div/div[2]/div[2]/div/button[2]")).click();
		System.out.println("Selection of Donation-successfull");
	}

	@Test(priority=7)
	public void merchandise() throws InterruptedException {
		//No selection of merchandise
		//next button
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[8]/div[1]/div[2]/form[1]/div[1]/button[2]")).click();
		System.out.println("Merchandise page-successfull");
	}

	@Test(priority=8)
	public void verify() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[6]/div/button[2]")).click();
		System.out.println("Verify Page-Successfull");
	}

	@Test(priority=9)
	public void waiver() throws InterruptedException {
		Thread.sleep(2000);
		//scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//Check box
		WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"0\"]/div/div[2]/div/form/div[2]/input"));
		checkbox.click();

		//text
		//			WebElement initial=driver.findElement(By.xpath(""))

		//next
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[6]/div/button[2]")).click();
		System.out.println("Waiver Page-successfull");
	}

	@Test(priority=10)
	public void safesportsign() throws InterruptedException {
		Thread.sleep(2000);
		//scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(100);
		//check box
		driver.findElement(By.xpath("//*[@id=\"1\"]/div/div[2]/div/form/div[2]/input")).click();
		//next
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[6]/div/button[2]")).click();
		System.out.println("Safe Sport-successfull");
	}

	@Test(priority=11)
	public void payment() throws InterruptedException {
		Thread.sleep(2000);
		//card number
		WebElement card_number=driver.findElement(By.xpath("//input[@placeholder='#### #### #### ####']"));
		card_number.click();
		card_number.sendKeys("4111 1111 1111 1111");

		//Expire month
		WebElement card_month=driver.findElement(By.id("expiration-month"));
		card_month.click();
		Select month=new Select(card_month);
		month.selectByVisibleText(Exp_month);

		//Expire year
		WebElement card_year=driver.findElement(By.id("expiration-year"));
		card_year.click();
		Select year=new Select(card_year);
		year.selectByValue(Exp_year);

		//CVC
		WebElement cvc=driver.findElement(By.xpath("//input[@name='paymentForm.cvv']"));
		cvc.click();
		cvc.sendKeys("2344");


		//Card Name
		WebElement card_name=driver.findElement(By.id("billing_firstname"));
		card_name.sendKeys(First_name);

		//scroll down
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		//Check box
		driver.findElement(By.xpath("//*[@id=\"payment_agree\"]")).click();
		//initial
		WebElement initial=driver.findElement(By.name("paymentForm.sign"));
		initial.click();
		initial.sendKeys(signas);

		//next
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[6]/div/button[2]")).click();
		System.out.println("Payment Page-Successfull");
		System.out.println("Displayed confirmation message");

	}
	

	}






