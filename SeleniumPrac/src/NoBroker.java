import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NoBroker {

	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.nobroker.in/");
		String City="Chennai";
		String Type="PG/Hostel";
		driver.findElement(By.xpath("//div[@class='nb__17yFj nb__1Z-uW']")).click();
		// Drop Down
		driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'"+City+"')]")).click();

		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys("Poonamallee");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='listPageSearchLocality']")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);

		// Radio Button
		driver.findElement(By.xpath("//*[contains(text(),'"+Type+"')]")).click();
		// Search Button
		driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();

		
		Thread.sleep(1000);
		Thread.sleep(1000);
		List<WebElement> title = driver.findElements(By.xpath("//h2[@class=\"heading-6 flex items-center font-semi-bold m-0\"]"));
		List<WebElement> sqft = driver.findElements(By.xpath("//div[@id=\"minRent\"]"));
		try{

			for(int q=1;q<title.size();q++) {
				System.out.println("Name : "+title.get(q).getText()+"  "+ "SquareFeet : " + sqft.get(q).getText());
			}
		}
		catch(Exception e){System.out.println(e);}
		
		driver.quit();


	}


}

