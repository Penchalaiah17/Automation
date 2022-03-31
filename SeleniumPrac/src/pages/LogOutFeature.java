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
	@FindBy(xpath="//div[@class='_3vhnxf']")
	WebElement LogOutButton;
	public void HoverOnAccount() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(AccountName).perform();
		Thread.sleep(2000);
		LogOutButton.click();
	}
	
	
}
//_3vhnxf