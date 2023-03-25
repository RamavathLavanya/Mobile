package automation.selenium.examples.browser.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountOfFrames20 {
	
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
	//driver.get("https://www.amazon.com/");
		driver.get("https://demoqa.com/alerts");
	//driver.get("https://www.tutorialspoint.com/html/html_image_links.htm");
	
	List<WebElement> l= driver.findElements(By.tagName("iframe"));
	
	System.out.println("No.of Frames in Webpage = "+l.size());
	}

}
