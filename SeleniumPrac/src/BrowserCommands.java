import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserCommands {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.demoqa.com/");
		System.out.println(driver.getTitle());
		System.out.println((driver.getTitle()).length());
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().equals("https://shop.demoqa.com/")) {
			System.out.println("You landed in correct website");
		}
		else {
			System.out.println("Landed wrong");
		}
		System.out.println(driver.getPageSource());
		System.out.println((driver.getPageSource()).length());
		driver.close();

	}

}// Code for basic browser commands like open,close,quit,getting title ,getting page source 
