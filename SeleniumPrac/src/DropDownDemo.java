import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KoduvayurAghoraAravi\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://fs2.formsite.com/meherpavan/form2/");
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//input[@value='CheckBox-0']")));
//		WebElement element=driver.findElement(By.xpath("//input[@value='CheckBox-0']"));
//		String textlist=element.getText();
//		System.out.println(textlist);
//		driver.navigate().to("C:\\Users\\KoduvayurAghoraAravi\\Desktop\\demo.html");
//		Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='cars']")));
//		Select multiselect=new Select(driver.findElement(By.xpath("//select[@id='cars']")));
//		if(multiselect.isMultiple()==true) {
//			multiselect.selectByIndex(2);
//			multiselect.selectByValue("opel");
//			multiselect.selectByIndex(1);
//		}
//		dropdown.selectByIndex(1);
//		Thread.sleep(2000);
//		dropdown.selectByValue("ford");
//		Thread.sleep(2000);
//		dropdown.selectByVisibleText("toyato");
//		List <WebElement> web=dropdown.getOptions();
//		for(WebElement ele:web) {
//			System.out.println(ele.getText());
//		}
//		multiselect.deselectAll();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")));
//		driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")).click();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@id=\"state\"]/div/div[1]")));

		String state="NCR";
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'"+state+"')]")).click();
		

	}

}
