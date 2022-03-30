import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandlingDemo {

	public static void main(String[] args) {
		String [] r_hobby = {"Music","Reading"};
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")));
		driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")).click();
		for(String hobby :r_hobby ) {
			for(WebElement e:driver.findElements(By.xpath("//div[@class='custom-control custom-checkbox custom-control-inline']/label"))) {
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", e);
				if(e.getText().equalsIgnoreCase(hobby)) {
					e.click();
				}
			}
		}
	}
}
//code for check box handling 
