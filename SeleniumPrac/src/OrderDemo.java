import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");  
		driver.findElement(By.name("q")).sendKeys("flipkart.com");
		driver.findElement(By.xpath("//div[@class='CqAVzb lJ9FBc']//center//input[@class='gNO89b']")).submit();//google search button
		driver.findElement(By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();//opens first link 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("9182288966");//enters username
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='password']")).sendKeys("9182288966");//enters password
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();//login button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[@class='_3704LK']")).sendKeys("Casio Edifice Watches");//search tab
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//search button
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='_2r_T1I']")).click();
		Thread.sleep(2000);
		for(String window:driver.getWindowHandles()) {
//			System.out.println("window="+window);
			driver.switchTo().window(window); //switching the window
		}
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")));
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
	}
}
