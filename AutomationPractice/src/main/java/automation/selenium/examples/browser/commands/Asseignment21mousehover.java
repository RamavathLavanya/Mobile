package automation.selenium.examples.browser.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asseignment21mousehover {
	

	static WebDriver driver;

	 @BeforeTest
	public static void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	}
	 
	
	@Test
	public static void onHover() {
		
		

		       driver.get("https://www.amazon.com");

		       WebElement signinNavigation= driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span"));
		       Actions action=new Actions(driver);
		       action.moveToElement(signinNavigation).build().perform();

		   }
	}
	
		