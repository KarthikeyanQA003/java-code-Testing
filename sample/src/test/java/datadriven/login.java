package datadriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class login {
	String [][] Data=null;
	WebDriver driver;

	
	
 

  @DataProvider(name="loginData")
  public String[][] loginDataProvider() throws BiffException, IOException {
	  Data=getExcelData();
	  
	return Data;
  }
  
  public String[][] getExcelData() throws BiffException, IOException  { 
	  
	 FileInputStream excel=new FileInputStream("D:\\workbook.xls");
   Workbook workbook=Workbook.getWorkbook(excel);
   
   Sheet sheet=workbook.getSheet(0);
   
  int rowCount= sheet.getRows();
  
  int columnCount=sheet.getColumns();
  
  String testData[][]=new String[rowCount][columnCount];
  
  for(int i=0;i<rowCount;i++) {
	  for(int j=0;j<columnCount;j++){
		  
	testData[i][j]=sheet.getCell(j, i).getContents();
	 
  }
}
 return testData;
  }
  @BeforeTest
  public void beforeTest() {
	  ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
	  
	  
  }
  @AfterTest
  public void aftertest() {
	  driver.quit();
  }
@Test(dataProvider="loginData")
public void loginWithBothCorrect(String uName,String pword) {
	  
	driver.get("http://thff.integrass.loc/backend/login");
	
	
	 WebElement username=driver.findElement(By.xpath("//*[@id=\"exampleInputEmail1\"]"));
	 username.sendKeys(uName);
	 
	 WebElement password=driver.findElement(By.xpath("//*[@id=\"exampleInputPassword1\"]"));
	 password.sendKeys(pword);	
	 
	 WebElement check= driver.findElement(By.id("exampleCheck1"));
	 check.click();
	 

	 WebElement login=driver.findElement(By.xpath("//*[@id=\"login\"]/div/div[4]/button"));
	 login.click();
}
	
}
