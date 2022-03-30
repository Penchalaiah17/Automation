import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderParticularProduct {

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
		String mobile_name="SAMSUNG Galaxy A12";
		driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[@class='_3704LK']")).sendKeys(mobile_name);//search tab
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//search button
		Thread.sleep(2000);
		for(int i=0;i<9;i++) {
			List<WebElement> MobileNames=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
			List<WebElement> MobilePrices=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
			Thread.sleep(1000);
			for(int j=0;j<MobileNames.size();j++) {
				if(MobileNames.get(j).getText().contains("SAMSUNG Galaxy A12 (Black, 64 GB)")) {
					System.out.println("Mobile Name:"+" "+MobileNames.get(j).getText()+" "+"|"+" "+"Price:"+" "+MobilePrices.get(j).getText());
					driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
					for(String window:driver.getWindowHandles()) {

						driver.switchTo().window(window);
					}
					driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
					break;
				}
			}
		}
		//		driver.quit();
	}
}
