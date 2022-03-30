import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DProvider {
	@DataProvider (name = "data-provider")
	public Object[][] dpMethod(){
		return new Object[][] {{2, 3 , 5}, {5, 7, 9},{10,10,20},{20,20,50}};
	}
	@DataProvider (name = "data-provider1")
	public Object[][] dpMethod1(){
		
		return new Object[][] {{"9182288966",288966},{"penchaliah","pench"},{"Rubini","rubi"}};
	}
	
      @Test (dataProvider = "data-provider")
      public void myTest (int a, int b, int result) {
	     int sum = a + b;
	     SoftAssert Sassert=new SoftAssert();
	     Sassert.assertEquals(result, sum);
	     System.out.println("Success");
      }
//    @Test (dataProvider = "data-provider1")
//     public void testrun2(String username,String password) throws InterruptedException {
//    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
// 		WebDriver driver =new ChromeDriver();
// 		driver.manage().window().maximize();
// 		driver.get("https://www.google.co.in/");  
// 		driver.findElement(By.name("q")).sendKeys("flipkart.com");
// 		driver.findElement(By.xpath("//div[@class='CqAVzb lJ9FBc']//center//input[@class='gNO89b']")).submit();//google search button
// 		driver.findElement(By.xpath("//div[@class='CCgQ5 vCa9Yd QfkTvb MUxGbd v0nnCb']")).click();//opens first link 
// 		Thread.sleep(1000);
// 		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='text']")).sendKeys(username);//enters username
// 		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']//input[@type='password']")).sendKeys(password);//enters password
// 		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();//login button
// 		driver.quit();
//     }
}
