package automation.selenium.examples.browser.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GmailWebDriverWait {
	
	static WebDriver driver;

	 @BeforeTest
	public static void setup()
	{
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().window().maximize();
	}
	 
	 
		@Test
		public static void EmailVerification() throws InterruptedException
		{
		Thread.sleep(2000);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		WebElement emailOrPhonenum = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
		
	 if(emailOrPhonenum.isDisplayed())
	 {
	 System.out.println("EmailOrPhoneNumber is Displaying");
	 Thread.sleep(2000);
	 emailOrPhonenum.sendKeys("lavanyarama305@gmail.com");
	 }
	 else
	{
	System.out.println("EmailOrPhoneNumber is not Displaying");
	}
	WebElement next = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
	Thread.sleep(2000);
	next.click();

	}
		
		@Test
		public static void PasswordlVerification() throws InterruptedException
		{
		Thread.sleep(2000);
		//driver.get("https://mail.google.com/mail/u/0/#inbox");
		WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
	 if(password.isDisplayed())
	 {
	 System.out.println("Password is Displaying");
	 Thread.sleep(2000);
	 password.sendKeys("Anusree123@");
	 }
		
	 else
	{
	System.out.println("Password is not Displaying");
	}
	//  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	WebElement next = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
	Thread.sleep(2000);
	next.click();
		}
}
