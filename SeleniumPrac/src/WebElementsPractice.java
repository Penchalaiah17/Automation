import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");  
        driver.findElement(By.name("q")).sendKeys("flipkart.com");
        driver.findElement(By.className("gNO89b")).submit();
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("_1_3w1N")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("aravind@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("12345678");        
        Thread.sleep(1000);
        driver.findElement(By.className("_2LJFE8")).submit();
        Thread.sleep(1000);
        driver.findElement(By.className("_14Me7y")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9989988988");
        Thread.sleep(2000);
        driver.quit();
	}
} //Flipkart code