package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsListPage {
	WebDriver driver;
	// Constructor with parameters
	public ProductsListPage(WebDriver driver1) {
		this.driver=driver1;
	}
	@FindBy(xpath="//img[@class='_2r_T1I']")
	WebElement Product;
	public void Product() {
		Product.click();
	}
}
