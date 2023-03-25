package automation.selenium.examples.browser.commands;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class RadioButton {
	
	
	       static WebDriver driver;
	       
	        @BeforeTest
	         public static void setUp() {
	        	
	           WebDriverManager.chromedriver().setup();
	           driver = new ChromeDriver();
	             driver.manage().window().maximize();
	             
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	           driver.navigate().to("http://www.dyn-web.com/tutorials/forms/examples/pizza.php");
	        }
	
	      @Test
	      public static void pizaaSizeButton() throws InterruptedException{
	    	  
	            List<WebElement> sizes = driver.findElements(By.xpath("//input[@name='size']"));
	             if (sizes.get(1).isSelected())
	              System.out.println("Medium  is Selected");
	               else
	            System.out.println("Medium button is Not Selected");
	             Thread.sleep(2000);
	             
	                sizes.get(0).click();
	               List<WebElement> topping = driver.findElements(By.xpath("//input[@type='checkbox']"));
	               topping.get(0).click();
	               topping.get(4).click();
	               
	            WebElement total = driver.findElement(By.xpath("//input[@name= 'total']"));
                System.out.println("Total Amount = " + total.getAttribute("value"));
	      }
	      }



