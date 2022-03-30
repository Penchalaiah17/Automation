import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class FindingElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=mobiles&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_ps&otracker1=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_ps&as-pos=1&as-type=RECENT&suggestionId=mobiles%7CMobiles&requestId=f8745824-5ce1-4a47-8ba8-5066175ed93b&as-searchtext=Mobiles");
		List <WebElement> mobiles=driver.findElements(By.className("_4rR01T"));
		for(WebElement e:mobiles) {
			System.out.println("Mobile Name"+e.getText());
		}
		}
}
// code for finding the first 24 mobile names
////input[@type='checkbox']
