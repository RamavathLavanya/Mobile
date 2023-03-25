package automation.selenium.examples.browser.commands;

import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;



public class Assertion {

	//public static void main(String[] args) {
		
		
	 @BeforeTest
		public static void setup()
		{
			WebDriverManager.chromedriver().setup();
		    ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		}
           @Test
            public static void EmailVerification() throws  InterruptedException {
		   Thread.sleep(5000);
		  WebDriver driver = null;
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		   WebElement emailOrPhonenum = driver.findElement(By.xpath("//input[@id='ap_email']"));
		  if(emailOrPhonenum.isDisplayed()) {
		System.out.println("EmailOrPhoneNumber is Displaying");
		 Thread.sleep(5000);
		  emailOrPhonenum.sendKeys("8688585170");
		 }
		  else {
			System.out.println("EmailOrPhoneNumber is Not Displaying");
		}
		WebElement continue1 = driver.findElement(By.xpath("//input[@id='continue']"));
		 Thread.sleep(5000);
		 continue1.click();
		}

		 @Test
           public static void passwordVerification() throws InterruptedException
		{

		 WebDriver driver = null;
		WebElement password =driver.findElement(By.xpath("//input[@id='ap_password']"));
		 if(password.isDisplayed())
		 {

		 System.out.println("Password is Displaying");
		   Thread.sleep(5000);
		 password.sendKeys("Anu123@");
		 }
		 else
             {
			System.out.println("Password is Not Displaying");
		   WebElement helloUser = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		   String txt = helloUser.getText();
		  assertEquals(true, txt.contains("Lavanya"));
		  assertTrue(helloUser.isDisplayed());
		}
		 WebElement signInBtn = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		 Thread.sleep(2000);
		signInBtn.click();

		



	}

}
