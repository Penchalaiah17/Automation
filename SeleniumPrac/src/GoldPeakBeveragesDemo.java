import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoldPeakBeveragesDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goldpeakbeverages.com/");
		Robot obj=new Robot();
		obj.keyPress(KeyEvent.VK_F12);
		Thread.sleep(1000);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='nav-icons__link nav__social-icons--facebook']")));
		Thread.sleep(1000);
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='nav-icons__link nav__social-icons--twitter']")));
		Thread.sleep(1000);
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='nav-icons__link nav__social-icons--youtube']")));
		Thread.sleep(1000);
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='nav-icons__link nav__social-icons--instagram']")));

		//		driver.findElement(By.xpath("//img[@class='nav__logo-img lazyloaded']")).click();
		//		driver.navigate().to("https://login.us.coca-cola.com/a62739e6-ccaa-4a4a-831c-416177dae1ea/b2c_1a_accountmerge_susi_web/oauth2/v2.0/authorize?client_id=bc193665-b707-4ff3-ac54-6720a6e0a3f4&scope=https%3A%2F%2Fccnaprod.onmicrosoft.com%2Fccna-b2c-authorizer-service%2Foauth.coke%20openid%20profile%20offline_access&redirect_uri=https%3A%2F%2Fwww.goldpeakbeverages.com%2Ftoken_exchange&client-request-id=17ac1637-2082-4512-a97c-b33e7655d612&response_mode=fragment&response_type=code&x-client-SKU=msal.js.browser&x-client-VER=2.20.0&x-client-OS=&x-client-CPU=&client_info=1&code_challenge=lmyAX1YENQLl1J-7ZF8mk-7coZbIZNlzgbac7rRtwGU&code_challenge_method=S256&nonce=4e8e0ce0-c7dc-4d51-b49c-79fb7aa7601b&state=eyJpZCI6ImFmYmIwZjU4LWViMDktNGZlNS1iMzk1LWYzYTI4ZWY3YmQxYiIsIm1ldGEiOnsiaW50ZXJhY3Rpb25UeXBlIjoicmVkaXJlY3QifX0%3D&isWebBrowser=true&kmsi_text_label=Keep%20me%20signed%20in&guest_uri=https://www.goldpeakbeverages.com/token_exchange?continue_as_guest=true&analyticsSessionUUID=8fb45c5d-4baf-4582-9fda-be5950b7b3f0&analyticsProfileId=undefined");

		//		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='btn btn-primary']")));

		//		Actions action = new Actions(driver);
		//		action.moveToElement(driver.findElement(By.xpath("//img[@class='nav__logo-img lazyloaded']"))).perform();
		//		Thread.sleep(2000);
		//		JavascriptExecutor executor = (JavascriptExecutor)driver;
		//		executor.executeScript("arguments[0].click();",driver.findElement(By.xpath("//a[@class='profile__menu--link popover__submenu--link tcccLogin_capture_signin_link']")));
	}
}
