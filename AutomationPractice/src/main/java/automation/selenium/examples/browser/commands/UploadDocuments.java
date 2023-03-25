package automation.selenium.examples.browser.commands;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDocuments{
	
    WebDriver drv;
	
	@BeforeTest
	public void SetUp() {
		
		WebDriverManager.chromedriver().setup();
		drv=new ChromeDriver();
		drv.manage().window().maximize();
		drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(100));
		
		drv.get("https://demoqa.com/alerts");
	}
		
		@Test(priority=1)
		public void alertmsg() throws InterruptedException {
			
		WebElement alert=drv.findElement(By.id("alertButton"));
	    alert.click();
	    Thread.sleep(1000);
	    drv.switchTo().alert().accept();
	    Thread.sleep(1000);
			
		}
		
		@Test(priority=2)
		public void  confirmbox() throws InterruptedException {
			Thread.sleep(1000);
			WebElement confirm =drv.findElement(By.id("confirmButton"));
			confirm.click();
			Thread.sleep(1000);
            drv.switchTo().alert().accept();
            System.out.println(drv.findElement(By.id("confirmResult")).getText());
		}
		
		@Test(priority=3)
		public void promptbox() throws InterruptedException {
			Thread.sleep(1000);
			WebElement promt =drv.findElement(By.id("promtButton"));
			promt.click();
			Thread.sleep(1000);
			Alert promtalert= drv.switchTo().alert();
			Thread.sleep(1000);
			promtalert.sendKeys("Lavanya");
			promtalert.accept();
			Thread.sleep(1000);
			 System.out.println(drv.findElement(By.id("promptResult")).getText());
            
		
		
//		   JavascriptExecutor js = (JavascriptExecutor)driver; 
//		   js.executeScript("window.scrollBy(0,380)");
//		   Thread.sleep(3000);
	}
		 
		
		@Test(priority=4)
		public void fileupload() {
			drv.navigate().to("https://demoqa.com/automation-practice-form");
			drv.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Reliance\\OneDrive\\Pictures\\pic.jpeg");
		}
		
		
		
		
	}




	

