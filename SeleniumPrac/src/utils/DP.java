package utils;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DP {
	WebDriver driver;
	@Test(dataProvider = "Authentication")
	public void RegistrationData(String UserName, String Password) throws IOException {
		String ProjectPath=System.getProperty("user.dir");
		new ExcelUtils(ProjectPath+"\\src\\testData\\DataProviderSheet.xlsx","Data");
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("UserName");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Password");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("C:\\My Files\\LogIn.html");
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
	@DataProvider
	public Object[][] Authentication() throws IOException {
		Object[][] TestData=ExcelUtils.TestData("C:\\Users\\KoduvayurAghoraAravi\\eclipse-workspace\\SeleniumPrac\\src\\testData\\DataProviderSheet.xlsx", "Data");
		return  TestData;
	}
}

