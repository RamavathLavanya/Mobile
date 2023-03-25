package automation.selenium.examples.browser.commands;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	
	
	static WebDriver driver;
	@SuppressWarnings("deprecation")
	     @Test
	    public static void setup() throws InterruptedException {
	     WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_9bqbl508i4_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486452179346&hvpos=&hvnetw=g&hvrand=3315958526366602932&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040222&hvtargid=kwd-296458777401&hydadcr=14454_2154375&gclid=CjwKCAjwwdWVBhA4EiwAjcYJEEwHE7gVUm21XHE4CN29CwqV6b-rDDqanNBLL3_Mq1BIpuUHjxR17hoCnOsQAvD_BwE");
	        WebElement ddown = driver.findElement(By.id("searchDropdownBox"));
	      Select select =new Select(ddown);
	      select.selectByIndex(4);
	       select.selectByVisibleText("Electronics");
	       
	       driver.findElement(By.id("nav-search-submit-button")).click();


}
}
	
	
	
	
	
	
	
	
	
	
	
	

//    @SuppressWarnings("deprecation")
//	@Test
//
//    public void verifySeleniumTitle()
//
//    {
//
//                   // WebDriver driver=new WebDriver();
//    	           WebDriverManager.chromedriver().setup();
//
//                    WebDriver driver = null;
//					driver.manage().window().maximize();
//
//                    driver.get("http://www.learn-automation.com");
//
//                    // Specify implicit wait of 30 seconds                                   
//                     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//                  // No login id is present on Webpage so this will fail our script.
//                    driver.findElement(By.id("login")).sendKeys(" Selenium Webdriver");

    






