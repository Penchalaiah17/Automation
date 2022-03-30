	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class FlipkartMobileDetails {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys("9182288966");//enters username
			driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='password']")).sendKeys("9182288966");//enters password
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();//login button
			Thread.sleep(1000);
			String mobile_name="SAMSUNG Galaxy A12";
			driver.findElement(By.xpath("//div[@class='_3OO5Xc']//input[@class='_3704LK']")).sendKeys(mobile_name);//search tab
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();//search button
			Thread.sleep(1000);
			List<WebElement> page = driver.findElements(By.xpath("//a[contains(@class,\"ge-49M\")]"));
			for (int p=1;p<=page.size();p++) {
				System.out.println("Page No : "+p);
				List<WebElement> element = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
				for(WebElement e:element) {
					System.out.println(e.getText());
				}
				Thread.sleep(2000);
				if(p!=page.size()-1) {
					if(driver.findElement(By.xpath("//span[text()=\"Next\"]")).isEnabled()) {
						driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
						Thread.sleep(2000);
					}
				}
			}
		}
	}