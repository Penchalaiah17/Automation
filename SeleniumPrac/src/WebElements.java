import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElements {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Amazon.com");
		driver.navigate().to("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Watch");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.className("s-image")).click();
		driver.findElement(By.id("nav-cart-count")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.findElement(By.id("hmenu-customer-name")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("ap_email")).sendKeys("aravind@gmail.com");
		driver.quit();
	}
} //Amazon Code
