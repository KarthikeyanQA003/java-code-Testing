package AFP;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamX {
	@FindBy(name="email")
	public static WebElement Email;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[3]/button[2]")
	public static WebElement login;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[2]/a")
	public static WebElement registration;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[2]/ul/li[3]/a")
	public static WebElement teammenu;
	@FindBy(xpath="//*[@id=\"list_table_length\"]/label/select")
	public static WebElement Showentries;
	@FindBy(xpath="//*[@id=\"list_table_filter\"]/label/input")
	public static WebElement search;
	@FindBy(xpath="//*[@id=\"list_table\"]/tbody/tr[1]/td[1]")
	public static WebElement maximize;
	@FindBy(xpath="(//i[@class='fas fa-eye'])[2]")
	public static WebElement Eye;
	//Team Information
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div/div[2]/div[1]/div[1]/div/div[1]/div/div[2]/button[1]")
	public static WebElement edit;
	@FindBy(id="clubname")
	public static WebElement TeamName;
	@FindBy(id="age_division")
	public static WebElement AgeDivision ;
	@FindBy(xpath="//*[@id=\"modal-center1___BV_modal_footer_\"]/button[1]")
	public static WebElement cancel;
	@FindBy(xpath="//*[@id=\"modal-center1___BV_modal_footer_\"]/button[2]")
	public static WebElement update;
	//Contact Information
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div/div[2]/div[1]/div[2]/div/div[1]/div[2]/button")
	public static WebElement Edit2;
	@FindBy(id="email")
	public static WebElement email ;
	@FindBy(id="retype_email")
	public static WebElement RetypeEmail ;
	@FindBy(name="telephone")
	public static WebElement CountrycodewithMobile ;
	@FindBy(id="address1")
	public static WebElement MailingAddress;
	@FindBy(id="city")
	public static WebElement City;
	@FindBy(id="country")
	public static WebElement Country;
	@FindBy(id="state_code")
	public static WebElement State;
	@FindBy(id="zip")
	public static WebElement PostalCode;
	@FindBy(xpath="//*[@id=\"edit-club-contact___BV_modal_footer_\"]/button[1]")
	public static WebElement cancel2;
	@FindBy(xpath="//*[@id=\"edit-club-contact___BV_modal_footer_\"]/button[2]")
	public static WebElement update2;
	//Membership History
	@FindBy(xpath="//*[@id=\"my-table\"]/tbody/tr/td[8]/div/div/button")
	public static WebElement Waiverdownloaded;
	@FindBy(xpath="//*[@id=\"my-table\"]/tbody/tr/td[9]/div/div/button")
	public static WebElement Receiptdownloaded;
	@FindBy(xpath="//*[@id=\"list_table\"]/tbody/tr[3]/td[11]/a[2]/i")
	public static WebElement delete;
	//staff
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[2]/ul/li[2]/a")
	public static WebElement staff;
	
	
	
	
	
	


}