package testCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LandingPage;
import pages.LogInPage;
import pages.LogOutFeature;
import pages.ProductPage;
import pages.ProductsListPage;
public class TestCase1 {
	@Test
	public void Run() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//		LogInPage LogInPage=new LogInPage(driver);
		LogInPage LogInPage=PageFactory.initElements(driver, LogInPage.class);
		LandingPage LandingPage=PageFactory.initElements(driver, LandingPage.class);
		ProductsListPage ProductsListPage=PageFactory.initElements(driver,ProductsListPage.class);
		ProductPage ProductPage=PageFactory.initElements(driver, ProductPage.class);
		LogOutFeature LogOutFeature=PageFactory.initElements(driver,LogOutFeature.class);
		LogInPage.EnterUserName("9182288966");
		LogInPage.EnterPassword("9182288966");
		LogInPage.ClickLogInButton();
		Thread.sleep(1000);
	
		LandingPage.GoToSearchBar("Casio Edifice");
		LandingPage.ClickSearchButton();
		Thread.sleep(1000);
	
		ProductsListPage.ProductClick();
		Thread.sleep(1000);
		ProductPage.BuyNowButton();
		Thread.sleep(1000);
		LogOutFeature.HoverOnAccountName();
		
//		driver.quit();

	}
}