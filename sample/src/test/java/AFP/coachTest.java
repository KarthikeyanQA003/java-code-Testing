package AFP;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class coachTest{
	@FindBy(xpath = "//input[@type='email']")
	public static WebElement email;
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	public static WebElement submit;
	@FindBy(xpath = "//p[.=\" Free Agent \"]")
	public static WebElement freeagent;
	@FindBy(xpath = "//p[.=\"Coach\"]")
	public static WebElement coach;
	@FindBy(xpath = "//*[@id=\"list_table\"]/tbody/tr[1]/td[1]")
	public static WebElement action;
	@FindBy(xpath = "/html/body/div/div[1]/div/div[3]/div/div/section/div/div/section/div/div/div[2]/div/table/tbody/tr[2]/td/ul/li/span[2]/a[3]/i")
    public static WebElement playertransfer;
	@FindBy(xpath="//*[@id=\"league\"]")
	public static WebElement Leagues;
	@FindBy(xpath="//*[@id=\"age_division\"]")
	public static WebElement Division;
	@FindBy(xpath="//*[@id=\"leagueTeam\"]")
	public static WebElement Team;
	@FindBy(xpath="//*[@id=\"playerTransfer___BV_modal_footer_\"]/button[1]")
	public static WebElement cancel;
	//@FindBy(xpath ="(//button[@type='button'])[4]")
	//public static WebElement okbtn;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[3]/ul/li[1]/a")
	public static WebElement playermenu;
	@FindBy(xpath="/html/body/div/div[1]/div/div[3]/div/div/section/div/div/section/div/div/div[2]/div/table/tbody/tr[1]/td[1]")
	public static WebElement memberid;
	@FindBy(xpath="/html/body/div/div[1]/div/div[3]/div/div/section/div/div/section/div/div/div[2]/div/table/tbody/tr[2]/td/ul/li/span[2]/a[3]/i")
	public static WebElement playertransfer1;
	@FindBy(xpath="//*[@id=\"league\"]")
	public static WebElement playerLeagues;
	@FindBy(xpath="/html/body/div[4]/div[1]/div/div/div/form/div[2]/select")
	public static WebElement playerDivision;
	@FindBy(xpath="//*[@id=\"leagueTeam\"]")
	public static WebElement playerTeam;
	//@FindBy(xpath="//*[@id=\"playerTransfer___BV_modal_footer_\"]/button[2]")
	//public static WebElement ok2;
	@FindBy(xpath="//*[@id=\"playerTransfer___BV_modal_footer_\"]/button[1]")
	public static WebElement cancel2;
	//registration Module
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[2]/a")
	public static WebElement registraion;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[2]/ul/li[3]/a")
	public static WebElement clickteam;
	@FindBy(xpath="(//i[@class='fas fa-eye'])[3]")
	public static WebElement clickView;
	@FindBy(xpath="//button[@class='btn btn-outline-primary btn-sm float-right']")
	public static WebElement profileid;
	@FindBy(xpath="//p[.=\" Team Member Roster \"]")
	public static WebElement roster;
	//@FindBy(xpath="//*[@id=\"list_table\"]/tbody/tr[3]/td[1]")
//	public static WebElement shorting;
	@FindBy(xpath = "//input[@type='search']")
	public static WebElement search;
	@FindBy(xpath="/html/body/div/div/div/div[1]/div/div/div/div/div/div[2]/div/div[1]/div/div/table/tbody/tr/td[9]/div/button/i")
	public static WebElement playerprotransf;
	@FindBy(xpath="//*[@id=\"leagueTeam\"]")
	public static WebElement team3;
	@FindBy(xpath="//*[@id=\"playerTransfer___BV_modal_footer_\"]/button[1]")
	public static WebElement cancel4;
	@FindBy(xpath="//*[@id=\"playerTransfer___BV_modal_footer_\"]/button[2]")
	public static WebElement ok4;
	@FindBy(xpath="//*[@id=\"dropdown-1__BV_toggle_\"]")
	public static WebElement exit;
	@FindBy(xpath="//*[@id=\"dropdown-1\"]/ul/li/a")
	public static WebElement switchout;
    // player transfer request
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[8]/a")	
	public static WebElement request;
	@FindBy(xpath="//*[@id=\"list_table_filter\"]/label/input")
	public static WebElement searchrequest;
}
