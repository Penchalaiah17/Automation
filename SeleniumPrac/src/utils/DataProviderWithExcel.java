package utils;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviderWithExcel {
	

WebDriver driver;


  @Test(dataProvider = "Authentication")
  public void Registration_data(String sUserName,String sPassword)throws  Exception{
	  String ExcelPath="C:\\Users\\KoduvayurAghoraAravi\\eclipse-workspace\\SeleniumPrac\\src\\testData\\DataProviderSheet.xlsx";
		String SheetName="Data";
		ExcelUtils.TestData(ExcelPath,SheetName);

		driver.findElement(By.xpath(".//*[@id='account']/a")).click();

		driver.findElement(By.id("log")).sendKeys(sUserName);

		System.out.println(sUserName);

		driver.findElement(By.id("pwd")).sendKeys(sPassword);

		System.out.println(sPassword);

		driver.findElement(By.id("login")).click();

		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
  }

  @BeforeMethod
  public void beforeMethod() throws Exception {

		driver = new ChromeDriver();

		driver.get("https://www.store.demoqa.com");	 

	}


  @AfterMethod
  public void afterMethod() {

		driver.close();

	}


  @DataProvider
  public Object[][] Authentication() throws Exception{

      Object[][] testObjArray = ExcelUtils.TestData("C:\\\\Users\\\\KoduvayurAghoraAravi\\\\eclipse-workspace\\\\SeleniumPrac\\\\src\\\\testData\\\\DataProviderSheet.xlsx","Sheet1");

      return (testObjArray);

		}
}
