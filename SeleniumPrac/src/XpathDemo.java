import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://toolsqa.com/selenium-webdriver/selenium-tutorial/");
		driver.findElement(By.xpath("//header//a[contains(text(),'Demo Site')]")).click();
		System.out.println(driver.getTitle());
		
		String parentWindow=driver.getWindowHandle();
		System.out.println(parentWindow);
		for(String window:driver.getWindowHandles()) {
			System.out.println("window="+window);
			driver.switchTo().window(window);
		}
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindow);
		
		System.out.println(driver.getTitle());

	}

}
