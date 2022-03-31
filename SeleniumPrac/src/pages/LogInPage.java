package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LogInPage {
	WebDriver driver;
	// Constructor with parameters
	public LogInPage(WebDriver driver1) {
		this.driver=driver1;
	}

	//	By UserNameXpath=By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']");
	//	By PasswordXpath=By.xpath("//div[@class='IiD88i _351hSN']//input[@type='password']");
	//	By LogInButtonXpath=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");

	// using the page factor model
	@FindBy(xpath="//div[@class='IiD88i _351hSN']//input[@type='text']")
	WebElement userName;
	@FindBy(xpath="//div[@class='IiD88i _351hSN']//input[@type='password']")
	WebElement pass;
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement ClickLogin;
	public void EnterUserName(String UserName) {
		//		driver.findElement(UserNameXpath).sendKeys(UserName);
		userName.sendKeys(UserName);
	}

	public void EnterPassword(String Password) {
		//		driver.findElement(PasswordXpath).sendKeys(Password);
		pass.sendKeys(Password);
	}
	public void ClickLogInButton() {
		//		driver.findElement(LogInButtonXpath).click();
		ClickLogin.click();
	}
}	

