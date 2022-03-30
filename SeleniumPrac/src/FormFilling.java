import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormFilling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Aravind");
		driver.findElement(By.id("lastName")).sendKeys("K.A");
		Thread.sleep(2000);
		driver.findElement(By.id("userEmail")).sendKeys("araivnd.ka@gmail.com");
		String gender="Male";
		WebElement element=driver.findElement(By.xpath("//input[@value='"+gender+"']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();",element);
		List<WebElement> options=driver.findElements(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]"));
		for(WebElement e: options) {
			System.out.println(e.getText());
		}
		driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("9989988988");
		driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]")).sendKeys("Computer");
		String arr[]= {"Sports","Music"};
		for(String hobbies:arr) {
			for(WebElement e:driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']/label"))) {
				 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
				 if(e.getText().equalsIgnoreCase(hobbies)) {
					 e.click();
				 }
			}
		}
		


	}

}
