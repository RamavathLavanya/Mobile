package automation.selenium.examples.browser.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchFrameException28 {
	

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
	driver.get("https://www.rediff.com/");
	//driver.findElement(By.linkText("Create New Account")).click();
	driver.switchTo().frame("moneyiframe");
	
	driver.findElement(By.name("query")).sendKeys("Hello Bank");

	}

}
