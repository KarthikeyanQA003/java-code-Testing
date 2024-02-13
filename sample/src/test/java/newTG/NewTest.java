package newTG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  

  
  @BeforeTest
	public void SetDriver(){
		 
		
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
   WebDriver driver = new ChromeDriver(options);


		driver.manage().window().maximize();
		driver.get("https://letcode.in/sortable");
	  
  }


    
}

