package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver;
	//Constructor with parameters
	public LandingPage(WebDriver driver1) {
		this.driver=driver1;
	}
	By SearchBarXpath=By.xpath("//input[@class='_3704LK']");
	By SearchButtonXpath=By.xpath("//button[@class='L0Z3Pu']");
	public void SearchBar(String ProductName) {
		driver.findElement(SearchBarXpath).sendKeys(ProductName);
	}
	public void ClickSearchButton() {
		driver.findElement(SearchButtonXpath).submit();		
	}

}
