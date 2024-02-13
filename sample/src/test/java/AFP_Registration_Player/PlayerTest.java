package AFP_Registration_Player;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class PlayerTest {
	@FindBy(name="email")
	public static WebElement Email;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[3]/button[2]")
	public static WebElement login;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[2]/a")
	public static WebElement registration;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[2]/ul/li[1]/a")
	public static WebElement player;
	@FindBy(xpath="//*[@id=\"list_table_length\"]/label/select")
	public static WebElement Showentries;
	@FindBy(xpath="//*[@id=\"list_table_filter\"]/label/input")
	public static WebElement search;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[3]/div/div/section/div/div/section/div/div/div[2]/div/table/tbody/tr[1]/td[1]")
	public static WebElement maximize;
	@FindBy(xpath="(//i[@class='fas fa-eye'])[2]")
	public static WebElement Eye;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div[2]/button[1]")
	public static WebElement PlayerInformation_Edit;
	//Player Information-edit
	@FindBy(id="first_name")
	public static WebElement FirstName;
	@FindBy(id="last_name")
	public static WebElement lastname;
	@FindBy(xpath="//*[@id=\"modal-center1___BV_modal_body_\"]/div/form/div[2]/div/div/div/div/div/input")
	public static WebElement dop;
	@FindBy(id="graduation_year")
	public static WebElement GraduationYear;
	@FindBy(id="jersey_number")
	public static WebElement jerseynumber;
	@FindBy(id="primary_position")
	public static WebElement PrimaryPosition;
	@FindBy(xpath="//input[@value='2']")
	public static WebElement Throws;
	@FindBy(xpath="(//input[@value='2'])[2]")
	public static WebElement Bats;
	@FindBy(xpath="//*[@id=\"modal-center1___BV_modal_footer_\"]/button[2]")
	public static WebElement update;
	@FindBy(xpath="//*[@id=\"modal-center1___BV_modal_footer_\"]/button[1]")
	public static WebElement cancel;
	//Address Information-Edit
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div/div[2]/div/div[2]/div[1]/div[1]/div[2]/button")
	public static WebElement AddressInformation_edit;
	@FindBy(xpath="//*[@id=\"address1\"]")
	public static WebElement MailingAddress;
	@FindBy(id="country")
	public static WebElement Country;
	@FindBy(id="city")
	public static WebElement City;
	@FindBy(id="state_code")
	public static WebElement state;
	@FindBy(id="zip")
	public static WebElement PostalCode ;
	@FindBy(xpath="//*[@id=\"modal-center___BV_modal_footer_\"]/button[1]")
	public static WebElement cancel2;
	@FindBy(xpath="//*[@id=\"modal-center___BV_modal_footer_\"]/button[2]")
	public static WebElement update2;
	// MembershipInformation_Edit
	@FindBy(xpath="/html/body/div/div[1]/div/div[3]/div/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/button")
	public static WebElement MembershipInformation_Edit;
	@FindBy(id="membership_stauts")
	public static WebElement MembershipStatus;
	@FindBy(id="startDate")
	public static WebElement StartDate;
	@FindBy(xpath="//*[@id=\"startDate\"]/div/div/header/div/div[1]/select")
	public static WebElement month;
	@FindBy(xpath="//*[@id=\"startDate\"]/div/div/header/div/div[2]/select")
	public static WebElement year;
	@FindBy(xpath="//*[@id=\"startDate\"]/div/div/header/div/div[2]/button")
	public static WebElement SelectYear;
	@FindBy(xpath="//*[@id=\"startDate\"]/div/div/table/tbody/tr[3]/td[5]")
	public static WebElement selectdate;
	@FindBy(xpath="(//*[@placeholder='MM/DD/YYYY'])[2]")
	public static WebElement ExpirationDate;
	@FindBy(xpath="//*[@id=\"validThru\"]/button")
	public static WebElement close;
	@FindBy(xpath="//*[@id=\"validThru\"]/div/div/header/div/div[1]/select")
	public static WebElement Exmonth;
	@FindBy(xpath="//*[@id=\"validThru\"]/div/div/header/div/div[2]/select")
	public static WebElement Exyear;
	@FindBy(xpath="//*[@id=\"validThru\"]/div/div/table/tbody/tr[4]/td[5]")
	public static WebElement selectexDate;
	@FindBy(xpath="//*[@id=\"modalMembership___BV_modal_footer_\"]/button[1]")
	public static WebElement cancel3;
	@FindBy(xpath="//*[@id=\"modalMembership___BV_modal_footer_\"]/button[2]")
	public static WebElement update3;
	//Contact Information-edit
	@FindBy(xpath="//*[@id=\"app\"]/div/div[3]/div/div/div[2]/div/div[2]/div[2]/div[1]/div[2]/button")
	public static WebElement ContactInformation_edit;
	@FindBy(id="parent_first_name")
	public static WebElement ParentFirstName;
	@FindBy(id="verify-parent_last_name")
	public static WebElement ParentLastName;
	@FindBy(xpath="/html/body/div[2]/div[1]/div/div/div/div/form/div[1]/div[4]/div/div/input")
	public static WebElement CountrycodewithMobile;
	@FindBy(xpath="//*[@id=\"modal-center3___BV_modal_footer_\"]/button[2]")
	public static WebElement update4;
	@FindBy(xpath="//*[@id=\"modal-center3___BV_modal_footer_\"]/button[1]")
	public static WebElement cancel4;
	@FindBy(xpath="//*[@id=\"list_table\"]/tbody/tr[1]/td[1]")
	public static WebElement minimize2;
	@FindBy(xpath="(//i[@class='fas fa-trash'])[2]")
	public static WebElement deleteicone;
	

}
