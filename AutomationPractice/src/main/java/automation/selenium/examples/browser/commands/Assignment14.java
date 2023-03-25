package automation.selenium.examples.browser.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment14 {
	
	
	static WebDriver driver;
	
	@BeforeTest
	public static void setup() {
		
	       WebDriverManager.chromedriver().setup();
	       driver =new ChromeDriver();
	      driver.manage().window().maximize();
	}

	     @Test
	       public static void Sendtheaddress() throws InterruptedException{
	       driver.navigate().to("https://demoqa.com/automation-practice-form");

	      driver.findElement(By.id("currentAddress")).sendKeys("Anantapur-DamodharColony-Andrapradseh(515787)");
	     
	

	
	          JavascriptExecutor js = (JavascriptExecutor)driver;
	         js.executeScript("window.scrollBy(0,400)");
	}
}