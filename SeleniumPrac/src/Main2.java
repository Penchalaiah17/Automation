import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Main2 {
	WebDriver driver;
	@Test (retryAnalyzer = utils.RetryAnalyzerDemo.class)
	public void testCase1(){
		System.out.println("Printing column");
		//		Printing countries column 
		List<WebElement> columnValues=driver.findElements(By.xpath("//table//tr//td[3]"));
		for(WebElement e:columnValues) {
			System.out.println(e.getText());
		}	
		Assert.assertEquals(true, false);
	}
	@Test 
	public void testCase2() {
		System.out.println("Printing row");
		//		Printing an entire row 
		List<WebElement> rowValues=driver.findElements(By.xpath("//table//tr[2]//td"));
		for(WebElement e:rowValues) {
			System.out.println(e.getText());
		}
	}
	@BeforeMethod 
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/My%20Files/Table.html");
	}
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
