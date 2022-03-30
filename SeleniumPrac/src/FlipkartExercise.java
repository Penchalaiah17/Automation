import java.net.MalformedURLException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class FlipkartExercise {
	public static final String AUTOMATE_USERNAME = "aravindka_h0BoYr";
	  public static final String AUTOMATE_ACCESS_KEY = "yBamazPuSCsVbYQWLiDz";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "latest");
		caps.setCapability("browserstack.local", "true");
		caps.setCapability("browserstack.selenium_version", "3.14.0");
	    final WebDriver driver = new RemoteWebDriver(new java.net.URL (URL), caps);
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");  
		driver.findElement(By.name("q")).sendKeys("flipkart.com");
		driver.findElement(By.xpath("//div[@class='CqAVzb lJ9FBc']//center//input[@class='gNO89b']")).submit();//google search button
		driver.findElement(By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();//opens first link 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("9182288966");//enters username
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='password']")).sendKeys("9182288966");//enters password
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();//login button
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[@class='_3704LK']")).sendKeys("Watch");//search tab
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//search button
		Thread.sleep(5000);
		List<WebElement> watchNames=driver.findElements(By.className("IRpwTa"));
		List<WebElement> watchPrices=driver.findElements(By.className("_30jeq3"));
		int length=watchNames.size();
		for(int i=0;i<length;i++) {
			System.out.println(watchNames.get(i).getText()+" "+watchPrices.get(i).getText());
		}
		driver.quit();
	
}
}

