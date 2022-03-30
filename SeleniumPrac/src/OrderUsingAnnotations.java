import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderUsingAnnotations {
	WebDriver driver;
	@Test
	public void testCase() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("9182288966");//enters username
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='password']")).sendKeys("9182288966");//enters password
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();//login button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[@class='_3704LK']")).sendKeys("Casio Edifice Watches");//search tab
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//search button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='_2r_T1I']")).click();
		Thread.sleep(2000);
		for(String window:driver.getWindowHandles()) {

			driver.switchTo().window(window); //switching the window
		}
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/"); 
	}
	@AfterMethod
	public void afterMethod() throws InterruptedException {
		System.out.println("Your product has been successfully added to the cart");
		driver.quit();
	}
}
