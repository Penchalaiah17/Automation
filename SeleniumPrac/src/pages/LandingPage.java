package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage {
	WebDriver driver;
	//Constructor with parameters
	public LandingPage(WebDriver driver1) {
		this.driver=driver1;
	}
	//		By SearchBarXpath=By.xpath("//input[@class='_3704LK']");
	//		By SearchButtonXpath=By.xpath("//button[@class='L0Z3Pu']");

	// Using page factor model
	@FindBy(xpath="//input[@class='_3704LK']")
	WebElement SearchBar;

	@FindBy(xpath="//button[@class='L0Z3Pu']")
	WebElement SearchButton;
	public void GoToSearchBar(String ProductName) {
		//				driver.findElement(SearchBarXpath).sendKeys(ProductName);
		SearchBar.sendKeys(ProductName);

	}
	public void ClickSearchButton() {
		//				driver.findElement(SearchButtonXpath).submit();	
		SearchButton.submit();
	}
}
