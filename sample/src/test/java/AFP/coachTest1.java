package AFP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.Test;

public class coachTest1 {
	WebDriver driver ;
	String email=("admin@integrass.com");
	String password=("Admin2@2!");
	String search=("PH00008388");
	String searchrequest=("PH00008388");

	@Test(priority = 0)
	public void openchrome() throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
	//	WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
// Launch Website
		driver.get("https://alliance-devportal.isportz.co/login");
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\Integrass\\eclipse-workspace\\driver\\src\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://alliance-devportal.isportz.co/login");
		driver.manage().window().maximize();*/
		PageFactory.initElements(driver,coachTest.class);
		Thread.sleep(5000);
	}

	@Test(priority = 1)
	public void coachfreeagend() throws InterruptedException, AWTException{

		coachTest.email.sendKeys(email);
		coachTest.password.sendKeys(password);
		coachTest.submit.click();
		Thread.sleep(4000);
		coachTest.freeagent.click();
		Thread.sleep(4000);
		coachTest.coach.click();
		Thread.sleep(12000);
		coachTest.action.click();
		Thread.sleep(7000);
		coachTest.playertransfer.click();
		Thread.sleep(4000);
		coachTest.Leagues.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		coachTest.Division.click();
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_DOWN);
		robot1.keyPress(KeyEvent.VK_DOWN);
		robot1.keyPress(KeyEvent.VK_ENTER);
		coachTest.Team.click();
		Robot robot2 = new Robot();
		robot2.keyPress(KeyEvent.VK_DOWN);
		robot2.keyPress(KeyEvent.VK_DOWN);
		robot2.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		coachTest.cancel.click();
		//coachTest.okbtn.click();
	}

	@Test(priority = 2)
	public void player() throws InterruptedException, AWTException {
		Thread.sleep(4000);
		coachTest.playermenu.click();
		Thread.sleep(5000);
		coachTest.memberid.click();
		Thread.sleep(7000);
		coachTest.playertransfer1.click();
		coachTest.playerLeagues.click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		coachTest.playerDivision.click();
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_DOWN);
		robot1.keyPress(KeyEvent.VK_DOWN);
		robot1.keyPress(KeyEvent.VK_DOWN);
		robot1.keyPress(KeyEvent.VK_ENTER);
		coachTest.playerTeam.click();
		Robot robot2 = new Robot();
		
		robot2.keyPress(KeyEvent.VK_DOWN);
		robot2.keyPress(KeyEvent.VK_ENTER);
		coachTest.cancel2.click();
		//Registration
        Thread.sleep(3000);
		coachTest.registraion.click();
		Thread.sleep(3000);
		coachTest.clickteam.click();
		Thread.sleep(15000);
		coachTest.clickView.click();
		Thread.sleep(15000);
		coachTest.profileid.click();
        //WebDriverWait roster = new WebDriverWait(driver, Duration.ofSeconds(30));
	    // roster.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[.=\" Team Member Roster \"]")));
		Thread.sleep(5000);
        coachTest.roster.click();
		//coachTest.shorting.click();
		Thread.sleep(2000);
		//		synchronized( driver){
		//			driver.wait(5000);
		//		}
		//		WebDriverWait s=new WebDriverWait(driver, 20);
		//		this.driver=null;
		//		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		//	WebElement locator=driver.findElement(By.xpath("(//i[@class='fas fa-share'])[2]"));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
		//locator.click();
		coachTest.search.sendKeys(search);
		Thread.sleep(15000);
		coachTest.playerprotransf.click();
		coachTest.team3.click();
		Robot robot3 = new Robot();
		robot3.keyPress(KeyEvent.VK_DOWN);
		robot3.keyPress(KeyEvent.VK_ENTER);
		//coachTest.cancel4.click();
		coachTest.ok4.click();
		Thread.sleep(3000);
		coachTest.exit.click();
		coachTest.switchout.click();
		//player transfer request
		Thread.sleep(5000);
		coachTest.request.click();
		coachTest.searchrequest.sendKeys("PH00008388");
        Assert.assertEquals("PH00008388", "PH00008388");
		System.out.println("passed");
		driver.close();
	

       




	}



}


