package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount {
	WebDriver driver;
	public CreateAccount(WebDriver driver1) {
		this.driver=driver1;
	}
	By CreateAccountXpath =By.xpath("//a[@class='_14Me7y']");
	By EnterUserNameXpath=By.xpath("//input[@class='_2IX_2- VJZDxU']");
	By ContinueButtonXpath=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	By EnterOTPXpath=By.xpath("//input[@class='_2IX_2- VJZDxU' and @type='text']");
	By SetNewPasswordXpath=By.xpath("//input[@class='_2IX_2- VJZDxU' and @type='password']");
	By SignUpXpath=By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
	public void ClickCreateAccount() {
		driver.findElement(CreateAccountXpath).click();
	}
	public void EnterUserName(String UserName) {
		driver.findElement(EnterUserNameXpath).sendKeys(UserName);
	}
	public void ClickContinueButton() {
		driver.findElement(ContinueButtonXpath).submit();
	}
	public void EnterOTP(String OTP) {
		driver.findElement(EnterOTPXpath).sendKeys(OTP);
	}
	public void SetNewPassword(String NewPassword) {
		driver.findElement(SetNewPasswordXpath).sendKeys(NewPassword);
	}
	public void ClickOnSignUp() {
		driver.findElement(SignUpXpath).submit();
	}
}
