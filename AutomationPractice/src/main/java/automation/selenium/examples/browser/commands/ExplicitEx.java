package automation.selenium.examples.browser.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitEx {
	
	
static ChromeDriver driver;
	
	@BeforeTest
	public static void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	//Run | Debug
	public static void openURL() {
		driver.get("https://www.amazon.com");
	}
}
