package automation.selenium.examples.browser.commands;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MultipleSelection {
	
	
	
	
	static ChromeDriver driver;
	
        @BeforeTest
	   public static void setup()
	{
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
	}
	     @Test
         public static void openURL() throws InterruptedException {
		
	      driver.get("http://jsbin.com/osebed/2");
	        System.out.println("Displayed");
	        
	      driver.get("http://jsbin.com/osebed/2 ");
	      Select mselect = new Select(driver.findElement(By.id("fruits")));
	        mselect.selectByVisibleText("Orange");
	      String SelectedFruit1 = driver.findElement(By.xpath("//*[@id='fruits']/option[1]")).getText();
	      System.out.println("Selected fruit 1 :" + SelectedFruit1);
	
	
	       Select bselect = new Select(driver.findElement(By.id("fruits")));
	       bselect.selectByIndex(2);
	       String SelectedFruit2 = driver.findElement(By.xpath("//*[@id='fruits']/option[3]")).getText();
	       System.out.println("Selected fruit 2:" +SelectedFruit2 );
	       Select oSelect = new Select(driver.findElement(By.id("fruits")));
	
	      oSelect.selectByVisibleText("Apple");
	      Thread.sleep(3000);
	         oSelect.deselectByVisibleText("Apple");

	        oSelect.selectByIndex(2);
	        Thread.sleep(3000);
             oSelect.deselectByIndex(2);
	
	      oSelect.deselectAll();
	      driver.close();
	     }
}

         