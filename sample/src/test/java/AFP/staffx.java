package AFP;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class staffx {
	@FindBy(name="email")
	public static WebElement Email;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(xpath="//*[@id=\"loginForm\"]/div[3]/button[2]")
	public static WebElement login;
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[2]/a")
	public static WebElement registration;
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/aside/div[2]/div[4]/div/div/nav/ul/li[2]/ul/li[2]/a")
	public static WebElement staff;
	@FindBy(xpath="//*[@id=\"list_table_length\"]/label/select")
	public static WebElement Showentries;
	@FindBy(xpath="//*[@id=\"list_table_filter\"]/label/input")
	public static WebElement search;
	@FindBy(xpath="//*[@id=\"list_table\"]/tbody/tr[1]/td[1]")
	public static WebElement maximize;
	@FindBy(xpath="(//i[@class='fas fa-eye'])[2]")
	public static WebElement Eye;

}
