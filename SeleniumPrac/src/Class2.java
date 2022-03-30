
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class2 {
	public WebDriver driver;
        @Test
        public void Test2() {	 
        	WebDriverManager.chromedriver().setup();
           
	    driver = new ChromeDriver();	  
	    driver.get("https://www.flipkart.com/"); 
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	    driver.quit();
         }
 
        @Test
 	public void ChromeTest()
 	{ WebDriverManager.chromedriver().setup();
	 
	  driver = new ChromeDriver();
	  driver.get("https://www.demoqa.com"); 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	  driver.quit();
 	}
}
