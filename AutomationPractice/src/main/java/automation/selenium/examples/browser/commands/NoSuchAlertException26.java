package automation.selenium.examples.browser.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchAlertException26 {
	

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
	driver.get("https://www.google.com/");

	try
	{
		Alert alert=driver.switchTo().alert();
		
	
	alert.accept();
	}
	catch(NoAlertPresentException e)
	{
		System.out.println("Alert is Not Present");
	}
	
	clickAboutLink();
	}
	private static void clickAboutLink() {
		
		WebElement aboutLink = driver.findElement(By.linkText("About"));
		aboutLink.click();
		
	}

}
