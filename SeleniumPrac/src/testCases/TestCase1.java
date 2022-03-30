package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.LogInPage;
public class TestCase1 {
	@Test
	public void Run() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//		LogInPage LogInPage=new LogInPage(driver);
		LogInPage LogInPage=PageFactory.initElements(driver, LogInPage.class);
		LogInPage.EnterUserName("9182288966");
		LogInPage.EnterPassword("9182288966");
		LogInPage.ClickLogInButton();
		//		if(driver.findElement(By.xpath("//span[@class='_2YULOR']//span")).isDisplayed()) {
		//			CreateAccount CreateAccount=new CreateAccount(driver);
		//			CreateAccount.ClickCreateAccount();
		//			CreateAccount.EnterUserName("9182288966");
		//			CreateAccount.ClickContinueButton();
		//			CreateAccount.EnterOTP("1234");
		//			CreateAccount.SetNewPassword("abcd123");
		//			CreateAccount.ClickOnSignUp();
		//		}
		LandingPage LandingPage=new LandingPage(driver);
		LandingPage.SearchBar("Casio Edifice");
		LandingPage.ClickSearchButton();
	}
}