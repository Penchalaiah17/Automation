import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDropByDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");
		Actions object = new Actions(driver);	
		WebElement Source = driver.findElement(By.id("draggable"));
		WebElement Target = driver.findElement(By.id("droppable"));	 
		// Offset's for source element
		int X_Source=Source.getLocation().getX();
	    int Y_Source=Source.getLocation().getY();
	    System.out.println(X_Source+" "+Y_Source);
	    // Offset's for Target element
	    int X_Target=Target.getLocation().getX();
	    int Y_Target=Target.getLocation().getY();
	    System.out.println(X_Target+" "+Y_Target);
		int X_Offset=(X_Target)-(X_Source);
		int Y_Offset=(Y_Target)-(Y_Source);
		// Drag and Drop Action
		object.dragAndDropBy(Source,X_Offset,Y_Offset).perform();
		}
}
