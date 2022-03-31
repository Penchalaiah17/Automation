package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
	WebDriver driver;
	// constructors with parameters
	public ProductPage(WebDriver driver1) {
		this.driver=driver1;
	}
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	WebElement AddToCart;
	public void BuyNowButton() {
		// switching the window
		for(String window:driver.getWindowHandles()) {
			driver.switchTo().window(window);
		}
		AddToCart.click();
	}

}
