package automation.selenium.examples.browser.commands;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	
	static WebDriver driver;

	 @BeforeTest
	public static void setup()
	{
	WebDriverManager.chromedriver().setup();
	}
	
	@Test
	public static void FileUploaded() throws InterruptedException{
	
		   ChromeDriver driver = new ChromeDriver();
		
		   driver.manage().window().maximize();
		   
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		   
           
		   driver.navigate().to("https://demoqa.com/automation-practice-form");
			driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Reliance\\OneDrive\\Pictures\\pic.jpeg");
		// System.out.println("File Uploaded Successfully.");
		
		   
		 //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   JavascriptExecutor js = (JavascriptExecutor)driver; 
		   js.executeScript("window.scrollBy(0,380)");
		 //  Thread.sleep(3000);
		 
	}
		  
		   }


