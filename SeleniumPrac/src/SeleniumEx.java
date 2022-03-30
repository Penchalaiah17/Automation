import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumEx {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.com/demo/");
		Thread.sleep(2000);
		WebElement textEle=driver.findElement(By.xpath("//*[@id=\"header-title\"]"));
		System.out.println(textEle.getText());
		System.out.println(textEle.getAttribute("id"));
		System.out.println(textEle.getSize());
		Dimension obj=textEle.getSize();
		System.out.println(obj.height+" "+obj.width);
		Point obj1=textEle.getLocation();
		System.out.println(obj1.x+" "+obj1.y);
		List <WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement s:links) {
			System.out.println(s.getText());
			
		}
	}
}
//Code for finding the text,attributes values,size,location of web elements
