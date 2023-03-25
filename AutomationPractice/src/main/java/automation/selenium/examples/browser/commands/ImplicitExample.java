package automation.selenium.examples.browser.commands;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitExample {
	
	    static WebDriver driver;

	    @Test
	    public void setup() throws InterruptedException {
	        WebDriverManager.chromedriver().setup();
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
	       // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_9bqbl508i4_e&adgrpid=60612964962&hvpone=&hvptwo=&hvadid=486452179346&hvpos=&hvnetw=g&hvrand=3315958526366602932&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040222&hvtargid=kwd-296458777401&hydadcr=14454_2154375&gclid=CjwKCAjwwdWVBhA4EiwAjcYJEEwHE7gVUm21XHE4CN29CwqV6b-rDDqanNBLL3_Mq1BIpuUHjxR17hoCnOsQAvD_BwE");
	        WebElement ddown = driver.findElement(By.id("searchDropdownBox"));
	        
	        Select select =new Select(ddown);
	        select.selectByIndex(4);
	        select.selectByVisibleText("Electronics");
	        driver.findElement(By.id("nav-search-submit-button")).click();
	    }
	    }

	



