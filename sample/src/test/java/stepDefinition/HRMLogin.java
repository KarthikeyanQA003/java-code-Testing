package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HRMLogin {
	WebDriver driver;
	@Given("user land on website")
	public void user_land_on_website() {
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@When("Enter the valid credentials")
	public void enter_the_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
		List<String> credentials=dataTable.asList(String.class);
		String username=credentials.get(0);
		String password=credentials.get(1);
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	@When("Click the login button")
	public void click_the_login_button() {
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
	}
}
