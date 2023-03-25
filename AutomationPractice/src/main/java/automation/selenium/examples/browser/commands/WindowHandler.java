package automation.selenium.examples.browser.commands;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandler {
     
	
	static WebDriver driver;
	
	    @Test
	     public static void setup() throws InterruptedException {
	    	
	     WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.salesforce.com/in/");
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[1]/div/a")).click();
	    Thread.sleep(2000);
	    
	    Set<String> windows = driver.getWindowHandles();
	    System.out.println(windows);
	    
	    Iterator<String> iterator = windows.iterator();
	     String parentwindow = iterator.next();
	    System.out.println(parentwindow);
	    
	     String chlidwindow = iterator.next();
	     System.out.println(chlidwindow);
	     driver.switchTo().window(chlidwindow);
	     
	     driver.findElement(By.name("UserFirstName")).sendKeys("Lavanya");
	     driver.findElement(By.name("UserLastName")).sendKeys("R");
	     driver.switchTo().window(parentwindow);
	    }
}