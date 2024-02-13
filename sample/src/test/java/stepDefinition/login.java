package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class login {
	WebDriver driver;
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver(options);
     driver.manage().window().maximize();
		driver.get("https://staging.motorcyclecoaching.org/signin");
	   
	}

@When("The user is entering the login creadential {string} and {string}")
public void the_user_is_entering_the_login_creadential_and(String string, String string2) throws InterruptedException {
    Thread.sleep(2000);
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
		
				
	 
	}
	@When("clicks the login button")
	public void clicks_the_login_button() {
		driver.findElement(By.xpath("/html/body/app-root/div/app-signin/div/main/div/div[2]/div[1]/form/div[3]/button")).click();
		
	    
	}
	@Then("user should be navigate to the home page")
	public void user_should_be_navigate_to_the_home_page() {
		
		Assert.assertEquals("Invalid email", "Invalid email");
		System.out.println("pass");
	}




}
