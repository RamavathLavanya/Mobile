package automation.selenium.examples.browser.commands;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment22 {
	

	static WebDriver driver;

	 @BeforeTest
	public static void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	}
	 
	 
	@Test
	public static void doubleClick()
	
	{
		 driver.get("https://demoqa.com/buttons");
		 WebElement dblClickBtn=driver.findElement(By.id("doubleClickBtn"));
		 Actions action=new Actions(driver);
		 action.doubleClick(dblClickBtn).build().perform();
		 
		 
		 
		 
	}


	

	
	
	}


