package automation.selenium.examples.browser.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	
	
	 static WebDriver driver;

	    @BeforeTest
	   public static void setup()
	   {
	   WebDriverManager.chromedriver().setup();
	   driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   }


	   @Test
	   public static void dragNDrop() {
       
		   driver.get("https://demoqa.com/droppable/");

	       WebElement source= driver.findElement(By.id("draggable"));
	       WebElement target= driver.findElement(By.id("draggable"));
	       Actions action=new Actions(driver);
	       action.dragAndDrop(source, target).build().perform();

	   }

	}