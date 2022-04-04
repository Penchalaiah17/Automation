package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoldPeakBeverages {
	WebDriver driver;
//	@Test
	public void SocialMediaClickable() throws InterruptedException {
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

	}
	@Test
	public void SignIn() throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='profile__wrapper nav__submenu--wrapper']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-main-wrapper\"]/div[1]/nav[2]/ul/div/ul/li[1]/a")).click();
		
	}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.get("https://www.goldpeakbeverages.com/");
	}
	@AfterMethod
	public void afterMethod() {
//		driver.quit();
	}
}
