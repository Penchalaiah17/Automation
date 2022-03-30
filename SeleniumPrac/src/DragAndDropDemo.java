import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		Actions object = new Actions(driver);		 
		WebElement Source = driver.findElement(By.id("draggable"));
//		WebElement Target = driver.findElement(By.id("droppable"));	 
		
//		object.dragAndDrop(Source,Target).perform();
		object.clickAndHold(Source).moveByOffset(273,5).release().build().perform();
		}
}
