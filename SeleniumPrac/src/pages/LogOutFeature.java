package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogOutFeature {
	WebDriver driver;
	public LogOutFeature(WebDriver driver1) {
		this.driver=driver1;
	}
	@FindBy(xpath="//div[@class='exehdJ']")
	WebElement AccountName;
//	@FindBy(xpath="//div[text()='Logout')]")
	@FindBy(xpath="//li[@class='_2NOVgJ']//a[@class='_2kxeIr']")
	WebElement LogOutButton;
	public void HoverOnAccountName() throws InterruptedException {
		Thread.sleep(1000);
		Actions action = new Actions(driver);
		action.moveToElement(AccountName).perform();
		action.wait(1000);
//		Thread.sleep(2000);
//		action.moveToElement(LogOutButton).perform();
//		action.click().perform();
		LogOutButton.click();
	}
}
//_3vhnxf
