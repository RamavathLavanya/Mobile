package automation.selenium.examples.browser.commands;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment16 {
	
static WebDriver driver;
	
	@BeforeTest
	public static void setUp()
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	@Test
	public static void sample ()
	{
	driver.get("https://www.amazon.com/");
	}
	@Test
	public static void navigateOps() throws InterruptedException
	{
	driver.get("https://www.amazon.com/");
	System.out.println("Amazon page is opened .");
	Thread.sleep(2000);
	
	 JavascriptExecutor js = (JavascriptExecutor)driver; 
	   js.executeScript("window.scrollBy(0,4000)");
	  // Thread.sleep(3000);
	 
	}

}



