package waterskiregistrationpageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageobjectWaterskixpath {
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/form[1]/div[1]/div[2]/div[1]/div[1]/p[1]/div[2]/ul[1]/li[1]/label[1]")
	 public static WebElement individualactive;
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/form[1]/div[2]/div[1]/button[1]")
	public static WebElement next;
	
	@FindBy(name="form.first_name")
	public static WebElement firstname;
	
	@FindBy(xpath="//input[@id='lastname']")
	public static WebElement lastname;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/form[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[1]/span[1]/span[1]/span[1]")
	public static WebElement teams;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/form[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement Dob;
	
	@FindBy(xpath="//input[@id='male']")
	public static WebElement gender;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[2]/form[1]/div[3]/div[1]/button[2]")
	public static WebElement next1;
	
	@FindBy(xpath="//input[@id='email']")
	public static WebElement email;
	
	@FindBy(xpath="//input[@id='retype_email']")
	public static WebElement retypemail;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[3]/form[1]/div[1]/div[2]/div[1]/div[4]/div[1]/input[1]")
	public static WebElement mallingaddress;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[3]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/select[1]")
	public static WebElement country;
	
	@FindBy(xpath="//input[@id='city']")
	public static WebElement city;
	
	@FindBy(xpath="//*[@id=\"state_code\"]")
	public static WebElement state;
	
	@FindBy(xpath="//input[@id='zip']")
	public static WebElement postalcode;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[3]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement countrycode;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[3]/form[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]")
	public static WebElement countrycodemobilenumber;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[3]/form[1]/div[1]/div[4]/div[1]/button[2]")
	public static WebElement next2;
	
	@FindBy(css ="#safe-3")
	public static WebElement  SafeSportTrained;
	
	@FindBy(xpath="//select[@id='first-choice']")
	public static WebElement chooice1;
	Select Type=new Select(chooice1);
    
    
	@FindBy(xpath="//select[@id='secondchoice']")
	public static WebElement chooice2;
	
	@FindBy(xpath="#skier_license")
	public static WebElement Federation;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[4]/form[1]/div[1]/div[4]/div[1]/button[2]")
	public static WebElement next4;
	
	@FindBy(css="#diversity_id1")
	public static WebElement race;
	
	@FindBy(xpath="#hispanic-or-latino")
	public static WebElement Ethnicity;
	
	@FindBy(css="#normal")
	public static WebElement Disability ;
	
	@FindBy(xpath="#veteran")
	public static WebElement Veteran ;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/section[5]/form[1]/div[1]/div[4]/div[1]/button[2]")
	public static WebElement next3;


		
	}

	
		
	
	
	
	
	
	
	
	


