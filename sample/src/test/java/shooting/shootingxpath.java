package shooting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class shootingxpath {
	//@FindBy(xpath="//*[@id=\"home\"]/div[2]/div/div/div/div/div/div/a[1]")
	//public static WebElement joinnow;
	//@FindBy(xpath="//*[@id=\"mType-0\"]/div/p/div/ul/li[1]/label")
	//public static WebElement individual;
	//@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[1]/form/div[2]/div/button")
	//public static WebElement next;
	@FindBy(id="title")
	public static WebElement Title;
	@FindBy(id="firstName")
	public static WebElement FirstName;
	@FindBy(id="lastname")
	public static WebElement LastName;
	@FindBy(xpath="(//*[@type=\"text\"])[6]")
	public static WebElement DoB;
	@FindBy(className ="gender-label-span")
	public static WebElement Gender;
	@FindBy(id="Yes")
	public static WebElement Veteran;
	@FindBy(xpath="//*[@id=\"select2--container\"]")
	public static WebElement ClubTeamName;
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[2]/form/div[3]/div/button[2]/span")
	public static WebElement next2;
	@FindBy(id="email")
	public static WebElement Email;
	@FindBy(id="retype_email")
	public static WebElement RetypeEmail;
	@FindBy(id="address_type")
	public static WebElement AddressType;
	@FindBy(id="address1")
	public static WebElement AddressLine1;
	@FindBy(id="city")
	public static WebElement City;
	@FindBy(name="form.state")
	public static WebElement State;
	@FindBy(id="zip")
	public static WebElement PostalCode;
	@FindBy(xpath="//*[@id=\"work_address_company_name\"]")
	public static WebElement CompanyName;
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[3]/form/div/div[2]/div[3]/div[1]/div/div/div/input")
	public static WebElement MobileNumber;
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[3]/form/div/div[4]/div/button[2]")
	public static WebElement next3;
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[4]/form/div/div[2]/div[1]/div/div/div/span/span[1]/span/ul/li/input")
	public static WebElement DisciplinesofInterest;
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[4]/form/div/div[4]/div/button[2]")
	public static WebElement next4;
	@FindBy(id="diversity_id2")
	public static WebElement Ethnicity;
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[5]/form/div/div[4]/div/button[2]")
	public static WebElement next5;
	@FindBy(xpath="//*[@id=\"donation_confirm_text_no\"]")
	public static WebElement Donation;
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[1]/div/div/div[1]/div[2]/div/section[7]/form/div/div[2]/div[2]/div/button[2]")
	public static WebElement next6;
	@FindBy(xpath="//*[@id=\"0\"]/div/div[2]/div/form/div[2]/input")
	public static WebElement verify;
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[6]/div/button[2]")
	public static WebElement next7;
	//safesportcheck//adult
	@FindBy(xpath="//*[@id=\"1\"]/div/div[2]/div/form/div[2]/input")
	public static WebElement safecheck;
	//safenext
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[6]/div/button[2]")
	public static WebElement next9;
	@FindBy(xpath="//*[@id=\"root\"]/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")
	public static WebElement CardNumber;
	@FindBy(xpath="//*[@id=\"root\"]/form/div/div[2]/span[2]/span[1]/span/span/input")
	public static WebElement ExpiryMonth;
	@FindBy(xpath="//*[@id=\"root\"]/form/div/div[2]/span[2]/span[2]/span/span/input")
	public static WebElement cvc;
	@FindBy(xpath="//*[@id=\"billing_firstname\"]")
	public static WebElement NameonCard;
	@FindBy(xpath="//*[@id=\"payment_agree\"]")
	public static WebElement confirmtextbox;
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[4]/div/div[2]/div/div/div[10]/div/div/div/input")
	public static WebElement confirmtext;
	@FindBy(xpath="//*[@id=\"app\"]/div/main/div/div/div/div[2]/div[1]/div/div[4]/div/div[6]/div/button[2]")
	public static WebElement next8;





}