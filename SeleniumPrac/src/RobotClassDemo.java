import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		Thread.sleep(2000);

		Actions object=new Actions(driver);
		object.click(driver.findElement(By.xpath("//*[@id=\"myFile\"]"))).build().perform();

		String myString = "C:\\My Files\\CheckBox Handling.txt";
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, null);
		Thread.sleep(2000);

		Robot obj=new Robot();
		obj.keyPress(KeyEvent.VK_CONTROL);
		obj.keyPress(KeyEvent.VK_V);
		obj.keyRelease(KeyEvent.VK_V);
		obj.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		obj.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		obj.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		obj.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		obj.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		obj.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		obj.keyRelease(KeyEvent.VK_ENTER);	
	}

}
