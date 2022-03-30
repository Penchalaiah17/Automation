import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/My%20Files/Table.html");
		//		Printing the headings
		List<WebElement>headings=driver.findElements(By.xpath("//table//tr[1]//th"));
		for(WebElement e:headings) {
			System.out.println(e.getText());
		}
		System.out.println("********************");


		//		Printing an entire row 
		List<WebElement> rowValues=driver.findElements(By.xpath("//table//tr[2]//td"));
		for(WebElement e:rowValues) {
			System.out.println(e.getText());
		}
		System.out.println("********************");


		//		Printing countries column 
		List<WebElement> columnValues=driver.findElements(By.xpath("//table//tr//td[3]"));
		for(WebElement e:columnValues) {
			System.out.println(e.getText());
		}


		Thread.sleep(2000);
		driver.quit();		
	}

}
