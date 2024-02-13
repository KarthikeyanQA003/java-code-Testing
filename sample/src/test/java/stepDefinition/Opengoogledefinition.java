package stepDefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opengoogledefinition {
	WebDriver driver;
	@Given("the user is entering google.co.in")
	public void the_user_is_entering_google_co_in() {
		 ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("--remote-allow-origins=*");
	     driver = new ChromeDriver(options);
         driver.manage().window().maximize();
         driver.get("https://www.google.com/");
	}
	@When("a user is typing the search term {string}")
	public void a_user_is_typing_the_search_term(String searchterm) {
	    driver.findElement(By.name("q")).sendKeys(searchterm);
	}
	@When("clicks the search button")
	public void clicks_the_search_button() {
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	@Then("the user should see the Result")
	public void the_user_should_see_the_result() {
		boolean status=driver.findElement(By.partialLinkText("kar")).isDisplayed();
	 if(status) {
		 System.out.println("Results displyed");
	 }
	}



}